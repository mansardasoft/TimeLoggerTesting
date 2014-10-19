package timelogger.presentation.ui.consulent;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SpinnerDateModel;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import org.jdesktop.swingx.JXDatePicker;

import timelogger.presentation.UIFacade;
import timelogger.presentation.graphicCommand.GuiManager;
import timelogger.utilities.Constants;


public class createTimeRecordPanel extends JPanel {
	private JXDatePicker dataInizio;
	private JXDatePicker dataFine;
	private Box verticalBox;
	private JComboBox cbxTask;
	private JPanel historyPanel;
	private JTextArea textCommento;
	private JSpinner spinnerOraFine;
	private JSpinner spinnerOraInizio;
	private JButton btnRegistraTimeRecord;
	private boolean dataInizioCheck= false;
	private boolean dataFineCheck= false;
	private boolean spinnerOraInizioCheck= false;
	private boolean spinnerOraFineCheck= false;
	private boolean cbxTaskCheck= false;

	/**
	 * Create the panel.
	 */
	public createTimeRecordPanel() {
		
		setPreferredSize(new Dimension(800, 600));
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JPanel formTRPanel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, formTRPanel, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, formTRPanel, 267, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, formTRPanel, -10, SpringLayout.EAST, this);
		add(formTRPanel);
		
