/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package timelogger.domain;

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class UtenteDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression nome;
	public final StringExpression cognome;
	public final StringExpression codiceFiscale;
	public final StringExpression indirizzo;
	public final StringExpression username;
	public final StringExpression password;
	public final DateExpression dataAssunzione;
	public final DateExpression dataLicenziamento;
	
	public UtenteDetachedCriteria() {
		super(timelogger.domain.Utente.class, timelogger.domain.UtenteCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		cognome = new StringExpression("cognome", this.getDetachedCriteria());
		codiceFiscale = new StringExpression("codiceFiscale", this.getDetachedCriteria());
		indirizzo = new StringExpression("indirizzo", this.getDetachedCriteria());
		username = new StringExpression("username", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		dataAssunzione = new DateExpression("dataAssunzione", this.getDetachedCriteria());
		dataLicenziamento = new DateExpression("dataLicenziamento", this.getDetachedCriteria());
	}
	
	public UtenteDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, timelogger.domain.UtenteCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		cognome = new StringExpression("cognome", this.getDetachedCriteria());
		codiceFiscale = new StringExpression("codiceFiscale", this.getDetachedCriteria());
		indirizzo = new StringExpression("indirizzo", this.getDetachedCriteria());
		username = new StringExpression("username", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		dataAssunzione = new DateExpression("dataAssunzione", this.getDetachedCriteria());
		dataLicenziamento = new DateExpression("dataLicenziamento", this.getDetachedCriteria());
	}
	
	public Utente uniqueUtente(PersistentSession session) {
		return (Utente) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Utente[] listUtente(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Utente[]) list.toArray(new Utente[list.size()]);
	}
}

