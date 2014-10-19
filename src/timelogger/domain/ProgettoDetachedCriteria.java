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

public class ProgettoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression titolo;
	public final DateExpression dataInizio;
	public final DateExpression dataFine;
	
	public ProgettoDetachedCriteria() {
		super(timelogger.domain.Progetto.class, timelogger.domain.ProgettoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		titolo = new StringExpression("titolo", this.getDetachedCriteria());
		dataInizio = new DateExpression("dataInizio", this.getDetachedCriteria());
		dataFine = new DateExpression("dataFine", this.getDetachedCriteria());
	}
	
	public ProgettoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, timelogger.domain.ProgettoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		titolo = new StringExpression("titolo", this.getDetachedCriteria());
		dataInizio = new DateExpression("dataInizio", this.getDetachedCriteria());
		dataFine = new DateExpression("dataFine", this.getDetachedCriteria());
	}
	
	public ClienteDetachedCriteria createClienteAssociatoCriteria() {
		return new ClienteDetachedCriteria(createCriteria("clienteAssociato"));
	}
	
	public AdminDetachedCriteria createAdminCriteria() {
		return new AdminDetachedCriteria(createCriteria("admin"));
	}
	
	public SottoProgettoDetachedCriteria createSottoprogettiCriteria() {
		return new SottoProgettoDetachedCriteria(createCriteria("ORM_Sottoprogetti"));
	}
	
	public FatturaDetachedCriteria createFattureCriteria() {
		return new FatturaDetachedCriteria(createCriteria("ORM_Fatture"));
	}
	
	public Progetto uniqueProgetto(PersistentSession session) {
		return (Progetto) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Progetto[] listProgetto(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Progetto[]) list.toArray(new Progetto[list.size()]);
	}
}

