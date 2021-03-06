package timelogger.control.operation;

import timelogger.control.ControlFacade;
import timelogger.domain.*;
import timelogger.presentation.UIFacade;
import timelogger.utilities.Constants;

import java.awt.*;
import java.util.concurrent.ConcurrentHashMap;

public class OperationCreateNewProject implements OperationFlyweight {
    private Progetto newProj;


    @Override
    public void doOp(ControlFacade controller, Container invoker) {
        System.out.println("--------------------------------------------------");
        System.out.println("OP::OperationCreateNewProject---> creating new instance for a Project");

        Admin a = (Admin) controller.getData("user");
        newProj = ProgettoFactory.createProgetto();
        newProj.setAdmin(a);
        controller.setData("newProject", newProj);
        ControlFacade.getInstance().setData("invoicesMap", new ConcurrentHashMap<String, Fattura>());
        ControlFacade.getInstance().setData("subProjsMap", new ConcurrentHashMap<String, SottoProgetto>());

        UIFacade.getInstance().toGuiAction(Constants.getInstance().createProjectCommand, invoker);
    }
}
