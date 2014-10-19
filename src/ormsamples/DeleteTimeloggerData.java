/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class DeleteTimeloggerData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = timelogger.domain.TimeloggerPersistentManager.instance().getSession().beginTransaction();
		try {
			timelogger.domain.Persona ltimeloggerdomainPersona = timelogger.domain.PersonaFactory.loadPersonaByQuery(null, null);
			ltimeloggerdomainPersona.delete();
			timelogger.domain.Utente ltimeloggerdomainUtente = timelogger.domain.UtenteFactory.loadUtenteByQuery(null, null);
			ltimeloggerdomainUtente.delete();
			timelogger.domain.Admin ltimeloggerdomainAdmin = timelogger.domain.AdminFactory.loadAdminByQuery(null, null);
			ltimeloggerdomainAdmin.delete();
			timelogger.domain.Manager ltimeloggerdomainManager = timelogger.domain.ManagerFactory.loadManagerByQuery(null, null);
			ltimeloggerdomainManager.delete();
			timelogger.domain.Consulente ltimeloggerdomainConsulente = timelogger.domain.ConsulenteFactory.loadConsulenteByQuery(null, null);
			ltimeloggerdomainConsulente.delete();
			timelogger.domain.Cliente ltimeloggerdomainCliente = timelogger.domain.ClienteFactory.loadClienteByQuery(null, null);
			ltimeloggerdomainCliente.delete();
			timelogger.domain.Progetto ltimeloggerdomainProgetto = timelogger.domain.ProgettoFactory.loadProgettoByQuery(null, null);
			ltimeloggerdomainProgetto.delete();
			timelogger.domain.SottoProgetto ltimeloggerdomainSottoProgetto = timelogger.domain.SottoProgettoFactory.loadSottoProgettoByQuery(null, null);
			ltimeloggerdomainSottoProgetto.delete();
			timelogger.domain.Task ltimeloggerdomainTask = timelogger.domain.TaskFactory.loadTaskByQuery(null, null);
			ltimeloggerdomainTask.delete();
			timelogger.domain.TimeRecord ltimeloggerdomainTimeRecord = timelogger.domain.TimeRecordFactory.loadTimeRecordByQuery(null, null);
			ltimeloggerdomainTimeRecord.delete();
			timelogger.domain.Fattura ltimeloggerdomainFattura = timelogger.domain.FatturaFactory.loadFatturaByQuery(null, null);
			ltimeloggerdomainFattura.delete();
			timelogger.domain.FatturaFinale ltimeloggerdomainFatturaFinale = timelogger.domain.FatturaFinaleFactory.loadFatturaFinaleByQuery(null, null);
			ltimeloggerdomainFatturaFinale.delete();
			timelogger.domain.FatturaParziale ltimeloggerdomainFatturaParziale = timelogger.domain.FatturaParzialeFactory.loadFatturaParzialeByQuery(null, null);
			ltimeloggerdomainFatturaParziale.delete();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteTimeloggerData deleteTimeloggerData = new DeleteTimeloggerData();
			try {
				deleteTimeloggerData.deleteTestData();
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
