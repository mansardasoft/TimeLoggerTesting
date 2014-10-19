package timelogger.presentation.graphicCommand.manager;

import java.awt.Container;
import java.util.concurrent.ConcurrentHashMap;

import javax.swing.JPanel;

import timelogger.presentation.UIFacade;
import timelogger.presentation.graphicCommand.GraphicCommand;
import timelogger.presentation.graphicCommand.GuiManager;
import timelogger.presentation.ui.admin.subProjResumePanel;

public class SubProjResumeCommand implements GraphicCommand{

	@Override
	public void draw(Container c)
	{
		subProjResumePanel s=new subProjResumePanel();
		
		s.setTitle((String)UIFacade.getInstance().getAData("TitoloSottoProgetto"));
		
		c.add(s);
		s.setFather(c);
		s.setUpdatableParent((JPanel)UIFacade.getInstance().getAData("subProjsPanel"));
		c.validate();
		GuiManager.getInstance().getWindow().validate();
	}

	@Override
	public void setData(ConcurrentHashMap<String, String> data) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public ConcurrentHashMap<String, String> getData()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
