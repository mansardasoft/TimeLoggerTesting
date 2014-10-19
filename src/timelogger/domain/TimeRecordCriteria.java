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

public class TimeRecordCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final TimestampExpression inizio;
	public final TimestampExpression fine;
	public final StringExpression commento;
	public final BooleanExpression fatturato;
	
	public TimeRecordCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		inizio = new TimestampExpression("inizio", this);
		fine = new TimestampExpression("fine", this);
		commento = new StringExpression("commento", this);
		fatturato = new BooleanExpression("fatturato", this);
	}
	
	public TimeRecordCriteria(PersistentSession session) {
		this(session.createCriteria(TimeRecord.class));
	}
	
	public TimeRecordCriteria() throws PersistentException {
		this(timelogger.domain.TimeloggerPersistentManager.instance().getSession());
	}
	
	public ConsulenteCriteria createConsulenteCriteria() {
		return new ConsulenteCriteria(createCriteria("consulente"));
	}
	
	public TaskCriteria createActivityCriteria() {
		return new TaskCriteria(createCriteria("activity"));
	}
	
	public TimeRecord uniqueTimeRecord() {
		return (TimeRecord) super.uniqueResult();
	}
	
	public TimeRecord[] listTimeRecord() {
		java.util.List list = super.list();
		return (TimeRecord[]) list.toArray(new TimeRecord[list.size()]);
	}
}

