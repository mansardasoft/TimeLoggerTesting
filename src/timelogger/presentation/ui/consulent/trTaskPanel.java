package timelogger.presentation.ui.consulent;

import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.Font;

public class trTaskPanel extends JPanel {
	private final JCheckBox checkBox = new JCheckBox("");
	private JLabel lblID;
	private JLabel lblStartDate;
	private JLabel lblEndDate;
	private JScrollPane scrollPane;
	private JTextArea txtrCommentoInspirator;
	public trTaskPanel() {
		setMinimumSize(new Dimension(500, 40));
		setMaximumSize(new Dimension(775, 40));
		setBorder(new LineBorder(Color.LIGHT_GRAY));
		setPreferredSize(new Dimension(774, 40));
		SpringLayout springLayout = new SpringLayout();
		springLayout.putConstraint(SpringLayout.NORTH, checkBox, 5, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, checkBox, -20, SpringLayout.EAST, this);
		setLayout(springLayout);
		
		lblID = new JLabel("ID");
		lblID.setHorizontalAlignment(SwingConstants.CENTER);
		lblID.setPreferredSize(new Dimension(19, 14));
		springLayout.putConstraint(SpringLayout.NORTH, lblID, 0, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblID, 0, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblID, 0, SpringLayout.SOUTH, this);
		add(lblID);
		
		JSeparator separator = new JSeparator();
		springLayout.putConstraint(SpringLayout.NORTH, separator, 0, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, separator, 0, SpringLayout.EAST, lblID);
		springLayout.putConstraint(SpringLayout.SOUTH, separator, 0, SpringLayout.SOUTH, this);
		separator.setOrientation(SwingConstants.VERTICAL);
		add(separator);
		
		lblStartDate = new JLabel("Data di inizio");
		lblStartDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblStartDate.setPreferredSize(new Dimension(150, 14));
		springLayout.putConstraint(SpringLayout.NORTH, lblStartDate, 0, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblStartDate, 0, SpringLayout.WEST, separator);
		springLayout.putConstraint(SpringLayout.SOUTH, lblStartDate, 0, SpringLayout.SOUTH, this);
		add(lblStartDate);
		
		JSeparator separator_1 = new JSeparator();
		springLayout.putConstraint(SpringLayout.NORTH, separator_1, 0, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, separator_1, 0, SpringLayout.EAST, lblStartDate);
		springLayout.putConstraint(SpringLayout.SOUTH, separator_1, 0, SpringLayout.SOUTH, this);
		separator_1.setOrientation(SwingConstants.VERTICAL);
		add(separator_1);
		
		lblEndDate = new JLabel("Data di fine");
		lblEndDate.setPreferredSize(new Dimension(150, 14));
		lblEndDate.setHorizontalAlignment(SwingConstants.CENTER);
		springLayout.putConstraint(SpringLayout.NORTH, lblEndDate, 0, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblEndDate, 0, SpringLayout.EAST, separator_1);
		springLayout.putConstraint(SpringLayout.SOUTH, lblEndDate, 0, SpringLayout.SOUTH, this);
		add(lblEndDate);
		
		JSeparator separator_2 = new JSeparator();
		springLayout.putConstraint(SpringLayout.NORTH, separator_2, 0, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, separator_2, 0, SpringLayout.EAST, lblEndDate);
		springLayout.putConstraint(SpringLayout.SOUTH, separator_2, 0, SpringLayout.SOUTH, this);
		separator_2.setOrientation(SwingConstants.VERTICAL);
		add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		springLayout.putConstraint(SpringLayout.EAST, separator_3, -68, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.WEST, checkBox, 20, SpringLayout.WEST, separator_3);
		springLayout.putConstraint(SpringLayout.NORTH, separator_3, 0, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, separator_3, 0, SpringLayout.SOUTH, this);
		separator_3.setOrientation(SwingConstants.VERTICAL);
		add(separator_3);
		checkBox.setEnabled(false);
		checkBox.setPreferredSize(new Dimension(20, 20));
		add(checkBox);
		
		scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		springLayout.putConstraint(SpringLayout.NORTH, scrollPane, 0, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, scrollPane, 0, SpringLayout.EAST, lblEndDate);
		springLayout.putConstraint(SpringLayout.SOUTH, scrollPane, 0, SpringLayout.SOUTH, lblID);
		springLayout.putConstraint(SpringLayout.EAST, scrollPane, 0, SpringLayout.WEST, separator_3);
		add(scrollPane);
		
		txtrCommentoInspirator = new JTextArea();
		txtrCommentoInspirator.setEditable(false);
		txtrCommentoInspirator.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtrCommentoInspirator.setLineWrap(true);
		txtrCommentoInspirator.setMaximumSize(new Dimension(282, 40));
		txtrCommentoInspirator.setText("Commento inspirator!");
		scrollPane.setViewportView(txtrCommentoInspirator);
	}
	public JLabel getLblID() {
		return lblID;
	}
	public JLabel getLblStartDate() {
		return lblStartDate;
	}
	public JLabel getLblEndDate() {
		return lblEndDate;
	}
	
	public JCheckBox getCheckBox() {
		return checkBox;
	}
	public JTextArea getTxtCommento() {
		return txtrCommentoInspirator;
	}
}
