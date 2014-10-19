package timelogger.presentation.graphicCommand.consulent;

import java.awt.Container;
import java.util.concurrent.ConcurrentHashMap;

import javax.swing.Box;
import javax.swing.JPanel;

import timelogger.control.ControlFacade;
import timelogger.domain.Consulente;
import timelogger.domain.Task;
import timelogger.presentation.UIFacade;
import timelogger.presentation.graphicCommand.GraphicCommand;
import timelogger.presentation.ui.consulent.trTaskPanel;
import timelogger.presentation.ui.manager.taskSubProj;

public class FillTimeRecordListCommand implements GraphicCommand {

	
	private Box box;
	@Override
	public void draw(Container c) {
				
		box = (Box) c;
		box.removeAll();
		if(!(UIFacade.getInstance().getAData("TaskSelezionato") instanceof String)){	
			
			Task tk= (Task) UIFacade.getInstance().getAData("TaskSelezionato");
			trTaskPanel trPanel;
			for(int i=0; i<tk.timerecords.size();i++){
			
				trPanel = new trTaskPanel();
			
				trPanel.getLblID().setText(String.valueOf(i+1));
				
				trPanel.getLblStartDate().setText(tk.timerecords.get(i).getInizio().toString());
				
				trPanel.getLblEndDate().setText(tk.timerecords.get(i).getFine().toString());
				
				trPanel.getTxtCommento().setText(tk.timerecords.get(i).getCommento());
			
				box.add(trPanel);
			}
			box.validate();
		}
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
