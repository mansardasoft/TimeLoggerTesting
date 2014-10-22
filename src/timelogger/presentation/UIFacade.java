package timelogger.presentation;

import java.awt.Container;
import java.util.concurrent.ConcurrentHashMap;

import timelogger.control.ControlFacade;
import timelogger.presentation.graphicCommand.*;
import timelogger.utilities.Constants;

public class UIFacade {
	
	private static UIFacade instance=new UIFacade();

    protected ConcurrentHashMap<String,Object> data=new ConcurrentHashMap<String,Object>();

	private UIFacade(){}

	public void clearData()
	{
		this.data.clear();
	}
	
	public void setAData(String key, Object value) {
        //TODO value null is not allowed
        if(value == null){
            throw new NullPointerException("the value it must be not null");
        }else {
            this.data.put(key, value);
        }
	}
	
	public Object getAData(String key) {
		return this.data.get(key);
	}

	public void toSysAction(String actionKey,Container invoker) {
		ControlFacade.getInstance().action(actionKey,invoker);
	}

	public void toGuiAction(String graphicCommandKey,Container father) {
		GuiManager.getInstance().getCommand(graphicCommandKey).draw(father);
	}

    //Getters
    public ConcurrentHashMap<String, Object> getData() {return data;}

	/**
	 * Metodo successivo allo startup
	 */
	public void startUseCase() {
		GuiManager.getInstance().getCommand(Constants.getInstance().mainWindowCommand).draw(null);
	}

	public static UIFacade getInstance() {
		return instance;
	}

	public static void setInstance(UIFacade instance) {
		UIFacade.instance = instance;
	}
}