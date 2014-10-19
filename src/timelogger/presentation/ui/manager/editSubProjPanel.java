package timelogger.presentation.ui.manager;


import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.Box;

import timelogger.domain.Consulente;
import timelogger.domain.SottoProgetto;
import timelogger.presentation.UIFacade;
import timelogger.utilities.Constants;
import timelogger.utilities.graphicSettings;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;


@SuppressWarnings("serial")
public class editSubProjPanel extends JPanel {

	private JPanel dataSubProjPanel = new JPanel();						//top panel
	

		private JLabel lblTitleSelectedSubProj = new JLabel();
		private JButton btnResetDati = new JButton("reset");
		private JPanel durataPanel, pagaOrariaPanel, budgetPanel, taskListPanel, panelDown;
		private JLabel lblTitolo = new JLabel("Titolo");
		@SuppressWarnings("unused")
		private JButton btnBack = new JButton("Back");
		private JButton btnNext = new JButton("Next");
		
		/////
		private JPanel top = new JPanel();						//header panel della scroll panel
		private JLabel lblTaskNumber = new JLabel("#");
		private JLabel lblTitoloTask = new JLabel("Titolo task");
		private JLabel lblconsulente = new JLabel();
		private JLabel lblStato = new JLabel("Stato"); 		//possibili stati: {Da assegnare, Completato, In corso}
		private JLabel lblFatturato = new JLabel("Fatturato");
		
		private Box taskTabVerticalBox = Box.createVerticalBox();		//vertical box che contiene i task
		private JButton btnResetTask = new JButton("reset");
		private final JScrollPane manageTaskTabScrolPane = new JScrollPane();
		private final JPanel manageTaskCommandPanel = new JPanel();
		
		private SottoProgetto selectedSubProject = (SottoProgetto) UIFacade.getInstance().getAData("SottoProgettoSelezionato");
		
		
		
		////
		
		
	
	
	public editSubProjPanel() {
		
		
		this.panelDown=new JPanel();
		
		setSize(graphicSettings.getInstance().getPreferedDimensionPanel());
		setMinimumSize(graphicSettings.getInstance().getMinimumDimensionPanel());
		setMaximumSize(graphicSettings.getInstance().getMaximumDimensionPanel());
		SpringLayout springLayout = new SpringLayout();
		springLayout.putConstraint(SpringLayout.WEST, panelDown, 0, SpringLayout.WEST, dataSubProjPanel);
		springLayout.putConstraint(SpringLayout.EAST, panelDown, 0, SpringLayout.EAST, dataSubProjPanel);
		setLayout(springLayout);
		
		//dataSubProjPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Dati sottoprogetto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		TitledBorder bordoData = graphicSettings.getInstance().getBorderOfFunctionPanel();
		bordoData.setTitle("Dati sottoprogetto");
		dataSubProjPanel.setBorder(bordoData);
		
		dataSubProjPanel.setMinimumSize(new Dimension(780, 150));
		dataSubProjPanel.setMaximumSize(new Dimension(780, 195));
		
	//panelli dati sotto progetto
		durataPanel = new JPanel();//new dataSubProjPanel("Durata", String.valueOf(selectedSubProject.getDurataStimata()));
		durataPanel.setPreferredSize(new Dimension(500, 37));
		durataPanel.setSize(new Dimension(500, 37));
		durataPanel.setMaximumSize(new Dimension(500, 37));
		durataPanel.setMinimumSize(new Dimension(500, 37));
		pagaOrariaPanel =new JPanel();// new dataSubProjPanel("Paga Oraria",String.valueOf(selectedSubProject.getPagaOraria()));
		pagaOrariaPanel.setPreferredSize(new Dimension(500, 37));
		pagaOrariaPanel.setMinimumSize(new Dimension(500, 37));
		pagaOrariaPanel.setMaximumSize(new Dimension(500, 37));
		budgetPanel = new JPanel();//new dataSubProjPanel("Budget",String.valueOf(selectedSubProject.getBudgetStimanto()));
		budgetPanel.setPreferredSize(new Dimension(500, 37));
		budgetPanel.setMinimumSize(new Dimension(500, 37));
		budgetPanel.setMaximumSize(new Dimension(500, 37));
		
		this.resetData();
		
		SpringLayout sl_dataSubProjPanel = new SpringLayout();
		sl_dataSubProjPanel.putConstraint(SpringLayout.NORTH, pagaOrariaPanel, 67, SpringLayout.NORTH, dataSubProjPanel);
		sl_dataSubProjPanel.putConstraint(SpringLayout.NORTH, budgetPanel, 104, SpringLayout.NORTH, dataSubProjPanel);
		sl_dataSubProjPanel.putConstraint(SpringLayout.NORTH, durataPanel, 30, SpringLayout.NORTH, dataSubProjPanel);
		
		sl_dataSubProjPanel.putConstraint(SpringLayout.SOUTH, btnResetDati, -5, SpringLayout.SOUTH, dataSubProjPanel);
		sl_dataSubProjPanel.putConstraint(SpringLayout.WEST, lblTitleSelectedSubProj, 110, SpringLayout.WEST, dataSubProjPanel);
		dataSubProjPanel.setLayout(sl_dataSubProjPanel);
		
		sl_dataSubProjPanel.putConstraint(SpringLayout.NORTH, lblTitolo, 10, SpringLayout.NORTH, dataSubProjPanel);
		sl_dataSubProjPanel.putConstraint(SpringLayout.NORTH, lblTitleSelectedSubProj, 0, SpringLayout.NORTH, lblTitolo);
		sl_dataSubProjPanel.putConstraint(SpringLayout.WEST, lblTitolo, 10, SpringLayout.WEST, dataSubProjPanel);
		dataSubProjPanel.add(lblTitolo);
		
		 
		
		lblTitleSelectedSubProj.setText(selectedSubProject.getTitolo()+" del progetto ''"+selectedSubProject.getProgetto().getTitolo()+"''");
		dataSubProjPanel.add(lblTitleSelectedSubProj);
		
		dataSubProjPanel.add(durataPanel);
		dataSubProjPanel.add(pagaOrariaPanel);
		dataSubProjPanel.add(budgetPanel);
		
		sl_dataSubProjPanel.putConstraint(SpringLayout.EAST, btnResetDati, -10, SpringLayout.EAST, dataSubProjPanel);
		btnResetDati.addActionListener(new ActionListener() {
			////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			public void actionPerformed(ActionEvent e) {
				resetData();
			}
		});
		btnResetDati.setPreferredSize(new Dimension(89, 26));
		btnResetDati.setMinimumSize(new Dimension(89, 26));
		btnResetDati.setMaximumSize(new Dimension(89, 26));
		dataSubProjPanel.add(btnResetDati);
		
