package timelogger.control.operation;

import java.awt.Container;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.orm.PersistentException;
import org.orm.PersistentSession;

import timelogger.control.ControlFacade;
import timelogger.domain.Consulente;
import timelogger.domain.Task;
import timelogger.domain.TimeRecord;
import timelogger.presentation.UIFacade;
import timelogger.presentation.ui.consulent.consulenteStartPanel;
import timelogger.utilities.Constants;

public class OperationRetrieveTRTask implements OperationFlyweight {
	
	@SuppressWarnings("unused")
	private ArrayList<TimeRecord> timeRecordList=new ArrayList<TimeRecord>();
	
	//buffer di copia
	private ArrayList<Object> trList= new ArrayList<Object>();

	@SuppressWarnings("unchecked")
	@Override
	
	public void doOp(ControlFacade controller, Container invoker) {
		System.out.println("--------------------------------------------------");
		System.out.println("OP::OperationRetrieveTRTasks---> retrieving time records from DB");
		
		trList.clear();
		List<TimeRecord> retrievedTimeRecords = null;		
		
		//riprende il consulente loggato
		Consulente cons=(Consulente) ControlFacade.getInstance().getData("user");		
		
		consulenteStartPanel consPanel= (consulenteStartPanel) invoker;
		Task t= (Task) UIFacade.getInstance().getAData("TaskSelezionato");
				
		try {
			PersistentSession sess = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			retrievedTimeRecords=sess.createCriteria(TimeRecord.class).add(Restrictions.like("consulente", cons))
				    .list();
			
			//List To ArrayList
			for(int i=0;i<retrievedTimeRecords.size();i++)
			{
				this.trList.add(retrievedTimeRecords.get(i));
			}
			
		} catch (PersistentException e) {
		}
		UIFacade.getInstance().setAData("trList", this.trList);	
	}

}