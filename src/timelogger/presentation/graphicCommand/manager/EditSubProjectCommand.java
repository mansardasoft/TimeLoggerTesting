package timelogger.presentation.graphicCommand.manager;

import java.awt.Container;
import java.util.concurrent.ConcurrentHashMap;

import timelogger.domain.SottoProgetto;
import timelogger.presentation.UIFacade;
import timelogger.presentation.graphicCommand.GraphicCommand;
import timelogger.presentation.graphicCommand.GuiManager;
import timelogger.presentation.ui.manager.editSubProjPanel;
import timelogger.utilities.Constants;

public class EditSubProjectCommand implements GraphicCommand {

	@SuppressWarnings("unused")
	@Override
	public void draw(Container c) {
		c.removeAll();
		
		editSubProjPanel p = new editSubProjPanel();
		SottoProgetto sp = (SottoProgetto) UIFacade.getInstance().getAData("SottoProgettoSelezionato");
		
		UIFacade.getInstance().toGuiAction(Constants.getInstance().fillTaskListCommand, p.getTaskTabVerticalBox());
		
		GuiManager.getInstance().getWindow().getContentPane().add(p);
		GuiManager.getInstance().getWindow().validate();
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
