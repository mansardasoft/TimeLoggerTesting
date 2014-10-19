package timelogger.presentation.ui.shared;


import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FocusTraversalPolicy;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import timelogger.presentation.UIFacade;
import timelogger.presentation.graphicCommand.GuiManager;
import timelogger.utilities.Constants;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class loginPanel extends JPanel {
	
	private JTextField textFieldUsername;
	private JPasswordField textFieldPassword;
	private JButton btnLogin,btnReset;
	private JLabel lblWarning;
	/**
	 * Create the panel.
	 */
	public loginPanel() {
		setPreferredSize(new Dimension(400, 350));
			
		JLabel lblUsername = new JLabel("User");
		
		JLabel lblPassword = new JLabel("Password");
		
		textFieldUsername = new JTextField();
		textFieldUsername.setPreferredSize(new Dimension(26, 20));
		
		textFieldUsername.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textFieldPassword.requestFocus();
			}
		});
		textFieldUsername.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				textFieldUsername.setText(limitedText(textFieldUsername.getText(),10));
			}
		});
		textFieldUsername.setColumns(10);
		
		textFieldPassword = new JPasswordField();
		textFieldPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operationLogin();
			}
		});
		textFieldPassword.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				textFieldPassword.setText(limitedText(String.valueOf(textFieldPassword.getPassword()),10));
			}
		});
		textFieldPassword.setColumns(10);
		textFieldPassword.setEchoChar('*');
		
		btnLogin = new JButton("Login");
		btnLogin.setMaximumSize(new Dimension(65, 23));
		btnLogin.setMinimumSize(new Dimension(65, 23));
		btnLogin.setPreferredSize(new Dimension(65, 23));
		btnLogin.setFocusPainted(false);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				operationLogin();
				
			}
		});
		btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearField();
			}
		});
		btnReset.setMaximumSize(new Dimension(65, 23));
		btnReset.setMinimumSize(new Dimension(65, 23));
		btnReset.setPreferredSize(new Dimension(65, 23));
		btnReset.setFocusPainted(false);
		
		SpringLayout springLayout = new SpringLayout();
		springLayout.putConstraint(SpringLayout.NORTH, textFieldPassword, 17, SpringLayout.SOUTH, textFieldUsername);
		springLayout.putConstraint(SpringLayout.WEST, textFieldPassword, 0, SpringLayout.WEST, textFieldUsername);
		springLayout.putConstraint(SpringLayout.EAST, textFieldPassword, 0, SpringLayout.EAST, textFieldUsername);
		springLayout.putConstraint(SpringLayout.NORTH, lblUsername, 75, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, textFieldUsername, -278, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.EAST, textFieldUsername, -160, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.WEST, lblUsername, 30, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.WEST, btnReset, 10, SpringLayout.EAST, btnLogin);
		springLayout.putConstraint(SpringLayout.WEST, btnLogin, 200, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.WEST, lblPassword, 0, SpringLayout.WEST, lblUsername);
		springLayout.putConstraint(SpringLayout.NORTH, btnReset, 25, SpringLayout.SOUTH, textFieldPassword);
		springLayout.putConstraint(SpringLayout.NORTH, btnLogin, 0, SpringLayout.NORTH, btnReset);
		springLayout.putConstraint(SpringLayout.NORTH, lblPassword, 3, SpringLayout.NORTH, textFieldPassword);
		springLayout.putConstraint(SpringLayout.NORTH, textFieldUsername, 72, SpringLayout.NORTH, this);
		setLayout(springLayout);
		
		
		add(lblUsername);
		add(lblPassword);
		add(textFieldPassword);
		add(textFieldUsername);
		add(btnReset);
		add(btnLogin);
			
		this.setFocusCycleRoot(true);	
		
		lblWarning = new JLabel("<html> <div style='text-align:center'>Il nome utente o la password inseriti non sono corretti<br><br>oppure non esiste un utente a lei associato nel database.</div></html>");
		lblWarning.setHorizontalAlignment(SwingConstants.CENTER);
		springLayout.putConstraint(SpringLayout.NORTH, lblWarning, 30, SpringLayout.SOUTH, btnReset);
		springLayout.putConstraint(SpringLayout.WEST, lblWarning, 40, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, lblWarning, -40, SpringLayout.EAST, this);
		lblWarning.setOpaque(true);
		lblWarning.setFocusTraversalKeysEnabled(false);
		lblWarning.setFocusable(false);
		lblWarning.setRequestFocusEnabled(false);
		lblWarning.setVisible(false);
		
		///////////////////////////////
		
		lblWarning.setVisible(false);
		add(lblWarning);
		
		///////////////////////////////
		
		
		LoginFocusTraversal l=new LoginFocusTraversal();
		l.getFirstComponent(this);
		setFocusTraversalPolicy(l);
				
		
	}
	
	private void operationLogin() {
		UIFacade.getInstance().setAData("Username", textFieldUsername.getText());
		UIFacade.getInstance().setAData("Password", String.valueOf(textFieldPassword.getPassword()));
		UIFacade.getInstance().toSysAction(Constants.getInstance().operationLogin, this);
	}

	/*
	 * Our method limit a textField 
	 */
	
	public String limitedText(String s, int limit)
	{
		if(s.length()>=limit){
			return s.substring(0, --limit);
		}
		return s;
	}
	
	private class LoginFocusTraversal extends FocusTraversalPolicy
	{
		Component componentReturn=null;
		@Override
		public Component getComponentAfter(Container container, Component component)
		{
			
			if(component.equals(textFieldUsername)){
				componentReturn=textFieldPassword;
			}
			
			else if(component.equals(textFieldUsername)){
				textFieldPassword.selectAll();
				componentReturn=textFieldPassword;
			}
			else if(component.equals(textFieldPassword))
				componentReturn=btnLogin;
			else if(component.equals(btnLogin)){
				textFieldUsername.selectAll();
				componentReturn=textFieldUsername;
			}
			else if(component.equals(btnReset)){
				textFieldUsername.selectAll();
				componentReturn=textFieldUsername;
			}
			
			return componentReturn;
		}

		@Override
		public Component getComponentBefore(Container container, Component component) {
			if(component.equals(textFieldPassword)) return textFieldUsername;
			else if(component.equals(btnLogin)) return textFieldPassword;
			else if(component.equals(btnReset)) return btnLogin;
			return null;
		}

		@Override
		public Component getDefaultComponent(Container container) {
			// TODO Auto-generated method stub
			return textFieldUsername;
		}

		@Override
		public Component getFirstComponent(Container container) {
			// TODO Auto-generated method stub
			return textFieldUsername;
		}

		@Override
		public Component getLastComponent(Container container) {
			// TODO Auto-generated method stub
			return btnReset;
		}
		
	}
	
	protected void clearField() {
		this.textFieldPassword.setText(null);
		this.textFieldUsername.setText(null);
		this.textFieldUsername.requestFocus();
	
	}
	
	public void changeColor() {
		
		alertDialog alert= new alertDialog("Login", "Login errato, verificare le credenziali!");
		
		this.clearField();
		this.lblWarning.setVisible(true);
		this.updateUI();
		this.validate();
	}
	
}








