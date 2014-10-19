package timelogger.presentation.graphicCommand.admin;

import java.awt.Container;
import java.util.concurrent.ConcurrentHashMap;

import timelogger.control.ControlFacade;
import timelogger.domain.Admin;
import timelogger.presentation.graphicCommand.GraphicCommand;
import timelogger.presentation.graphicCommand.GuiManager;
import timelogger.presentation.ui.admin.adminStartPanel;

public class MainAdminWindowCommand implements GraphicCommand {

	private ConcurrentHashMap<String,String> data;

	@Override
	public void draw(Container c) {
		Admin a = (Admin) ControlFacade.getInstance().getData("user");
		GuiManager.getInstance().getDialog().setVisible(false);
		GuiManager.getInstance().getWindow().getContentPane().removeAll();
		GuiManager.getInstance().getWindow().getContentPane().add(new adminStartPanel());
		GuiManager.getInstance().getWindow().setTitle("[TimeLogger] Admin - "+a.getCognome()+" "+a.getNome());
		GuiManager.getInstance().getWindow().getContentPane().validate();
		GuiManager.getInstance().getWindow().setVisible(true);
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