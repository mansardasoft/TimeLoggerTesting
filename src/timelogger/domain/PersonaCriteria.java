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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class PersonaCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression nome;
	public final StringExpression cognome;
	public final StringExpression codiceFiscale;
	public final StringExpression indirizzo;
	
	public PersonaCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		nome = new StringExpression("nome", this);
		cognome = new StringExpression("cognome", this);
		codiceFiscale = new StringExpression("codiceFiscale", this);
		indirizzo = new StringExpression("indirizzo", this);
	}
	
	public PersonaCriteria(PersistentSession session) {
		this(session.createCriteria(Persona.class));
	}
	
	public PersonaCriteria() throws PersistentException {
		this(timelogger.domain.TimeloggerPersistentManager.instance().getSession());
	}
	
	public Persona uniquePersona() {
		return (Persona) super.uniqueResult();
	}
	
	public Persona[] listPersona() {
		java.util.List list = super.list();
		return (Persona[]) list.toArray(new Persona[list.size()]);
	}
}

