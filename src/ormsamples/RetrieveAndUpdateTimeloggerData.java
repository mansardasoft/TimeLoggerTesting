/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateTimeloggerData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = timelogger.domain.TimeloggerPersistentManager.instance().getSession().beginTransaction();
		try {
			timelogger.domain.Persona ltimeloggerdomainPersona = timelogger.domain.PersonaFactory.loadPersonaByQuery(null, null);
			// Update the properties of the persistent object
			ltimeloggerdomainPersona.save();
			timelogger.domain.Utente ltimeloggerdomainUtente = timelogger.domain.UtenteFactory.loadUtenteByQuery(null, null);
			// Update the properties of the persistent object
			ltimeloggerdomainUtente.save();
			timelogger.domain.Admin ltimeloggerdomainAdmin = timelogger.domain.AdminFactory.loadAdminByQuery(null, null);
			// Update the properties of the persistent object
			ltimeloggerdomainAdmin.save();
			timelogger.domain.Manager ltimeloggerdomainManager = timelogger.domain.ManagerFactory.loadManagerByQuery(null, null);
			// Update the properties of the persistent object
			ltimeloggerdomainManager.save();
			timelogger.domain.Consulente ltimeloggerdomainConsulente = timelogger.domain.ConsulenteFactory.loadConsulenteByQuery(null, null);
			// Update the properties of the persistent object
			ltimeloggerdomainConsulente.save();
			timelogger.domain.Cliente ltimeloggerdomainCliente = timelogger.domain.ClienteFactory.loadClienteByQuery(null, null);
			// Update the properties of the persistent object
			ltimeloggerdomainCliente.save();
			timelogger.domain.Progetto ltimeloggerdomainProgetto = timelogger.domain.ProgettoFactory.loadProgettoByQuery(null, null);
			// Update the properties of the persistent object
			ltimeloggerdomainProgetto.save();
			timelogger.domain.SottoProgetto ltimeloggerdomainSottoProgetto = timelogger.domain.SottoProgettoFactory.loadSottoProgettoByQuery(null, null);
			// Update the properties of the persistent object
			ltimeloggerdomainSottoProgetto.save();
			timelogger.domain.Task ltimeloggerdomainTask = timelogger.domain.TaskFactory.loadTaskByQuery(null, null);
			// Update the properties of the persistent object
			ltimeloggerdomainTask.save();
			timelogger.domain.TimeRecord ltimeloggerdomainTimeRecord = timelogger.domain.TimeRecordFactory.loadTimeRecordByQuery(null, null);
			// Update the properties of the persistent object
			ltimeloggerdomainTimeRecord.save();
			timelogger.domain.Fattura ltimeloggerdomainFattura = timelogger.domain.FatturaFactory.loadFatturaByQuery(null, null);
			// Update the properties of the persistent object
			ltimeloggerdomainFattura.save();
			timelogger.domain.FatturaFinale ltimeloggerdomainFatturaFinale = timelogger.domain.FatturaFinaleFactory.loadFatturaFinaleByQuery(null, null);
			// Update the properties of the persistent object
			ltimeloggerdomainFatturaFinale.save();
			timelogger.domain.FatturaParziale ltimeloggerdomainFatturaParziale = timelogger.domain.FatturaParzialeFactory.loadFatturaParzialeByQuery(null, null);
			// Update the properties of the persistent object
			ltimeloggerdomainFatturaParziale.save();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Persona by PersonaCriteria");
		timelogger.domain.PersonaCriteria personaCriteria = new timelogger.domain.PersonaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//personaCriteria.ID.eq();
		System.out.println(personaCriteria.uniquePersona());
		
		System.out.println("Retrieving Utente by UtenteCriteria");
		timelogger.domain.UtenteCriteria utenteCriteria = new timelogger.domain.UtenteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//utenteCriteria.ID.eq();
		System.out.println(utenteCriteria.uniqueUtente());
		
		System.out.println("Retrieving Admin by AdminCriteria");
		timelogger.domain.AdminCriteria adminCriteria = new timelogger.domain.AdminCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//adminCriteria.ID.eq();
		System.out.println(adminCriteria.uniqueAdmin());
		
		System.out.println("Retrieving Manager by ManagerCriteria");
		timelogger.domain.ManagerCriteria managerCriteria = new timelogger.domain.ManagerCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//managerCriteria.ID.eq();
		System.out.println(managerCriteria.uniqueManager());
		
		System.out.println("Retrieving Consulente by ConsulenteCriteria");
		timelogger.domain.ConsulenteCriteria consulenteCriteria = new timelogger.domain.ConsulenteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//consulenteCriteria.ID.eq();
		System.out.println(consulenteCriteria.uniqueConsulente());
		
		System.out.println("Retrieving Cliente by ClienteCriteria");
		timelogger.domain.ClienteCriteria clienteCriteria = new timelogger.domain.ClienteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//clienteCriteria.ID.eq();
		System.out.println(clienteCriteria.uniqueCliente());
		
		System.out.println("Retrieving Progetto by ProgettoCriteria");
		timelogger.domain.ProgettoCriteria progettoCriteria = new timelogger.domain.ProgettoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//progettoCriteria.ID.eq();
		System.out.println(progettoCriteria.uniqueProgetto());
		
		System.out.println("Retrieving SottoProgetto by SottoProgettoCriteria");
		timelogger.domain.SottoProgettoCriteria sottoProgettoCriteria = new timelogger.domain.SottoProgettoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//sottoProgettoCriteria.ID.eq();
		System.out.println(sottoProgettoCriteria.uniqueSottoProgetto());
		
		System.out.println("Retrieving Task by TaskCriteria");
		timelogger.domain.TaskCriteria taskCriteria = new timelogger.domain.TaskCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//taskCriteria.ID.eq();
		System.out.println(taskCriteria.uniqueTask());
		
		System.out.println("Retrieving TimeRecord by TimeRecordCriteria");
		timelogger.domain.TimeRecordCriteria timeRecordCriteria = new timelogger.domain.TimeRecordCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//timeRecordCriteria.ID.eq();
		System.out.println(timeRecordCriteria.uniqueTimeRecord());
		
		System.out.println("Retrieving Fattura by FatturaCriteria");
		timelogger.domain.FatturaCriteria fatturaCriteria = new timelogger.domain.FatturaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//fatturaCriteria.ID.eq();
		System.out.println(fatturaCriteria.uniqueFattura());
		
		System.out.println("Retrieving FatturaFinale by FatturaFinaleCriteria");
		timelogger.domain.FatturaFinaleCriteria fatturaFinaleCriteria = new timelogger.domain.FatturaFinaleCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//fatturaFinaleCriteria.ID.eq();
		System.out.println(fatturaFinaleCriteria.uniqueFatturaFinale());
		
		System.out.println("Retrieving FatturaParziale by FatturaParzialeCriteria");
		timelogger.domain.FatturaParzialeCriteria fatturaParzialeCriteria = new timelogger.domain.FatturaParzialeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//fatturaParzialeCriteria.ID.eq();
		System.out.println(fatturaParzialeCriteria.uniqueFatturaParziale());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateTimeloggerData retrieveAndUpdateTimeloggerData = new RetrieveAndUpdateTimeloggerData();
			try {
				retrieveAndUpdateTimeloggerData.retrieveAndUpdateTestData();
				//retrieveAndUpdateTimeloggerData.retrieveByCriteria();
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