		springLayout.putConstraint(SpringLayout.NORTH, dataSubProjPanel, 16, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, dataSubProjPanel, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, dataSubProjPanel, 210, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, dataSubProjPanel, -10, SpringLayout.EAST, this);
				
		add(dataSubProjPanel);
		springLayout.putConstraint(SpringLayout.SOUTH, panelDown, 0, SpringLayout.SOUTH, this);
		panelDown.setPreferredSize(new Dimension(800, 45));
		add(panelDown, BorderLayout.SOUTH);
		btnBack.addActionListener(new ActionListener() {
			/////////////////////////////////////////////////////////////////////////////////////////////////////////
			public void actionPerformed(ActionEvent e) {
				goHome();
			}
		});
		
		btnBack.setPreferredSize(new Dimension(100, 25));
		btnBack.setMinimumSize(new Dimension(100, 25));
		btnBack.setMaximumSize(new Dimension(100, 25));
		btnNext.addActionListener(new ActionListener() {
			//////////////////////////////////////////////////////////////////////////////////////////////////////////
			public void actionPerformed(ActionEvent e) {
				confirmSubProject();
			}
		});
		
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
		
		taskListPanel = new JPanel(); 
		//		taskListPanel.setBorder(new TitledBorder(null, "Gestisci task", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		TitledBorder bordoTaskList = graphicSettings.getInstance().getBorderOfFunctionPanel();
		bordoTaskList.setTitle("Gestisci task");
		taskListPanel.setBorder(bordoTaskList);
		
		springLayout.putConstraint(SpringLayout.NORTH, taskListPanel, 0, SpringLayout.SOUTH, dataSubProjPanel);
		springLayout.putConstraint(SpringLayout.WEST, taskListPanel, 0, SpringLayout.WEST, dataSubProjPanel);
		springLayout.putConstraint(SpringLayout.SOUTH, taskListPanel, 0, SpringLayout.NORTH, panelDown);
		springLayout.putConstraint(SpringLayout.EAST, taskListPanel, 0, SpringLayout.EAST, dataSubProjPanel);
		add(taskListPanel);
		SpringLayout sl_taskListPanel = new SpringLayout();
		sl_taskListPanel.putConstraint(SpringLayout.WEST, manageTaskTabScrolPane, 0, SpringLayout.WEST, taskListPanel);
		sl_taskListPanel.putConstraint(SpringLayout.SOUTH, manageTaskTabScrolPane, 0, SpringLayout.NORTH, manageTaskCommandPanel);
		sl_taskListPanel.putConstraint(SpringLayout.EAST, manageTaskTabScrolPane, 0, SpringLayout.EAST, taskListPanel);
		sl_taskListPanel.putConstraint(SpringLayout.NORTH, manageTaskCommandPanel, -43, SpringLayout.SOUTH, taskListPanel);
		sl_taskListPanel.putConstraint(SpringLayout.WEST, manageTaskCommandPanel, 0, SpringLayout.WEST, taskListPanel);
		sl_taskListPanel.putConstraint(SpringLayout.SOUTH, manageTaskCommandPanel, 0, SpringLayout.SOUTH, taskListPanel);
		sl_taskListPanel.putConstraint(SpringLayout.EAST, manageTaskCommandPanel, 0, SpringLayout.EAST, taskListPanel);
		sl_taskListPanel.putConstraint(SpringLayout.NORTH, manageTaskTabScrolPane, 5, SpringLayout.NORTH, taskListPanel);
		taskListPanel.setLayout(sl_taskListPanel);
		
