package timelogger.presentation.graphicCommand.manager;

import java.awt.Container;
import java.util.concurrent.ConcurrentHashMap;

import timelogger.domain.SottoProgetto;
import timelogger.presentation.UIFacade;
import timelogger.presentation.graphicCommand.GraphicCommand;
import timelogger.presentation.graphicCommand.GuiManager;
import timelogger.presentation.ui.manager.createTaskPanel;
import timelogger.utilities.Constants;

public class CreateTaskCommand implements GraphicCommand{

	@Override
	public void draw(Container c) {
		c.removeAll();
		
		createTaskPanel p = new createTaskPanel();
		SottoProgetto sp = (SottoProgetto) UIFacade.getInstance().getAData("SottoProgettoNonInizializzato");
		UIFacade.getInstance().toGuiAction(Constants.getInstance().fillComboBoxCommand, p.getCbxConsulente());
		UIFacade.getInstance().toGuiAction(Constants.getInstance().fillTaskListNotStartedCommand, p.getVerticalBox());
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
