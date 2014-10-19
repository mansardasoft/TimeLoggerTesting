/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package ormsamples;

import java.util.Calendar;
import java.util.Date;

import org.orm.*;

import timelogger.presentation.clui.CommandLineBuilder;
import timelogger.utilities.Encrypter;


public class CreateTimeloggerData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = timelogger.domain.TimeloggerPersistentManager.instance().getSession().beginTransaction();
		try {
			Encrypter e= new Encrypter();
			
			
			
			timelogger.domain.Admin ltimeloggerdomainAdmin = timelogger.domain.AdminFactory.createAdmin();
			
			ltimeloggerdomainAdmin.setUsername("admin");
			ltimeloggerdomainAdmin.setCognome("Rossi");
			ltimeloggerdomainAdmin.setNome("Mario");
			ltimeloggerdomainAdmin.setPassword(e.encrypt("a"));
			ltimeloggerdomainAdmin.save();
			
			timelogger.domain.Manager ltimeloggerdomainManager = timelogger.domain.ManagerFactory.createManager();
			ltimeloggerdomainManager.setUsername("manager");
			ltimeloggerdomainManager.setCognome("Verdi");
			ltimeloggerdomainManager.setNome("Giuseppe");
			ltimeloggerdomainManager.setPassword(e.encrypt("m"));
			ltimeloggerdomainManager.save();
			
			
			
			// CONSULENTE
			timelogger.domain.Consulente ltimeloggerdomainConsulente;
			for(int i=0;i<4;i++){
				ltimeloggerdomainConsulente = timelogger.domain.ConsulenteFactory.createConsulente();
				ltimeloggerdomainConsulente.setUsername("cons"+String.valueOf(i));
				ltimeloggerdomainConsulente.setCognome("cognomeCons"+String.valueOf(i));
				ltimeloggerdomainConsulente.setNome("nomeCons"+String.valueOf(i));
				ltimeloggerdomainConsulente.setPassword(e.encrypt("c"));
				ltimeloggerdomainConsulente.save();
			}
			
			
			//CLIENTE
			timelogger.domain.Cliente ltimeloggerdomainCliente = timelogger.domain.ClienteFactory.createCliente();
			for(int i=0;i<4;i++){				
				ltimeloggerdomainCliente.setCognome("cognomeCliente"+String.valueOf(i));
				ltimeloggerdomainCliente.setNome("nomeClinte"+String.valueOf(i));
				ltimeloggerdomainCliente.save();
			}
			
			
			timelogger.domain.Progetto ltimeloggerdomainProgetto = timelogger.domain.ProgettoFactory.createProgetto();
			ltimeloggerdomainProgetto.setTitolo("Progetto già iniziato");
			ltimeloggerdomainProgetto.setDataInizio(new Date(Calendar.getInstance().getTimeInMillis()-1728000000));
			ltimeloggerdomainProgetto.setClienteAssociato(ltimeloggerdomainCliente);
			ltimeloggerdomainProgetto.setAdmin(ltimeloggerdomainAdmin);
			ltimeloggerdomainProgetto.save();
			
			timelogger.domain.SottoProgetto ltimeloggerdomainSottoProgetto = timelogger.domain.SottoProgettoFactory.createSottoProgetto();
			ltimeloggerdomainSottoProgetto.setTitolo("SubP1");
			ltimeloggerdomainSottoProgetto.setManager(ltimeloggerdomainManager);
			ltimeloggerdomainSottoProgetto.setProgetto(ltimeloggerdomainProgetto);
			ltimeloggerdomainSottoProgetto.save();
			
			
			
			//Task
			timelogger.domain.Task ltimeloggerdomainTask;
			for(int i=0;i<12;i++){
				ltimeloggerdomainTask = timelogger.domain.TaskFactory.createTask();
				ltimeloggerdomainTask.setTitolo("Task già attivo "+String.valueOf(i));
				ltimeloggerdomainTask.setSottoprogetto(ltimeloggerdomainSottoProgetto);
				ltimeloggerdomainTask.save();
			}
			
			

			ltimeloggerdomainProgetto = timelogger.domain.ProgettoFactory.createProgetto();
			ltimeloggerdomainProgetto.setTitolo("Progetto non iniziato");
			ltimeloggerdomainProgetto.setDataInizio(new Date(Calendar.getInstance().getTimeInMillis()+1728000000));
			ltimeloggerdomainProgetto.setClienteAssociato(ltimeloggerdomainCliente);
			ltimeloggerdomainProgetto.setAdmin(ltimeloggerdomainAdmin);
			ltimeloggerdomainProgetto.save();
			
			ltimeloggerdomainSottoProgetto = timelogger.domain.SottoProgettoFactory.createSottoProgetto();
			ltimeloggerdomainSottoProgetto.setTitolo("SubP2");
			ltimeloggerdomainSottoProgetto.setManager(ltimeloggerdomainManager);
			ltimeloggerdomainSottoProgetto.setProgetto(ltimeloggerdomainProgetto);
			ltimeloggerdomainSottoProgetto.save();
			
			
			
			//Task
			for(int i=0;i<12;i++){
				ltimeloggerdomainTask = timelogger.domain.TaskFactory.createTask();
				ltimeloggerdomainTask.setTitolo("Task non attivo "+String.valueOf(i));
				ltimeloggerdomainTask.setSottoprogetto(ltimeloggerdomainSottoProgetto);
				ltimeloggerdomainTask.save();
			}
			

			ltimeloggerdomainProgetto.save();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateTimeloggerData createTimeloggerData = new CreateTimeloggerData();
			CommandLineBuilder.buildTerminal();
			try {
				createTimeloggerData.createTestData();
				CommandLineBuilder.getInstance().print("Data correctly created in DB");
			}
			catch (Exception e)
			{
				CommandLineBuilder.getInstance().print("Data was already created in DB");
			}
			finally {
				timelogger.domain.TimeloggerPersistentManager.instance().disposePersistentManager();
			}
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
