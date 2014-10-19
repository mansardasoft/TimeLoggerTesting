package timelogger.presentation.ui.admin;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

import timelogger.presentation.UIFacade;
import timelogger.presentation.graphicCommand.GuiManager;
import timelogger.utilities.Constants;

@SuppressWarnings("serial")
public class confirmProjPanel extends JPanel {
	
	private JLabel lblProject = new JLabel();
	private final Box verticalBox = Box.createVerticalBox();

	/**
	 * Create the panel.
	 */
	
	public confirmProjPanel() {
		setMaximumSize(new Dimension(400, 350));
		setMinimumSize(new Dimension(400, 350));
		setPreferredSize(new Dimension(400, 350));
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(null);
		scrollPane.setMaximumSize(new Dimension(400, 350));
		scrollPane.setMinimumSize(new Dimension(400, 350));
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		JPanel projectPanel = new JPanel();
		projectPanel.setPreferredSize(new Dimension(400, 350));
		projectPanel.setMinimumSize(new Dimension(400, 350));
		projectPanel.setMaximumSize(new Dimension(400, 350));
		springLayout.putConstraint(SpringLayout.NORTH, projectPanel, 0, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, projectPanel, 0, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, projectPanel, 0, SpringLayout.EAST, this);
		SpringLayout sl_projectPanel = new SpringLayout();
		sl_projectPanel.putConstraint(SpringLayout.WEST, scrollPane, 5, SpringLayout.WEST, projectPanel);
		sl_projectPanel.putConstraint(SpringLayout.SOUTH, scrollPane, 0, SpringLayout.SOUTH, projectPanel);
		projectPanel.setLayout(sl_projectPanel);
		
		JLabel lblHeader = new JLabel("<html>Vuoi confermare i seguenti dati?<br /><br /></html>");
		lblHeader.setMaximumSize(new Dimension(400, 350));
		lblHeader.setMinimumSize(new Dimension(400, 350));
		lblHeader.setPreferredSize(new Dimension(400, 350));
		sl_projectPanel.putConstraint(SpringLayout.NORTH, scrollPane, 2, SpringLayout.SOUTH, lblHeader);
		sl_projectPanel.putConstraint(SpringLayout.NORTH, lblHeader, 0, SpringLayout.NORTH, projectPanel);
		sl_projectPanel.putConstraint(SpringLayout.WEST, lblHeader, 0, SpringLayout.WEST, scrollPane);
		sl_projectPanel.putConstraint(SpringLayout.SOUTH, lblHeader, 40, SpringLayout.NORTH, projectPanel);
		sl_projectPanel.putConstraint(SpringLayout.EAST, lblHeader, 0, SpringLayout.EAST, projectPanel);
		projectPanel.add(lblHeader);
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);

		springLayout.putConstraint(SpringLayout.NORTH, scrollPane, 0, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, scrollPane, 0, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, scrollPane, 238, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, scrollPane, 0, SpringLayout.EAST, this);
		scrollPane.setPreferredSize(new Dimension(380, 350));
		projectPanel.add(scrollPane);
		add(projectPanel);
		

		
		JPanel btnPanel = new JPanel();
		btnPanel.setMinimumSize(new Dimension(400, 350));
		btnPanel.setMaximumSize(new Dimension(400, 350));
		btnPanel.setPreferredSize(new Dimension(400, 350));
		springLayout.putConstraint(SpringLayout.WEST, btnPanel, 0, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, btnPanel, 0, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, projectPanel, 0, SpringLayout.NORTH, btnPanel);
		scrollPane.setViewportView(verticalBox);
		verticalBox.add(lblProject);
		lblProject.setAutoscrolls(true);
		springLayout.putConstraint(SpringLayout.NORTH, btnPanel, -40, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, btnPanel, 0, SpringLayout.SOUTH, this);
		JButton btnSalva = new JButton("salva");
		JButton btnAnnulla = new JButton("annulla");
		btnSalva.setPreferredSize(new Dimension(89, 26));
		btnSalva.setMinimumSize(new Dimension(89, 26));
		btnSalva.setMaximumSize(new Dimension(89, 26));
		btnAnnulla.setPreferredSize(new Dimension(89, 26));
		btnAnnulla.setMinimumSize(new Dimension(89, 26));
		btnAnnulla.setMaximumSize(new Dimension(89, 26));
		SpringLayout sl_btnPanel = new SpringLayout();
		sl_btnPanel.putConstraint(SpringLayout.EAST, btnSalva, -30, SpringLayout.WEST, btnAnnulla);
		sl_btnPanel.putConstraint(SpringLayout.NORTH, btnAnnulla, 5, SpringLayout.NORTH, btnPanel);
		sl_btnPanel.putConstraint(SpringLayout.EAST, btnAnnulla, -10, SpringLayout.EAST, btnPanel);
		sl_btnPanel.putConstraint(SpringLayout.NORTH, btnSalva, 5, SpringLayout.NORTH, btnPanel);
		btnPanel.setLayout(sl_btnPanel);
		btnPanel.add(btnSalva);
		btnPanel.add(btnAnnulla);
		add(btnPanel);
		
		
		btnSalva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salvaSubPr();
			
		}});
		btnAnnulla.addActionListener(new ActionListener() {
			//////////////////////////////////////////////////////////////////////
			public void actionPerformed(ActionEvent e) {
				undo();
			}
		});
		
			

	}

	public void undo() {
		GuiManager.getInstance().getDialog().dispose();		
	}

	public void salvaSubPr() {
		// UIFacade.getInstance().toSysAction(Constants.getInstance().operationStoreSubProject,this);
		//this.dispose();		//verificare se questo metodo fa casini o no
		UIFacade.getInstance().toSysAction(Constants.getInstance().operationStoreProject,null);
	}

	public void setData(String text)
	{
		this.lblProject.setText(text);
	}
}

