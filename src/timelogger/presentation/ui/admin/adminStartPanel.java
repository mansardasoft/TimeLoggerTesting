package timelogger.presentation.ui.admin;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import ormsamples.ListTimeloggerData;

import timelogger.presentation.UIFacade;
import timelogger.utilities.Constants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;

@SuppressWarnings("serial")
public class adminStartPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	Font titleFont = new Font ("Arial", Font.PLAIN, 14);
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public adminStartPanel() {
		
		setMinimumSize(new Dimension(800, 600));
		setPreferredSize(new Dimension(800, 600));
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JPanel newClientPanel = new JPanel();
		springLayout.putConstraint(SpringLayout.SOUTH, newClientPanel, 120, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.NORTH, newClientPanel, 40, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, newClientPanel, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, newClientPanel, -10, SpringLayout.EAST, this);
		newClientPanel.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)), "Nuovo Cliente", TitledBorder.LEADING, TitledBorder.TOP, titleFont));
		add(newClientPanel);
		SpringLayout sl_newClientPanel = new SpringLayout();
		newClientPanel.setLayout(sl_newClientPanel);
		
		JLabel lblNewClient = new JLabel("Inserire un nuovo cliente nel sistema");
		sl_newClientPanel.putConstraint(SpringLayout.NORTH, lblNewClient, 20, SpringLayout.NORTH, newClientPanel);
		sl_newClientPanel.putConstraint(SpringLayout.WEST, lblNewClient, 10, SpringLayout.WEST, newClientPanel);
		sl_newClientPanel.putConstraint(SpringLayout.SOUTH, lblNewClient, -20, SpringLayout.SOUTH, newClientPanel);
		newClientPanel.add(lblNewClient);
		
		JButton btnInserisciNuvoCliente = new JButton("Inserisci nuvo cliente ");
		sl_newClientPanel.putConstraint(SpringLayout.EAST, btnInserisciNuvoCliente, -30, SpringLayout.EAST, newClientPanel);
		btnInserisciNuvoCliente.setPreferredSize(new Dimension(167, 23));
		sl_newClientPanel.putConstraint(SpringLayout.SOUTH, btnInserisciNuvoCliente, 0, SpringLayout.SOUTH, lblNewClient);
		newClientPanel.add(btnInserisciNuvoCliente);
		
		JPanel newProjPanel = new JPanel();
		newProjPanel.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)), "Crea nuovo progetto", TitledBorder.LEADING, TitledBorder.TOP, titleFont));
		springLayout.putConstraint(SpringLayout.NORTH, newProjPanel, 50, SpringLayout.SOUTH, newClientPanel);
		springLayout.putConstraint(SpringLayout.WEST, newProjPanel, 0, SpringLayout.WEST, newClientPanel);
		springLayout.putConstraint(SpringLayout.SOUTH, newProjPanel, 130, SpringLayout.SOUTH, newClientPanel);
		springLayout.putConstraint(SpringLayout.EAST, newProjPanel, 0, SpringLayout.EAST, newClientPanel);
		add(newProjPanel);
		SpringLayout sl_newProjPanel = new SpringLayout();
		newProjPanel.setLayout(sl_newProjPanel);
		
		JLabel lblNewProj = new JLabel("Inserisci un nuovo progetto nel sistema");
		sl_newProjPanel.putConstraint(SpringLayout.NORTH, lblNewProj, 20, SpringLayout.NORTH, newProjPanel);
		sl_newProjPanel.putConstraint(SpringLayout.WEST, lblNewProj, 10, SpringLayout.WEST, newProjPanel);
		sl_newProjPanel.putConstraint(SpringLayout.SOUTH, lblNewProj, -20, SpringLayout.SOUTH, newProjPanel);
		newProjPanel.add(lblNewProj);
		
		JButton button = new JButton("Crea nuovo Progetto");
		sl_newProjPanel.putConstraint(SpringLayout.EAST, button, -30, SpringLayout.EAST, newProjPanel);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				creaProgetto();
			}
		});
		sl_newProjPanel.putConstraint(SpringLayout.SOUTH, button, 0, SpringLayout.SOUTH, lblNewProj);
		button.setPreferredSize(new Dimension(167, 23));
		button.setMinimumSize(new Dimension(140, 23));
		button.setMaximumSize(new Dimension(140, 23));
		newProjPanel.add(button);
		
		JPanel invoicePanel = new JPanel();
		invoicePanel.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)), "Stampa fattura", TitledBorder.LEADING, TitledBorder.TOP, titleFont));
		springLayout.putConstraint(SpringLayout.NORTH, invoicePanel, 50, SpringLayout.SOUTH, newProjPanel);
		springLayout.putConstraint(SpringLayout.WEST, invoicePanel, 0, SpringLayout.WEST, newProjPanel);
		springLayout.putConstraint(SpringLayout.SOUTH, invoicePanel, 130, SpringLayout.SOUTH, newProjPanel);
		springLayout.putConstraint(SpringLayout.EAST, invoicePanel, 0, SpringLayout.EAST, newProjPanel);
		add(invoicePanel);
		SpringLayout sl_invoicePanel = new SpringLayout();
		invoicePanel.setLayout(sl_invoicePanel);
		
		JButton btnPrintInvoice = new JButton("Stampa fattura");
		sl_invoicePanel.putConstraint(SpringLayout.EAST, btnPrintInvoice, -30, SpringLayout.EAST, invoicePanel);
		btnPrintInvoice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		sl_invoicePanel.putConstraint(SpringLayout.NORTH, btnPrintInvoice, 10, SpringLayout.NORTH, invoicePanel);
		btnPrintInvoice.setPreferredSize(new Dimension(167, 23));
		btnPrintInvoice.setMinimumSize(new Dimension(140, 23));
		btnPrintInvoice.setMaximumSize(new Dimension(140, 23));
		invoicePanel.add(btnPrintInvoice);
		
		JComboBox InvoiceComboBox = new JComboBox();
		InvoiceComboBox.setPreferredSize(new Dimension(280, 20));
		InvoiceComboBox.setModel(new DefaultComboBoxModel(new String[] {"Elenco dei progetti per la stampa delle fatture"}));
		sl_invoicePanel.putConstraint(SpringLayout.EAST, InvoiceComboBox, -30, SpringLayout.WEST, btnPrintInvoice);
		invoicePanel.add(InvoiceComboBox);
		
		JLabel lblPrintInvoice = new JLabel("Stampa una fattura di un progetto");
		sl_invoicePanel.putConstraint(SpringLayout.WEST, lblPrintInvoice, 10, SpringLayout.WEST, invoicePanel);
		sl_invoicePanel.putConstraint(SpringLayout.SOUTH, InvoiceComboBox, 0, SpringLayout.SOUTH, lblPrintInvoice);
		sl_invoicePanel.putConstraint(SpringLayout.SOUTH, lblPrintInvoice, 0, SpringLayout.SOUTH, btnPrintInvoice);
		invoicePanel.add(lblPrintInvoice);
		
		JPanel seeConsulentHistoryPanel = new JPanel();
		seeConsulentHistoryPanel.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)), "Visualizza storico consulente", TitledBorder.LEADING, TitledBorder.TOP, titleFont));
		springLayout.putConstraint(SpringLayout.NORTH, seeConsulentHistoryPanel, 50, SpringLayout.SOUTH, invoicePanel);
		springLayout.putConstraint(SpringLayout.WEST, seeConsulentHistoryPanel, 0, SpringLayout.WEST, newClientPanel);
		springLayout.putConstraint(SpringLayout.SOUTH, seeConsulentHistoryPanel, 130, SpringLayout.SOUTH, invoicePanel);
		springLayout.putConstraint(SpringLayout.EAST, seeConsulentHistoryPanel, 0, SpringLayout.EAST, newClientPanel);
		add(seeConsulentHistoryPanel);
		SpringLayout sl_seeConsulentHistoryPanel = new SpringLayout();
		seeConsulentHistoryPanel.setLayout(sl_seeConsulentHistoryPanel);
		
		JButton btnViewHistory = new JButton("Visualizza storico consulente");
		sl_seeConsulentHistoryPanel.putConstraint(SpringLayout.NORTH, btnViewHistory, 10, SpringLayout.NORTH, seeConsulentHistoryPanel);
		sl_seeConsulentHistoryPanel.putConstraint(SpringLayout.EAST, btnViewHistory, -30, SpringLayout.EAST, seeConsulentHistoryPanel);
		seeConsulentHistoryPanel.add(btnViewHistory);
		
		JComboBox consulentComboBox = new JComboBox();
		sl_seeConsulentHistoryPanel.putConstraint(SpringLayout.SOUTH, consulentComboBox, 0, SpringLayout.SOUTH, btnViewHistory);
		consulentComboBox.setPreferredSize(new Dimension(280, 20));
		consulentComboBox.setModel(new DefaultComboBoxModel(new String[] {"Selezionare il Consulente"}));
		sl_seeConsulentHistoryPanel.putConstraint(SpringLayout.EAST, consulentComboBox, -30, SpringLayout.WEST, btnViewHistory);
		seeConsulentHistoryPanel.add(consulentComboBox);
		
		JLabel lblConsulentHistory = new JLabel("Mostro lo storico del Consulente");
		sl_seeConsulentHistoryPanel.putConstraint(SpringLayout.WEST, lblConsulentHistory, 10, SpringLayout.WEST, seeConsulentHistoryPanel);
		sl_seeConsulentHistoryPanel.putConstraint(SpringLayout.SOUTH, lblConsulentHistory, 0, SpringLayout.SOUTH, btnViewHistory);
		seeConsulentHistoryPanel.add(lblConsulentHistory);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UIFacade.getInstance().toSysAction(Constants.getInstance().operationLogout, null);
			}
		});
		btnLogout.setPreferredSize(new Dimension(147, 23));
		btnLogout.setMinimumSize(new Dimension(147, 23));
		btnLogout.setMaximumSize(new Dimension(147, 23));
		springLayout.putConstraint(SpringLayout.SOUTH, btnLogout, -25, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, btnLogout, -50, SpringLayout.EAST, this);
		add(btnLogout);
		
		JButton btnMostraReport = new JButton("Mostra Report");
		btnMostraReport.setPreferredSize(new Dimension(147, 23));
		
		springLayout.putConstraint(SpringLayout.WEST, btnMostraReport, 50, SpringLayout.WEST, this);
		
		btnMostraReport.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ListTimeloggerData.main(null);
				}
		});
		springLayout.putConstraint(SpringLayout.SOUTH, btnMostraReport, 0, SpringLayout.SOUTH, btnLogout);
		add(btnMostraReport);
	
	}

	private void creaProgetto() {
		// TODO Auto-generated method stub
		//UIFacade.getInstance().toGuiAction("CreateProject", this.getParent());
		UIFacade.getInstance().toSysAction(Constants.getInstance().operationCreateNewProject, this.getParent());
		
	}
}
