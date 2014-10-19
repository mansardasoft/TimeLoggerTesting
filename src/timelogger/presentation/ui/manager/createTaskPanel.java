package timelogger.presentation.ui.manager;
import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.SpringLayout;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.Box;
import javax.swing.border.MatteBorder;

import timelogger.presentation.UIFacade;
import timelogger.utilities.Constants;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class createTaskPanel extends JPanel {
	/**
	 * 
	 */
	private JTextField titolo;
	private JComboBox cbxConsulente;
	private Box verticalBox = Box.createVerticalBox();




	/**
	 * Create the panel.
	 */
	public createTaskPanel() {
		setPreferredSize(new Dimension(800, 600));
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);

		JPanel taskDataPanel = new JPanel();
		springLayout.putConstraint(SpringLayout.SOUTH, taskDataPanel, 190,
				SpringLayout.NORTH, this);
		taskDataPanel.setBorder(new TitledBorder(null, "Dati del task",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		springLayout.putConstraint(SpringLayout.NORTH, taskDataPanel, 20,
				SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, taskDataPanel, 10,
				SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, taskDataPanel, -10,
				SpringLayout.EAST, this);
		add(taskDataPanel);
		SpringLayout sl_taskDataPanel = new SpringLayout();
		taskDataPanel.setLayout(sl_taskDataPanel);

		JLabel lblTitolo = new JLabel("Titolo");
		sl_taskDataPanel.putConstraint(SpringLayout.NORTH, lblTitolo, 10,
				SpringLayout.NORTH, taskDataPanel);
		sl_taskDataPanel.putConstraint(SpringLayout.WEST, lblTitolo, 10,
				SpringLayout.WEST, taskDataPanel);
		taskDataPanel.add(lblTitolo);

		JLabel lblConsulente = new JLabel("Consulente");
		sl_taskDataPanel.putConstraint(SpringLayout.WEST, lblConsulente, 0,
				SpringLayout.WEST, lblTitolo);
		sl_taskDataPanel.putConstraint(SpringLayout.SOUTH, lblConsulente, 35,
				SpringLayout.SOUTH, lblTitolo);
		taskDataPanel.add(lblConsulente);

		JLabel lblNTask = new JLabel("N\u00B0 task");
		sl_taskDataPanel.putConstraint(SpringLayout.WEST, lblNTask, 0,
				SpringLayout.WEST, lblTitolo);
		sl_taskDataPanel.putConstraint(SpringLayout.SOUTH, lblNTask, 35,
				SpringLayout.SOUTH, lblConsulente);
		taskDataPanel.add(lblNTask);

		titolo = new JTextField();
		sl_taskDataPanel.putConstraint(SpringLayout.NORTH, titolo, 0,
				SpringLayout.NORTH, lblTitolo);
		sl_taskDataPanel.putConstraint(SpringLayout.WEST, titolo, 70,
				SpringLayout.EAST, lblTitolo);
		sl_taskDataPanel.putConstraint(SpringLayout.EAST, titolo, 270,
				SpringLayout.EAST, lblTitolo);
		taskDataPanel.add(titolo);
		titolo.setColumns(10);

		cbxConsulente = new JComboBox();
		sl_taskDataPanel.putConstraint(SpringLayout.NORTH, cbxConsulente, 0,
				SpringLayout.NORTH, lblConsulente);
		sl_taskDataPanel.putConstraint(SpringLayout.WEST, cbxConsulente, 0,
				SpringLayout.WEST, titolo);
		sl_taskDataPanel.putConstraint(SpringLayout.EAST, cbxConsulente, 0,
				SpringLayout.EAST, titolo);
		taskDataPanel.add(cbxConsulente);

		JComboBox cbxNumeroTask = new JComboBox();
		sl_taskDataPanel.putConstraint(SpringLayout.NORTH, cbxNumeroTask, -3,
				SpringLayout.NORTH, lblNTask);
		sl_taskDataPanel.putConstraint(SpringLayout.WEST, cbxNumeroTask, 0,
				SpringLayout.WEST, titolo);
		sl_taskDataPanel.putConstraint(SpringLayout.EAST, cbxNumeroTask, 154,
				SpringLayout.WEST, taskDataPanel);
		taskDataPanel.add(cbxNumeroTask);

		JTextArea textArea = new JTextArea();
		textArea.setBorder(new MatteBorder(1, 1, 1, 1, Color.LIGHT_GRAY));
		sl_taskDataPanel.putConstraint(SpringLayout.NORTH, textArea, -5,
				SpringLayout.NORTH, lblConsulente);
		sl_taskDataPanel.putConstraint(SpringLayout.SOUTH, textArea, 10,
				SpringLayout.SOUTH, cbxNumeroTask);
		sl_taskDataPanel.putConstraint(SpringLayout.EAST, textArea, -10,
				SpringLayout.EAST, taskDataPanel);
		taskDataPanel.add(textArea);

		JLabel lblDescrizione = new JLabel("Descrizione");
		sl_taskDataPanel.putConstraint(SpringLayout.WEST, textArea, 0,
				SpringLayout.WEST, lblDescrizione);
		sl_taskDataPanel.putConstraint(SpringLayout.NORTH, lblDescrizione, 0,
				SpringLayout.NORTH, lblTitolo);
		sl_taskDataPanel.putConstraint(SpringLayout.WEST, lblDescrizione, 67,
				SpringLayout.EAST, titolo);
		taskDataPanel.add(lblDescrizione);

		JButton btnReset = new JButton("Reset");
		sl_taskDataPanel.putConstraint(SpringLayout.SOUTH, btnReset, -5,
				SpringLayout.SOUTH, taskDataPanel);
		sl_taskDataPanel.putConstraint(SpringLayout.EAST, btnReset, -10,
				SpringLayout.EAST, taskDataPanel);
		taskDataPanel.add(btnReset);

		JButton btnInserisci = new JButton("Inserisci");
		btnInserisci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				createSingleTask();
			}
		});
		sl_taskDataPanel.putConstraint(SpringLayout.SOUTH, btnInserisci, 0,
				SpringLayout.SOUTH, btnReset);
		sl_taskDataPanel.putConstraint(SpringLayout.EAST, btnInserisci, -41,
				SpringLayout.WEST, btnReset);
		taskDataPanel.add(btnInserisci);

		JPanel taskPanel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, taskPanel, 10,
				SpringLayout.SOUTH, taskDataPanel);
		springLayout.putConstraint(SpringLayout.WEST, taskPanel, 10,
				SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, taskPanel, -40,
				SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, taskPanel, -10,
				SpringLayout.EAST, this);
		taskPanel.setBorder(new TitledBorder(null, "Task finora inseriti",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(taskPanel);
		SpringLayout sl_taskPanel = new SpringLayout();
		taskPanel.setLayout(sl_taskPanel);

		JScrollPane scrollPanel = new JScrollPane();
		sl_taskPanel.putConstraint(SpringLayout.NORTH, scrollPanel, 0,
				SpringLayout.NORTH, taskPanel);
		sl_taskPanel.putConstraint(SpringLayout.WEST, scrollPanel, 0,
				SpringLayout.WEST, taskPanel);
		sl_taskPanel.putConstraint(SpringLayout.SOUTH, scrollPanel, 0,
				SpringLayout.SOUTH, taskPanel);
		sl_taskPanel.putConstraint(SpringLayout.EAST, scrollPanel, 0,
				SpringLayout.EAST, taskPanel);
		springLayout.putConstraint(SpringLayout.NORTH, scrollPanel, 232,
				SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, scrollPanel, 10,
				SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, scrollPanel, -40,
				SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, scrollPanel, -10,
				SpringLayout.EAST, this);
		taskPanel.add(scrollPanel);

		scrollPanel.setViewportView(verticalBox);
		
	
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indietro();
			}
		});
		btnBack.setPreferredSize(new Dimension(100, 25));
		btnBack.setMinimumSize(new Dimension(100, 25));
		btnBack.setMaximumSize(new Dimension(100, 25));
		springLayout.putConstraint(SpringLayout.NORTH, btnBack, 6, SpringLayout.SOUTH, taskPanel);
		springLayout.putConstraint(SpringLayout.WEST, btnBack, 31, SpringLayout.WEST, this);
		add(btnBack);
		
		JButton btnNext = new JButton("Next");
		btnNext.setPreferredSize(new Dimension(100, 25));
		btnNext.setMinimumSize(new Dimension(100, 25));
		btnNext.setMaximumSize(new Dimension(100, 25));
		springLayout.putConstraint(SpringLayout.NORTH, btnNext, 6, SpringLayout.SOUTH, taskPanel);
		springLayout.putConstraint(SpringLayout.EAST, btnNext, -10, SpringLayout.EAST, this);
		add(btnNext);
		
		
		
	}
	
	public Box getVerticalBox() {
		return verticalBox;
	}
	
	public void indietro()
	{
		UIFacade.getInstance().toGuiAction(Constants.getInstance().mainWindowCommand, null);
	}

	public JComboBox getCbxConsulente() {
		return cbxConsulente;
	}

	protected void createSingleTask() {
		//this.
		//UIFacade.getInstance().setAData("taskList", this.vBoxInvoices);
		//UIFacade.getInstance().setAData("invoicesPanel", this.invoicesPanel);
		
		//ControlFacade.getInstance().setData("DataFatturaInserita", invoiceDateInvoice.getDate());
		//UIFacade.getInstance().toSysAction(Constants.getInstance().operationCreateNewInvoice,this.vBoxInvoices);
		
	}
}