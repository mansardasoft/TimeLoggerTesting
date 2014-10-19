package timelogger.control.operation;

import java.awt.Container;

import org.orm.PersistentException;

import timelogger.control.ControlFacade;
import timelogger.domain.Progetto;
import timelogger.presentation.UIFacade;
import timelogger.utilities.Constants;

public class OperationStoreProject implements OperationFlyweight {

	@Override
	public void doOp(ControlFacade controller, Container invoker) {
		
		System.out.println("--------------------------------------------------");
		System.out.println("OP::OperationStoreProject---> storing project in DB");
		
		Progetto p= (Progetto) ControlFacade.getInstance().getData("newProject");
		
		try {
			ControlFacade.getInstance().setTransaction(timelogger.domain.TimeloggerPersistentManager.instance().getSession().beginTransaction());
			p.save();
			ControlFacade.getInstance().getTransaction().commit();
			UIFacade.getInstance().toGuiAction(Constants.getInstance().resultPopupCommand,invoker);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
