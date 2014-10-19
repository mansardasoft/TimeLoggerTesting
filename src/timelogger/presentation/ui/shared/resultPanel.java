package timelogger.presentation.ui.shared;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import timelogger.presentation.UIFacade;
import timelogger.utilities.Constants;

public class resultPanel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2920870983398054860L;
	private JLabel lblResult;
	private JButton btnHome;

	public resultPanel() {
		setBounds(0, 0, 434, 229);
		setMinimumSize(new Dimension(400, 300));
		setMaximumSize(new Dimension(400, 300));
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
		lblResult = new JLabel("Dati correttamente inseriti!");
		lblResult.setBounds(121, 90, 165, 14);
		add(lblResult);
		
		btnHome = new JButton("Torna alla home del programma");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				tornaAllaHome();
			}
		});
		btnHome.setBounds(85, 195, 245, 23);
		add(btnHome);

	}
	
	public void tornaAllaHome()
	{
		UIFacade.getInstance().toGuiAction(Constants.getInstance().mainWindowCommand, null);
	}

}
