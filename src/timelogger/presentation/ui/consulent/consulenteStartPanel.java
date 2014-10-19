package timelogger.presentation.ui.consulent;


import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import timelogger.presentation.UIFacade;
import timelogger.utilities.Constants;
import timelogger.utilities.graphicSettings;

import javax.swing.SpringLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;



public class consulenteStartPanel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private boolean cbxTaskCheck = false;
	private JButton btnInsertTR;

	private JPanel historyPanel;

	public consulenteStartPanel() {
		setMinimumSize(graphicSettings.getInstance().getMinimumDimensionPanel());
		setSize(graphicSettings.getInstance().getPreferedDimensionPanel());
		setMaximumSize(graphicSettings.getInstance().getMaximumDimensionPanel());
		setBorder(new EmptyBorder(5, 5, 5, 5));
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JButton btnLogout = graphicSettings.getInstance().getLogoutButton();
		springLayout.putConstraint(SpringLayout.SOUTH, btnLogout, -25, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, btnLogout, -50, SpringLayout.EAST, this);
		
		add(btnLogout);
		
		JPanel insertTRPanel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, insertTRPanel, 100, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, insertTRPanel, graphicSettings.getInstance().getOffsetConstrainsSubPanel(), SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, insertTRPanel, 180, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, insertTRPanel, -graphicSettings.getInstance().getOffsetConstrainsSubPanel(), SpringLayout.EAST, this);
		TitledBorder bordoInsert = graphicSettings.getInstance().getBorderOfInsidePanel();
		bordoInsert.setTitle("Inserisci Time Record");
		insertTRPanel.setBorder(bordoInsert);
		add(insertTRPanel);
		SpringLayout sl_insertTRPanel = new SpringLayout();
		insertTRPanel.setLayout(sl_insertTRPanel);
		
		this.btnInsertTR = new JButton("Inserisci Time Record");
		this.btnInsertTR.setPreferredSize(new Dimension(179, 23));
		
		//btnInsertTR is not available
		this.btnInsertTR.setEnabled(true);
				
		this.btnInsertTR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
						inserisciTimeRecord();
			}
		});
	
		sl_insertTRPanel.putConstraint(SpringLayout.EAST, btnInsertTR, -50, SpringLayout.EAST, insertTRPanel);
		insertTRPanel.add(btnInsertTR);
				
		JLabel lblInsertTR = new JLabel("Seleziona il task");
		sl_insertTRPanel.putConstraint(SpringLayout.WEST, lblInsertTR, 10, SpringLayout.WEST, insertTRPanel);
		sl_insertTRPanel.putConstraint(SpringLayout.SOUTH, btnInsertTR, 0, SpringLayout.SOUTH, lblInsertTR);
		sl_insertTRPanel.putConstraint(SpringLayout.SOUTH, lblInsertTR, -20, SpringLayout.SOUTH, insertTRPanel);
		insertTRPanel.add(lblInsertTR);
		
		historyPanel = new JPanel();
		TitledBorder bordoHistory = graphicSettings.getInstance().getBorderOfInsidePanel();
		bordoHistory.setTitle("Visualizza il mio storico");
		historyPanel.setBorder(bordoHistory);
		springLayout.putConstraint(SpringLayout.NORTH, historyPanel, 50, SpringLayout.SOUTH, insertTRPanel);
		springLayout.putConstraint(SpringLayout.WEST, historyPanel, graphicSettings.getInstance().getOffsetConstrainsSubPanel(), SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, historyPanel, 130, SpringLayout.SOUTH, insertTRPanel);
		springLayout.putConstraint(SpringLayout.EAST, historyPanel, -graphicSettings.getInstance().getOffsetConstrainsSubPanel(), SpringLayout.EAST, this);
		add(historyPanel);
		SpringLayout sl_historyPanel = new SpringLayout();
		historyPanel.setLayout(sl_historyPanel);
		
		
		
		
		JLabel lblHistory = new JLabel("Visualizza il mio storico lavorativo");
		sl_historyPanel.putConstraint(SpringLayout.WEST, lblHistory, 10, SpringLayout.WEST, historyPanel);
		sl_historyPanel.putConstraint(SpringLayout.SOUTH, lblHistory, -20, SpringLayout.SOUTH, historyPanel);
		historyPanel.add(lblHistory);
		
		JButton btnHistory = new JButton("Visualizzo lo storico");
		btnHistory.setMaximumSize(new Dimension(179, 23));
		btnHistory.setPreferredSize(new Dimension(179, 23));
		sl_historyPanel.putConstraint(SpringLayout.SOUTH, btnHistory, 0, SpringLayout.SOUTH, lblHistory);
		sl_historyPanel.putConstraint(SpringLayout.EAST, btnHistory, -50, SpringLayout.EAST, historyPanel);
		historyPanel.add(btnHistory);
		
		JPanel SalaryPanel = new JPanel();
		TitledBorder bordoSalary = graphicSettings.getInstance().getBorderOfInsidePanel();
		bordoSalary.setTitle("Visualizza statino");
		springLayout.putConstraint(SpringLayout.EAST, SalaryPanel, -graphicSettings.getInstance().getOffsetConstrainsSubPanel(), SpringLayout.EAST, this);
		SalaryPanel.setBorder(bordoSalary);
		springLayout.putConstraint(SpringLayout.NORTH, SalaryPanel, 50, SpringLayout.SOUTH, historyPanel);
		springLayout.putConstraint(SpringLayout.WEST, SalaryPanel, graphicSettings.getInstance().getOffsetConstrainsSubPanel(), SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, SalaryPanel, 130, SpringLayout.SOUTH, historyPanel);
		add(SalaryPanel);
		SpringLayout sl_SalaryPanel = new SpringLayout();
		SalaryPanel.setLayout(sl_SalaryPanel);
		
		JLabel lblShowSalary = new JLabel("Visualizza lo stipendio del mese");
		sl_SalaryPanel.putConstraint(SpringLayout.WEST, lblShowSalary, 10, SpringLayout.WEST, SalaryPanel);
		sl_SalaryPanel.putConstraint(SpringLayout.SOUTH, lblShowSalary, -20, SpringLayout.SOUTH, SalaryPanel);
		SalaryPanel.add(lblShowSalary);
		
		JButton btnShowSalry = new JButton("Visualizza lo stipendio del mese");
		sl_SalaryPanel.putConstraint(SpringLayout.SOUTH, btnShowSalry, 0, SpringLayout.SOUTH, lblShowSalary);
		sl_SalaryPanel.putConstraint(SpringLayout.EAST, btnShowSalry, -50, SpringLayout.EAST, SalaryPanel);
		SalaryPanel.add(btnShowSalry);
	}
	
	public void inserisciTimeRecord(){
		//UIFacade.getInstance().toSysAction("OperationRetrieveTRTask", null);
		UIFacade.getInstance().toGuiAction(Constants.getInstance().newTimeRecordFormCommand, null);
		
		//UIFacade.getInstance().toSysAction(Constants.getInstance().operationRetrieveTaskForConsulentList,GuiManager.getInstance().getWindow().getContentPane());
	}

	
	public void setComboBoxTask(JComboBox comboBoxTask) {
	}
}