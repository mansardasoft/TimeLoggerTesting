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

public class ProgettoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression titolo;
	public final DateExpression dataInizio;
	public final DateExpression dataFine;
	
	public ProgettoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		titolo = new StringExpression("titolo", this);
		dataInizio = new DateExpression("dataInizio", this);
		dataFine = new DateExpression("dataFine", this);
	}
	
	public ProgettoCriteria(PersistentSession session) {
		this(session.createCriteria(Progetto.class));
	}
	
	public ProgettoCriteria() throws PersistentException {
		this(timelogger.domain.TimeloggerPersistentManager.instance().getSession());
	}
	
	public ClienteCriteria createClienteAssociatoCriteria() {
		return new ClienteCriteria(createCriteria("clienteAssociato"));
	}
	
	public AdminCriteria createAdminCriteria() {
		return new AdminCriteria(createCriteria("admin"));
	}
	
	public SottoProgettoCriteria createSottoprogettiCriteria() {
		return new SottoProgettoCriteria(createCriteria("ORM_Sottoprogetti"));
	}
	
	public FatturaCriteria createFattureCriteria() {
		return new FatturaCriteria(createCriteria("ORM_Fatture"));
	}
	
	public Progetto uniqueProgetto() {
		return (Progetto) super.uniqueResult();
	}
	
	public Progetto[] listProgetto() {
		java.util.List list = super.list();
		return (Progetto[]) list.toArray(new Progetto[list.size()]);
	}
}

