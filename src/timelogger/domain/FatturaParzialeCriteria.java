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

public class FatturaParzialeCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression totale;
	public final DateExpression dataInizio;
	public final DateExpression dataFine;
	
	public FatturaParzialeCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		totale = new IntegerExpression("totale", this);
		dataInizio = new DateExpression("dataInizio", this);
		dataFine = new DateExpression("dataFine", this);
	}
	
	public FatturaParzialeCriteria(PersistentSession session) {
		this(session.createCriteria(FatturaParziale.class));
	}
	
	public FatturaParzialeCriteria() throws PersistentException {
		this(timelogger.domain.TimeloggerPersistentManager.instance().getSession());
	}
	
	public ProgettoCriteria createProgettoCriteria() {
		return new ProgettoCriteria(createCriteria("progetto"));
	}
	
	public FatturaParziale uniqueFatturaParziale() {
		return (FatturaParziale) super.uniqueResult();
	}
	
	public FatturaParziale[] listFatturaParziale() {
		java.util.List list = super.list();
		return (FatturaParziale[]) list.toArray(new FatturaParziale[list.size()]);
	}
}

