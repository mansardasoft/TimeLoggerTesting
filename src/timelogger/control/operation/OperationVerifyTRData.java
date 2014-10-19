package timelogger.control.operation;

import java.awt.Container;
import java.util.ArrayList;

import timelogger.control.*;
import timelogger.domain.Consulente;
import timelogger.presentation.*;
import timelogger.utilities.Constants;

public class OperationVerifyTRData implements OperationFlyweight {

	/**
	 * 
	 * @param controller
	 * @param invoker
	 * @return 
	 */
	@SuppressWarnings("unused")
	public void doOp(ControlFacade controller,Container invoker) {
		
		System.out.println("--------------------------------------------------");
		System.out.println("OP::OperationVerifyTRData---> verifying inserted data");
		@SuppressWarnings("unchecked")
		ArrayList<Object> dataToVerify=(ArrayList<Object>) UIFacade.getInstance().getAData("newTRFormData");
		Consulente c=(Consulente) controller.getData("user");
		
		if(true)//Dummy verify condition
		{
			//dataToVerify.add(String.valueOf(c.tasks.get(Integer.parseInt(dataToVerify.get(4))).getID()));
			//dataToVerify.add(String.valueOf(c.tasks.get);
			
			UIFacade.getInstance().clearData();
			UIFacade.getInstance().setAData("dataToConfirm",dataToVerify);
			UIFacade.getInstance().toGuiAction(Constants.getInstance().confirmTimeRecordPopupCommand,invoker);
		}
		else
		{
			////Show a popup of error in data validity check
		}
	}

}