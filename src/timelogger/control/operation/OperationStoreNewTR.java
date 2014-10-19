package timelogger.control.operation;

import java.awt.Container;
import java.sql.Timestamp;
import java.util.ArrayList;
import org.orm.PersistentException;

import timelogger.control.ControlFacade;
import timelogger.domain.Consulente;
import timelogger.domain.Task;
import timelogger.domain.TimeRecord;
import timelogger.domain.TimeRecordFactory;
import timelogger.presentation.*;
import timelogger.utilities.Constants;

public class OperationStoreNewTR implements OperationFlyweight {

	private Consulente cons;
	private TimeRecord tr;
	private Task tk;
	public void doOp(ControlFacade controller,Container invoker) {
		
		System.out.println("--------------------------------------------------");
		System.out.println("OP::StoreNewTR---> creating and storing new Time Record");
		
		@SuppressWarnings("unchecked")
		ArrayList<Object> data=(ArrayList<Object>) UIFacade.getInstance().getAData("dataToConfirm");
		
		this.cons=(Consulente)controller.getData("user");
		this.tr=createNewTR();
		this.setDati(data);
		if(this.confirm(true))//Lancia un booleano che segnala che non ï¿½ andata a buon fine
			UIFacade.getInstance().toGuiAction(Constants.getInstance().newTimeRecordFormCommand, invoker);
		else
		{}//Gestire errore
	}
	
	public TimeRecord createNewTR()
	{
		return TimeRecordFactory.createTimeRecord();
	}
	
	public void setDati(ArrayList<Object> data)
	{
		//this.tk=this.cons.tasks.get(Integer.parseInt(data.get(4)));
		//this.tk=(Task) data.get(4);		//indice 4 è quello del TR: vedi classe createTimeRecordPanel, metodo registraDati()
		
		//OLDER METHODthis.tr.setDati(this.tk,this.convertitore.toDate(data.get(0)+data.get(2)+"00+0100"),this.convertitore.toDate(data.get(1)+data.get(3)+"00+0100"),data.get(5));

		this.tk=(Task) data.get(2);
		
		this.tr.setActivity(this.tk);

		this.tr.setInizio((Timestamp) data.get(0));
		
		this.tr.setFine((Timestamp) data.get(1));
		
		this.tr.setCommento((String) data.get(3));
		
		this.tr.setConsulente(this.cons);
		
		/*
		//this.tr.setInizio(this.convertitore.toDate((String) data.get(0)+data.get(2)+"00"));
		Date aux = (Date) data.get(0);
		
		aux.set
		
		this.tr.setInizio(aux);
		
		this.tr.setFine(this.convertitore.toDate((String) data.get(1)+data.get(3)+"00"));
		
		this.tr.setCommento((String) data.get(5));
		
		this.tr.setConsulente(this.cons);
		*/
		
		
	}
	
	public boolean confirm(boolean check) {
		
		boolean turnback=false;
		
		///Istanzio la transazione con il DB
		try {
			ControlFacade.getInstance().setTransaction(timelogger.domain.TimeloggerPersistentManager.instance().getSession().beginTransaction());
		} catch (PersistentException e1) {
			e1.printStackTrace();
		}
		
		
		if(check)
		{
			turnback=this.tr.save();
		}
		
		
		//Commissiono la transazione con il db
		try {
			ControlFacade.getInstance().getTransaction().commit();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
		return turnback;
	}

}