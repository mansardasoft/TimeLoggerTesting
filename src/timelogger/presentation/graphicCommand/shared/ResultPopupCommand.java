package timelogger.presentation.graphicCommand.shared;

import java.awt.Container;
import java.util.concurrent.ConcurrentHashMap;

import timelogger.presentation.graphicCommand.GraphicCommand;
import timelogger.presentation.graphicCommand.GuiManager;
import timelogger.presentation.ui.shared.resultPanel;

public class ResultPopupCommand implements GraphicCommand{

	public ConcurrentHashMap<String,String>data=new ConcurrentHashMap<String,String>();
	
	public void draw(Container c) {
		GuiManager.getInstance().getDialog().setVisible(false);
		GuiManager.getInstance().getDialog().getContentPane().removeAll();
		resultPanel result=new resultPanel();
		GuiManager.getInstance().getDialog().getContentPane().add(result);
		GuiManager.getInstance().getDialog().setVisible(true);
	}

	
	@Override
	public void setData(ConcurrentHashMap<String, String> data) {
		this.data=data;		
	}

	@Override
	public ConcurrentHashMap<String, String> getData() {
		return this.data;
	}

}
