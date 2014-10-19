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

public class AdminCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression nome;
	public final StringExpression cognome;
	public final StringExpression codiceFiscale;
	public final StringExpression indirizzo;
	public final StringExpression username;
	public final StringExpression password;
	public final DateExpression dataAssunzione;
	public final DateExpression dataLicenziamento;
	
	public AdminCriteria(Criteria criteria) {
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
	}
	
	public AdminCriteria(PersistentSession session) {
		this(session.createCriteria(Admin.class));
	}
	
	public AdminCriteria() throws PersistentException {
		this(timelogger.domain.TimeloggerPersistentManager.instance().getSession());
	}
	
	public ProgettoCriteria createProjectsCriteria() {
		return new ProgettoCriteria(createCriteria("ORM_Projects"));
	}
	
	public Admin uniqueAdmin() {
		return (Admin) super.uniqueResult();
	}
	
	public Admin[] listAdmin() {
		java.util.List list = super.list();
		return (Admin[]) list.toArray(new Admin[list.size()]);
	}
}