		taskListPanel.add(manageTaskTabScrolPane);
		
		taskListPanel.add(manageTaskCommandPanel);
		
		
		//////// PROVA INSERITA
		
		
		manageTaskTabScrolPane.setBorder(null);
		manageTaskTabScrolPane.setViewportBorder(null);
		SpringLayout sl_manageTaskCommandPanel = new SpringLayout();
		sl_manageTaskCommandPanel.putConstraint(SpringLayout.SOUTH, btnResetTask, -5, SpringLayout.SOUTH, manageTaskCommandPanel);
		sl_manageTaskCommandPanel.putConstraint(SpringLayout.EAST, btnResetTask, -10, SpringLayout.EAST, manageTaskCommandPanel);
		manageTaskCommandPanel.setLayout(sl_manageTaskCommandPanel);
		btnResetTask.setPreferredSize(new Dimension(89, 26));
		btnResetTask.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				resetTaskList();
			}
		});
		
		manageTaskCommandPanel.add(btnResetTask);
		
		//top headers della scrollpane
		top.setBorder(null);
		top.setPreferredSize(new Dimension(740, 40));
		top.setMinimumSize(new Dimension(740, 40));
		top.setMaximumSize(new Dimension(740, 40));
		
		SpringLayout sp_top = new SpringLayout();
		sp_top.putConstraint(SpringLayout.WEST, lblTaskNumber, 16, SpringLayout.WEST, top);
		sp_top.putConstraint(SpringLayout.WEST, lblFatturato, 695, SpringLayout.WEST, top);
		sp_top.putConstraint(SpringLayout.WEST, lblStato, 613, SpringLayout.WEST, top);
		sp_top.putConstraint(SpringLayout.EAST, lblFatturato, -3, SpringLayout.EAST, top);
		sp_top.putConstraint(SpringLayout.EAST, lblStato, -4, SpringLayout.WEST, lblFatturato);
		sp_top.putConstraint(SpringLayout.WEST, lblconsulente, 359, SpringLayout.WEST, top);
		sp_top.putConstraint(SpringLayout.EAST, lblconsulente, -8, SpringLayout.WEST, lblStato);
		sp_top.putConstraint(SpringLayout.WEST, lblTitoloTask, 27, SpringLayout.WEST, top);
		sp_top.putConstraint(SpringLayout.EAST, lblTitoloTask, -10, SpringLayout.WEST, lblconsulente);
		sp_top.putConstraint(SpringLayout.EAST, lblTaskNumber, -330, SpringLayout.WEST, lblconsulente);
		top.setLayout(sp_top);
		
		sp_top.putConstraint(SpringLayout.NORTH, lblTaskNumber, 0, SpringLayout.NORTH, top);
		sp_top.putConstraint(SpringLayout.SOUTH, lblTaskNumber, 0, SpringLayout.SOUTH, top);
		top.add(lblTaskNumber);
		lblTitoloTask.setHorizontalAlignment(SwingConstants.CENTER);
		sp_top.putConstraint(SpringLayout.NORTH, lblTitoloTask, 0, SpringLayout.NORTH, top);
		sp_top.putConstraint(SpringLayout.SOUTH, lblTitoloTask, 0, SpringLayout.SOUTH, top);
		top.add(lblTitoloTask);
		lblconsulente.setHorizontalAlignment(SwingConstants.CENTER);
		lblconsulente.setText("Consulente associato al task");
		sp_top.putConstraint(SpringLayout.NORTH, lblconsulente, 10, SpringLayout.NORTH, top);
		top.add(lblconsulente);
		lblStato.setHorizontalAlignment(SwingConstants.CENTER);
		sp_top.putConstraint(SpringLayout.NORTH, lblStato, 0, SpringLayout.NORTH, top);
		sp_top.putConstraint(SpringLayout.SOUTH, lblStato, 0, SpringLayout.SOUTH, top);
		top.add(lblStato);
		lblFatturato.setHorizontalAlignment(SwingConstants.CENTER);
		lblFatturato.setHorizontalTextPosition(SwingConstants.CENTER);
		sp_top.putConstraint(SpringLayout.NORTH, lblFatturato, 0, SpringLayout.NORTH, top);
		sp_top.putConstraint(SpringLayout.SOUTH, lblFatturato, 0, SpringLayout.SOUTH, top);
		top.add(lblFatturato);
		
		manageTaskTabScrolPane.setColumnHeaderView(top);
			
		//headers della scroll pane inserita 
	
		
		//ViewPort
		
		
		manageTaskTabScrolPane.setViewportView(taskTabVerticalBox);
		
		
		

	
		
	}
	
	public void confirmSubProject() {
		//genera un pop up con un riassunto dei dati
		dataSubProjPanel d = (dataSubProjPanel) this.durataPanel.getComponent(0);
		UIFacade.getInstance().setAData("DurataSPSelezionato", Integer.parseInt(d.getlblData()));
		d = (dataSubProjPanel) this.pagaOrariaPanel.getComponent(0);
		UIFacade.getInstance().setAData("PagaOrariaSPSelezionato", Integer.parseInt(d.getlblData()));
		d = (dataSubProjPanel) this.budgetPanel.getComponent(0);
		UIFacade.getInstance().setAData("BudgetSPSelezionato", Integer.parseInt(d.getlblData()));
		ArrayList<Object> cons = new ArrayList<Object>();
		taskSubProj t;
		for (int i=0; i<taskTabVerticalBox.getComponentCount(); i++)
		{
			t=(taskSubProj) taskTabVerticalBox.getComponent(i);
			if (t.getComboConsulente().getSelectedItem() instanceof String)
				cons.add(null);
			else 
				cons.add((Consulente) t.getComboConsulente().getSelectedItem());
		}
		UIFacade.getInstance().setAData("ConsulentTaskList", cons);
		
		UIFacade.getInstance().toSysAction(Constants.getInstance().operationVerifySPData, null);
	}
	

	public void goHome() {
		UIFacade.getInstance().toGuiAction(Constants.getInstance().mainWindowCommand, null);
	}

	public void resetData() {
		
		this.selectedSubProject = (SottoProgetto) UIFacade.getInstance().getAData("SottoProgettoSelezionato");
		
		this.durataPanel.removeAll();
		this.pagaOrariaPanel.removeAll();
		this.budgetPanel.removeAll();
		SpringLayout sl_durataPanel = new SpringLayout();
		durataPanel.setLayout(sl_durataPanel);
		
		dataSubProjPanel dataSubProjPanel_ = new dataSubProjPanel("Durata", String.valueOf(selectedSubProject.getDurataStimata()));
		sl_durataPanel.putConstraint(SpringLayout.WEST, dataSubProjPanel_, 0, SpringLayout.WEST, durataPanel);
		this.durataPanel.add(dataSubProjPanel_);
		SpringLayout sl_pagaOrariaPanel = new SpringLayout();
		pagaOrariaPanel.setLayout(sl_pagaOrariaPanel);
		dataSubProjPanel dataSubProjPanel__1 = new dataSubProjPanel("Paga Oraria",String.valueOf(selectedSubProject.getPagaOraria()));
		sl_pagaOrariaPanel.putConstraint(SpringLayout.WEST, dataSubProjPanel__1, 0, SpringLayout.WEST, pagaOrariaPanel);
		this.pagaOrariaPanel.add(dataSubProjPanel__1);
		SpringLayout sl_budgetPanel = new SpringLayout();
		budgetPanel.setLayout(sl_budgetPanel);
		dataSubProjPanel dataSubProjPanel__2 = new dataSubProjPanel("Budget",String.valueOf(selectedSubProject.getBudgetStimato()));
		sl_budgetPanel.putConstraint(SpringLayout.WEST, dataSubProjPanel__2, 0, SpringLayout.WEST, budgetPanel);
		this.budgetPanel.add(dataSubProjPanel__2);
		this.updateUI();
	}
	
	public void resetTaskList()
	{
		UIFacade.getInstance().toSysAction(Constants.getInstance().operationRetrieveSubProject,null);
		UIFacade.getInstance().toGuiAction(Constants.getInstance().fillTaskListCommand, this.getTaskTabVerticalBox());
	}
	
	
	
	public JPanel getDurata() {
		return durataPanel;
	}

	public void setDurata(JPanel durata) {
		this.durataPanel = durata;
	}

	public JPanel getPagaOraria() {
		return pagaOrariaPanel;
	}

	public void setPagaOraria(JPanel pagaOraria) {
		this.pagaOrariaPanel = pagaOraria;
	}

	public JPanel getBudget() {
		return budgetPanel;
	}

	public void setBudget(JPanel budget) {
		this.budgetPanel = budget;
	}
	
	public Box getTaskTabVerticalBox() {
		return taskTabVerticalBox;
	}
}
