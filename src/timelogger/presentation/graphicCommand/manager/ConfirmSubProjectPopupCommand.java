package timelogger.presentation.graphicCommand.manager;

import java.awt.Container;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

import javax.swing.JLabel;

import timelogger.domain.Consulente;
import timelogger.domain.SottoProgetto;
import timelogger.presentation.UIFacade;
import timelogger.presentation.graphicCommand.GraphicCommand;
import timelogger.presentation.graphicCommand.GuiManager;
import timelogger.presentation.ui.manager.confirmSubProjPanel;
import timelogger.utilities.graphicSettings;

public class ConfirmSubProjectPopupCommand implements GraphicCommand {

	@Override
	public void draw(Container c) {
		confirmSubProjPanel p = new confirmSubProjPanel();
		p.setData(this.formatData());
		GuiManager.getInstance().getDialog().getContentPane().removeAll();
		GuiManager.getInstance().getDialog().getContentPane().add(p);
		GuiManager.getInstance().getDialog().setTitle(graphicSettings.getInstance().getTitleDialog()+" conferma dati sotto progetto");
		GuiManager.getInstance().getDialog().validate();
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

	@SuppressWarnings("unchecked")
	public String formatData()
	{
		String turnback="";
		SottoProgetto sp=(SottoProgetto)UIFacade.getInstance().getAData("SottoProgettoSelezionato");
		ArrayList<Consulente> consulentTaskList = (ArrayList<Consulente>) UIFacade.getInstance().getAData("ConsulentTaskList");
		
		turnback+="<html>Titolo sotto progetto: "+sp.getTitolo()+"<br />";
		turnback+="Paga oraria: "+UIFacade.getInstance().getAData("PagaOrariaSPSelezionato")+"<br />";
		turnback+="Durata stimata: "+UIFacade.getInstance().getAData("DurataSPSelezionato")+"<br />";
		turnback+="Budget stimato: "+UIFacade.getInstance().getAData("BudgetSPSelezionato")+"<br />";
		turnback+="Tasks: "+"<br />";
		
		for (int i=0; i<consulentTaskList.size(); i++)
		{
			if(consulentTaskList.get(i)==null)
				turnback+="  - "+sp.tasks.get(i).getTitolo()+" non associato a nessun consulente<br />";
			else{
				turnback+="  - "+sp.tasks.get(i).getTitolo()+" associato a "+consulentTaskList.get(i).getCognome()+"<br />";
			}
		}
		return turnback+="</html>";
	}
}
