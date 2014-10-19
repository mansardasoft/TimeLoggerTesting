package timelogger.utilities;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;

import timelogger.presentation.UIFacade;

public class graphicSettings {
	
	private graphicSettings()
	{
		
	}
	
	private static graphicSettings instance = new graphicSettings();
	
	public static graphicSettings getInstance() 
	{
		return instance;
	}
	
	//TOD: loginPanel, alertDialog, resultPanel

	//Roba di sistema
	private Font generalFont = new Font("Tahoma", Font.PLAIN, 11);
	private Color backgroundColor = new Color (240, 240, 240);
	
	//frame
	private Dimension preferedDimensionFrame = new Dimension (820, 650);
	private Dimension minimumDimensionFrame = new Dimension (820, 650);
	private Dimension maximumDimensionFrame = new Dimension (820, 650);
	private boolean isFrameResizable = false;
	private String titleFrame = "TimeLogger --- Mansardasoft";
	private int defaultFrameCloseOperation = JFrame.EXIT_ON_CLOSE;
	private int locationXFrame = (Toolkit.getDefaultToolkit().getScreenSize().width-preferedDimensionFrame.width)/2;
	private int locationYFrame = (Toolkit.getDefaultToolkit().getScreenSize().height-preferedDimensionFrame.height)/2;
	
	//confirmDialog
	private boolean isDialogResizable = false;
	private String titleDialog = "[TimeLogger]";
	private int defaultDialogCloseOperation = JDialog.DISPOSE_ON_CLOSE;
	private Dimension preferedDimensionDialog = new Dimension (400, 300);
	private Dimension minimumDimensionDialog = new Dimension (400, 300);
	private Dimension maximumDimensionDialog = new Dimension (400, 300);
	private int locationXDialog = (Toolkit.getDefaultToolkit().getScreenSize().width-preferedDimensionDialog.width)/2;
	private int locationYDialog = (Toolkit.getDefaultToolkit().getScreenSize().height-preferedDimensionDialog.height)/2;
	private Dimension preferedContentDimensionInDialog = new Dimension (400, 300);
	private Dimension minimumContentDimensionInDialog = new Dimension (400, 300);
	private Dimension maximumContentDimensionInDialog = new Dimension (400, 300);
	
	//pannelli principali
	private Dimension preferedDimensionPanel = new Dimension(800, 600);
	private Dimension minimumDimensionPanel = new Dimension(800, 600);
	private Dimension maximumDimensionPanel = new Dimension(800, 600);
	
	//bottone logout. NO GET SU QUESTI ATTRIBUTI!
	private String textLogout="Logout";
	private Dimension preferedLogoutDimension = new Dimension(147, 23);
	private Dimension minimumLogoutDimension = new Dimension(147, 23);
	private Dimension maximumLogoutDimension = new Dimension(147, 23);
	//constrains sub panel degli start panel
	private int offsetConstrainsSubPanel = 10;
	//settings dei border pannellini dentro ai main panel. NO GET SU QUESTI ATTRIBUTI!
	private Font fontTitledBorderInsidePanel = new Font ("Arial", Font.PLAIN, 14);
	private Color matteBorderColor = new Color(0, 0, 0);
	private int matteBorderInsetTop = 1;
	private int matteBorderInsetBottom = 1;
	private int matteBorderInsetLeft = 1;
	private int matteBorderInsetRight = 1;
	private int titleJustification = TitledBorder.LEADING;
	private int titlePosition = TitledBorder.TOP;
	
	private Font fontTitledBorderFunctionPanel = new Font ("Arial", Font.PLAIN, 12);
	
	
	//bordo dei pannelli delle funzioni (es: Dati sottoprogetto dentro editSubProjPanel in manager)
	public TitledBorder getBorderOfFunctionPanel() {
		return new TitledBorder(new MatteBorder(matteBorderInsetTop, matteBorderInsetLeft, matteBorderInsetBottom, 
				matteBorderInsetRight, matteBorderColor), "", titleJustification, titlePosition, fontTitledBorderFunctionPanel);
	}
	
	
	//bordo degli start panel
	public TitledBorder getBorderOfInsidePanel()
	{
		//remember: sul bordo bisogna chiamare SetTitle
		return new TitledBorder(new MatteBorder(matteBorderInsetTop, matteBorderInsetLeft, matteBorderInsetBottom, 
				matteBorderInsetRight, matteBorderColor), "", titleJustification, titlePosition, fontTitledBorderInsidePanel);
	}
	
	public JButton getLogoutButton() {
		JButton btnLogout = new JButton(textLogout);
		btnLogout.setPreferredSize(preferedLogoutDimension);
		btnLogout.setMinimumSize(minimumLogoutDimension);
		btnLogout.setMaximumSize(maximumLogoutDimension);
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UIFacade.getInstance().toSysAction(Constants.getInstance().operationLogout, null);
			}
		});
		return btnLogout;	
	}

	public Font getGeneralFont() {
		return generalFont;
	}

	public Color getBackgroundColor() {
		return backgroundColor;
	}

	public Dimension getPreferedDimensionFrame() {
		return preferedDimensionFrame;
	}

	public Dimension getMinimumDimensionFrame() {
		return minimumDimensionFrame;
	}

	public Dimension getMaximumDimensionFrame() {
		return maximumDimensionFrame;
	}

	public boolean isFrameResizable() {
		return isFrameResizable;
	}

	public String getTitleFrame() {
		return titleFrame;
	}

	public int getDefaultFrameCloseOperation() {
		return defaultFrameCloseOperation;
	}

	public int getLocationXFrame() {
		return locationXFrame;
	}

	public int getLocationYFrame() {
		return locationYFrame;
	}

	public boolean isDialogResizable() {
		return isDialogResizable;
	}

	public int getDefaultDialogCloseOperation() {
		return defaultDialogCloseOperation;
	}

	public Dimension getPreferedDimensionDialog() {
		return preferedDimensionDialog;
	}

	public Dimension getMinimumDimensionDialog() {
		return minimumDimensionDialog;
	}

	public Dimension getMaximumDimensionDialog() {
		return maximumDimensionDialog;
	}

	public int getLocationXDialog() {
		return locationXDialog;
	}

	public int getLocationYDialog() {
		return locationYDialog;
	}

	public Dimension getPreferedContentDimensionInDialog() {
		return preferedContentDimensionInDialog;
	}

	public Dimension getPreferedDimensionPanel() {
		return preferedDimensionPanel;
	}

	public Dimension getMinimumDimensionPanel() {
		return minimumDimensionPanel;
	}

	public Dimension getMaximumDimensionPanel() {
		return maximumDimensionPanel;
	}

	public int getMatteBorderInsetTop() {
		return matteBorderInsetTop;
	}

	public String getTitleDialog() {
		return titleDialog;
	}

	public Dimension getMaximumContentDimensionInDialog() {
		return maximumContentDimensionInDialog;
	}

	public Dimension getMinimumContentDimensionInDialog() {
		return minimumContentDimensionInDialog;
	}
	
	public int getOffsetConstrainsSubPanel() {
		return offsetConstrainsSubPanel;
	}


}
