package timelogger.presentation.ui.manager;

import javax.swing.JPanel;
import javax.swing.SpringLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;

import timelogger.domain.SottoProgetto;
import timelogger.presentation.UIFacade;
import timelogger.presentation.graphicCommand.GuiManager;
import timelogger.utilities.Constants;
import timelogger.utilities.graphicSettings;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;


@SuppressWarnings("serial")
public class managerStartPanel extends JPanel {
	
	@SuppressWarnings("rawtypes")
	private JComboBox cbxEditSubProject;
	private JPanel gestisciPanel;
	private JButton btnEditSubProject;
	private JComboBox cbxSelectSubProject;
	private JButton btnCreaTask;

	/**
	 * Create the panel.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public managerStartPanel() {
		
		setPreferredSize(graphicSettings.getInstance().getPreferedDimensionPanel());
		setMinimumSize(graphicSettings.getInstance().getMinimumDimensionPanel());
		setMaximumSize(graphicSettings.getInstance().getMaximumDimensionPanel());
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JButton btnLogout = graphicSettings.getInstance().getLogoutButton();
		springLayout.putConstraint(SpringLayout.SOUTH, btnLogout, -25, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, btnLogout, -50, SpringLayout.EAST, this);
		add(btnLogout);
		
		JPanel monitoraPanel = new JPanel();
		springLayout.putConstraint(SpringLayout.SOUTH, monitoraPanel, 210, SpringLayout.NORTH, this);
		
		//TitledBorder title = new TitledBorder(null, "prova", TitledBorder.LEADING, TitledBorder.TOP, null, null);
		
		TitledBorder bordoMonitora = graphicSettings.getInstance().getBorderOfInsidePanel();
		bordoMonitora.setTitle("Monitora lo Stato");
		monitoraPanel.setBorder(bordoMonitora);
		springLayout.putConstraint(SpringLayout.NORTH, monitoraPanel, 70, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, monitoraPanel, graphicSettings.getInstance().getOffsetConstrainsSubPanel(), SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, monitoraPanel, -graphicSettings.getInstance().getOffsetConstrainsSubPanel(), SpringLayout.EAST, this);
		add(monitoraPanel);
		SpringLayout sl_monitora = new SpringLayout();
		monitoraPanel.setLayout(sl_monitora);
		
		JButton btnMonitoraSubProject = new JButton("Monitora sotto progetto");
		sl_monitora.putConstraint(SpringLayout.NORTH, btnMonitoraSubProject, 10, SpringLayout.NORTH, monitoraPanel);
		sl_monitora.putConstraint(SpringLayout.WEST, btnMonitoraSubProject, 400, SpringLayout.WEST, monitoraPanel);
		springLayout.putConstraint(SpringLayout.WEST, btnMonitoraSubProject, 276, SpringLayout.WEST, monitoraPanel);
		springLayout.putConstraint(SpringLayout.SOUTH, btnMonitoraSubProject, -349, SpringLayout.SOUTH, this);
		monitoraPanel.add(btnMonitoraSubProject);
		
		JButton btnMonitoraConsulente = new JButton("Monitora consulente");
		sl_monitora.putConstraint(SpringLayout.NORTH, btnMonitoraConsulente, 70, SpringLayout.NORTH, monitoraPanel);
		sl_monitora.putConstraint(SpringLayout.WEST, btnMonitoraConsulente, 0, SpringLayout.WEST, btnMonitoraSubProject);
		btnMonitoraConsulente.setPreferredSize(new Dimension(147, 23));
		btnMonitoraConsulente.setMinimumSize(new Dimension(147, 23));
		btnMonitoraConsulente.setMaximumSize(new Dimension(147, 23));
		springLayout.putConstraint(SpringLayout.WEST, btnMonitoraConsulente, 214, SpringLayout.WEST, this);
		monitoraPanel.add(btnMonitoraConsulente);
		TitledBorder bordoAltro = graphicSettings.getInstance().getBorderOfInsidePanel();
		bordoAltro.setTitle("Altre funzioni");
		
		gestisciPanel = new JPanel();
		springLayout.putConstraint(SpringLayout.WEST, gestisciPanel, graphicSettings.getInstance().getOffsetConstrainsSubPanel(), SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, gestisciPanel, -graphicSettings.getInstance().getOffsetConstrainsSubPanel(), SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.NORTH, gestisciPanel, 40, SpringLayout.SOUTH, monitoraPanel);
		springLayout.putConstraint(SpringLayout.SOUTH, gestisciPanel, 180, SpringLayout.SOUTH, monitoraPanel);

		TitledBorder bordoGestisci = graphicSettings.getInstance().getBorderOfInsidePanel();
		bordoGestisci.setTitle("Gestisci Sotto progetto");
		gestisciPanel.setBorder(bordoGestisci);
		
		JLabel lblMonitoraSubProject = new JLabel("Visualizza lo stato di un sotto progetto");
		sl_monitora.putConstraint(SpringLayout.NORTH, lblMonitoraSubProject, 0, SpringLayout.NORTH, btnMonitoraSubProject);
		sl_monitora.putConstraint(SpringLayout.WEST, lblMonitoraSubProject, 100, SpringLayout.WEST, monitoraPanel);
		sl_monitora.putConstraint(SpringLayout.SOUTH, lblMonitoraSubProject, 0, SpringLayout.SOUTH, btnMonitoraSubProject);
		monitoraPanel.add(lblMonitoraSubProject);
		
		JLabel lblMonitoraConsulente = new JLabel("Visualizza le informazioni e il lavoro svolto da un consulente");
		sl_monitora.putConstraint(SpringLayout.NORTH, lblMonitoraConsulente, 0, SpringLayout.NORTH, btnMonitoraConsulente);
		sl_monitora.putConstraint(SpringLayout.WEST, lblMonitoraConsulente, 0, SpringLayout.WEST, lblMonitoraSubProject);
		sl_monitora.putConstraint(SpringLayout.SOUTH, lblMonitoraConsulente, 0, SpringLayout.SOUTH, btnMonitoraConsulente);
		monitoraPanel.add(lblMonitoraConsulente);
		
		JPanel altroPanel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, altroPanel, 40, SpringLayout.SOUTH, gestisciPanel);
		springLayout.putConstraint(SpringLayout.WEST, altroPanel, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, altroPanel, 110, SpringLayout.SOUTH, gestisciPanel);
		springLayout.putConstraint(SpringLayout.EAST, altroPanel, -10, SpringLayout.EAST, this);
		altroPanel.setBorder(bordoAltro);
		add(altroPanel);
		SpringLayout sl_altro = new SpringLayout();
		altroPanel.setLayout(sl_altro);
		
		btnEditSubProject = new JButton("Modifica sotto progetto");
		btnEditSubProject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editSubProject();
			}
		});
		
		
		JButton btnBonus = new JButton("Assegna bonus");
		sl_altro.putConstraint(SpringLayout.WEST, btnBonus, 400, SpringLayout.WEST, altroPanel);
		btnBonus.setPreferredSize(new Dimension(147, 23));
		btnBonus.setMinimumSize(new Dimension(147, 23));
		btnBonus.setMaximumSize(new Dimension(147, 23));
		sl_altro.putConstraint(SpringLayout.NORTH, btnBonus, 10, SpringLayout.NORTH, altroPanel);
		springLayout.putConstraint(SpringLayout.NORTH, btnBonus, 21, SpringLayout.NORTH, altroPanel);
		springLayout.putConstraint(SpringLayout.WEST, btnBonus, 347, SpringLayout.WEST, altroPanel);
		altroPanel.add(btnBonus);
		btnBonus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		springLayout.putConstraint(SpringLayout.SOUTH, btnEditSubProject, -159, SpringLayout.NORTH, altroPanel);
		springLayout.putConstraint(SpringLayout.SOUTH, btnBonus, -31, SpringLayout.NORTH, btnEditSubProject);
		
		JLabel lblBonus = new JLabel("Assegna un bonus ad un consulente");
		lblBonus.setToolTipText("");
		sl_altro.putConstraint(SpringLayout.NORTH, lblBonus, 0, SpringLayout.NORTH, btnBonus);
		sl_altro.putConstraint(SpringLayout.WEST, lblBonus, 100, SpringLayout.WEST, altroPanel);
		sl_altro.putConstraint(SpringLayout.SOUTH, lblBonus, 0, SpringLayout.SOUTH, btnBonus);
		altroPanel.add(lblBonus);
		add(gestisciPanel);
		SpringLayout sl_gestisci = new SpringLayout();
		gestisciPanel.setLayout(sl_gestisci);
		
		btnCreaTask = new JButton("Crea/Modifica task");
		btnCreaTask.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				createTask();
			}
		});
		btnCreaTask.setMinimumSize(new Dimension(147, 23));
		btnCreaTask.setMaximumSize(new Dimension(147, 23));
		btnCreaTask.setPreferredSize(new Dimension(147, 23));
		sl_gestisci.putConstraint(SpringLayout.NORTH, btnCreaTask, 10, SpringLayout.NORTH, gestisciPanel);
		springLayout.putConstraint(SpringLayout.WEST, btnCreaTask, 100, SpringLayout.WEST, gestisciPanel);
		gestisciPanel.add(btnCreaTask);
		
		
		sl_gestisci.putConstraint(SpringLayout.WEST, btnCreaTask, 0, SpringLayout.WEST, btnEditSubProject);
		sl_gestisci.putConstraint(SpringLayout.WEST, btnEditSubProject, 400, SpringLayout.WEST, gestisciPanel);
		btnEditSubProject.setPreferredSize(new Dimension(147, 23));
		btnEditSubProject.setMinimumSize(new Dimension(147, 23));
		btnEditSubProject.setMaximumSize(new Dimension(147, 23));
		springLayout.putConstraint(SpringLayout.WEST, btnEditSubProject, 300, SpringLayout.WEST, gestisciPanel);
		gestisciPanel.add(btnEditSubProject);
		
		cbxEditSubProject = new JComboBox();
		cbxEditSubProject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cbxEditSubProject.getSelectedItem() instanceof String) btnEditSubProject.setEnabled(false);
				else btnEditSubProject.setEnabled(true);
			}
		});
		
		cbxEditSubProject.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				if(cbxEditSubProject.getSelectedItem() instanceof String) btnEditSubProject.setEnabled(false);
				else btnEditSubProject.setEnabled(true);
			}
		});
		
		sl_gestisci.putConstraint(SpringLayout.NORTH, btnEditSubProject, 0, SpringLayout.NORTH, cbxEditSubProject);
		//sl_gestisci.putConstraint(SpringLayout.NORTH, btnEditSubProject, 0, SpringLayout.NORTH, cbxEditSubProject);
		
		sl_gestisci.putConstraint(SpringLayout.EAST, cbxEditSubProject, -30, SpringLayout.WEST, btnCreaTask);
		sl_gestisci.putConstraint(SpringLayout.NORTH, cbxEditSubProject, 70, SpringLayout.NORTH, gestisciPanel);
		sl_gestisci.putConstraint(SpringLayout.WEST, cbxEditSubProject, 100, SpringLayout.WEST, gestisciPanel);
		gestisciPanel.add(cbxEditSubProject);
		
		
		
		cbxSelectSubProject = new JComboBox();
		
		sl_gestisci.putConstraint(SpringLayout.NORTH, cbxSelectSubProject, 0, SpringLayout.NORTH, btnCreaTask);
		sl_gestisci.putConstraint(SpringLayout.WEST, cbxSelectSubProject, 100, SpringLayout.WEST, gestisciPanel);
		sl_gestisci.putConstraint(SpringLayout.SOUTH, cbxSelectSubProject, 0, SpringLayout.SOUTH, btnCreaTask);
		sl_gestisci.putConstraint(SpringLayout.EAST, cbxSelectSubProject, 0, SpringLayout.EAST, cbxEditSubProject);
		gestisciPanel.add(cbxSelectSubProject);
		
		cbxSelectSubProject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbxSelectSubProject.getSelectedItem() instanceof String) btnCreaTask.setEnabled(false);
				else btnCreaTask.setEnabled(true);
			}
		});
		
		
		cbxSelectSubProject.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				if(cbxSelectSubProject.getSelectedItem() instanceof String) btnCreaTask.setEnabled(false);
				else btnCreaTask.setEnabled(true);
			}
		});

	}

	protected void createTask () {
		/*
		UIFacade.getInstance().setAData("SottoProgettoNonInizializzato", cbxSelectSubProject.getSelectedItem());
		UIFacade.getInstance().toSysAction(Constants.getInstance().operationRetrieveAllConsulents, null);
		UIFacade.getInstance().toGuiAction(Constants.getInstance().createTaskCommand, GuiManager.getInstance().getWindow().getContentPane());
		*/
	}
	
	protected void editSubProject() {
		UIFacade.getInstance().setAData("SottoProgettoSelezionato", cbxEditSubProject.getSelectedItem());
		UIFacade.getInstance().toSysAction(Constants.getInstance().operationRetrieveAllConsulents, null);
		UIFacade.getInstance().toGuiAction(Constants.getInstance().editSubProjectCommand, GuiManager.getInstance().getWindow().getContentPane());
		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getListSubProjForEdit(){
		return this.cbxEditSubProject;
	}
	
	public JComboBox getListSubProjForTask(){
		return this.cbxSelectSubProject;
	}
}
