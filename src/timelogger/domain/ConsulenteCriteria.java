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

public class ConsulenteCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression nome;
	public final StringExpression cognome;
	public final StringExpression codiceFiscale;
	public final StringExpression indirizzo;
	public final StringExpression username;
	public final StringExpression password;
	public final DateExpression dataAssunzione;
	public final DateExpression dataLicenziamento;
	public final IntegerExpression pagaFissa;
	
	public ConsulenteCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		nome = new StringExpression("nome", this);
		cognome = new StringExpression("cognome", this);
		codiceFiscale = new StringExpression("codiceFiscale", this);
		indirizzo = new StringExpression("indirizzo", this);
		username = new StringExpression("username", this);
		password = new StringExpression("password", this);
		dataAssunzione = new DateExpression("dataAssunzione", this);
		dataLicenziamento = new DateExpression("dataLicenziamento", this);
		pagaFissa = new IntegerExpression("pagaFissa", this);
	}
	
	public ConsulenteCriteria(PersistentSession session) {
		this(session.createCriteria(Consulente.class));
	}
	
	public ConsulenteCriteria() throws PersistentException {
		this(timelogger.domain.TimeloggerPersistentManager.instance().getSession());
	}
	
	public TaskCriteria createTasksCriteria() {
		return new TaskCriteria(createCriteria("ORM_Tasks"));
	}
	
	public TimeRecordCriteria createTimerecordsCriteria() {
		return new TimeRecordCriteria(createCriteria("ORM_Timerecords"));
	}
	
	public Consulente uniqueConsulente() {
		return (Consulente) super.uniqueResult();
	}
	
	public Consulente[] listConsulente() {
		java.util.List list = super.list();
		return (Consulente[]) list.toArray(new Consulente[list.size()]);
	}
}

