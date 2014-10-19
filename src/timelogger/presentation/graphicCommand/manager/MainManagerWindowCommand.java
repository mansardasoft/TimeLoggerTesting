package timelogger.presentation.graphicCommand.manager;

import java.awt.Container;
import java.util.concurrent.ConcurrentHashMap;

import timelogger.control.ControlFacade;
import timelogger.domain.Manager;
import timelogger.presentation.UIFacade;
import timelogger.presentation.graphicCommand.GraphicCommand;
import timelogger.presentation.graphicCommand.GuiManager;
import timelogger.presentation.ui.manager.managerStartPanel;
import timelogger.utilities.Constants;

public class MainManagerWindowCommand implements GraphicCommand {

	@Override
	public void draw(Container c) {
		managerStartPanel msp= new managerStartPanel();
		Manager m = (Manager) ControlFacade.getInstance().getData("user");

		//caricamento subProj per progetti non ancora iniziati
		UIFacade.getInstance().toSysAction(Constants.getInstance().operationRetrieveSubProjNotStarted, msp.getListSubProjForTask());

		//caricamento subProj per edita sottoprogetto
		UIFacade.getInstance().toSysAction(Constants.getInstance().operationRetrieveSubProjsList, msp.getListSubProjForEdit());

		
		GuiManager.getInstance().getDialog().setVisible(false);
		GuiManager.getInstance().getWindow().getContentPane().removeAll();
		GuiManager.getInstance().getWindow().getContentPane().add(msp);
		GuiManager.getInstance().getWindow().setTitle("[TimeLogger] Manager - "+m.getCognome()+" "+m.getNome());

		GuiManager.getInstance().getWindow().getContentPane().validate();
		GuiManager.getInstance().getWindow().setVisible(true);
		
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
