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

public class SottoProgettoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression titolo;
	public final IntegerExpression durataStimata;
	public final IntegerExpression totaleOre;
	public final IntegerExpression budgetStimato;
	public final IntegerExpression pagaOraria;
	
	public SottoProgettoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		titolo = new StringExpression("titolo", this);
		durataStimata = new IntegerExpression("durataStimata", this);
		totaleOre = new IntegerExpression("totaleOre", this);
		budgetStimato = new IntegerExpression("budgetStimato", this);
		pagaOraria = new IntegerExpression("pagaOraria", this);
	}
	
	public SottoProgettoCriteria(PersistentSession session) {
		this(session.createCriteria(SottoProgetto.class));
	}
	
	public SottoProgettoCriteria() throws PersistentException {
		this(timelogger.domain.TimeloggerPersistentManager.instance().getSession());
	}
	
	public ManagerCriteria createManagerCriteria() {
		return new ManagerCriteria(createCriteria("manager"));
	}
	
	public ProgettoCriteria createProgettoCriteria() {
		return new ProgettoCriteria(createCriteria("progetto"));
	}
	
	public TaskCriteria createTasksCriteria() {
		return new TaskCriteria(createCriteria("ORM_Tasks"));
	}
	
	public SottoProgetto uniqueSottoProgetto() {
		return (SottoProgetto) super.uniqueResult();
	}
	
	public SottoProgetto[] listSottoProgetto() {
		java.util.List list = super.list();
		return (SottoProgetto[]) list.toArray(new SottoProgetto[list.size()]);
	}
}

