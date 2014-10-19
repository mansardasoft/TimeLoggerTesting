package timelogger.presentation.clui;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.ScrollPaneConstants;

import timelogger.utilities.graphicSettings;

import java.awt.Dimension;

public class Terminal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2766083199706526913L;
	private JPanel contentPane;
	private JTextArea txtrConsole;
	
	/**
	 * Create the frame.
	 */
	public Terminal() {
		setMaximumSize(graphicSettings.getInstance().getMaximumDimensionFrame());
		setMinimumSize(graphicSettings.getInstance().getMinimumDimensionFrame());
		setPreferredSize(graphicSettings.getInstance().getPreferedDimensionFrame());
		setTitle("Timelogger Terminal");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1001, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.GREEN);
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Courier New", Font.PLAIN, 11));
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		contentPane.add(scrollPane);
		
		txtrConsole = new JTextArea();
		txtrConsole.setFont(new Font("Courier New", Font.BOLD, 13));
		txtrConsole.setBackground(Color.BLACK);
		txtrConsole.setForeground(Color.GREEN);
		txtrConsole.setText("Admin Database Report");
		scrollPane.setViewportView(txtrConsole);
		
		setLocation(graphicSettings.getInstance().getLocationXFrame(), graphicSettings.getInstance().getLocationXFrame());
		
		this.setVisible(true);
	}

	public void addLog(String message)
	{
		this.txtrConsole.setText(this.txtrConsole.getText()+"\n"+message);
		this.validate();
	}
}
