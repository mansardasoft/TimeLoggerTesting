package timelogger.control.operation;

import java.awt.Container;

import timelogger.control.ControlFacade;
import timelogger.domain.SottoProgetto;
import timelogger.presentation.UIFacade;

public class OperationRetrieveSubProject implements OperationFlyweight{

	@SuppressWarnings("unused")
	@Override
	public void doOp(ControlFacade controller, Container invoker) {
		SottoProgetto sp=(SottoProgetto)UIFacade.getInstance().getAData("SottoProgettoSelezionato");
	}

}
