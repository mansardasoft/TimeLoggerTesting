package timelogger.presentation.ui.manager;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import timelogger.presentation.UIFacade;
import timelogger.utilities.Constants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


@SuppressWarnings("serial")
public class dataEditSubProjPanel extends JPanel {
	
	//private String type = new String();
	private JLabel lblName;
	private JTextField lblData;

	public dataEditSubProjPanel(String type)
	{
		setPreferredSize(new Dimension(500, 35));
		setMinimumSize(new Dimension(500, 35));
		setMaximumSize(new Dimension(500, 35));
		setLayout(null);
		
		this.lblName = new JLabel(type);
		this.lblName.setBounds(10, 11, 63, 21);
		add(this.lblName);
			
		this.lblData = new JTextField();
		this.lblData.setBounds(111, 8, 63, 26);
		add(lblData);
		
		JButton btnConferma = new JButton("conferma");
		btnConferma.addActionListener(new ActionListener() {
			//////////////////////////////////////////////////////////
			public void actionPerformed(ActionEvent e) {
				confirmData();
			}
		});
		btnConferma.setPreferredSize(new Dimension(89, 26));
		btnConferma.setMinimumSize(new Dimension(89, 26));
		btnConferma.setMaximumSize(new Dimension(89, 26));
		btnConferma.setBounds(194, 8, 89, 26);
		add(btnConferma);
			
		JButton btnAnnulla = new JButton("annulla");
		btnAnnulla.addActionListener(new ActionListener() {
			///////////////////////////////////////////////////////////
			public void actionPerformed(ActionEvent e) {
				undoData();
			}
		});
		btnAnnulla.setPreferredSize(new Dimension(89, 26));
		btnAnnulla.setMinimumSize(new Dimension(89, 26));
		btnAnnulla.setMaximumSize(new Dimension(89, 26));
		btnAnnulla.setBounds(295, 8, 89, 26);
		add(btnAnnulla);

	} 
	
	public void confirmData() {
		//1) edita il parametro scelto (NB: finch� non si fa "next" nel pannellino in basso
		//		il nuovo valore non viene sparato nel dominio, resta nel facade)
		//2) revert da SingleDataEditable a SingleData
		//3) ovviamente il nuovo pannellino ha il valore aggiornato
		
		
		//salva nel buffer del Facade il pannello padre del btn conferma
		//UIFacade.getInstance().setAData("tempSpDataEdit", this);
		UIFacade.getInstance().toGuiAction(Constants.getInstance().confirmEditDataSubProjectCommand, this);
		
	}
	
	public void undoData() {
		UIFacade.getInstance().toGuiAction(Constants.getInstance().undoDataSubProjectCommand, this);
	}
	
	public String getLabelName() {
		return lblName.getText();
	}
	
	public void setLabelName(String str) {
		this.lblName.setText(str);
	}
	
	
	/*
	 *  aggiunta per passare il valore della casella di testo edita dall'utente alla classe dataSubProjPanel
	 *  dopo il click sul pulsante conferma
	 *  
	 */
	
	public String getLabelData(){
		return lblData.getText();
	}
}

