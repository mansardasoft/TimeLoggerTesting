package timelogger.presentation.ui.admin;

import org.jdesktop.swingx.JXDatePicker;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Calendar;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ScrollPaneConstants;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

import timelogger.control.ControlFacade;
import timelogger.domain.Progetto;
import timelogger.presentation.UIFacade;
import timelogger.utilities.Constants;
import timelogger.utilities.graphicSettings;

import javax.swing.DefaultComboBoxModel;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JFormattedTextField;

@SuppressWarnings("serial")
public class createProjPanel extends JPanel{
	
	private JTextField textFieldNameProj,textFieldSubPTitle;
	private JFormattedTextField textFieldBudget, subProjLength;
	private JXDatePicker startDateProj, invoiceDateInvoice;
	
	private JPanel invoicesPanel, dataProjPanel, dataSubProjPanel, subProjPanel, projPanel, panelCenter;
	private Box vBoxInvoices,vBoxSubProjs;
	@SuppressWarnings("rawtypes")
	private JComboBox cbxListClients,listManagers;
	private JButton btnNext,btnBack,btnAddSubProj, btnNewInvoice;
	
	private boolean cbxClientCheck=false;
	private boolean cbxProjDateCheck=false;
	private boolean textFieldNameProjCheck=false;
	private boolean vBoxSubProjsCheck=false;
	
	private boolean titleSubProjCheck=false;
	private boolean cbxManagerCheck=false;
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public createProjPanel() {
		setSize(graphicSettings.getInstance().getPreferedDimensionPanel());
		setMinimumSize(graphicSettings.getInstance().getMinimumDimensionPanel());
		setMaximumSize(graphicSettings.getInstance().getMaximumDimensionPanel());
		setLayout(new BorderLayout(0, 0));
		
		panelCenter = new JPanel();
		panelCenter.setAlignmentY(Component.TOP_ALIGNMENT);
		panelCenter.setAlignmentX(Component.LEFT_ALIGNMENT);
		add(panelCenter, BorderLayout.CENTER);
		
		projPanel = new JPanel();
		TitledBorder bordoProject = graphicSettings.getInstance().getBorderOfFunctionPanel();
		bordoProject.setTitle("Progetto");
		SpringLayout sl_panelCenter = new SpringLayout();
		sl_panelCenter.putConstraint(SpringLayout.NORTH, projPanel, graphicSettings.getInstance().getOffsetConstrainsSubPanel(), SpringLayout.NORTH, panelCenter);
		sl_panelCenter.putConstraint(SpringLayout.WEST, projPanel, 1, SpringLayout.WEST, panelCenter);
		sl_panelCenter.putConstraint(SpringLayout.SOUTH, projPanel, 0, SpringLayout.SOUTH, panelCenter);
		panelCenter.setLayout(sl_panelCenter);
		//projPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Progetto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		projPanel.setBorder(bordoProject);
		projPanel.setPreferredSize(new Dimension(300, 524));
		projPanel.setMaximumSize(new Dimension(2147483647, 2147483647));
		projPanel.setMinimumSize(new Dimension(400, 485));
		projPanel.setSize(new Dimension(400, 485));
		panelCenter.add(projPanel);
		
		dataProjPanel= new JPanel();
		dataProjPanel.setBorder(new TitledBorder(null, "Dati Progetto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		dataProjPanel.setMinimumSize(new Dimension(280, 190));
		dataProjPanel.setMaximumSize(new Dimension(280, 190));
		dataProjPanel.setPreferredSize(new Dimension(280, 190));
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setMaximumSize(new Dimension(70, 16));
		lblNome.setMinimumSize(new Dimension(70, 16));
		lblNome.setHorizontalAlignment(SwingConstants.LEFT);
		lblNome.setPreferredSize(new Dimension(70, 16));
		
		textFieldNameProj = new JTextField();
		textFieldNameProj.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(textFieldNameProj.getText().isEmpty()) textFieldNameProjCheck=false;
				else textFieldNameProjCheck=true;
				nextEnabler();
			}
		});
		textFieldNameProj.setMaximumSize(new Dimension(210, 2147483647));
		textFieldNameProj.setMinimumSize(new Dimension(210, 22));
		textFieldNameProj.setPreferredSize(new Dimension(210, 22));
		textFieldNameProj.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldNameProj.setColumns(15);
		
		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setHorizontalAlignment(SwingConstants.LEFT);
		lblCliente.setPreferredSize(new Dimension(70, 16));
		
