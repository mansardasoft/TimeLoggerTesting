package timelogger.presentation.graphicCommand.admin;

import java.awt.Container;
import java.util.concurrent.ConcurrentHashMap;

import timelogger.presentation.UIFacade;
import timelogger.presentation.graphicCommand.GraphicCommand;
import timelogger.presentation.graphicCommand.GuiManager;
import timelogger.presentation.ui.admin.createProjPanel;
import timelogger.utilities.Constants;

public class CreateProjectCommand implements GraphicCommand {

	@Override
	public void draw(Container c)
	{
		c.removeAll();
		createProjPanel p=new createProjPanel();
		
		// inserimento dei dati
		c.add(p);
		c.validate();
		GuiManager.getInstance().getWindow().validate();
		UIFacade.getInstance().toSysAction(Constants.getInstance().operationRetrieveClientsList, p.getListClients());
		UIFacade.getInstance().toSysAction(Constants.getInstance().operationRetrieveManagersList, p.getListManagers());
	}

	@Override
	public void setData(ConcurrentHashMap<String, String> data)
	{
		// TODO Auto-generated method stub
	}

	@Override
	public ConcurrentHashMap<String, String> getData() {
		// TODO Auto-generated method stub
		return null;
	}

}
