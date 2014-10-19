package timelogger.control.operation;

import java.awt.Container;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.orm.PersistentException;
import org.orm.PersistentSession;

import timelogger.control.ControlFacade;
import timelogger.domain.Manager;
import timelogger.presentation.UIFacade;
import timelogger.utilities.Constants;
import timelogger.domain.SottoProgetto;

public class OperationRetrieveSubProjList implements OperationFlyweight{
	
	private ArrayList<Object> subProjList=new ArrayList<Object>();

	@SuppressWarnings("unchecked")
	@Override
	public void doOp(ControlFacade controller, Container invoker) {
		System.out.println("--------------------------------------------------");
		System.out.println("OP::OperationRetrieveSubProjList---> retrieving subprojects from DB");
		
		subProjList.clear();
		List<SottoProgetto> retrievedSubProjects = null;
		Manager m = (Manager) ControlFacade.getInstance().getData("user");
		try {
			PersistentSession sess = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			retrievedSubProjects=sess.createCriteria(SottoProgetto.class)
					.add(Restrictions.like("manager", m))
				    .list();
			
			this.subProjList.add("seleziona un sottoprogetto");
			for(int i=0;i<retrievedSubProjects.size();i++)
				this.subProjList.add(retrievedSubProjects.get(i));
		} catch (PersistentException e) {
		}
		
		UIFacade.getInstance().setAData("ComboBoxList", this.subProjList);
		
		UIFacade.getInstance().toGuiAction(Constants.getInstance().fillComboBoxCommand, invoker); //invoker deve essere una cbx
	}

}