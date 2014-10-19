package timelogger.presentation.ui.manager;

import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.SpringLayout;
import java.awt.SystemColor;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Timer;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

@SuppressWarnings("serial")
public class singleTaskPanel extends JPanel {

	private Color backgroundColor = new Color(240, 240, 240);
	private Color editColor = new Color(190, 255, 168);
	private JLabel lblTaskNumber = new JLabel("04");


	private JSeparator separator1 = new JSeparator();
	private JLabel lblTitoloTask = new JLabel();
	private JSeparator separator2 = new JSeparator();
	private JComboBox comboConsulente = new JComboBox();
	private JSeparator separator3 = new JSeparator();
	private JButton btnDescription = new JButton("Descrizione");
	private JSeparator separator4 = new JSeparator();
	private JButton btnCancel = new JButton("x"); // possibili valori: {S�, No}
	private int delay = 1100;
	private boolean firstTime=true;
	
	private ActionListener change = new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			revertColor();
		}
	};
	private Timer support = new Timer(delay, change);
	private final JButton btnNewButton = new JButton("up");
	private final JButton btnDown = new JButton("down");

	public singleTaskPanel() {
		this.setBackground(backgroundColor);
		setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null,
				null));
		setPreferredSize(new Dimension(740, 40));
		setMinimumSize(new Dimension(740, 40));
		setMaximumSize(new Dimension(740, 40));
		SpringLayout springLayout = new SpringLayout();
		springLayout.putConstraint(SpringLayout.NORTH, comboConsulente, 0,
				SpringLayout.NORTH, btnDescription);
		springLayout.putConstraint(SpringLayout.NORTH, btnDown, -15,
				SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton, 15,
				SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, btnDown, 3,
				SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, btnDown, -3,
				SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, btnDown, -5,
				SpringLayout.WEST, lblTaskNumber);
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 3,
				SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 3,
				SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton, -5,
				SpringLayout.WEST, lblTaskNumber);

		springLayout.putConstraint(SpringLayout.EAST, lblTaskNumber, -3,
				SpringLayout.EAST, separator1);
		springLayout.putConstraint(SpringLayout.WEST, btnDescription, 10,
				SpringLayout.WEST, separator3);

		springLayout.putConstraint(SpringLayout.WEST, separator3, 230,
				SpringLayout.WEST, separator2);
		springLayout.putConstraint(SpringLayout.EAST, separator4, -50,
				SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.NORTH, btnDescription, 5,
				SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.NORTH, btnCancel, 5,
				SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, separator1, 50,
				SpringLayout.WEST, this);
		setLayout(springLayout);

		springLayout.putConstraint(SpringLayout.NORTH, lblTaskNumber, 0,
				SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblTaskNumber, 0,
				SpringLayout.SOUTH, this);
		add(lblTaskNumber);
		springLayout.putConstraint(SpringLayout.NORTH, separator1, 0,
				SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, separator1, 0,
				SpringLayout.SOUTH, this);
		separator1.setOrientation(SwingConstants.VERTICAL);
		separator1.setForeground(SystemColor.controlShadow);
		add(separator1);

		String dati = new String();
		dati = "<html>riga1 blablablablab laasdas<br />";
		dati = dati + "riga2 blabla blablaasdasdasd</html>";
		// forse necessario metodo per formattare la stringa di input dal task.
		// esempio: conta caratteri del titolo del task e, dopo un certo valore
		// x,
		// inserisce il tag html per andare a capo (o meglio dallo spazio subito
		// prima
		// di un certo valore x)
		// JLabel lblSubprojectgettaskgettitleCantami = new
		// JLabel("subProject.getTask().getTitle() cantami o diva del pelide Achille l'ira funesta");
		lblTitoloTask.setText(dati);
		springLayout.putConstraint(SpringLayout.NORTH, lblTitoloTask, 0,
				SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblTitoloTask, 3,
				SpringLayout.WEST, separator1);
		springLayout.putConstraint(SpringLayout.SOUTH, lblTitoloTask, 0,
				SpringLayout.SOUTH, this);
		add(lblTitoloTask);

		springLayout.putConstraint(SpringLayout.WEST, separator2, 340,
				SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, lblTitoloTask, -3,
				SpringLayout.EAST, separator2);
		springLayout.putConstraint(SpringLayout.NORTH, separator2, 0,
				SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, separator2, 0,
				SpringLayout.SOUTH, this);
		separator2.setForeground(new Color(160, 160, 160));
		separator2.setOrientation(SwingConstants.VERTICAL);
		add(separator2);

		springLayout.putConstraint(SpringLayout.WEST, comboConsulente, 7,
				SpringLayout.EAST, separator2);
		comboConsulente.setModel(new DefaultComboBoxModel(new String[] {"a", "b", "c"}));
		add(comboConsulente);
		
		comboConsulente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboConsulente.addItemListener(new ItemListener() {
					public void itemStateChanged(ItemEvent e)
					{ 
						changeColor();				
					}
			});
		}});
		
		springLayout.putConstraint(SpringLayout.EAST, comboConsulente, -7,
				SpringLayout.EAST, separator3);
		springLayout.putConstraint(SpringLayout.NORTH, separator3, 0,
				SpringLayout.NORTH, this);
		separator3.setOrientation(SwingConstants.VERTICAL);
		springLayout.putConstraint(SpringLayout.SOUTH, separator3, 0,
				SpringLayout.SOUTH, this);
		add(separator3);

		btnDescription.setHorizontalAlignment(SwingConstants.CENTER);
		add(btnDescription);
		springLayout.putConstraint(SpringLayout.NORTH, separator4, 0,
				SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, separator4, 0,
				SpringLayout.SOUTH, this);
		separator4.setOrientation(SwingConstants.VERTICAL);
		add(separator4);

		btnCancel.setHorizontalAlignment(SwingConstants.CENTER);
		btnCancel.setHorizontalTextPosition(SwingConstants.CENTER);
		springLayout.putConstraint(SpringLayout.EAST, btnCancel, -3,
				SpringLayout.EAST, this);
		add(btnCancel);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 5));

		add(btnNewButton);

		add(btnDown);

	}

	public void changeColor() {
		
		if(this.firstTime)	
		{
			this.firstTime=false;
		}
		else
		{
			this.setBackground(editColor);
			this.updateUI();
			this.validate();
			support.start();
		}
			
	}
	
	public void revertColor() {
		this.setBackground(backgroundColor);
		this.updateUI();
		this.validate();
	}
	
	public JLabel getLblTaskNumber() {
		return lblTaskNumber;
	}

	public JLabel getLblTitoloTask() {
		return lblTitoloTask;
	}

	public JComboBox getComboConsulente() {
		return comboConsulente;
	}

	public JButton getBtnDescription() {
		return btnDescription;
	}

}