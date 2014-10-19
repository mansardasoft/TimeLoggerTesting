package timelogger.presentation.ui.consulent;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import timelogger.presentation.UIFacade;
import timelogger.presentation.graphicCommand.GuiManager;
import timelogger.presentation.ui.shared.alertDialog;
import timelogger.utilities.Constants;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

public class confirmTimeRecordPanel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2368419471367978376L;
	private JLabel lblDescription;
	private JLabel lblDati;
	private String riassuntoTR;

	public confirmTimeRecordPanel() {
		setPreferredSize(new Dimension(400, 350));
		setBounds(0, 0, 434, 229);
		setMinimumSize(new Dimension(400, 300));
		setMaximumSize(new Dimension(400, 350));
		setBorder(new EmptyBorder(5, 5, 5, 5));
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		{
			lblDescription = new JLabel("Vuoi confermare l'inserimento dei seguenti dati?");
			springLayout.putConstraint(SpringLayout.NORTH, lblDescription, 10, SpringLayout.NORTH, this);
			springLayout.putConstraint(SpringLayout.WEST, lblDescription, 78, SpringLayout.WEST, this);
			springLayout.putConstraint(SpringLayout.SOUTH, lblDescription, 32, SpringLayout.NORTH, this);
			springLayout.putConstraint(SpringLayout.EAST, lblDescription, 370, SpringLayout.WEST, this);
			add(lblDescription);
		}
		
		JButton btnConfirm = new JButton("Conferma");
		springLayout.putConstraint(SpringLayout.WEST, btnConfirm, 169, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, btnConfirm, -10, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, btnConfirm, 266, SpringLayout.WEST, this);
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				conferma();
			}
		});
		add(btnConfirm);
		lblDati = new JLabel();
		lblDati.setHorizontalAlignment(SwingConstants.CENTER);
		springLayout.putConstraint(SpringLayout.NORTH, lblDati, 30, SpringLayout.SOUTH, lblDescription);
		springLayout.putConstraint(SpringLayout.WEST, lblDati, 5, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, lblDati, -5, SpringLayout.EAST, this);
		lblDati.setVisible(true);
		add(lblDati);
		
		JButton buttonAnnulla = new JButton("Annulla");
		springLayout.putConstraint(SpringLayout.NORTH, buttonAnnulla, 0, SpringLayout.NORTH, btnConfirm);
		springLayout.putConstraint(SpringLayout.EAST, buttonAnnulla, -10, SpringLayout.EAST, this);
		buttonAnnulla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				annulla();
			}
		});
		add(buttonAnnulla);

	}

	public void setData(ArrayList<Object> data)
	{
		lblDati.setText("<html>Data/Ora inizio: "+data.get(0).toString()+"<br />"
						+"Data/Ora fine: "+data.get(1).toString()+"<br />"
						+"Task: "+data.get(2).toString()+"<br />"
						+"Commento: "+data.get(3).toString()+"<br /></html>");
	}
	
	public void conferma()
	{
		UIFacade.getInstance().toSysAction(Constants.getInstance().operationStoreNewTR, this);
		alertDialog a=new alertDialog("salvataggio corretto","Dati correttamente salvati");
	}
	
	public void annulla()
	{
		GuiManager.getInstance().getDialog().dispose();
	}
}
