package timelogger.presentation.ui.admin;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import timelogger.presentation.UIFacade;
import timelogger.utilities.Constants;

@SuppressWarnings("serial")
public class subProjResumePanel extends JPanel
{
	private static int counter=0;
	
	private int index;
	
	private Container father;
	private JPanel updatableParent;
	private JLabel lblTitolo;
	
	public subProjResumePanel() {
		setMaximumSize(new Dimension(430, 35));
		setPreferredSize(new Dimension(430, 35));
		setMinimumSize(new Dimension(430, 35));
		
		JButton btnSubProjRemove = new JButton("x");
		btnSubProjRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeSubProj();
			}
		});
		btnSubProjRemove.setPreferredSize(new Dimension(26, 25));
		btnSubProjRemove.setMinimumSize(new Dimension(26, 25));
		btnSubProjRemove.setMaximumSize(new Dimension(26, 25));
		SpringLayout springLayout = new SpringLayout();
		springLayout.putConstraint(SpringLayout.WEST, btnSubProjRemove, -44, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.NORTH, btnSubProjRemove, 5, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, btnSubProjRemove, -5, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, btnSubProjRemove, -5, SpringLayout.EAST, this);
		setLayout(springLayout);
		add(btnSubProjRemove);
		
		lblTitolo = new JLabel();
		springLayout.putConstraint(SpringLayout.NORTH, lblTitolo, 0, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblTitolo, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblTitolo, 0, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, lblTitolo, -5, SpringLayout.WEST, btnSubProjRemove);
		add(lblTitolo);
		
		this.setIndex(counter);
		counter+=1;
	}
	

	public void setFather(Container father) {
		this.father = father;
	}
	
	public Container getFather() {
		return this.father;
	}
	
	public void removeSubProj()
	{
		UIFacade.getInstance().toSysAction(Constants.getInstance().operationRemoveSubProj, this);
	}

	public JPanel getUpdatableParent() {
		return updatableParent;
	}

	public void setUpdatableParent(JPanel updatableParent) {
		this.updatableParent = updatableParent;
	}
	
	public void setTitle(String titolo)
	{
		this.lblTitolo.setText(titolo);
	}

	public int getIndex()
	{
		return this.index;
	}

	public void setIndex(int index) {
		this.index = index;
	}


	public static int getCounter() {
		return counter;
	}


	public static void setCounter(int counter) {
		subProjResumePanel.counter = counter;
	}
}
