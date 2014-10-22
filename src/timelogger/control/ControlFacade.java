package timelogger.control;

import java.awt.Container;
import java.util.concurrent.ConcurrentHashMap;

import timelogger.control.operation.*;

public class ControlFacade {

	private static ControlFacade instance=new ControlFacade();
	
	private ControlFacade(){}
	
	private OperationFlyweightFactory oFactory=new OperationFlyweightFactory();
	private org.orm.PersistentTransaction transaction;

	private ConcurrentHashMap<String,Object> tempData = new ConcurrentHashMap<String,Object>();
	
	public OperationFlyweightFactory getOFactory() {
		return this.oFactory;
	}

	public void setOFactory(OperationFlyweightFactory oFactory) {
		this.oFactory = oFactory;
	}

	public org.orm.PersistentTransaction getTransaction() {
		return this.transaction;
	}

	public void setTransaction(org.orm.PersistentTransaction transaction) {
		this.transaction = transaction;
	}
	
	public void action(String actionKey,Container invoker) {
		this.oFactory.getOperation(actionKey).doOp(this,invoker);
	}

	public ConcurrentHashMap<String,Object> getTempData() {
		return tempData;
	}
	public void setTempData(ConcurrentHashMap<String,Object> tempData) {
		this.tempData = tempData;
	}
	
	public void addData(String key,Object value)
	{
		this.tempData.put(key, value);
	}
	
	public Object getData(String key)
	{
		return this.tempData.get(key);
	}
	
	public void setData(String key,Object value)
	{
        if(value == null){
            throw new NullPointerException("Object value must be not null");
        }else{
		    this.tempData.put(key,value);
        }

	}

	public static ControlFacade getInstance() {
		return instance;
	}

	public static void setInstance(ControlFacade instance) {
		ControlFacade.instance = instance;
	}
	
	public void clearData(){this.tempData.clear();}



}