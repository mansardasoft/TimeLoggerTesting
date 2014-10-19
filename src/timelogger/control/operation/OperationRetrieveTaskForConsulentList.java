package timelogger.control.operation;

import java.awt.Container;
import java.util.ArrayList;

import timelogger.control.ControlFacade;
import timelogger.domain.Consulente;
import timelogger.presentation.*;
import timelogger.utilities.Constants;

public class OperationRetrieveTaskForConsulentList implements OperationFlyweight {

	/**
	 * 
	 * @param f
	 * @return 
	 */
	public void doOp(ControlFacade controller,Container invoker) {
		//throw new UnsupportedOperationException();
				System.out.println("--------------------------------------------------");
				
				
				System.out.println("OP::OperationGetTRList---> retrieving TimeRecordslist");
				
				Consulente c=(Consulente)controller.getData("user");
				ArrayList<Object> data=new ArrayList<Object>();
				
				data.add("Selezionare un task");
				for(int i=0;i<c.tasks.size();i++)
					data.add(c.tasks.get(i));
				UIFacade.getInstance().setAData("ComboBoxList",data);
	
	}
}