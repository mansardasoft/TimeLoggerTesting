package timelogger.control.operation;

import java.awt.Container;
import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.orm.PersistentException;
import org.orm.PersistentSession;

import timelogger.control.ControlFacade;
import timelogger.control.TimeLogger;
import timelogger.domain.Utente;
import timelogger.presentation.UIFacade;
import timelogger.utilities.Constants;
import timelogger.utilities.Encrypter;

public class OperationLogin implements OperationFlyweight{

	private Utente loggedUser=null;
	
	//x richiamare il metodo loginfail
	private Container invoker;
	
	public boolean doLogin(String Username,String Password)
	{
		boolean turnback=false;
		
		PersistentSession sess;
		try {
			sess = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			@SuppressWarnings("unchecked")
			List<Utente> retrievedUsers=sess.createCriteria(Utente.class)
			    .add( Restrictions.like("username", Username) )
			    .list();
			if(retrievedUsers.size()!=0)
			{
				Utente loggingUser=retrievedUsers.get(0);
				if(!loggingUser.getPassword().equals(Password))
					turnback=false;
				else 
				{
					turnback=true;
					this.loggedUser=loggingUser;
				}
			}
		
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return turnback;
		
	}
	
	public void StartApp(String Username,String Password)
	{
		Encrypter e=new Encrypter();
		
		if(this.doLogin(Username, e.encrypt(Password)))
		{
			TimeLogger tl=new TimeLogger(this.getLoggedUser().getID());
			ControlFacade.getInstance().addData("timelogger", tl);
		}
		else
		{
			// Manca operazione di fallimento UIFacade....
			UIFacade.getInstance().toGuiAction(Constants.getInstance().loginFailCommand, this.invoker);
		}
	}

	public Utente getLoggedUser() {
		return loggedUser;
	}

	public void setLoggedUser(Utente loggedUser) {
		this.loggedUser = loggedUser;
	}

	@Override
	public void doOp(ControlFacade controller, Container invoker) {
		System.out.println("--------------------------------------------------");
		System.out.println("OP::OperationLogin---> verifying login for user");
		
		this.invoker=invoker;
		this.StartApp((String)UIFacade.getInstance().getAData("Username"),(String)UIFacade.getInstance().getAData("Password"));
	}
	
}
