package timelogger.presentation.graphicCommand.manager;

import java.awt.Container;
import java.util.concurrent.ConcurrentHashMap;

import javax.swing.JPanel;
import javax.swing.SpringLayout;

import timelogger.domain.SottoProgetto;
import timelogger.presentation.UIFacade;
import timelogger.presentation.graphicCommand.GraphicCommand;
import timelogger.presentation.ui.manager.dataEditSubProjPanel;
import timelogger.presentation.ui.manager.dataSubProjPanel;
import timelogger.domain.SottoProgetto;

@SuppressWarnings("unused")
public class UndoDataSubProjectCommand implements GraphicCommand {

	
	@Override
	public void draw(Container c) {
		
		dataEditSubProjPanel dataEdit = (dataEditSubProjPanel) c;
		dataSubProjPanel dataSub = new dataSubProjPanel(dataEdit.getLabelName(),null);
		
		SottoProgetto sb = (SottoProgetto) UIFacade.getInstance().getAData("SottoProgettoSelezionato");

		if(dataEdit.getLabelName()=="Budget")   dataSub.setlblData(String.valueOf(sb.getBudgetStimato()));
		else if(dataEdit.getLabelName()=="Durata")  dataSub.setlblData(String.valueOf(sb.getDurataStimata()));
		else if(dataEdit.getLabelName()=="Paga Oraria") dataSub.setlblData(String.valueOf(sb.getPagaOraria()));
		
		/*
		if(dataEdit.getLabelName()=="Budget")   dataSub.setlblData(String.valueOf(sb.getBudgetStimanto()));
		else if(dataEdit.getLabelName()=="Durata")  dataSub.setlblData(String.valueOf(sb.getDurataStimata()));
		else if(dataEdit.getLabelName()=="Paga Oraria") dataSub.setlblData(String.valueOf(sb.getPagaOraria()));
			

		JPanel parent = (JPanel) c.getParent();
		SpringLayout layout = (SpringLayout) parent.getLayout();
		SpringLayout.Constraints misure = layout.getConstraints(c);
		parent.remove(c);
		parent.add(dataSub, misure);
		parent.validate();
		parent.updateUI();*/
		
		
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
