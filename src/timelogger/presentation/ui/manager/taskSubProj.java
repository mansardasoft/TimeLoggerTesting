package timelogger.presentation.ui.manager;

import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.SpringLayout;
import java.awt.Component;
import javax.swing.Box;
import java.awt.SystemColor;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.Timer;

import timelogger.domain.Consulente;
import timelogger.presentation.UIFacade;
import timelogger.utilities.Constants;


@SuppressWarnings({ "serial", "unused" })
public class taskSubProj extends JPanel {
	
	private Color backgroundColor = new Color(240, 240, 240);
	private Color editColor = new Color (190, 255, 168);
	private JLabel lblTaskNumber = new JLabel("04");
	private JSeparator separator1, separator2, separator3, separator4;
	private JLabel lblTitoloTask;
	
	@SuppressWarnings("rawtypes")
	private JComboBox comboConsulente = new JComboBox();
	
	private JLabel lblStato = new JLabel("Da assegnare"); 		//possibili stati: {Da assegnare, Completato, In corso}
	
	private JLabel lblFatturato = new JLabel("S\u00EC");	//possibili valori: {S�, No}
	private int delay = 1100;
	private boolean firstTime=true;
	
	private ActionListener change = new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			revertColor();
		}
	};
	private Timer support = new Timer(delay, change);
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public taskSubProj() {
		
		//System.out.println(this.comboConsulente.getSelectedItem().getClass());
		/*
		if(this.comboConsulente.getSelectedItem() instanceof String)
			{
			System.out.println(this.comboConsulente.getSelectedItem().getClass());
			firstTime=false;
			}
			*/
		this.setBackground(backgroundColor);
		setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setPreferredSize(new Dimension(740, 40));
		setMinimumSize(new Dimension(740, 40));
		setMaximumSize(new Dimension(740, 40));
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		springLayout.putConstraint(SpringLayout.NORTH, lblTaskNumber, 0, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblTaskNumber, 3, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblTaskNumber, 0, SpringLayout.SOUTH, this);
		add(lblTaskNumber);
		
		
		this.separator1=new JSeparator();
		springLayout.putConstraint(SpringLayout.EAST, lblTaskNumber, 3, SpringLayout.EAST, separator1);
		springLayout.putConstraint(SpringLayout.NORTH, separator1, 0, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, separator1, 24, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, separator1, 0, SpringLayout.SOUTH, this);
		separator1.setOrientation(SwingConstants.VERTICAL);
		separator1.setForeground(SystemColor.controlShadow);
		add(separator1);
		
		String dati = new String();
		dati="<html>riga1 blablablablab laasdas<br />";
		dati=dati+"riga2 blabla blablaasdasdasd</html>";
		
		
		lblTitoloTask = new JLabel();
		lblTitoloTask.setText(dati);
		springLayout.putConstraint(SpringLayout.NORTH, lblTitoloTask, 0, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblTitoloTask, 3, SpringLayout.WEST, separator1);
		springLayout.putConstraint(SpringLayout.SOUTH, lblTitoloTask, 0, SpringLayout.SOUTH, this);
		add(lblTitoloTask);
		
		this.separator2=new JSeparator();
		springLayout.putConstraint(SpringLayout.WEST, separator2, 340, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, lblTitoloTask, -3, SpringLayout.EAST, separator2);
		springLayout.putConstraint(SpringLayout.NORTH, separator2, 0, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, separator2, 0, SpringLayout.SOUTH, this);
		separator2.setForeground(new Color(160, 160, 160));
		separator2.setOrientation(SwingConstants.VERTICAL);
		add(separator2);
		
		springLayout.putConstraint(SpringLayout.WEST, comboConsulente, 7, SpringLayout.EAST, separator2);
		comboConsulente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboConsulente.addItemListener(new ItemListener() {
					public void itemStateChanged(ItemEvent e)
					{ 
						changeColor();				
					}
			});
		}});

		comboConsulente.setModel(new DefaultComboBoxModel(new String[] {"nessuno", "Franco Rossi", "Giovanni Bianchi", "Ermenegildo Costantinelli Asdrubale Attila"}));
		springLayout.putConstraint(SpringLayout.NORTH, comboConsulente, 10, SpringLayout.NORTH, this);
		add(comboConsulente);
		
		this.separator3=new JSeparator();
		springLayout.putConstraint(SpringLayout.WEST, separator3, 260, SpringLayout.WEST, separator2);
		springLayout.putConstraint(SpringLayout.EAST, comboConsulente, -7, SpringLayout.EAST, separator3);
		springLayout.putConstraint(SpringLayout.NORTH, separator3, 0, SpringLayout.NORTH, this);
		separator3.setOrientation(SwingConstants.VERTICAL);
		springLayout.putConstraint(SpringLayout.SOUTH, separator3, 0, SpringLayout.SOUTH, this);
		add(separator3);
		
		lblStato.setHorizontalAlignment(SwingConstants.CENTER);
		springLayout.putConstraint(SpringLayout.NORTH, lblStato, 0, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblStato, 3, SpringLayout.WEST, separator3);
		springLayout.putConstraint(SpringLayout.SOUTH, lblStato, 0, SpringLayout.SOUTH, this);
		add(lblStato);
		
		this.separator4=new JSeparator();
		springLayout.putConstraint(SpringLayout.WEST, separator4, 85, SpringLayout.EAST, separator3);
		springLayout.putConstraint(SpringLayout.EAST, lblStato, -3, SpringLayout.EAST, separator4);
		springLayout.putConstraint(SpringLayout.NORTH, separator4, 0, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, separator4, 0, SpringLayout.SOUTH, this);
		separator4.setOrientation(SwingConstants.VERTICAL);
		add(separator4);
		
		lblFatturato.setHorizontalAlignment(SwingConstants.CENTER);
		lblFatturato.setHorizontalTextPosition(SwingConstants.CENTER);
		springLayout.putConstraint(SpringLayout.NORTH, lblFatturato, 0, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblFatturato, 3, SpringLayout.WEST, separator4);
		springLayout.putConstraint(SpringLayout.SOUTH, lblFatturato, 0, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, lblFatturato, -3, SpringLayout.EAST, this);
		add(lblFatturato);

	}
	

	public JLabel getLblTaskNumber() {
		return lblTaskNumber;
	}

	public JLabel getLblTitoloTask() {
		return lblTitoloTask;
	}

	@SuppressWarnings("rawtypes")
	public JComboBox getComboConsulente() {
		return comboConsulente;
	}

	public JLabel getLblStato() {
		return lblStato;
	}

	public JLabel getLblFatturato() {
		return lblFatturato;
	}
	
	public boolean isFirstTime() {
		return firstTime;
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
		

}
