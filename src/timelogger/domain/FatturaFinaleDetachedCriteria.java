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

public class FatturaFinaleDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression totale;
	
	public FatturaFinaleDetachedCriteria() {
		super(timelogger.domain.FatturaFinale.class, timelogger.domain.FatturaFinaleCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		totale = new IntegerExpression("totale", this.getDetachedCriteria());
	}
	
	public FatturaFinaleDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, timelogger.domain.FatturaFinaleCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		totale = new IntegerExpression("totale", this.getDetachedCriteria());
	}
	
	public ProgettoDetachedCriteria createProgettoCriteria() {
		return new ProgettoDetachedCriteria(createCriteria("progetto"));
	}
	
	public FatturaFinale uniqueFatturaFinale(PersistentSession session) {
		return (FatturaFinale) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public FatturaFinale[] listFatturaFinale(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (FatturaFinale[]) list.toArray(new FatturaFinale[list.size()]);
	}
}

