package timelogger.presentation.graphicCommand.admin;

import java.awt.Container;
import java.util.concurrent.ConcurrentHashMap;

import javax.swing.JPanel;

import timelogger.presentation.UIFacade;
import timelogger.presentation.graphicCommand.GraphicCommand;
import timelogger.presentation.graphicCommand.GuiManager;
import timelogger.presentation.ui.admin.invoiceResumePanel;

public class InvoiceResumeCommand implements GraphicCommand
{

	@Override
	public void draw(Container c) 
	{
		invoiceResumePanel i= new invoiceResumePanel();
		
		// Settato
		i.setDate((String)UIFacade.getInstance().getAData("DataFattura"));
		
		c.add(i);
		i.setFather(c);
		i.setUpdatableParent((JPanel)UIFacade.getInstance().getAData("invoicesPanel"));
		c.validate();
		GuiManager.getInstance().getWindow().validate();
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
