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

public class TimeRecordDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final TimestampExpression inizio;
	public final TimestampExpression fine;
	public final StringExpression commento;
	public final BooleanExpression fatturato;
	
	public TimeRecordDetachedCriteria() {
		super(timelogger.domain.TimeRecord.class, timelogger.domain.TimeRecordCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		inizio = new TimestampExpression("inizio", this.getDetachedCriteria());
		fine = new TimestampExpression("fine", this.getDetachedCriteria());
		commento = new StringExpression("commento", this.getDetachedCriteria());
		fatturato = new BooleanExpression("fatturato", this.getDetachedCriteria());
	}
	
	public TimeRecordDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, timelogger.domain.TimeRecordCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		inizio = new TimestampExpression("inizio", this.getDetachedCriteria());
		fine = new TimestampExpression("fine", this.getDetachedCriteria());
		commento = new StringExpression("commento", this.getDetachedCriteria());
		fatturato = new BooleanExpression("fatturato", this.getDetachedCriteria());
	}
	
	public ConsulenteDetachedCriteria createConsulenteCriteria() {
		return new ConsulenteDetachedCriteria(createCriteria("consulente"));
	}
	
	public TaskDetachedCriteria createActivityCriteria() {
		return new TaskDetachedCriteria(createCriteria("activity"));
	}
	
	public TimeRecord uniqueTimeRecord(PersistentSession session) {
		return (TimeRecord) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public TimeRecord[] listTimeRecord(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (TimeRecord[]) list.toArray(new TimeRecord[list.size()]);
	}
}

