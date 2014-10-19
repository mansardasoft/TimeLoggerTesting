package timelogger.control.operation;

import java.awt.Container;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

import timelogger.control.ControlFacade;
import timelogger.domain.Manager;
import timelogger.domain.Progetto;
import timelogger.domain.SottoProgetto;
import timelogger.domain.SottoProgettoFactory;
import timelogger.presentation.UIFacade;
import timelogger.presentation.ui.admin.subProjResumePanel;
import timelogger.utilities.Constants;

public class OperationCreateNewSubProj implements OperationFlyweight{

	private SottoProgetto sp;
	
	@Override
	public void doOp(ControlFacade controller, Container invoker) 
	{
		System.out.println("--------------------------------------------------");
		System.out.println("OP::OperationCreateNewSubProject---> creating new SubProject for a Project");
		
		this.createNewSubProj();
		this.setSpData();
		ConcurrentHashMap<String,SottoProgetto> spMap = this.updateMap();
		Progetto p=(Progetto)ControlFacade.getInstance().getData("newProject");
		this.updateSubProjsFromMap(p, spMap);
		
		this.reInitializeList(p, spMap, invoker);
		
	}
	
	private void createNewSubProj()
	{
		this.sp=SottoProgettoFactory.createSottoProgetto();
		Progetto p=(Progetto) ControlFacade.getInstance().getData("newProject");
		this.sp.setProgetto(p);				
	}
	
	private void setSpData()
	{
		this.sp.setTitolo((String)ControlFacade.getInstance().getData("TitoloSottoProgetto"));
		this.sp.setBudgetStimato((Integer) (ControlFacade.getInstance().getData("DurataSottoProgetto")));
		this.sp.setDurataStimata((Integer) ControlFacade.getInstance().getData("BudgetSottoProgetto"));
		this.sp.setManager((Manager) ControlFacade.getInstance().getData("ManagerSelezionato"));
	}
	
	private ConcurrentHashMap<String,SottoProgetto> updateMap()
	{
		@SuppressWarnings("unchecked")
		ConcurrentHashMap<String,SottoProgetto> spTempMap = (ConcurrentHashMap<String,SottoProgetto>) ControlFacade.getInstance().getData("subProjsMap");
		spTempMap.put(String.valueOf(subProjResumePanel.getCounter()),this.sp);
		return spTempMap;
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
	
	private void reInitializeList(Progetto p, ConcurrentHashMap<String,SottoProgetto> spMap, Container invoker)
	{
		UIFacade.getInstance().toGuiAction(Constants.getInstance().clearThisContainerCommand, invoker);
		
		subProjResumePanel.setCounter(0);
		spMap.clear();
		for(int i=0;i<p.sottoprogetti.size();i++)
		{
			SottoProgetto sp=(SottoProgetto)p.sottoprogetti.get(i);
			spMap.put(String.valueOf(subProjResumePanel.getCounter()),sp);
			UIFacade.getInstance().setAData("TitoloSottoProgetto",sp.toString());
			UIFacade.getInstance().toGuiAction(Constants.getInstance().subProjResumeCommand, invoker);
		}
	}
	
}
