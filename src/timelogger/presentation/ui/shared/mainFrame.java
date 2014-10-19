package timelogger.presentation.ui.shared;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import timelogger.utilities.graphicSettings;

public class mainFrame extends JFrame {


	/**
	 * 
	 */
	private static final long serialVersionUID = 8363206095221037954L;
	
	private Dimension screen, frame;

	public mainFrame() {
		setPreferredSize(graphicSettings.getInstance().getPreferedDimensionFrame());
		setTitle(graphicSettings.getInstance().getTitleFrame());
		setMinimumSize(graphicSettings.getInstance().getMinimumDimensionFrame());
		setMaximumSize(graphicSettings.getInstance().getMaximumDimensionFrame());
		setDefaultCloseOperation(graphicSettings.getInstance().getDefaultFrameCloseOperation());
		this.setLocation(graphicSettings.getInstance().getLocationXFrame(), graphicSettings.getInstance().getLocationYFrame());
		this.requestFocus();
	}

}
