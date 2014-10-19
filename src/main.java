
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import timelogger.presentation.*;
import timelogger.presentation.graphicCommand.GuiBuilder;
import timelogger.utilities.Constants;



public class main {

	public static void main(String args[])
	{	
		
			try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (UnsupportedLookAndFeelException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			GuiBuilder.getInstance().createShared();	
			
			UIFacade.getInstance().toGuiAction(Constants.getInstance().loginPopupCommand,null);
	}
}

