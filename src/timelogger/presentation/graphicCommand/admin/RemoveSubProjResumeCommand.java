package timelogger.presentation.graphicCommand.admin;

import java.awt.Container;
import java.util.concurrent.ConcurrentHashMap;

import timelogger.presentation.graphicCommand.GraphicCommand;
import timelogger.presentation.ui.admin.subProjResumePanel;

public class RemoveSubProjResumeCommand implements GraphicCommand{

	@Override
	public void draw(Container c)
	{
		subProjResumePanel sp=(subProjResumePanel)c;
		sp.getFather().remove(sp);
		sp.getUpdatableParent().updateUI();
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
