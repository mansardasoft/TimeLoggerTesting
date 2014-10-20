package timelogger.control.operation;

import java.awt.Container;
import java.util.Date;

import timelogger.control.ControlFacade;
import timelogger.domain.Cliente;
import timelogger.domain.Progetto;
import timelogger.presentation.UIFacade;
import timelogger.utilities.Constants;
import timelogger.utilities.DateConverter;

public class OperationSetProjData implements OperationFlyweight{

	@Override
	public void doOp(ControlFacade controller, Container invoker) {
		
		System.out.println("--------------------------------------------------");
		System.out.println("OP::OperationSetProjData---> setting data in project");

		Progetto p= (Progetto) ControlFacade.getInstance().getData("newProject");

        p.setTitolo((String)UIFacade.getInstance().getAData("TitoloProgetto"));
		
		DateConverter dc=new DateConverter();

        Date d=(Date) UIFacade.getInstance().getAData("DataProgetto");
		p.setDataInizio(d);
		
		p.setClienteAssociato((Cliente) UIFacade.getInstance().getAData("ClienteProgetto"));
	
		UIFacade.getInstance().setAData("Progetto", p);

        UIFacade.getInstance().toGuiAction(Constants.getInstance().confirmProjectPopupCommand, invoker);
	}

}
