package timelogger.control.operation;

import java.awt.Container;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

import timelogger.control.ControlFacade;
import timelogger.domain.Progetto;
import timelogger.domain.SottoProgetto;
import timelogger.presentation.UIFacade;
import timelogger.presentation.ui.admin.subProjResumePanel;
import timelogger.utilities.Constants;

public class OperationRemoveSubProj implements OperationFlyweight{

	@Override
	public void doOp(ControlFacade controller, Container invoker)
	{
		System.out.println("--------------------------------------------------");
		System.out.println("OP::OperationRemoveSubProject---> removing a Subproject from a Project");
		
		subProjResumePanel sp=(subProjResumePanel) invoker;
		ConcurrentHashMap<String,SottoProgetto> spMap = this.updateMap(sp);
		
		Progetto p=(Progetto)ControlFacade.getInstance().getData("newProject");
		this.updateSubProjsFromMap(p, spMap);
		
		UIFacade.getInstance().toGuiAction(Constants.getInstance().removeSubProjResumeCommand, invoker);
	}
	
	
	private ConcurrentHashMap<String,SottoProgetto> updateMap(subProjResumePanel sp)
	{
		@SuppressWarnings("unchecked")
		ConcurrentHashMap<String,SottoProgetto> spMap = (ConcurrentHashMap<String,SottoProgetto>) ControlFacade.getInstance().getData("subProjsMap");
		spMap.remove(String.valueOf(sp.getIndex()));
		return spMap;
	}
	
	@SuppressWarnings("unchecked")
	private void updateSubProjsFromMap(Progetto p, ConcurrentHashMap<String,SottoProgetto> spMap)
	{
		ArrayList<SottoProgetto> ordered=Collections.list(Collections.enumeration(spMap.values()));
		Collections.sort(ordered);
		p.sottoprogetti.clear();
		for(int i=0;i<ordered.size();i++)
			p.sottoprogetti.add(ordered.get(i));
	}

}
