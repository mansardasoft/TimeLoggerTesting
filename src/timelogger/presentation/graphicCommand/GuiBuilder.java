package timelogger.presentation.graphicCommand;

import timelogger.presentation.graphicCommand.admin.*;

/*import timelogger.presentation.graphicCommand.admin.CreateProjectCommand;
import timelogger.presentation.graphicCommand.admin.InvoiceResumeCommand;
import timelogger.presentation.graphicCommand.admin.MainAdminWindowCommand;
import timelogger.presentation.graphicCommand.admin.RemoveInvoiceResumeCommand;
import timelogger.presentation.graphicCommand.admin.RemoveSubProjResumeCommand;
import timelogger.presentation.graphicCommand.admin.ShowCalendarCommand;
*/

import timelogger.presentation.graphicCommand.consulent.*;

/*import timelogger.presentation.graphicCommand.consulent.NewTimeRecordFormCommand;
import timelogger.presentation.graphicCommand.consulent.ResultTimeRecordPopupCommand;
*/

import timelogger.presentation.graphicCommand.manager.*;

/*import timelogger.presentation.graphicCommand.manager.ConfirmSubProjectPopupCommand;
import timelogger.presentation.graphicCommand.manager.EditDataSubProjectCommand;
import timelogger.presentation.graphicCommand.manager.EditSubProjectCommand;
import timelogger.presentation.graphicCommand.manager.MainManagerWindowCommand;
import timelogger.presentation.graphicCommand.manager.SubProjResumeCommand;
import timelogger.presentation.graphicCommand.manager.UndoDataSubProjectCommand;
*/

import timelogger.presentation.graphicCommand.shared.*;
/*
import timelogger.presentation.graphicCommand.shared.LoginPopupCommand;
import timelogger.presentation.graphicCommand.shared.MainWindowCommand;
*/
import timelogger.utilities.Constants;

public class GuiBuilder {
	
	private static GuiBuilder instance=new GuiBuilder();
	
	private GuiBuilder()
	{
	}
	
	public void createConsulentCommands()
	{
		GuiManager.getInstance().storeCommand(Constants.getInstance().mainWindowCommand,new MainConsulentWindowCommand() );
		GuiManager.getInstance().storeCommand(Constants.getInstance().newTimeRecordFormCommand,new NewTimeRecordFormCommand() );
		GuiManager.getInstance().storeCommand(Constants.getInstance().confirmTimeRecordPopupCommand,new ConfirmTimeRecordPopupCommand() );
		GuiManager.getInstance().storeCommand(Constants.getInstance().fillTimeRecordListCommand,new FillTimeRecordListCommand() );
	}
	
	public void createAdminCommands()
	{
		GuiManager.getInstance().storeCommand(Constants.getInstance().mainWindowCommand,new MainAdminWindowCommand() );
		GuiManager.getInstance().storeCommand(Constants.getInstance().createProjectCommand, new CreateProjectCommand());
		GuiManager.getInstance().storeCommand(Constants.getInstance().invoiceResumeCommand, new InvoiceResumeCommand());
		GuiManager.getInstance().storeCommand(Constants.getInstance().removeInvoiceResumeCommand, new RemoveInvoiceResumeCommand());
		GuiManager.getInstance().storeCommand(Constants.getInstance().subProjResumeCommand, new SubProjResumeCommand());
		GuiManager.getInstance().storeCommand(Constants.getInstance().removeSubProjResumeCommand, new RemoveSubProjResumeCommand());
		GuiManager.getInstance().storeCommand(Constants.getInstance().clearThisContainerCommand, new ClearThisContainerCommand());
		GuiManager.getInstance().storeCommand(Constants.getInstance().confirmProjectPopupCommand, new ConfirmProjectPopupCommand());
		
	}
	
	public void createManagerCommands()
	{
		GuiManager.getInstance().storeCommand(Constants.getInstance().mainWindowCommand,new MainManagerWindowCommand() );
		GuiManager.getInstance().storeCommand(Constants.getInstance().editSubProjectCommand, new EditSubProjectCommand());
		GuiManager.getInstance().storeCommand(Constants.getInstance().confirmSubProjectPopupCommand, new ConfirmSubProjectPopupCommand());
		GuiManager.getInstance().storeCommand(Constants.getInstance().editDataSubProjectCommand,new EditDataSubProjectCommand() );
		GuiManager.getInstance().storeCommand(Constants.getInstance().undoDataSubProjectCommand,new UndoDataSubProjectCommand() );
		GuiManager.getInstance().storeCommand(Constants.getInstance().confirmEditDataSubProjectCommand, new ConfirmEditDataSubProjectCommand());
		GuiManager.getInstance().storeCommand(Constants.getInstance().fillTaskListCommand, new FillTaskListCommand());
		GuiManager.getInstance().storeCommand(Constants.getInstance().createTaskCommand, new CreateTaskCommand());
		GuiManager.getInstance().storeCommand(Constants.getInstance().fillTaskListNotStartedCommand, new FillTaskListNotStartedCommand());
	}
	
	public void createShared()		//crea command login e commad shared da i vari utenti
	{
		GuiManager.getInstance().storeCommand(Constants.getInstance().loginPopupCommand,new LoginPopupCommand() );
		GuiManager.getInstance().storeCommand(Constants.getInstance().loginFailCommand,new LoginFailCommand() );
		
		GuiManager.getInstance().storeCommand(Constants.getInstance().fillComboBoxCommand, new FillComboBoxCommand());
		GuiManager.getInstance().storeCommand(Constants.getInstance().resultPopupCommand,new ResultPopupCommand() );
	}
	

	public static GuiBuilder getInstance() {
		return instance;
	}

	public static void setInstance(GuiBuilder instance) {
		GuiBuilder.instance = instance;
	}
	
}