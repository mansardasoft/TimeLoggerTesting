package timelogger.control.operation;

import java.awt.Container;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

import timelogger.control.ControlFacade;
import timelogger.domain.Fattura;
import timelogger.domain.Progetto;
import timelogger.presentation.UIFacade;
import timelogger.presentation.ui.admin.invoiceResumePanel;
import timelogger.utilities.Constants;

public class OperationRemoveInvoice implements OperationFlyweight{

	@Override
	public void doOp(ControlFacade controller, Container invoker)
	{
		System.out.println("--------------------------------------------------");
		System.out.println("OP::OperationRemoveInvoice---> removing an invoice from a Project");
	
		
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		invoiceResumePanel fp=(invoiceResumePanel) invoker;
		ConcurrentHashMap<String,Fattura> fMap = this.updateMap(fp);
		
		/*
		 * 
		 * 
		 * 
		 */
		
		Progetto p=(Progetto)ControlFacade.getInstance().getData("newProject");
		this.updateInvoicesFromMap(p, fMap);
		
		/*
		 * 
		 * 
		 * 
		 * 
		 */
		
		UIFacade.getInstance().toGuiAction(Constants.getInstance().removeInvoiceResumeCommand, invoker);
	}
	
	private ConcurrentHashMap<String,Fattura> updateMap(invoiceResumePanel fp)
	{
		@SuppressWarnings("unchecked")
		ConcurrentHashMap<String,Fattura> fMap = (ConcurrentHashMap<String,Fattura>) ControlFacade.getInstance().getData("invoicesMap");
		fMap.remove(String.valueOf(fp.getIndex()));
		return fMap;
	}
	
	@SuppressWarnings("unchecked")
	private void updateInvoicesFromMap(Progetto p, ConcurrentHashMap<String,Fattura> fMap)
	{
		ArrayList<Fattura> ordered=Collections.list(Collections.enumeration(fMap.values()));
		Collections.sort(ordered);
		p.fatture.clear();
		for(int i=0;i<ordered.size();i++)
			p.fatture.add(ordered.get(i));
	}
	
}
