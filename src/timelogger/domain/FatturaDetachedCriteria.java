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

public class FatturaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression totale;
	
	public FatturaDetachedCriteria() {
		super(timelogger.domain.Fattura.class, timelogger.domain.FatturaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		totale = new IntegerExpression("totale", this.getDetachedCriteria());
	}
	
	public FatturaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, timelogger.domain.FatturaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		totale = new IntegerExpression("totale", this.getDetachedCriteria());
	}
	
	public ProgettoDetachedCriteria createProgettoCriteria() {
		return new ProgettoDetachedCriteria(createCriteria("progetto"));
	}
	
	public Fattura uniqueFattura(PersistentSession session) {
		return (Fattura) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Fattura[] listFattura(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Fattura[]) list.toArray(new Fattura[list.size()]);
	}
}

