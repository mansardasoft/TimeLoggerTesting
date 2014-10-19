package timelogger.presentation.graphicCommand.admin;

import java.awt.Container;
import java.util.concurrent.ConcurrentHashMap;

import timelogger.domain.Progetto;
import timelogger.presentation.UIFacade;
import timelogger.presentation.graphicCommand.GraphicCommand;
import timelogger.presentation.graphicCommand.GuiManager;
import timelogger.presentation.ui.admin.confirmProjPanel;
import timelogger.utilities.graphicSettings;

public class ConfirmProjectPopupCommand implements GraphicCommand {

	@Override
	public void draw(Container c) {
	
		confirmProjPanel pan=new confirmProjPanel();
		Progetto p=(Progetto)UIFacade.getInstance().getAData("Progetto");
		pan.setData(p.toString());
		GuiManager.getInstance().getDialog().getContentPane().removeAll();
		GuiManager.getInstance().getDialog().getContentPane().add(pan);
		GuiManager.getInstance().getDialog().setTitle(graphicSettings.getInstance().getTitleDialog()+" conferma dati progetto");
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
