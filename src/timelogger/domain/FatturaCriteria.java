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

public class FatturaCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression totale;
	
	public FatturaCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		totale = new IntegerExpression("totale", this);
	}
	
	public FatturaCriteria(PersistentSession session) {
		this(session.createCriteria(Fattura.class));
	}
	
	public FatturaCriteria() throws PersistentException {
		this(timelogger.domain.TimeloggerPersistentManager.instance().getSession());
	}
	
	public ProgettoCriteria createProgettoCriteria() {
		return new ProgettoCriteria(createCriteria("progetto"));
	}
	
	public Fattura uniqueFattura() {
		return (Fattura) super.uniqueResult();
	}
	
	public Fattura[] listFattura() {
		java.util.List list = super.list();
		return (Fattura[]) list.toArray(new Fattura[list.size()]);
	}
}

