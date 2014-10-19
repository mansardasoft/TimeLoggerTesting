package timelogger.presentation.graphicCommand.consulent;

import java.awt.Container;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

import timelogger.domain.Task;
import timelogger.presentation.UIFacade;
import timelogger.presentation.graphicCommand.GraphicCommand;
import timelogger.presentation.graphicCommand.GuiManager;
import timelogger.presentation.ui.consulent.consulenteStartPanel;
import timelogger.presentation.ui.consulent.createTimeRecordPanel;
import timelogger.presentation.ui.shared.alertDialog;
import timelogger.utilities.Constants;

public class NewTimeRecordFormCommand implements GraphicCommand {

	public ConcurrentHashMap<String,String>data=new ConcurrentHashMap<String,String>();
	private createTimeRecordPanel formTR;
	
	@SuppressWarnings("unchecked")
	@Override
	public void draw(Container c) {
		
		GuiManager.getInstance().getDialog().setVisible(false);
		
		GuiManager.getInstance().getWindow().getContentPane().removeAll();
		
		formTR = new createTimeRecordPanel();
		
		//fill la cbx della home del consulente
		UIFacade.getInstance().toSysAction(Constants.getInstance().operationRetrieveTaskForConsulentList,this.formTR);
		UIFacade.getInstance().toGuiAction(Constants.getInstance().fillComboBoxCommand, this.formTR.getComboBoxTask());
		
		
		GuiManager.getInstance().getWindow().getContentPane().add(formTR);
		
		GuiManager.getInstance().getWindow().getContentPane().validate();
		GuiManager.getInstance().getWindow().validate();
	}

	@Override
	public void setData(ConcurrentHashMap<String, String> data) {
		this.data=data;		
	}

	@Override
	public ConcurrentHashMap<String, String> getData() {
		return this.data;
	}

}
