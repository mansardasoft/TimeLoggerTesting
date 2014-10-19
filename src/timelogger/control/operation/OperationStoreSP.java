package timelogger.control.operation;

import java.awt.Container;
import java.util.ArrayList;

import javax.swing.JLabel;

import org.orm.PersistentException;

import timelogger.control.ControlFacade;
import timelogger.domain.Consulente;
import timelogger.domain.SottoProgetto;
import timelogger.presentation.UIFacade;
import timelogger.utilities.Constants;

public class OperationStoreSP implements OperationFlyweight {
	
	private SottoProgetto sp;
	private int aux;
	

	@SuppressWarnings("unchecked")
	@Override
	public void doOp(ControlFacade controller, Container invoker) {

		System.out.println("--------------------------------------------------");
		System.out.println("OP::StoreSP---> editing and storign a SubProject");
		
		ArrayList<Consulente> consulentTaskList = (ArrayList<Consulente>) UIFacade.getInstance().getAData("ConsulentTaskList");
		sp = (SottoProgetto) UIFacade.getInstance().getAData("SottoProgettoSelezionato");
		aux = (Integer) UIFacade.getInstance().getAData("DurataSPSelezionato");
		sp.setDurataStimata(aux);
		aux = (Integer) UIFacade.getInstance().getAData("PagaOrariaSPSelezionato");
		sp.setPagaOraria(aux);
		aux = (Integer) UIFacade.getInstance().getAData("BudgetSPSelezionato");
		sp.setBudgetStimato(aux);
		
		for(int i=0; i<sp.tasks.size(); i++)
		{	
			if(consulentTaskList.get(i)==null) sp.tasks.get(i).setConsulenteAssociato(null);
			else sp.tasks.get(i).setConsulenteAssociato(consulentTaskList.get(i));
		}
		
		try {
			ControlFacade.getInstance().setTransaction(timelogger.domain.TimeloggerPersistentManager.instance().getSession().beginTransaction());
			sp.save();
			ControlFacade.getInstance().getTransaction().commit();
			UIFacade.getInstance().toGuiAction(Constants.getInstance().resultPopupCommand,invoker);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
