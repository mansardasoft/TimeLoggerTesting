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

public class FatturaParzialeDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression totale;
	public final DateExpression dataInizio;
	public final DateExpression dataFine;
	
	public FatturaParzialeDetachedCriteria() {
		super(timelogger.domain.FatturaParziale.class, timelogger.domain.FatturaParzialeCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		totale = new IntegerExpression("totale", this.getDetachedCriteria());
		dataInizio = new DateExpression("dataInizio", this.getDetachedCriteria());
		dataFine = new DateExpression("dataFine", this.getDetachedCriteria());
	}
	
	public FatturaParzialeDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, timelogger.domain.FatturaParzialeCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		totale = new IntegerExpression("totale", this.getDetachedCriteria());
		dataInizio = new DateExpression("dataInizio", this.getDetachedCriteria());
		dataFine = new DateExpression("dataFine", this.getDetachedCriteria());
	}
	
	public ProgettoDetachedCriteria createProgettoCriteria() {
		return new ProgettoDetachedCriteria(createCriteria("progetto"));
	}
	
	public FatturaParziale uniqueFatturaParziale(PersistentSession session) {
		return (FatturaParziale) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public FatturaParziale[] listFatturaParziale(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (FatturaParziale[]) list.toArray(new FatturaParziale[list.size()]);
	}
}

