package timelogger.control.operation;

import java.util.concurrent.ConcurrentHashMap;

import timelogger.utilities.Constants;

public class OperationFlyweightFactory {

	private java.util.concurrent.ConcurrentHashMap<String, OperationFlyweight> operations = new ConcurrentHashMap<String,OperationFlyweight>();

	/**
	 * 
	 * @return 
	 */
	public OperationFlyweightFactory() 
	{		
		operations.put(Constants.getInstance().operationRetrieveTaskForConsulentList,new OperationRetrieveTaskForConsulentList());
		operations.put(Constants.getInstance().operationVerifyTRData, new OperationVerifyTRData());
		operations.put(Constants.getInstance().operationStoreNewTR, new OperationStoreNewTR());
		operations.put(Constants.getInstance().operationStoreProject, new OperationStoreProject());
		operations.put(Constants.getInstance().operationLogin, new OperationLogin());
		operations.put(Constants.getInstance().operationCreateNewProject, new OperationCreateNewProject());
		operations.put(Constants.getInstance().operationCreateNewSubProj, new OperationCreateNewSubProj());
		operations.put(Constants.getInstance().operationCreateNewInvoice, new OperationCreateNewInvoice());
		operations.put(Constants.getInstance().operationRemoveInvoice, new OperationRemoveInvoice());
		operations.put(Constants.getInstance().operationRemoveSubProj, new OperationRemoveSubProj());
		operations.put(Constants.getInstance().operationRetrieveManagersList, new OperationRetrieveManagersList());
		operations.put(Constants.getInstance().operationRetrieveClientsList, new OperationRetrieveClientsList());
		operations.put(Constants.getInstance().operationSetProjData, new OperationSetProjData());
		operations.put(Constants.getInstance().operationRetrieveSubProjsList, new OperationRetrieveSubProjList());
		operations.put(Constants.getInstance().operationRetrieveSubProject, new OperationRetrieveSubProject());
		operations.put(Constants.getInstance().operationRetrieveAllConsulents, new OperationRetrieveAllConsulents());
		operations.put(Constants.getInstance().operationChangeTaskConsulent, new OperationChangeTaskConsulent());
		operations.put(Constants.getInstance().operationVerifySPData, new OperationVerifySPData());
		operations.put(Constants.getInstance().operationStoreSP, new OperationStoreSP());
		operations.put(Constants.getInstance().operationLogout, new OperationLogout());
		operations.put(Constants.getInstance().operationRetrieveTRTask, new OperationRetrieveTRTask());
		operations.put(Constants.getInstance().operationRetrieveSubProjNotStarted, new OperationRetrieveSubProjNotStarted());
		
	}

	/**
	 * 
	 * @param key
	 * @return 
	 */
	public OperationFlyweight getOperation(String key) {
		return this.operations.get(key);
	}

}