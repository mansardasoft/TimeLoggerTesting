package timelogger.presentation.graphicCommand;

import java.awt.Container;
import java.util.concurrent.ConcurrentHashMap;

public class ClearThisContainerCommand implements GraphicCommand{

	@Override
	public void draw(Container c) {
		c.removeAll();
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
