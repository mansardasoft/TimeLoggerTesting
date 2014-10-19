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
public class invoiceResumePanel extends JPanel {
	
	private static int counter=0;
	
	private int index=0;
	
	private Container father;
	private JPanel updatableParent;
	private JLabel lblDateInvoiceResume;
	
	public invoiceResumePanel() {
		
		setPreferredSize(new Dimension(250, 35));
		setMaximumSize(new Dimension(250, 35));
		setMinimumSize(new Dimension(250, 35));
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		lblDateInvoiceResume = new JLabel("Data Fattura: ");
		springLayout.putConstraint(SpringLayout.WEST, lblDateInvoiceResume, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblDateInvoiceResume, -9, SpringLayout.SOUTH, this);
		add(lblDateInvoiceResume);
		
		JButton btnCancInvoice = new JButton("x");
		springLayout.putConstraint(SpringLayout.NORTH, btnCancInvoice, 5, SpringLayout.NORTH, this);
		btnCancInvoice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeInvoice();
			}
		});
		springLayout.putConstraint(SpringLayout.EAST, btnCancInvoice, -5, SpringLayout.EAST, this);
		add(btnCancInvoice);
		
		this.index=counter;
		counter+=1;
		
	}

	public Container getFather() {
		return father;
	}

	public void setFather(Container father) {
		this.father = father;
	}
	
	public void removeInvoice()
	{
		UIFacade.getInstance().toSysAction(Constants.getInstance().operationRemoveInvoice, this);
	}

	public JPanel getUpdatableParent() {
		return updatableParent;
	}

	public void setUpdatableParent(JPanel updatableParent) {
		this.updatableParent = updatableParent;
	}
	
	public void setDate(String date)
	{
		this.lblDateInvoiceResume.setText(this.lblDateInvoiceResume.getText()+date);
	}
	
	public static int getCounter()
	{
		return counter;
	}

	public int getIndex() {
		return this.index;
	}

	public static void setCounter(int i) 
	{
		counter=i;
		
	}

}
