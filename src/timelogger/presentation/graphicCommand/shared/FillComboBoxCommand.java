package timelogger.presentation.graphicCommand.shared;

import java.awt.Container;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

import timelogger.presentation.UIFacade;
import timelogger.presentation.graphicCommand.GraphicCommand;

public class FillComboBoxCommand implements GraphicCommand{

	//
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void draw(Container c)
	{
		JComboBox cbx=(JComboBox) c;
		ArrayList<Object> listTemp = (ArrayList<Object>) UIFacade.getInstance().getAData("ComboBoxList");
		DefaultComboBoxModel d = new DefaultComboBoxModel(listTemp.toArray());
		
		//Finds a string in arrayList and puts the first string as label
		for(int i=0;i<d.getSize();i++)
		{
			Object o=d.getElementAt(i);
			if(o instanceof String)
			{
				i=d.getSize();
				d.setSelectedItem(o);
			}
		}
		
		cbx.setModel(d);
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