		cbxListClients = new JComboBox();

		
		cbxListClients.setPreferredSize(new Dimension(210, 22));
		
		JLabel lblDataInizio = new JLabel("Data Inizio");
		
		startDateProj = new JXDatePicker();
		
		startDateProj.getEditor().setFont(new Font("Tahoma", Font.PLAIN, 13));
		startDateProj.setPreferredSize(new Dimension(126, 24));
	
		
		invoicesPanel = new JPanel();
		invoicesPanel.setAutoscrolls(true);
		invoicesPanel.setBorder(BorderFactory.createTitledBorder("Fatture Parziali"));
		//invocePanel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		invoicesPanel.setPreferredSize(new Dimension(280, 180));
		invoicesPanel.setMinimumSize(new Dimension(280, 190));
		invoicesPanel.setMaximumSize(new Dimension(280, 190));
		SpringLayout sl_projPanel = new SpringLayout();
		sl_projPanel.putConstraint(SpringLayout.NORTH, invoicesPanel, 10, SpringLayout.SOUTH, dataProjPanel);
		sl_projPanel.putConstraint(SpringLayout.SOUTH, invoicesPanel, -10, SpringLayout.SOUTH, projPanel);
		sl_projPanel.putConstraint(SpringLayout.NORTH, dataProjPanel, 10, SpringLayout.NORTH, projPanel);
		sl_projPanel.putConstraint(SpringLayout.WEST, dataProjPanel, 0, SpringLayout.WEST, invoicesPanel);
		sl_projPanel.putConstraint(SpringLayout.SOUTH, dataProjPanel, 184, SpringLayout.NORTH, projPanel);
		sl_projPanel.putConstraint(SpringLayout.EAST, dataProjPanel, -3, SpringLayout.EAST, projPanel);
		sl_projPanel.putConstraint(SpringLayout.WEST, invoicesPanel, 3, SpringLayout.WEST, projPanel);
		sl_projPanel.putConstraint(SpringLayout.EAST, invoicesPanel, -3, SpringLayout.EAST, projPanel);
		projPanel.setLayout(sl_projPanel);
		projPanel.add(dataProjPanel);
		SpringLayout sl_dataProjPanel = new SpringLayout();
		sl_dataProjPanel.putConstraint(SpringLayout.WEST, textFieldNameProj, 0, SpringLayout.WEST, cbxListClients);
		sl_dataProjPanel.putConstraint(SpringLayout.EAST, textFieldNameProj, 0, SpringLayout.EAST, cbxListClients);
		sl_dataProjPanel.putConstraint(SpringLayout.NORTH, startDateProj, 101, SpringLayout.NORTH, dataProjPanel);
		sl_dataProjPanel.putConstraint(SpringLayout.NORTH, lblDataInizio, 107, SpringLayout.NORTH, dataProjPanel);
		sl_dataProjPanel.putConstraint(SpringLayout.NORTH, cbxListClients, 61, SpringLayout.NORTH, dataProjPanel);
		sl_dataProjPanel.putConstraint(SpringLayout.NORTH, lblCliente, 67, SpringLayout.NORTH, dataProjPanel);
		sl_dataProjPanel.putConstraint(SpringLayout.NORTH, textFieldNameProj, 21, SpringLayout.NORTH, dataProjPanel);
		sl_dataProjPanel.putConstraint(SpringLayout.NORTH, lblNome, 24, SpringLayout.NORTH, dataProjPanel);
		sl_dataProjPanel.putConstraint(SpringLayout.WEST, startDateProj, 90, SpringLayout.WEST, dataProjPanel);
		sl_dataProjPanel.putConstraint(SpringLayout.WEST, lblDataInizio, 18, SpringLayout.WEST, dataProjPanel);
		sl_dataProjPanel.putConstraint(SpringLayout.WEST, cbxListClients, 93, SpringLayout.WEST, dataProjPanel);
		sl_dataProjPanel.putConstraint(SpringLayout.EAST, cbxListClients, 264, SpringLayout.WEST, dataProjPanel);
		sl_dataProjPanel.putConstraint(SpringLayout.WEST, lblCliente, 18, SpringLayout.WEST, dataProjPanel);
		sl_dataProjPanel.putConstraint(SpringLayout.WEST, lblNome, 18, SpringLayout.WEST, dataProjPanel);
		dataProjPanel.setLayout(sl_dataProjPanel);
		dataProjPanel.add(lblNome);
		dataProjPanel.add(textFieldNameProj);
		dataProjPanel.add(lblCliente);
		dataProjPanel.add(cbxListClients);
		dataProjPanel.add(lblDataInizio);
		dataProjPanel.add(startDateProj);
		projPanel.add(invoicesPanel);
		invoicesPanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		invoicesPanel.add(scrollPane);
		
