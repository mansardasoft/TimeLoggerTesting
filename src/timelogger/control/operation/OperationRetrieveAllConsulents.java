package timelogger.control.operation;

import java.awt.Container;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;

import org.orm.PersistentException;
import org.orm.PersistentSession;

import timelogger.control.ControlFacade;
import timelogger.domain.Consulente;
import timelogger.presentation.UIFacade;
import timelogger.domain.Task;

public class OperationRetrieveAllConsulents implements OperationFlyweight{
	
	@SuppressWarnings("unused")
	private ArrayList<Task> taskList=new ArrayList<Task>();
	private ArrayList<Object> consulentList= new ArrayList<Object>();

	@SuppressWarnings("unchecked")
	@Override
	public void doOp(ControlFacade controller, Container invoker) {
		System.out.println("--------------------------------------------------");
		System.out.println("OP::OperationRetrieveAllConsulents---> retrieving consulents from DB");
		
		consulentList.clear();
		List<Consulente> retrievedConsulents = null;		
		
		
		
		try {
			PersistentSession sess = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			retrievedConsulents=sess.createCriteria(Consulente.class)
				    .list();
			//List To ArrayList
			
			this.consulentList.add("da assegnare");
			for(int i=0;i<retrievedConsulents.size();i++)
			{
				this.consulentList.add(retrievedConsulents.get(i));
			}
			
		} catch (PersistentException e) {
		}
		UIFacade.getInstance().setAData("ComboBoxList", this.consulentList);		
		
		
	}

}