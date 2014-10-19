/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;

import timelogger.presentation.clui.CommandLineBuilder;
public class ListTimeloggerData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		String toPrint="";
		toPrint+="\n\t"+"Listing Persona...";
		timelogger.domain.Persona[] timeloggerdomainPersonas = timelogger.domain.PersonaFactory.listPersonaByQuery(null, null);
		int length = Math.min(timeloggerdomainPersonas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			toPrint+="\n\t\t"+timeloggerdomainPersonas[i];
		}
		toPrint+="\n\t"+length + " record(s) retrieved.";
		
		toPrint+="\n\t"+"Listing Utente...";
		timelogger.domain.Utente[] timeloggerdomainUtentes = timelogger.domain.UtenteFactory.listUtenteByQuery(null, null);
		length = Math.min(timeloggerdomainUtentes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			toPrint+="\n\t\t"+timeloggerdomainUtentes[i];
		}
		toPrint+="\n\t"+length + " record(s) retrieved.";
		
		toPrint+="\n\t"+"Listing Admin...";
		timelogger.domain.Admin[] timeloggerdomainAdmins = timelogger.domain.AdminFactory.listAdminByQuery(null, null);
		length = Math.min(timeloggerdomainAdmins.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			toPrint+="\n\t\t"+timeloggerdomainAdmins[i];
		}
		toPrint+="\n\t"+length + " record(s) retrieved.";
		
		toPrint+="\n\t"+"Listing Manager...";
		timelogger.domain.Manager[] timeloggerdomainManagers = timelogger.domain.ManagerFactory.listManagerByQuery(null, null);
		length = Math.min(timeloggerdomainManagers.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			toPrint+="\n\t\t"+timeloggerdomainManagers[i];
		}
		toPrint+="\n\t"+length + " record(s) retrieved.";
		
		toPrint+="\n\t"+"Listing Consulente...";
		timelogger.domain.Consulente[] timeloggerdomainConsulentes = timelogger.domain.ConsulenteFactory.listConsulenteByQuery(null, null);
		length = Math.min(timeloggerdomainConsulentes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			toPrint+="\n\t\t"+timeloggerdomainConsulentes[i];
		}
		toPrint+="\n\t"+length + " record(s) retrieved.";
		
		toPrint+="\n\t"+"Listing Cliente...";
		timelogger.domain.Cliente[] timeloggerdomainClientes = timelogger.domain.ClienteFactory.listClienteByQuery(null, null);
		length = Math.min(timeloggerdomainClientes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			toPrint+="\n\t\t"+timeloggerdomainClientes[i];
		}
		toPrint+="\n\t"+length + " record(s) retrieved.";
		
		toPrint+="\n\t"+"Listing Progetto...";
		timelogger.domain.Progetto[] timeloggerdomainProgettos = timelogger.domain.ProgettoFactory.listProgettoByQuery(null, null);
		length = Math.min(timeloggerdomainProgettos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			toPrint+="\n\t\t"+timeloggerdomainProgettos[i];
		}
		toPrint+="\n\t"+length + " record(s) retrieved.";
		
		toPrint+="\n\t"+"Listing SottoProgetto...";
		timelogger.domain.SottoProgetto[] timeloggerdomainSottoProgettos = timelogger.domain.SottoProgettoFactory.listSottoProgettoByQuery(null, null);
		length = Math.min(timeloggerdomainSottoProgettos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			toPrint+="\n\t\t"+timeloggerdomainSottoProgettos[i];
		}
		toPrint+="\n\t\t"+length + " record(s) retrieved.";
		
		toPrint+="\n\t"+"Listing Task...";
		timelogger.domain.Task[] timeloggerdomainTasks = timelogger.domain.TaskFactory.listTaskByQuery(null, null);
		length = Math.min(timeloggerdomainTasks.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			toPrint+="\n\t\t"+timeloggerdomainTasks[i];
		}
		toPrint+="\n\t"+length + " record(s) retrieved.";
		
		toPrint+="\n\t"+"Listing TimeRecord...";
		timelogger.domain.TimeRecord[] timeloggerdomainTimeRecords = timelogger.domain.TimeRecordFactory.listTimeRecordByQuery(null, null);
		length = Math.min(timeloggerdomainTimeRecords.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			toPrint+="\n\t\t"+timeloggerdomainTimeRecords[i];
		}
		toPrint+="\n\t\t"+length + " record(s) retrieved.";
		
		toPrint+="\n\t"+"Listing Fattura...";
		timelogger.domain.Fattura[] timeloggerdomainFatturas = timelogger.domain.FatturaFactory.listFatturaByQuery(null, null);
		length = Math.min(timeloggerdomainFatturas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			toPrint+="\n\t\t"+timeloggerdomainFatturas[i];
		}
		toPrint+="\n\t"+length + " record(s) retrieved.";
		
		toPrint+="\n\t"+"Listing FatturaFinale...";
		timelogger.domain.FatturaFinale[] timeloggerdomainFatturaFinales = timelogger.domain.FatturaFinaleFactory.listFatturaFinaleByQuery(null, null);
		length = Math.min(timeloggerdomainFatturaFinales.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			toPrint+="\n\t\t"+timeloggerdomainFatturaFinales[i];
		}
		toPrint+="\n\t"+length + " record(s) retrieved.";
		
		toPrint+="\n\t"+"Listing FatturaParziale...";
		timelogger.domain.FatturaParziale[] timeloggerdomainFatturaParziales = timelogger.domain.FatturaParzialeFactory.listFatturaParzialeByQuery(null, null);
		length = Math.min(timeloggerdomainFatturaParziales.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			toPrint+="\n\t\t"+timeloggerdomainFatturaParziales[i];
		}
		toPrint+="\n\t"+length + " record(s) retrieved.";
		CommandLineBuilder.getInstance().print(toPrint);
	}
	
	public void listByCriteria() throws PersistentException  {
		System.out.println("Listing Persona by Criteria...");
		timelogger.domain.PersonaCriteria personaCriteria = new timelogger.domain.PersonaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//personaCriteria.ID.eq();
		personaCriteria.setMaxResults(ROW_COUNT);
		timelogger.domain.Persona[] timeloggerdomainPersonas = personaCriteria.listPersona();
		int length =timeloggerdomainPersonas== null ? 0 : Math.min(timeloggerdomainPersonas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(timeloggerdomainPersonas[i]);
		}
		System.out.println(length + " Persona record(s) retrieved."); 
		
		System.out.println("Listing Utente by Criteria...");
		timelogger.domain.UtenteCriteria utenteCriteria = new timelogger.domain.UtenteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//utenteCriteria.ID.eq();
		utenteCriteria.setMaxResults(ROW_COUNT);
		timelogger.domain.Utente[] timeloggerdomainUtentes = utenteCriteria.listUtente();
		length =timeloggerdomainUtentes== null ? 0 : Math.min(timeloggerdomainUtentes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(timeloggerdomainUtentes[i]);
		}
		System.out.println(length + " Utente record(s) retrieved."); 
		
		System.out.println("Listing Admin by Criteria...");
		timelogger.domain.AdminCriteria adminCriteria = new timelogger.domain.AdminCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//adminCriteria.ID.eq();
		adminCriteria.setMaxResults(ROW_COUNT);
		timelogger.domain.Admin[] timeloggerdomainAdmins = adminCriteria.listAdmin();
		length =timeloggerdomainAdmins== null ? 0 : Math.min(timeloggerdomainAdmins.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(timeloggerdomainAdmins[i]);
		}
		System.out.println(length + " Admin record(s) retrieved."); 
		
		System.out.println("Listing Manager by Criteria...");
		timelogger.domain.ManagerCriteria managerCriteria = new timelogger.domain.ManagerCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//managerCriteria.ID.eq();
		managerCriteria.setMaxResults(ROW_COUNT);
		timelogger.domain.Manager[] timeloggerdomainManagers = managerCriteria.listManager();
		length =timeloggerdomainManagers== null ? 0 : Math.min(timeloggerdomainManagers.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(timeloggerdomainManagers[i]);
		}
		System.out.println(length + " Manager record(s) retrieved."); 
		
		System.out.println("Listing Consulente by Criteria...");
		timelogger.domain.ConsulenteCriteria consulenteCriteria = new timelogger.domain.ConsulenteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//consulenteCriteria.ID.eq();
		consulenteCriteria.setMaxResults(ROW_COUNT);
		timelogger.domain.Consulente[] timeloggerdomainConsulentes = consulenteCriteria.listConsulente();
		length =timeloggerdomainConsulentes== null ? 0 : Math.min(timeloggerdomainConsulentes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(timeloggerdomainConsulentes[i]);
		}
		System.out.println(length + " Consulente record(s) retrieved."); 
		
		System.out.println("Listing Cliente by Criteria...");
		timelogger.domain.ClienteCriteria clienteCriteria = new timelogger.domain.ClienteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//clienteCriteria.ID.eq();
		clienteCriteria.setMaxResults(ROW_COUNT);
		timelogger.domain.Cliente[] timeloggerdomainClientes = clienteCriteria.listCliente();
		length =timeloggerdomainClientes== null ? 0 : Math.min(timeloggerdomainClientes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(timeloggerdomainClientes[i]);
		}
		System.out.println(length + " Cliente record(s) retrieved."); 
		
		System.out.println("Listing Progetto by Criteria...");
		timelogger.domain.ProgettoCriteria progettoCriteria = new timelogger.domain.ProgettoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//progettoCriteria.ID.eq();
		progettoCriteria.setMaxResults(ROW_COUNT);
		timelogger.domain.Progetto[] timeloggerdomainProgettos = progettoCriteria.listProgetto();
		length =timeloggerdomainProgettos== null ? 0 : Math.min(timeloggerdomainProgettos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(timeloggerdomainProgettos[i]);
		}
		System.out.println(length + " Progetto record(s) retrieved."); 
		
		System.out.println("Listing SottoProgetto by Criteria...");
		timelogger.domain.SottoProgettoCriteria sottoProgettoCriteria = new timelogger.domain.SottoProgettoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//sottoProgettoCriteria.ID.eq();
		sottoProgettoCriteria.setMaxResults(ROW_COUNT);
		timelogger.domain.SottoProgetto[] timeloggerdomainSottoProgettos = sottoProgettoCriteria.listSottoProgetto();
		length =timeloggerdomainSottoProgettos== null ? 0 : Math.min(timeloggerdomainSottoProgettos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(timeloggerdomainSottoProgettos[i]);
		}
		System.out.println(length + " SottoProgetto record(s) retrieved."); 
		
		System.out.println("Listing Task by Criteria...");
		timelogger.domain.TaskCriteria taskCriteria = new timelogger.domain.TaskCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//taskCriteria.ID.eq();
		taskCriteria.setMaxResults(ROW_COUNT);
		timelogger.domain.Task[] timeloggerdomainTasks = taskCriteria.listTask();
		length =timeloggerdomainTasks== null ? 0 : Math.min(timeloggerdomainTasks.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(timeloggerdomainTasks[i]);
		}
		System.out.println(length + " Task record(s) retrieved."); 
		
		System.out.println("Listing TimeRecord by Criteria...");
		timelogger.domain.TimeRecordCriteria timeRecordCriteria = new timelogger.domain.TimeRecordCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//timeRecordCriteria.ID.eq();
		timeRecordCriteria.setMaxResults(ROW_COUNT);
		timelogger.domain.TimeRecord[] timeloggerdomainTimeRecords = timeRecordCriteria.listTimeRecord();
		length =timeloggerdomainTimeRecords== null ? 0 : Math.min(timeloggerdomainTimeRecords.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(timeloggerdomainTimeRecords[i]);
		}
		System.out.println(length + " TimeRecord record(s) retrieved."); 
		
		System.out.println("Listing Fattura by Criteria...");
		timelogger.domain.FatturaCriteria fatturaCriteria = new timelogger.domain.FatturaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//fatturaCriteria.ID.eq();
		fatturaCriteria.setMaxResults(ROW_COUNT);
		timelogger.domain.Fattura[] timeloggerdomainFatturas = fatturaCriteria.listFattura();
		length =timeloggerdomainFatturas== null ? 0 : Math.min(timeloggerdomainFatturas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(timeloggerdomainFatturas[i]);
		}
		System.out.println(length + " Fattura record(s) retrieved."); 
		
		System.out.println("Listing FatturaFinale by Criteria...");
		timelogger.domain.FatturaFinaleCriteria fatturaFinaleCriteria = new timelogger.domain.FatturaFinaleCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//fatturaFinaleCriteria.ID.eq();
		fatturaFinaleCriteria.setMaxResults(ROW_COUNT);
		timelogger.domain.FatturaFinale[] timeloggerdomainFatturaFinales = fatturaFinaleCriteria.listFatturaFinale();
		length =timeloggerdomainFatturaFinales== null ? 0 : Math.min(timeloggerdomainFatturaFinales.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(timeloggerdomainFatturaFinales[i]);
		}
		System.out.println(length + " FatturaFinale record(s) retrieved."); 
		
		System.out.println("Listing FatturaParziale by Criteria...");
		timelogger.domain.FatturaParzialeCriteria fatturaParzialeCriteria = new timelogger.domain.FatturaParzialeCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//fatturaParzialeCriteria.ID.eq();
		fatturaParzialeCriteria.setMaxResults(ROW_COUNT);
		timelogger.domain.FatturaParziale[] timeloggerdomainFatturaParziales = fatturaParzialeCriteria.listFatturaParziale();
		length =timeloggerdomainFatturaParziales== null ? 0 : Math.min(timeloggerdomainFatturaParziales.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(timeloggerdomainFatturaParziales[i]);
		}
		System.out.println(length + " FatturaParziale record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListTimeloggerData listTimeloggerData = new ListTimeloggerData();
			CommandLineBuilder.buildTerminal();
			try {
				listTimeloggerData.listTestData();
				//listTimeloggerData.listByCriteria();
			}
			finally {
				//timelogger.domain.TimeloggerPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
