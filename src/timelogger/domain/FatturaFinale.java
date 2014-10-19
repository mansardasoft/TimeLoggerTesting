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

public class FatturaFinale extends timelogger.domain.Fattura {
	public FatturaFinale() {
	}
	
	public boolean deleteAndDissociate() {
		try {
			if(getProgetto() != null) {
				getProgetto().fatture.remove(this);
			}
			
			return delete();
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean deleteAndDissociate(org.orm.PersistentSession session) {
		try {
			if(getProgetto() != null) {
				getProgetto().fatture.remove(this);
			}
			
			try {
				session.delete(this);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public String toString() {
		return super.toString();
	}
	
}
