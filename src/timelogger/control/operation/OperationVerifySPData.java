package timelogger.control.operation;

import java.awt.Container;
import java.util.ArrayList;

import timelogger.control.ControlFacade;
import timelogger.presentation.UIFacade;
import timelogger.utilities.Constants;

public class OperationVerifySPData implements OperationFlyweight {
	

	/**
	 * 
	 * @param controller
	 * @param invoker
	 * @return 
	 */
	@SuppressWarnings("unused")
	public void doOp(ControlFacade controller,Container invoker) {
		
		System.out.println("--------------------------------------------------");
		System.out.println("OP::OperationVerifySPData---> verifying inserted data");
	
		
	
		//ArrayList<String> dataToVerify = new ArrayList<String>();
		/*
		dataToVerify.add(UIFacade.getInstance().getAData("DurataSPSelezionato"));
		dataToVerify.add(UIFacade.getInstance().getAData("PagaOrariaSPSelezionato"));
		dataToVerify.add(UIFacade.getInstance().getAData("BudgetSPSelezionato"));
		dataToVerify.add(UIFacade.getInstance().getAData("ConsulentTaskList"));
		*/
			
		
		if(true)//Dummy verify condition
		{
			/*
			dataToVerify.add(String.valueOf(c.tasks.get(Integer.parseInt(dataToVerify.get(4))).getID()));
			UIFacade.getInstance().clearData();
			UIFacade.getInstance().setAData("dataToConfirm",dataToVerify);
			UIFacade.getInstance().toGuiAction(Constants.getInstance().confirmTimeRecordPopupCommand,invoker);
			*/
			UIFacade.getInstance().toGuiAction(Constants.getInstance().confirmSubProjectPopupCommand, invoker);
		}
		else
		{
			////Show a popup of error in data validity check
		}
		
	}

}
