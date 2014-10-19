package timelogger.control.operation;

import java.awt.Container;

import timelogger.control.ControlFacade;
import timelogger.presentation.UIFacade;
import timelogger.presentation.graphicCommand.GuiBuilder;
import timelogger.presentation.graphicCommand.GuiManager;
import timelogger.utilities.Constants;

public class OperationLogout implements OperationFlyweight {

	@Override
	public void doOp(ControlFacade controller, Container invoker) {
		System.out.println("--------------------------------------------------");
		System.out.println("OP::OperationLogout---> logging out");
	
		UIFacade.getInstance().clearData();
		ControlFacade.getInstance().clearData();
		GuiManager.getInstance().clearCommands();
		
		GuiBuilder.getInstance().createShared();	
		
		UIFacade.getInstance().toGuiAction(Constants.getInstance().loginPopupCommand, null);

		
		
		
	}

}
