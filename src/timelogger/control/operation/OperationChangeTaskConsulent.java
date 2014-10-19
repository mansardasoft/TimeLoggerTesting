package timelogger.control.operation;

import java.awt.Container;

import timelogger.control.ControlFacade;
import timelogger.domain.Consulente;
import timelogger.domain.SottoProgetto;
import timelogger.presentation.UIFacade;
import timelogger.presentation.ui.manager.taskSubProj;

public class OperationChangeTaskConsulent implements OperationFlyweight {

    /**
     *
     * In order to execute correctly this operation a well formed SottoProgetto object must be
     * instanced in UIFacade data map under the key "SottoProgettoSelezionato"
     *
     * @param controller
     * @param invoker, a taskSubProj class with a correctly selected Consulente in combobox
     */

	@Override
	public void doOp(ControlFacade controller, Container invoker) {
		
		System.out.println("--------------------------------------------------");
		System.out.println("OP::OperationChangeTaskConsulent---> changing the assigned Consulent to a task");
		
		taskSubProj t = (taskSubProj) invoker;
		
		SottoProgetto sp = (SottoProgetto) UIFacade.getInstance().getAData("SottoProgettoSelezionato");
		Consulente c = (Consulente) t.getComboConsulente().getSelectedItem();
		
		sp.tasks.get(Integer.parseInt(t.getLblTaskNumber().getText())-1).setConsulenteAssociato(c);
	}

}
