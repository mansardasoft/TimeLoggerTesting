package timelogger.presentation.graphicCommand;


import java.awt.Container;
import java.util.concurrent.ConcurrentHashMap;

public interface GraphicCommand {
	
	public void draw(Container c);

	public void setData(ConcurrentHashMap<String,String> data);
	
	public ConcurrentHashMap<String,String> getData();
}
