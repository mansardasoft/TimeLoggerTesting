package timelogger.presentation.ui.manager;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

import timelogger.presentation.UIFacade;
import timelogger.utilities.Constants;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


@SuppressWarnings("serial")
public class dataSubProjPanel extends JPanel {

	//private String type = new String();
	private JLabel lblName, lblData;
	
	public dataSubProjPanel(String type, String value) {
		setPreferredSize(new Dimension(500, 35));
		setMinimumSize(new Dimension(500, 35));
		setMaximumSize(new Dimension(500, 35));
		setLayout(null);
		
		lblName = new JLabel(type);
		lblName.setBounds(10, 11, 63, 21);
		add(lblName);
		
		JButton btnModifica = new JButton("modifica");
		//////////////////////////////////////////////////////////////////////////////////////
		btnModifica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				editData();
			}
		});
		
		lblData = new JLabel();
		lblData.setBounds(111, 8, 63, 26);
		
		this.lblData.setText(value);
		
		///  PUNTOINTERROGATIVO
		//lblData.setText(type+"visua");
		add(lblData);
		
		btnModifica.setPreferredSize(new Dimension(89, 26));
		btnModifica.setMinimumSize(new Dimension(89, 26));
		btnModifica.setMaximumSize(new Dimension(89, 26));
		btnModifica.setBounds(194, 8, 89, 26);
		add(btnModifica);

	}
	
	public void editData() {
		UIFacade.getInstance().toGuiAction(Constants.getInstance().editDataSubProjectCommand, this);
		//Cambia pannello da SingleData a SingleDataEditable
	}
	
	public String getlblName() {
		return lblName.getText();
	}
	
	public void setlblData(String str) {
		this.lblData.setText(str);
	}
	
	public String getlblData() {
		return lblData.getText();
	}
	
	public void undoData() {
		UIFacade.getInstance().toGuiAction(Constants.getInstance().undoDataSubProjectCommand, this);
	}

}
