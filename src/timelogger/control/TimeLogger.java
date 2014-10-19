package timelogger.control;
import org.orm.PersistentTransaction;

import timelogger.domain.Utente;
import timelogger.domain.UtenteFactory;
import timelogger.presentation.UIFacade;
import timelogger.presentation.ui.shared.alertDialog;


public class TimeLogger {
	@SuppressWarnings("unused")
	private alertDialog alert;
	public TimeLogger(int LoggedUserID)
	{
		PersistentTransaction t=null;
		Utente user=null;
		user=UtenteFactory.loadUtenteByORMID(LoggedUserID);
		if(user!=null) {
			user.createCommands();
			ControlFacade.getInstance().addData("user",user);
			
			UIFacade.getInstance().startUseCase();
		}
		else alert = new alertDialog("DataBase","Errore di connessione al dataBase");
	}
}
