package timelogger.presentation.graphicCommand.manager;

import java.awt.Container;
import java.util.concurrent.ConcurrentHashMap;

import javax.swing.Box;

import timelogger.domain.SottoProgetto;
import timelogger.presentation.UIFacade;
import timelogger.presentation.graphicCommand.GraphicCommand;
import timelogger.presentation.ui.manager.taskSubProj;
import timelogger.utilities.Constants;

public class FillTaskListCommand implements GraphicCommand {
	
	private Box box;

	@Override
	public void draw(Container c) {
		
		box = (Box) c;
		box.removeAll();
		SottoProgetto sp = (SottoProgetto) UIFacade.getInstance().getAData("SottoProgettoSelezionato");
		
		//Draw di ogni task il pannello con i dati nella cbx
		for(int i =0; i< sp.tasks.size(); i++) {
			taskSubProj t = new taskSubProj();
			t.getLblTaskNumber().setText(String.valueOf(i+1));
			t.getLblTitoloTask().setText(sp.tasks.get(i).getTitolo());
			UIFacade.getInstance().toGuiAction(Constants.getInstance().fillComboBoxCommand, t.getComboConsulente());
			
			// Seleziona il primo elemento della ComboBox
			if(sp.tasks.get(i).getConsulenteAssociato()!=null)
				t.getComboConsulente().setSelectedItem(sp.tasks.get(i).getConsulenteAssociato());
			else
				t.getComboConsulente().setSelectedIndex(0);
			
			if (sp.tasks.get(i).getConsulenteAssociato()==null) t.getLblStato().setText("Non assegnato");
				else if(!sp.tasks.get(i).timerecords.isEmpty()) t.getLblStato().setText("In corso");	//esistono TR associati al task
				else t.getLblStato().setText("Assegnato");							//non esistono TR associati al task
			
			t.getLblFatturato().setText("No");
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
