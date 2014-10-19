package timelogger.presentation.graphicCommand.shared;

import java.awt.Container;
import java.util.concurrent.ConcurrentHashMap;

import timelogger.presentation.graphicCommand.GraphicCommand;
import timelogger.presentation.graphicCommand.GuiManager;
import timelogger.presentation.ui.shared.loginPanel;

public class LoginPopupCommand implements GraphicCommand{

	@Override
	public void draw(Container c) {
		GuiManager.getInstance().getDialog().setVisible(true);
		GuiManager.getInstance().getDialog().getContentPane().removeAll();
		GuiManager.getInstance().getWindow().setVisible(false);
		loginPanel l=new loginPanel();
		GuiManager.getInstance().getDialog().setTitle("[TimeLogger] Login");
		GuiManager.getInstance().getDialog().getContentPane().add(l);
		GuiManager.getInstance().getDialog().validate();
	}

	@Override
	public void setData(ConcurrentHashMap<String, String> data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ConcurrentHashMap<String, String> getData() {
		// TODO Auto-generated method stub
		return null;
	}

}
