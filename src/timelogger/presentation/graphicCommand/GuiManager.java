package timelogger.presentation.graphicCommand;

import java.util.concurrent.ConcurrentHashMap;

import timelogger.presentation.ui.shared.confirmDialog;
import timelogger.presentation.ui.shared.mainFrame;

public class GuiManager {
	
	private static GuiManager instance=new GuiManager();
	
	private mainFrame window=new mainFrame();
	
	private confirmDialog dialog=new confirmDialog();
	
	private ConcurrentHashMap<String,GraphicCommand> commands = new ConcurrentHashMap<String,GraphicCommand>();
	
	private GuiManager()
	{
	}
	
	public void storeCommand(String key,GraphicCommand c)
	{
		this.commands.put(key, c);
	}
	
	public GraphicCommand getCommand(String commandKey)
	{
        return this.commands.get(commandKey);
	}

	public static GuiManager getInstance() {
		return instance;
	}

	public static void setInstance(GuiManager instance) {
		GuiManager.instance = instance;
	}

	public mainFrame getWindow() {
		return window;
	}

	public void setWindow(mainFrame window) {
		this.window = window;
		this.window.setVisible(true);
	}

	public confirmDialog getDialog() {
		return dialog;
	}

	public void setDialog(confirmDialog dialog) {
		this.dialog = dialog;
	}
	
	public void clearCommands(){
		this.commands.clear();
	}
}