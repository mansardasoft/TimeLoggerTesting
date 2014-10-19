package timelogger.presentation.graphicCommand.manager;

import java.awt.Container;
import java.util.concurrent.ConcurrentHashMap;

import javax.swing.JPanel;
import timelogger.presentation.graphicCommand.GraphicCommand;
import timelogger.presentation.ui.manager.dataEditSubProjPanel;
import timelogger.presentation.ui.manager.dataSubProjPanel;

public class EditDataSubProjectCommand implements GraphicCommand {

	@Override
	public void draw(Container c) {
		
		dataSubProjPanel dataSub = (dataSubProjPanel) c; //pannello per il casting
		dataEditSubProjPanel dataEdit = new dataEditSubProjPanel(dataSub.getlblName());
	
		/*
		JPanel parent = (JPanel) c.getParent();
		SpringLayout layout = (SpringLayout) parent.getLayout();
		SpringLayout.Constraints misure = layout.getConstraints(c);
		parent.remove(c);
		parent.add(dataEdit, misure);
		parent.validate();
		parent.updateUI();*/
		
		JPanel padre=(JPanel)c.getParent();
		padre.removeAll();
		padre.add(dataEdit);
		padre.updateUI();
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
