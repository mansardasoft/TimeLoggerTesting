package timelogger.presentation.graphicCommand.shared;

import java.awt.Container;
import java.util.concurrent.ConcurrentHashMap;

import timelogger.presentation.graphicCommand.GraphicCommand;
import timelogger.presentation.ui.shared.loginPanel;

public class LoginFailCommand implements GraphicCommand {

	@Override
	public void draw(Container c) {
		loginPanel p = (loginPanel) c;
		p.changeColor();
		
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