		JPanel newInvoicePanel = new JPanel();
		newInvoicePanel.setPreferredSize(new Dimension(200, 35));
		scrollPane.setColumnHeaderView(newInvoicePanel);
		SpringLayout sl_newInvoicePanel = new SpringLayout();
		newInvoicePanel.setLayout(sl_newInvoicePanel);
		
		btnNewInvoice = new JButton("+");
		sl_newInvoicePanel.putConstraint(SpringLayout.WEST, btnNewInvoice, -45, SpringLayout.EAST, newInvoicePanel);
		btnNewInvoice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInvoice();
			}
		});
		btnNewInvoice.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewInvoice.setMaximumSize(new Dimension(26, 25));
		btnNewInvoice.setMinimumSize(new Dimension(26, 25));
		btnNewInvoice.setPreferredSize(new Dimension(26, 25));
		sl_newInvoicePanel.putConstraint(SpringLayout.NORTH, btnNewInvoice, 5, SpringLayout.NORTH, newInvoicePanel);
		sl_newInvoicePanel.putConstraint(SpringLayout.SOUTH, btnNewInvoice, -5, SpringLayout.SOUTH, newInvoicePanel);
		sl_newInvoicePanel.putConstraint(SpringLayout.EAST, btnNewInvoice, -5, SpringLayout.EAST, newInvoicePanel);
		newInvoicePanel.add(btnNewInvoice);
		
		invoiceDateInvoice = new JXDatePicker();
		invoiceDateInvoice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		invoiceDateInvoice.setDate(Calendar.getInstance().getTime());
		invoiceDateInvoice.setFont(new Font("Tahoma", Font.PLAIN, 13));
		sl_newInvoicePanel.putConstraint(SpringLayout.NORTH, invoiceDateInvoice, 7, SpringLayout.NORTH, newInvoicePanel);
		sl_newInvoicePanel.putConstraint(SpringLayout.SOUTH, invoiceDateInvoice, -7, SpringLayout.SOUTH, newInvoicePanel);
		invoiceDateInvoice.setPreferredSize(new Dimension(126, 24));
		sl_newInvoicePanel.putConstraint(SpringLayout.EAST, invoiceDateInvoice, -6, SpringLayout.WEST, btnNewInvoice);
		invoiceDateInvoice.setMaximumSize(new Dimension(6, 20));
		
		newInvoicePanel.add(invoiceDateInvoice);

		JLabel lblDateInvoice = new JLabel("Data Fattura:");
		sl_newInvoicePanel.putConstraint(SpringLayout.NORTH, lblDateInvoice, 5, SpringLayout.NORTH, newInvoicePanel);
		sl_newInvoicePanel.putConstraint(SpringLayout.WEST, lblDateInvoice, 5, SpringLayout.WEST, newInvoicePanel);
		sl_newInvoicePanel.putConstraint(SpringLayout.SOUTH, lblDateInvoice, -5, SpringLayout.SOUTH, newInvoicePanel);
		lblDateInvoice.setPreferredSize(new Dimension(71, 25));
		newInvoicePanel.add(lblDateInvoice);
		
		vBoxInvoices = Box.createVerticalBox();
		scrollPane.setViewportView(vBoxInvoices);
		
		JPanel subProjDataPanel = new JPanel();
		sl_panelCenter.putConstraint(SpringLayout.NORTH, subProjDataPanel, 10, SpringLayout.NORTH, panelCenter);
		sl_panelCenter.putConstraint(SpringLayout.WEST, subProjDataPanel, 302, SpringLayout.WEST, panelCenter);
		sl_panelCenter.putConstraint(SpringLayout.SOUTH, subProjDataPanel, 0, SpringLayout.SOUTH, panelCenter);
		sl_panelCenter.putConstraint(SpringLayout.EAST, subProjDataPanel, -graphicSettings.getInstance().getOffsetConstrainsSubPanel(), SpringLayout.EAST, panelCenter);
		TitledBorder bordoSubProj = graphicSettings.getInstance().getBorderOfFunctionPanel();;
		bordoSubProj.setTitle("Sotto Progetti");
		subProjDataPanel.setBorder(bordoSubProj);
		//subProjDataPanel.setBorder(new TitledBorder(null, "Sotto Progetti", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		subProjDataPanel.setPreferredSize(new Dimension(498, 524));
		subProjDataPanel.setMinimumSize(new Dimension(498, 524));
		subProjDataPanel.setMaximumSize(new Dimension(498, 524));
		panelCenter.add(subProjDataPanel);
		SpringLayout sl_subProjDataPanel = new SpringLayout();
		subProjDataPanel.setLayout(sl_subProjDataPanel);
		
		dataSubProjPanel = new JPanel();
		sl_subProjDataPanel.putConstraint(SpringLayout.NORTH, dataSubProjPanel, 10, SpringLayout.NORTH, subProjDataPanel);
		sl_subProjDataPanel.putConstraint(SpringLayout.WEST, dataSubProjPanel, 3, SpringLayout.WEST, subProjDataPanel);
		sl_subProjDataPanel.putConstraint(SpringLayout.SOUTH, dataSubProjPanel, 184, SpringLayout.NORTH, subProjDataPanel);
		sl_subProjDataPanel.putConstraint(SpringLayout.EAST, dataSubProjPanel, -3, SpringLayout.EAST, subProjDataPanel);
		dataSubProjPanel.setPreferredSize(new Dimension(280, 190));
		dataSubProjPanel.setMinimumSize(new Dimension(290, 190));
		dataSubProjPanel.setMaximumSize(new Dimension(290, 190));
		dataSubProjPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Dati Sotto Progetto", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		subProjDataPanel.add(dataSubProjPanel);
		
		JLabel lblSubPTitle = new JLabel("Titolo");
		lblSubPTitle.setPreferredSize(new Dimension(70, 16));
		lblSubPTitle.setMinimumSize(new Dimension(70, 16));
		lblSubPTitle.setMaximumSize(new Dimension(70, 16));
		lblSubPTitle.setHorizontalAlignment(SwingConstants.LEFT);
		
		textFieldSubPTitle = new JTextField();
		textFieldSubPTitle.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(textFieldSubPTitle.getText().isEmpty()) titleSubProjCheck=false;
				else titleSubProjCheck=true;
				nextSubProjEnabler();
			}
		});
		textFieldSubPTitle.setPreferredSize(new Dimension(210, 22));
		textFieldSubPTitle.setMinimumSize(new Dimension(210, 22));
		textFieldSubPTitle.setMaximumSize(new Dimension(210, 2147483647));
		textFieldSubPTitle.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldSubPTitle.setColumns(15);
		
		JLabel lblManager = new JLabel("Manager");
		lblManager.setPreferredSize(new Dimension(70, 16));
		lblManager.setHorizontalAlignment(SwingConstants.LEFT);
		
		listManagers = new JComboBox();
		
		
		listManagers.setModel(new DefaultComboBoxModel(new String[] {"Scegliere il manager da associare al sottoprogetto"}));
		listManagers.setPreferredSize(new Dimension(210, 22));
		
		JLabel lblSubProjLength = new JLabel("Durata");
			
		subProjLength = new JFormattedTextField(new Integer(0));
							
		//.setText("0");

		subProjLength.setHorizontalAlignment(SwingConstants.LEFT);
		subProjLength.setColumns(10);
		
		JLabel lblBudget = new JLabel("Budget");
		
		textFieldBudget = new JFormattedTextField(new Integer(0));
	
		textFieldBudget.setText("0");
		textFieldBudget.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldBudget.setColumns(10);
		
		btnAddSubProj = new JButton("Aggiungi sotto progetto");
		btnAddSubProj.setEnabled(false);

		btnAddSubProj.setPreferredSize(new Dimension(147, 25));
		btnAddSubProj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addSubProj();
			}
		});
		
		listManagers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(listManagers.getSelectedItem() instanceof String) cbxManagerCheck=false;
				else cbxManagerCheck=true;
				nextSubProjEnabler();
			}
		});
		
		SpringLayout sl_dataSubProjPanel = new SpringLayout();
		sl_dataSubProjPanel.putConstraint(SpringLayout.WEST, lblBudget, 0, SpringLayout.WEST, lblSubProjLength);
		sl_dataSubProjPanel.putConstraint(SpringLayout.EAST, lblBudget, 10, SpringLayout.WEST, textFieldBudget);
		sl_dataSubProjPanel.putConstraint(SpringLayout.NORTH, subProjLength, 0, SpringLayout.NORTH, textFieldSubPTitle);
		sl_dataSubProjPanel.putConstraint(SpringLayout.SOUTH, subProjLength, 0, SpringLayout.SOUTH, textFieldSubPTitle);
		sl_dataSubProjPanel.putConstraint(SpringLayout.NORTH, textFieldBudget, 0, SpringLayout.NORTH, listManagers);
		sl_dataSubProjPanel.putConstraint(SpringLayout.WEST, textFieldBudget, 0, SpringLayout.WEST, subProjLength);
		sl_dataSubProjPanel.putConstraint(SpringLayout.SOUTH, textFieldBudget, 0, SpringLayout.SOUTH, listManagers);
		sl_dataSubProjPanel.putConstraint(SpringLayout.EAST, textFieldBudget, 0, SpringLayout.EAST, subProjLength);
		sl_dataSubProjPanel.putConstraint(SpringLayout.EAST, btnAddSubProj, -10, SpringLayout.WEST, lblSubProjLength);
		sl_dataSubProjPanel.putConstraint(SpringLayout.WEST, lblSubProjLength, -50, SpringLayout.WEST, subProjLength);
		sl_dataSubProjPanel.putConstraint(SpringLayout.WEST, subProjLength, -57, SpringLayout.EAST, dataSubProjPanel);
		sl_dataSubProjPanel.putConstraint(SpringLayout.WEST, textFieldSubPTitle, 0, SpringLayout.WEST, listManagers);
		sl_dataSubProjPanel.putConstraint(SpringLayout.EAST, textFieldSubPTitle, 0, SpringLayout.EAST, listManagers);
		sl_dataSubProjPanel.putConstraint(SpringLayout.EAST, subProjLength, -6, SpringLayout.EAST, dataSubProjPanel);
		sl_dataSubProjPanel.putConstraint(SpringLayout.NORTH, lblBudget, 67, SpringLayout.NORTH, dataSubProjPanel);
		sl_dataSubProjPanel.putConstraint(SpringLayout.NORTH, listManagers, 61, SpringLayout.NORTH, dataSubProjPanel);
		sl_dataSubProjPanel.putConstraint(SpringLayout.NORTH, lblManager, 67, SpringLayout.NORTH, dataSubProjPanel);
		sl_dataSubProjPanel.putConstraint(SpringLayout.NORTH, lblSubProjLength, 24, SpringLayout.NORTH, dataSubProjPanel);
		sl_dataSubProjPanel.putConstraint(SpringLayout.NORTH, textFieldSubPTitle, 21, SpringLayout.NORTH, dataSubProjPanel);
		sl_dataSubProjPanel.putConstraint(SpringLayout.NORTH, lblSubPTitle, 24, SpringLayout.NORTH, dataSubProjPanel);
		sl_dataSubProjPanel.putConstraint(SpringLayout.WEST, lblSubPTitle, 18, SpringLayout.WEST, dataSubProjPanel);
		sl_dataSubProjPanel.putConstraint(SpringLayout.WEST, listManagers, 93, SpringLayout.WEST, dataSubProjPanel);
		sl_dataSubProjPanel.putConstraint(SpringLayout.EAST, listManagers, 264, SpringLayout.WEST, dataSubProjPanel);
		sl_dataSubProjPanel.putConstraint(SpringLayout.WEST, lblManager, 18, SpringLayout.WEST, dataSubProjPanel);
		dataSubProjPanel.setLayout(sl_dataSubProjPanel);
		dataSubProjPanel.add(btnAddSubProj);
		dataSubProjPanel.add(lblManager);
		dataSubProjPanel.add(listManagers);
		dataSubProjPanel.add(lblBudget);
		dataSubProjPanel.add(textFieldBudget);
		dataSubProjPanel.add(lblSubPTitle);
		dataSubProjPanel.add(textFieldSubPTitle);
		dataSubProjPanel.add(lblSubProjLength);
		dataSubProjPanel.add(subProjLength);
		
		JButton btnResetSubProjects = new JButton("Svuota campi");
		btnResetSubProjects.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearField();
			}
		});
		sl_dataSubProjPanel.putConstraint(SpringLayout.WEST, btnAddSubProj, -200, SpringLayout.WEST, btnResetSubProjects);
		sl_dataSubProjPanel.putConstraint(SpringLayout.SOUTH, btnAddSubProj, 0, SpringLayout.SOUTH, btnResetSubProjects);
		btnResetSubProjects.setPreferredSize(new Dimension(97, 25));
		sl_dataSubProjPanel.putConstraint(SpringLayout.SOUTH, btnResetSubProjects, -10, SpringLayout.SOUTH, dataSubProjPanel);
		sl_dataSubProjPanel.putConstraint(SpringLayout.EAST, btnResetSubProjects, -6, SpringLayout.EAST, dataSubProjPanel);
		sl_dataSubProjPanel.putConstraint(SpringLayout.NORTH, btnAddSubProj, 0, SpringLayout.NORTH, btnResetSubProjects);
		dataSubProjPanel.add(btnResetSubProjects);
		
		subProjPanel = new JPanel();
		sl_subProjDataPanel.putConstraint(SpringLayout.NORTH, subProjPanel, 10, SpringLayout.SOUTH, dataSubProjPanel);
		sl_subProjDataPanel.putConstraint(SpringLayout.WEST, subProjPanel, 3, SpringLayout.WEST, subProjDataPanel);
		sl_subProjDataPanel.putConstraint(SpringLayout.SOUTH, subProjPanel, -10, SpringLayout.SOUTH, subProjDataPanel);
		sl_subProjDataPanel.putConstraint(SpringLayout.EAST, subProjPanel, -3, SpringLayout.EAST, subProjDataPanel);
		subProjPanel.setPreferredSize(new Dimension(280, 180));
		subProjPanel.setMinimumSize(new Dimension(280, 190));
		subProjPanel.setMaximumSize(new Dimension(280, 190));
		subProjPanel.setBorder(new TitledBorder(null, "Sotto Progetti Inseriti", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		subProjPanel.setAutoscrolls(true);
		subProjDataPanel.add(subProjPanel);
		subProjPanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPaneSubProj = new JScrollPane();
		
		scrollPaneSubProj.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		subProjPanel.add(scrollPaneSubProj, BorderLayout.CENTER);
		
		vBoxSubProjs = Box.createVerticalBox();
			
		scrollPaneSubProj.setViewportView(vBoxSubProjs);
		
		JPanel panelDown = new JPanel();
		panelDown.setPreferredSize(new Dimension(800, 45));
		add(panelDown, BorderLayout.SOUTH);
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				indietro();
			}
		});
		btnBack.setPreferredSize(new Dimension(100, 25));
		btnBack.setMinimumSize(new Dimension(100, 25));
		btnBack.setMaximumSize(new Dimension(100, 25));
		
		btnNext = new JButton("Next");
		btnNext.setEnabled(false);
				
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addProj();
			}
		});
		
		//Controllo su errore dati progetto
		startDateProj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cbxProjDateCheck=true;
				nextEnabler();
			}
		});
		
		cbxListClients.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbxListClients.getSelectedItem() instanceof String) cbxClientCheck=false;
				else cbxClientCheck=true;
				nextEnabler();
			}
		});
		
		//Controllo su errore dati progetto
		cbxListClients.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				if(cbxListClients.getSelectedItem() instanceof String) cbxClientCheck=false;
				else cbxClientCheck=true;
				nextEnabler();
			}
		});
		
		//Controllo su errore dati progetto
		/*
		 vBoxSubProjs.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if(vBoxSubProjs.getComponentCount()==0)	vBoxSubProjsCheck=false;
				else vBoxSubProjsCheck=true;
				nextEnabler();
			}
		});
		*/
		btnNext.setMinimumSize(new Dimension(100, 25));
		btnNext.setMaximumSize(new Dimension(100, 25));
		btnNext.setPreferredSize(new Dimension(100, 25));
		GroupLayout gl_panelDown = new GroupLayout(panelDown);
		gl_panelDown.setHorizontalGroup(
			gl_panelDown.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelDown.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnBack, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 617, Short.MAX_VALUE)
					.addComponent(btnNext, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panelDown.setVerticalGroup(
			gl_panelDown.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelDown.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panelDown.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnBack, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNext, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panelDown.setLayout(gl_panelDown);
	}
	
	public void addProj()
	{
		UIFacade.getInstance().setAData("TitoloProgetto", this.textFieldNameProj.getText());
		UIFacade.getInstance().setAData("DataProgetto", this.startDateProj.getDate());
		UIFacade.getInstance().setAData("ClienteProgetto", this.cbxListClients.getSelectedItem());
		UIFacade.getInstance().toSysAction(Constants.getInstance().operationSetProjData,this );
	}

	public void indietro()
	{
		Progetto p=(Progetto)ControlFacade.getInstance().getData("newProject");
		if(p!=null)
		{
			p.deleteAndDissociate();
		}
		UIFacade.getInstance().toGuiAction(Constants.getInstance().mainWindowCommand, null);
	}
	
	
	public String limitedText(String s, int limit)
	{
		if(s.length()>=limit){
			return s.substring(0, --limit);
		}
		return s;
	}
	
	
	public void addInvoice()
	{
		UIFacade.getInstance().setAData("invoicesList", this.vBoxInvoices);
		UIFacade.getInstance().setAData("invoicesPanel", this.invoicesPanel);
		
		ControlFacade.getInstance().setData("DataFatturaInserita", invoiceDateInvoice.getDate());
		UIFacade.getInstance().toSysAction(Constants.getInstance().operationCreateNewInvoice,this.vBoxInvoices);
    
	}
	
	public void responseToCalendar()
	{
	   
	}
	
	public void addSubProj()
	{
		UIFacade.getInstance().setAData("subProjsList", this.vBoxSubProjs);
		UIFacade.getInstance().setAData("subProjsPanel", this.subProjPanel);
		
		ControlFacade.getInstance().setData("TitoloSottoProgetto", textFieldSubPTitle.getText());
		ControlFacade.getInstance().setData("DurataSottoProgetto", subProjLength.getValue());
		ControlFacade.getInstance().setData("BudgetSottoProgetto", textFieldBudget.getValue());

		ControlFacade.getInstance().setData("ManagerSelezionato",this.listManagers.getModel().getSelectedItem());

		UIFacade.getInstance().toSysAction(Constants.getInstance().operationCreateNewSubProj, this.vBoxSubProjs);	
		this.clearField();
	}

	private void clearField()
	{
		this.textFieldBudget.setValue(0);
		this.textFieldSubPTitle.setText("");
		this.subProjLength.setValue(0);
		for(int i=0; i<this.listManagers.getModel().getSize();i++)
			if(this.listManagers.getModel().getElementAt(i) instanceof String){
				this.listManagers.setSelectedIndex(i);
				i=this.listManagers.getModel().getSize();
			}
	}

	@SuppressWarnings("rawtypes")
	public JComboBox getListClients() {
		return cbxListClients;
	}

	@SuppressWarnings("rawtypes")
	public void setListClients(JComboBox listClients) {
		this.cbxListClients = listClients;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getListManagers() {
		return listManagers;
	}

	@SuppressWarnings("rawtypes")
	public void setListManagers(JComboBox listManagers) {
		this.listManagers = listManagers;
	}
	
	private void nextEnabler(){
		btnNext.setEnabled(this.cbxClientCheck && this.cbxProjDateCheck && this.textFieldNameProjCheck && true);
	}
	
	private void nextSubProjEnabler(){
		this.btnAddSubProj.setEnabled(this.titleSubProjCheck && this.cbxManagerCheck);
	}
}
