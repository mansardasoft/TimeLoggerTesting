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

public class TaskDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression titolo;
	public final StringExpression descrizione;
	public final BooleanExpression completato;
	public final BooleanExpression fatturato;
	
	public TaskDetachedCriteria() {
		super(timelogger.domain.Task.class, timelogger.domain.TaskCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		titolo = new StringExpression("titolo", this.getDetachedCriteria());
		descrizione = new StringExpression("descrizione", this.getDetachedCriteria());
		completato = new BooleanExpression("completato", this.getDetachedCriteria());
		fatturato = new BooleanExpression("fatturato", this.getDetachedCriteria());
	}
	
	public TaskDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, timelogger.domain.TaskCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		titolo = new StringExpression("titolo", this.getDetachedCriteria());
		descrizione = new StringExpression("descrizione", this.getDetachedCriteria());
		completato = new BooleanExpression("completato", this.getDetachedCriteria());
		fatturato = new BooleanExpression("fatturato", this.getDetachedCriteria());
	}
	
	public ConsulenteDetachedCriteria createConsulenteAssociatoCriteria() {
		return new ConsulenteDetachedCriteria(createCriteria("consulenteAssociato"));
	}
	
	public SottoProgettoDetachedCriteria createSottoprogettoCriteria() {
		return new SottoProgettoDetachedCriteria(createCriteria("sottoprogetto"));
	}
	
	public TimeRecordDetachedCriteria createTimerecordsCriteria() {
		return new TimeRecordDetachedCriteria(createCriteria("ORM_Timerecords"));
	}
	
	public Task uniqueTask(PersistentSession session) {
		return (Task) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Task[] listTask(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Task[]) list.toArray(new Task[list.size()]);
	}
}

