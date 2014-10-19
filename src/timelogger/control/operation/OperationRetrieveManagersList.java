package timelogger.control.operation;

import java.awt.Container;
import java.util.ArrayList;
import java.util.List;

import org.orm.PersistentException;
import org.orm.PersistentSession;

import timelogger.control.ControlFacade;
import timelogger.domain.Manager;
import timelogger.presentation.UIFacade;
import timelogger.utilities.Constants;

public class OperationRetrieveManagersList implements OperationFlyweight{
	
	private ArrayList<Object> managersList=new ArrayList<Object>();

	@SuppressWarnings("unchecked")
	@Override
	public void doOp(ControlFacade controller, Container invoker) {
		
		System.out.println("--------------------------------------------------");
		System.out.println("OP::OperationRetrieveManagersList---> retrieving managers from DB");
		
		managersList.clear();
		List<Manager> retrievedManagers = null;
		try {
			PersistentSession sess = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			retrievedManagers=sess.createCriteria(Manager.class)
				    .list();
			this.managersList.add("Selezionare un manager");
			for(int i=0;i<retrievedManagers.size();i++)
				this.managersList.add(retrievedManagers.get(i));
			
		} catch (PersistentException e) {
		}
		
		UIFacade.getInstance().setAData("ComboBoxList", this.managersList);
		
		UIFacade.getInstance().toGuiAction(Constants.getInstance().fillComboBoxCommand, invoker); //invoker deve essere una cbx
	}

}
