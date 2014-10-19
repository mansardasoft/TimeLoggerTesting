package timelogger.presentation.graphicCommand.consulent;

import java.awt.Container;
import java.util.concurrent.ConcurrentHashMap;

import timelogger.control.ControlFacade;
import timelogger.domain.Consulente;
import timelogger.presentation.UIFacade;
import timelogger.presentation.graphicCommand.GraphicCommand;
import timelogger.presentation.graphicCommand.GuiManager;
import timelogger.presentation.ui.consulent.consulenteStartPanel;
import timelogger.utilities.Constants;

public class MainConsulentWindowCommand implements GraphicCommand {

	private ConcurrentHashMap<String,String> data;
	private consulenteStartPanel consStartPanel;

	@Override
	public void draw(Container c) {
		
		consStartPanel= new consulenteStartPanel();
		
		Consulente cons = (Consulente) ControlFacade.getInstance().getData("user");
		GuiManager.getInstance().getDialog().setVisible(false);
		GuiManager.getInstance().getWindow().getContentPane().removeAll();
		GuiManager.getInstance().getWindow().getContentPane().add(consStartPanel);
		GuiManager.getInstance().getWindow().setTitle("[TimeLogger] Consulente - "+cons.getCognome()+" "+cons.getNome());

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