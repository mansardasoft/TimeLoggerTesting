package timelogger.control.operation;

import java.awt.Container;

import timelogger.control.ControlFacade;

public abstract interface OperationFlyweight {

	/**
	 * 
	 * @param f
	 * @return 
	 */
	abstract void doOp(ControlFacade controller,Container invoker);

}