		historyPanel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, historyPanel, 10, SpringLayout.SOUTH, formTRPanel);
		springLayout.putConstraint(SpringLayout.WEST, formTRPanel, 0, SpringLayout.WEST, historyPanel);
		springLayout.putConstraint(SpringLayout.WEST, historyPanel, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, historyPanel, -10, SpringLayout.EAST, this);
		SpringLayout sl_formTRPanel = new SpringLayout();
		formTRPanel.setLayout(sl_formTRPanel);
		
		JLabel lblDataInizio = new JLabel("Data Inizio");
		sl_formTRPanel.putConstraint(SpringLayout.WEST, lblDataInizio, 20, SpringLayout.WEST, formTRPanel);
		formTRPanel.add(lblDataInizio);
		
		JLabel lblDataFine = new JLabel("Data Fine");
		sl_formTRPanel.putConstraint(SpringLayout.WEST, lblDataFine, 0, SpringLayout.WEST, lblDataInizio);
		sl_formTRPanel.putConstraint(SpringLayout.SOUTH, lblDataFine, 50, SpringLayout.SOUTH, lblDataInizio);
		formTRPanel.add(lblDataFine);
		
		JLabel lblOraInizio = new JLabel("Ora Inizio");
		sl_formTRPanel.putConstraint(SpringLayout.SOUTH, lblOraInizio, 0, SpringLayout.SOUTH, lblDataInizio);
		formTRPanel.add(lblOraInizio);
		
		JLabel lblOraFine = new JLabel("Ora Fine");
		sl_formTRPanel.putConstraint(SpringLayout.WEST, lblOraFine, 0, SpringLayout.WEST, lblOraInizio);
		sl_formTRPanel.putConstraint(SpringLayout.SOUTH, lblOraFine, 0, SpringLayout.SOUTH, lblDataFine);
		formTRPanel.add(lblOraFine);
		
		JRadioButton rdbtnSi = new JRadioButton("Si");
		formTRPanel.add(rdbtnSi);
		
		JRadioButton rdbtnNo = new JRadioButton("No");
		sl_formTRPanel.putConstraint(SpringLayout.WEST, rdbtnNo, 16, SpringLayout.EAST, rdbtnSi);
		sl_formTRPanel.putConstraint(SpringLayout.SOUTH, rdbtnNo, 0, SpringLayout.SOUTH, rdbtnSi);
		formTRPanel.add(rdbtnNo);
		
		JLabel lblCompletato = new JLabel("Completato");
		sl_formTRPanel.putConstraint(SpringLayout.WEST, lblCompletato, 0, SpringLayout.WEST, lblDataInizio);
		sl_formTRPanel.putConstraint(SpringLayout.SOUTH, rdbtnSi, 2, SpringLayout.SOUTH, lblCompletato);
		formTRPanel.add(lblCompletato);
		
		textCommento = new JTextArea();
		textCommento.setLineWrap(true);
		sl_formTRPanel.putConstraint(SpringLayout.SOUTH, textCommento, 0, SpringLayout.SOUTH, lblCompletato);
		sl_formTRPanel.putConstraint(SpringLayout.NORTH, lblDataInizio, 3, SpringLayout.NORTH, textCommento);
		textCommento.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		sl_formTRPanel.putConstraint(SpringLayout.NORTH, textCommento, 42, SpringLayout.NORTH, formTRPanel);
		sl_formTRPanel.putConstraint(SpringLayout.EAST, textCommento, -40, SpringLayout.EAST, formTRPanel);
		formTRPanel.add(textCommento);
		
		JLabel lblCommento = new JLabel("Commento");
		sl_formTRPanel.putConstraint(SpringLayout.NORTH, lblCommento, 15, SpringLayout.NORTH, formTRPanel);
		sl_formTRPanel.putConstraint(SpringLayout.WEST, textCommento, 0, SpringLayout.WEST, lblCommento);
		sl_formTRPanel.putConstraint(SpringLayout.EAST, lblCommento, -235, SpringLayout.EAST, formTRPanel);
		formTRPanel.add(lblCommento);
		
		cbxTask = new JComboBox();
	
		cbxTask.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UIFacade.getInstance().setAData("TaskSelezionato", cbxTask.getSelectedItem());
				UIFacade.getInstance().toGuiAction(Constants.getInstance().fillTimeRecordListCommand, verticalBox);
				historyPanel.validate();
				if(cbxTask.getSelectedItem() instanceof String) cbxTaskCheck=false;
				else cbxTaskCheck=true;
				recEnabler();
			}
		});
		formTRPanel.add(cbxTask);
		
		dataInizio = new JXDatePicker();
		dataInizio.setDate(Calendar.getInstance().getTime());
		sl_formTRPanel.putConstraint(SpringLayout.WEST, cbxTask, 0, SpringLayout.WEST, dataInizio);
		sl_formTRPanel.putConstraint(SpringLayout.WEST, rdbtnSi, 0, SpringLayout.WEST, dataInizio);
		sl_formTRPanel.putConstraint(SpringLayout.WEST, dataInizio, 30, SpringLayout.EAST, lblDataInizio);
		sl_formTRPanel.putConstraint(SpringLayout.SOUTH, dataInizio, 2, SpringLayout.SOUTH, lblDataInizio);
		sl_formTRPanel.putConstraint(SpringLayout.WEST, lblOraInizio, 20, SpringLayout.EAST, dataInizio);
		formTRPanel.add(dataInizio);
		
		dataFine = new JXDatePicker();
		dataFine.setDate(Calendar.getInstance().getTime());
		sl_formTRPanel.putConstraint(SpringLayout.WEST, dataFine, 0, SpringLayout.WEST, dataInizio);
		sl_formTRPanel.putConstraint(SpringLayout.SOUTH, dataFine, 2, SpringLayout.SOUTH, lblDataFine);
		formTRPanel.add(dataFine);
		
		//Spinner ora fine
		
		Date d=new Date();
		SpinnerDateModel sm = new SpinnerDateModel(d, null, null, Calendar.HOUR_OF_DAY);
		spinnerOraFine = new JSpinner(sm);
		JSpinner.DateEditor de = new JSpinner.DateEditor(spinnerOraFine, "HH:mm");
		spinnerOraFine.setEditor(de);
	
		sl_formTRPanel.putConstraint(SpringLayout.SOUTH, spinnerOraFine, 2, SpringLayout.SOUTH, lblOraFine);
		spinnerOraFine.setPreferredSize(new Dimension(6, 22));
		formTRPanel.add(spinnerOraFine);
		
		d=new Date();
		sm = new SpinnerDateModel(d, null, null, Calendar.HOUR_OF_DAY);
		spinnerOraInizio = new JSpinner(sm);
		de = new JSpinner.DateEditor(spinnerOraInizio, "HH:mm");
		spinnerOraInizio.setEditor(de);		
		
		sl_formTRPanel.putConstraint(SpringLayout.EAST, spinnerOraFine, 0, SpringLayout.EAST, spinnerOraInizio);
		sl_formTRPanel.putConstraint(SpringLayout.EAST, spinnerOraInizio, 100, SpringLayout.EAST, lblOraInizio);
			
		sl_formTRPanel.putConstraint(SpringLayout.EAST, cbxTask, 0, SpringLayout.EAST, spinnerOraInizio);
		sl_formTRPanel.putConstraint(SpringLayout.SOUTH, spinnerOraInizio, 2, SpringLayout.SOUTH, lblOraInizio);
		sl_formTRPanel.putConstraint(SpringLayout.WEST, spinnerOraFine, 0, SpringLayout.WEST, spinnerOraInizio);
		sl_formTRPanel.putConstraint(SpringLayout.WEST, spinnerOraInizio, 20, SpringLayout.EAST, lblOraInizio);
		spinnerOraInizio.setPreferredSize(new Dimension(6, 22));
		formTRPanel.add(spinnerOraInizio);
		
		JLabel lblTask = new JLabel("Task");
		sl_formTRPanel.putConstraint(SpringLayout.SOUTH, lblCompletato, 50, SpringLayout.SOUTH, lblTask);
		sl_formTRPanel.putConstraint(SpringLayout.SOUTH, lblTask, 50, SpringLayout.SOUTH, lblDataFine);
		sl_formTRPanel.putConstraint(SpringLayout.NORTH, cbxTask, -2, SpringLayout.NORTH, lblTask);
		sl_formTRPanel.putConstraint(SpringLayout.WEST, lblTask, 0, SpringLayout.WEST, lblDataInizio);
		formTRPanel.add(lblTask);
		add(historyPanel);
		SpringLayout sl_historyPanel = new SpringLayout();
		historyPanel.setLayout(sl_historyPanel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		sl_historyPanel.putConstraint(SpringLayout.NORTH, scrollPane, 0, SpringLayout.NORTH, historyPanel);
		sl_historyPanel.putConstraint(SpringLayout.WEST, scrollPane, 0, SpringLayout.WEST, historyPanel);
		sl_historyPanel.putConstraint(SpringLayout.SOUTH, scrollPane, 0, SpringLayout.SOUTH, historyPanel);
		sl_historyPanel.putConstraint(SpringLayout.EAST, scrollPane, 0, SpringLayout.EAST, historyPanel);
		historyPanel.add(scrollPane);
		
		JPanel headersBox = new JPanel();
		headersBox.setPreferredSize(new Dimension(10, 30));
		scrollPane.setColumnHeaderView(headersBox);
		SpringLayout sl_headersBox = new SpringLayout();
		headersBox.setLayout(sl_headersBox);
		
		JLabel lblId = new JLabel("ID");
		sl_headersBox.putConstraint(SpringLayout.EAST, lblId, 20, SpringLayout.WEST, headersBox);
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		sl_headersBox.putConstraint(SpringLayout.NORTH, lblId, 0, SpringLayout.NORTH, headersBox);
		sl_headersBox.putConstraint(SpringLayout.WEST, lblId, 0, SpringLayout.WEST, headersBox);
		sl_headersBox.putConstraint(SpringLayout.SOUTH, lblId, 0, SpringLayout.SOUTH, headersBox);
		headersBox.add(lblId);
		
		JSeparator separatorID = new JSeparator();
		sl_headersBox.putConstraint(SpringLayout.WEST, separatorID, 0, SpringLayout.EAST, lblId);
		separatorID.setOrientation(SwingConstants.VERTICAL);
		sl_headersBox.putConstraint(SpringLayout.NORTH, separatorID, 0, SpringLayout.NORTH, headersBox);
		sl_headersBox.putConstraint(SpringLayout.SOUTH, separatorID, 0, SpringLayout.SOUTH, headersBox);
		headersBox.add(separatorID);
		
		JLabel lblDStartDB = new JLabel("Data Inizio");
		lblDStartDB.setPreferredSize(new Dimension(150, 16));
		lblDStartDB.setHorizontalAlignment(SwingConstants.CENTER);
		sl_headersBox.putConstraint(SpringLayout.NORTH, lblDStartDB, 0, SpringLayout.NORTH, headersBox);
		sl_headersBox.putConstraint(SpringLayout.WEST, lblDStartDB, 0, SpringLayout.EAST, lblId);
		sl_headersBox.putConstraint(SpringLayout.SOUTH, lblDStartDB, 0, SpringLayout.SOUTH, headersBox);
		headersBox.add(lblDStartDB);
		
		JLabel lblDEndDB = new JLabel("Data Fine");
		lblDEndDB.setHorizontalAlignment(SwingConstants.CENTER);
		sl_headersBox.putConstraint(SpringLayout.NORTH, lblDEndDB, 0, SpringLayout.NORTH, headersBox);
		sl_headersBox.putConstraint(SpringLayout.SOUTH, lblDEndDB, 0, SpringLayout.SOUTH, headersBox);
		lblDEndDB.setPreferredSize(new Dimension(150, 155));
		headersBox.add(lblDEndDB);
		
		JSeparator separatorDS = new JSeparator();
		separatorDS.setOrientation(SwingConstants.VERTICAL);
		sl_headersBox.putConstraint(SpringLayout.WEST, lblDEndDB, 0, SpringLayout.EAST, separatorDS);
		sl_headersBox.putConstraint(SpringLayout.NORTH, separatorDS, 0, SpringLayout.NORTH, headersBox);
		sl_headersBox.putConstraint(SpringLayout.WEST, separatorDS, 0, SpringLayout.EAST, lblDStartDB);
		sl_headersBox.putConstraint(SpringLayout.SOUTH, separatorDS, 0, SpringLayout.SOUTH, headersBox);
		headersBox.add(separatorDS);
		
		JSeparator separatorDE = new JSeparator();
		separatorDE.setOrientation(SwingConstants.VERTICAL);
		sl_headersBox.putConstraint(SpringLayout.NORTH, separatorDE, 0, SpringLayout.NORTH, headersBox);
		sl_headersBox.putConstraint(SpringLayout.WEST, separatorDE, 0, SpringLayout.EAST, lblDEndDB);
		sl_headersBox.putConstraint(SpringLayout.SOUTH, separatorDE, 0, SpringLayout.SOUTH, headersBox);
		headersBox.add(separatorDE);
		
		JLabel lblCommDB = new JLabel("Commento");
		sl_headersBox.putConstraint(SpringLayout.EAST, lblCommDB, -108, SpringLayout.EAST, headersBox);
		lblCommDB.setHorizontalAlignment(SwingConstants.CENTER);
		sl_headersBox.putConstraint(SpringLayout.NORTH, lblCommDB, 0, SpringLayout.NORTH, headersBox);
		sl_headersBox.putConstraint(SpringLayout.WEST, lblCommDB, 0, SpringLayout.EAST, separatorDE);
		sl_headersBox.putConstraint(SpringLayout.SOUTH, lblCommDB, 0, SpringLayout.SOUTH, headersBox);
		headersBox.add(lblCommDB);
		
		JSeparator separator = new JSeparator();
		sl_headersBox.putConstraint(SpringLayout.NORTH, separator, 0, SpringLayout.NORTH, headersBox);
		sl_headersBox.putConstraint(SpringLayout.SOUTH, separator, 0, SpringLayout.SOUTH, headersBox);
		sl_headersBox.putConstraint(SpringLayout.EAST, separator, -60, SpringLayout.EAST, headersBox);
		separator.setOrientation(SwingConstants.VERTICAL);
		headersBox.add(separator);
		
		JLabel lblFatturato = new JLabel("Fatturato");
		lblFatturato.setHorizontalAlignment(SwingConstants.CENTER);
		sl_headersBox.putConstraint(SpringLayout.WEST, lblFatturato, 0, SpringLayout.EAST, separator);
		sl_headersBox.putConstraint(SpringLayout.EAST, lblFatturato, 0, SpringLayout.EAST, headersBox);
		headersBox.add(lblFatturato);
		
		verticalBox = Box.createVerticalBox();
		verticalBox.setSize(new Dimension(700, 400));
		verticalBox.setMinimumSize(new Dimension(700, 400));
		verticalBox.setMaximumSize(new Dimension(700, 400));
		scrollPane.setViewportView(verticalBox);
		
		cbxTask.addActionListener(new ActionListener() {
		 
			public void actionPerformed(ActionEvent arg0) {
				UIFacade.getInstance().setAData("TaskSelezionato", cbxTask.getSelectedItem());
				UIFacade.getInstance().toGuiAction(Constants.getInstance().fillTimeRecordListCommand, verticalBox);
				verticalBox.add(new JLabel("pippo"));
				historyPanel.updateUI();
				
			}
		});
		
		
		btnRegistraTimeRecord = new JButton("Registra Time Record");
		this.btnRegistraTimeRecord.setEnabled(false);
		btnRegistraTimeRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				registraDati();
			}
		});
		
		springLayout.putConstraint(SpringLayout.NORTH, btnRegistraTimeRecord, 569, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, btnRegistraTimeRecord, -10, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, historyPanel, -6, SpringLayout.NORTH, btnRegistraTimeRecord);
		add(btnRegistraTimeRecord);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				goHome();
			}
		});
		btnBack.setPreferredSize(new Dimension(145, 25));
		springLayout.putConstraint(SpringLayout.SOUTH, btnBack, 0, SpringLayout.SOUTH, btnRegistraTimeRecord);
		springLayout.putConstraint(SpringLayout.EAST, btnBack, -20, SpringLayout.WEST, btnRegistraTimeRecord);
		add(btnBack);

	}
	public Box getvBoxTR() {
		return verticalBox;
	}
	public JComboBox getComboBoxTask() {
		return cbxTask;
	}
	
	public void registraDati()
	{
		ArrayList<Object> data=new ArrayList<Object>();
		
		Date aux;
		if (dataInizio.getDate()==null) aux = Calendar.getInstance().getTime();
		else aux=dataInizio.getDate();
		
		Date startTime= (Date) spinnerOraInizio.getValue();
		
		aux.setHours(startTime.getHours());
		aux.setMinutes(startTime.getMinutes());
		
		Timestamp oraInizio = new Timestamp(aux.getTime());
		data.add(oraInizio);

		if (dataFine.getDate()==null) aux = Calendar.getInstance().getTime();
		else aux=dataFine.getDate();
		
		Date endTime=(Date) spinnerOraFine.getValue();
		
		aux.setHours(endTime.getHours());
		aux.setMinutes(endTime.getMinutes());
		
		Timestamp oraFine = new Timestamp(aux.getTime());
		data.add(oraFine);	
		
		data.add(this.cbxTask.getSelectedItem());
		data.add(this.textCommento.getText());
		
		UIFacade.getInstance().setAData("newTRFormData", data);
		UIFacade.getInstance().toSysAction(Constants.getInstance().operationVerifyTRData, GuiManager.getInstance().getWindow().getContentPane());
	}
	
	public void goHome(){
		UIFacade.getInstance().toGuiAction(Constants.getInstance().mainWindowCommand, null);
	}
	
	public void recEnabler(){
		this.btnRegistraTimeRecord.setEnabled(this.cbxTaskCheck);
	}
}
