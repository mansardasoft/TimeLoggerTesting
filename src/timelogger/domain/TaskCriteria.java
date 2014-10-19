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

public class TaskCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression titolo;
	public final StringExpression descrizione;
	public final BooleanExpression completato;
	public final BooleanExpression fatturato;
	
	public TaskCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		titolo = new StringExpression("titolo", this);
		descrizione = new StringExpression("descrizione", this);
		completato = new BooleanExpression("completato", this);
		fatturato = new BooleanExpression("fatturato", this);
	}
	
	public TaskCriteria(PersistentSession session) {
		this(session.createCriteria(Task.class));
	}
	
	public TaskCriteria() throws PersistentException {
		this(timelogger.domain.TimeloggerPersistentManager.instance().getSession());
	}
	
	public ConsulenteCriteria createConsulenteAssociatoCriteria() {
		return new ConsulenteCriteria(createCriteria("consulenteAssociato"));
	}
	
	public SottoProgettoCriteria createSottoprogettoCriteria() {
		return new SottoProgettoCriteria(createCriteria("sottoprogetto"));
	}
	
	public TimeRecordCriteria createTimerecordsCriteria() {
		return new TimeRecordCriteria(createCriteria("ORM_Timerecords"));
	}
	
	public Task uniqueTask() {
		return (Task) super.uniqueResult();
	}
	
	public Task[] listTask() {
		java.util.List list = super.list();
		return (Task[]) list.toArray(new Task[list.size()]);
	}
}

