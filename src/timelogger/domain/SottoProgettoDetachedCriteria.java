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

public class SottoProgettoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression titolo;
	public final IntegerExpression durataStimata;
	public final IntegerExpression totaleOre;
	public final IntegerExpression budgetStimato;
	public final IntegerExpression pagaOraria;
	
	public SottoProgettoDetachedCriteria() {
		super(timelogger.domain.SottoProgetto.class, timelogger.domain.SottoProgettoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		titolo = new StringExpression("titolo", this.getDetachedCriteria());
		durataStimata = new IntegerExpression("durataStimata", this.getDetachedCriteria());
		totaleOre = new IntegerExpression("totaleOre", this.getDetachedCriteria());
		budgetStimato = new IntegerExpression("budgetStimato", this.getDetachedCriteria());
		pagaOraria = new IntegerExpression("pagaOraria", this.getDetachedCriteria());
	}
	
	public SottoProgettoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, timelogger.domain.SottoProgettoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		titolo = new StringExpression("titolo", this.getDetachedCriteria());
		durataStimata = new IntegerExpression("durataStimata", this.getDetachedCriteria());
		totaleOre = new IntegerExpression("totaleOre", this.getDetachedCriteria());
		budgetStimato = new IntegerExpression("budgetStimato", this.getDetachedCriteria());
		pagaOraria = new IntegerExpression("pagaOraria", this.getDetachedCriteria());
	}
	
	public ManagerDetachedCriteria createManagerCriteria() {
		return new ManagerDetachedCriteria(createCriteria("manager"));
	}
	
	public ProgettoDetachedCriteria createProgettoCriteria() {
		return new ProgettoDetachedCriteria(createCriteria("progetto"));
	}
	
	public TaskDetachedCriteria createTasksCriteria() {
		return new TaskDetachedCriteria(createCriteria("ORM_Tasks"));
	}
	
	public SottoProgetto uniqueSottoProgetto(PersistentSession session) {
		return (SottoProgetto) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public SottoProgetto[] listSottoProgetto(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (SottoProgetto[]) list.toArray(new SottoProgetto[list.size()]);
	}
}

