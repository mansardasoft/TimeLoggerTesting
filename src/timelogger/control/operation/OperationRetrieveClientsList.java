package timelogger.control.operation;

import java.awt.Container;
import java.util.ArrayList;
import java.util.List;

import org.orm.PersistentException;
import org.orm.PersistentSession;

import timelogger.control.ControlFacade;
import timelogger.domain.Cliente;
import timelogger.presentation.UIFacade;
import timelogger.utilities.Constants;

public class OperationRetrieveClientsList implements OperationFlyweight 
{
	
	private ArrayList<Object> clientsList=new ArrayList<Object>();

	@SuppressWarnings("unchecked")
	@Override
	public void doOp(ControlFacade controller, Container invoker) {
		
		System.out.println("--------------------------------------------------");
		System.out.println("OP::OperationRetrieveClientsList---> retrieving clients from DB");
		
		clientsList.clear();
		List<Cliente> retrievedClients = null;
		try {
			PersistentSession sess = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			retrievedClients=sess.createCriteria(Cliente.class)
				    .list();
			this.clientsList.add("Seleziona un cliente");
			for(int i=0;i<retrievedClients.size();i++)
				this.clientsList.add(retrievedClients.get(i));
			
		} catch (PersistentException e) {
		}
		
		
		
		/*Cliente cTemp;
		for(int i=0; i<6; i++)
		{
			cTemp=new Cliente();
			cTemp.setCognome("Cliente["+i+"]");
			this.clientsList.add(cTemp);
		}		
		*/
		
		UIFacade.getInstance().setAData("ComboBoxList", this.clientsList);
		UIFacade.getInstance().toGuiAction(Constants.getInstance().fillComboBoxCommand, invoker); //invoker deve essere una cbx
	}

}
