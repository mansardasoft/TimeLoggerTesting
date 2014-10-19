package timelogger.presentation.graphicCommand.consulent;

import java.awt.Container;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

import timelogger.presentation.UIFacade;
import timelogger.presentation.graphicCommand.GraphicCommand;
import timelogger.presentation.graphicCommand.GuiManager;
import timelogger.presentation.ui.consulent.confirmTimeRecordPanel;
import timelogger.utilities.graphicSettings;

public class ConfirmTimeRecordPopupCommand implements GraphicCommand{

	/**
	 * 
	 * @param c
	 * @return 
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void draw(Container c) {
		confirmTimeRecordPanel confirm=new confirmTimeRecordPanel();		
		confirm.setData((ArrayList<Object>) UIFacade.getInstance().getAData("dataToConfirm"));
		GuiManager.getInstance().getDialog().getContentPane().removeAll();
		GuiManager.getInstance().getDialog().getContentPane().add(confirm);
		GuiManager.getInstance().getDialog().setTitle(graphicSettings.getInstance().getTitleDialog()+" conferma dati time record");
		GuiManager.getInstance().getDialog().setVisible(true);
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
