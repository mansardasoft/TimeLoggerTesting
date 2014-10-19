package timelogger.presentation.ui.shared;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import timelogger.presentation.graphicCommand.GuiManager;

public class alertDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Create the dialog.
	 */
	public alertDialog(String Titolo, String warning ) {

		Rectangle bounds=GuiManager.getInstance().getDialog().getBounds();
		getContentPane().setBounds(bounds);
		JOptionPane.showMessageDialog(getContentPane(),warning, "[TimeLogger]: "+Titolo, JOptionPane.WARNING_MESSAGE);
		
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
	}

}
