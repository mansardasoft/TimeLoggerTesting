package timelogger.presentation.ui.shared;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JDialog;

import timelogger.utilities.graphicSettings;


public class confirmDialog extends JDialog {


	/**
	 * 
	 */
	private static final long serialVersionUID = -3019324601308064930L;
	
	public confirmDialog() {
		setTitle(graphicSettings.getInstance().getTitleDialog());
		setResizable(graphicSettings.getInstance().isDialogResizable());
		setFocusCycleRoot(false);
		getContentPane().setPreferredSize(new Dimension(400, 350));
		setDefaultCloseOperation(graphicSettings.getInstance().getDefaultDialogCloseOperation());
		getContentPane().setMinimumSize(graphicSettings.getInstance().getMinimumContentDimensionInDialog());
		getContentPane().setMaximumSize(graphicSettings.getInstance().getMaximumContentDimensionInDialog());
		getContentPane().setLayout(new BorderLayout(0, 0));
		setMinimumSize(graphicSettings.getInstance().getMinimumDimensionDialog());
		setMaximumSize(graphicSettings.getInstance().getMaximumDimensionDialog());
		setPreferredSize(graphicSettings.getInstance().getPreferedDimensionFrame());
		setLocation(graphicSettings.getInstance().getLocationXDialog(), graphicSettings.getInstance().getLocationYDialog());
	}
}
