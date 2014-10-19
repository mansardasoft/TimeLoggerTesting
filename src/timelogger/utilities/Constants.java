package timelogger.utilities;

public class Constants {
	
	private static Constants instance=new Constants();
	
	private Constants()
	{
		
	}
	
	public static Constants getInstance() {
		return instance;
	}

	// //////////////GUIBUILDER/////////////////////////////
	// createConsulenteCommand
	public final String newTimeRecordFormCommand = "NewTimeRecordForm";
	public final String confirmTimeRecordPopupCommand = "ConfirmTimeRecordPopup";
	public final String fillTimeRecordListCommand="FillTimeRecordList";
	// createAdminCommand
	public final String createProjectCommand = "CreateProject";
	public final String invoiceResumeCommand = "InvoiceResume";
	public final String removeInvoiceResumeCommand = "RemoveInvoiceResume";
	public final String subProjResumeCommand = "SubProjResume";
	public final String removeSubProjResumeCommand = "RemoveSubProjResume";
	public final String clearThisContainerCommand = "ClearThisContainer";
	public final String fillComboBoxCommand = "FillComboBox";
	public final String confirmProjectPopupCommand = "ConfirmProjectPopup";
	// createManagerCommand
	public final String editSubProjectCommand = "EditSubProject";
	public final String confirmSubProjectPopupCommand = "ConfirmSubProjectPopup";
	public final String editDataSubProjectCommand = "EditDataSubProject";
	public final String undoDataSubProjectCommand = "UndoDataSubProject";
	public final String confirmEditDataSubProjectCommand = "ConfirmEditDataSubProject";
	public final String taskListCommand = "TaskList";
	public final String fillTaskListCommand = "FillTaskList";
	public final String createTaskCommand = "CreateTask";
	public final String fillTaskListNotStartedCommand = "FillTaskListNotStarted";
	
	// createLoginCommand
	public final String loginPopupCommand = "LoginPopup";
	public final String loginFailCommand = "LoginFail";
	//shared
	public final String mainWindowCommand = "MainWindow";
	public final String showCalendarCommand = "ShowCalendar";
	public final String resultPopupCommand = "ResultPopup";


	////////////////////OPERATION FLYWEIGHT FACTORY//////////////////////////
	public final String operationRetrieveTaskForConsulentList = "OperationRetrieveTaskForConsulentList";
	public final String operationVerifyTRData = "OperationVerifyTRData";
	public final String operationStoreNewTR = "OperationStoreNewTR";
	public final String operationLogin = "OperationLogin";
	public final String operationCreateNewProject = "OperationCreateNewProject";
	public final String operationCreateNewSubProj = "OperationCreateNewSubProj";
	public final String operationCreateNewInvoice = "OperationCreateNewInvoice";
	public final String operationRemoveInvoice = "OperationRemoveInvoice";
	public final String operationRemoveSubProj = "OperationRemoveSubProj";
	public final String operationRetrieveManagersList = "OperationRetrieveManagersList";
	public final String operationRetrieveClientsList = "OperationRetrieveClientsList";
	public final String operationSetProjData = "OperationSetProjData";
	public final String operationStoreProject = "OperationStoreProject";
	public final String operationRetrieveSubProjsList = "OperationRetrieveSubProjsList";
	public final String operationRetrieveSubProject = "OperationRetrieveSubProject";
	public final String operationRetrieveAllConsulents = "OperationAllConsulents";
	public final String operationChangeTaskConsulent = "OperationChangeTaskConsulent";
	public final String operationVerifySPData = "OperationVerifySPData";
	public final String operationStoreSP = "OperationStoreSP";
	public final String operationLogout = "OperationLogout";
	public final String operationRetrieveTRTask="OperationRetrieveTRTask";
	public final String operationRetrieveSubProjNotStarted = "OperationRetrieveSubProjNotStarted";
}
