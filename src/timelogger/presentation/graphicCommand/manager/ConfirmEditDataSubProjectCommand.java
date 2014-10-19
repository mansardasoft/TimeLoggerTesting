package timelogger.presentation.graphicCommand.manager;

import java.awt.Container;
import java.util.concurrent.ConcurrentHashMap;

import javax.swing.JPanel;

import timelogger.presentation.graphicCommand.*;
import timelogger.presentation.ui.manager.dataEditSubProjPanel;
import timelogger.presentation.ui.manager.dataSubProjPanel;

public class ConfirmEditDataSubProjectCommand implements GraphicCommand{

	@Override
	public void draw(Container c) {
		
		dataEditSubProjPanel dataEdit= (dataEditSubProjPanel)	c;	//x il casting
		
		dataSubProjPanel dataSub=new dataSubProjPanel(dataEdit.getLabelName(),dataEdit.getLabelData()); //ridisegna il pannello non modificabile
		
		/*
		JPanel parent = (JPanel) c.getParent();
		SpringLayout layout = (SpringLayout) parent.getLayout();
		SpringLayout.Constraints misure = layout.getConstraints(c);
		parent.remove(c);
		parent.add(p, misure);
		parent.validate();
		parent.updateUI();
		*/
		
		JPanel padre=(JPanel)c.getParent();
		padre.removeAll();
		padre.add(dataSub);
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
