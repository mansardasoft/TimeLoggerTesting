package timelogger.presentation.graphicCommand.manager;

import java.awt.Container;
import java.util.concurrent.ConcurrentHashMap;

import javax.swing.Box;

import timelogger.domain.SottoProgetto;
import timelogger.presentation.UIFacade;
import timelogger.presentation.graphicCommand.GraphicCommand;
import timelogger.presentation.ui.manager.singleTaskPanel;
import timelogger.presentation.ui.manager.taskSubProj;
import timelogger.utilities.Constants;

public class FillTaskListNotStartedCommand implements GraphicCommand {
	
	private Box box;

	@Override
	public void draw(Container c) {
		box = (Box) c;
		box.removeAll();
		SottoProgetto sp = (SottoProgetto) UIFacade.getInstance().getAData("SottoProgettoNonInizializzato");
		
		for(int i =0; i< sp.tasks.size(); i++) {
			singleTaskPanel t = new singleTaskPanel();
			t.getLblTaskNumber().setText(String.valueOf(sp.tasks.get(i).getID()));
			t.getLblTitoloTask().setText(sp.tasks.get(i).getTitolo());
			UIFacade.getInstance().toGuiAction(Constants.getInstance().fillComboBoxCommand, t.getComboConsulente());
			
			// Seleziona il primo elemento della ComboBox
			if(sp.tasks.get(i).getConsulenteAssociato()!=null)
				t.getComboConsulente().setSelectedItem(sp.tasks.get(i).getConsulenteAssociato());
			else
				t.getComboConsulente().setSelectedIndex(0);
			

			box.add(t);
		}
		box.validate();
		
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
