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

public class Fattura implements Comparable {
	public Fattura() {
	}
	
	public boolean save() {
		try {
			timelogger.domain.TimeloggerPersistentManager.instance().saveObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean delete() {
		try {
			timelogger.domain.TimeloggerPersistentManager.instance().deleteObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean refresh() {
		try {
			timelogger.domain.TimeloggerPersistentManager.instance().getSession().refresh(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean evict() {
		try {
			timelogger.domain.TimeloggerPersistentManager.instance().getSession().evict(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
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
	
	private void this_setOwner(Object owner, int key) {
		if (key == timelogger.domain.ORMConstants.KEY_FATTURA_PROGETTO) {
			this.progetto = (timelogger.domain.Progetto) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private timelogger.domain.Progetto progetto;
	
	protected int totale;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setTotale(int value) {
		this.totale = value;
	}
	
	public int getTotale() {
		return totale;
	}
	
	public void setProgetto(timelogger.domain.Progetto value) {
		if (progetto != null) {
			progetto.fatture.remove(this);
		}
		if (value != null) {
			value.fatture.add(this);
		}
	}
	
	public timelogger.domain.Progetto getProgetto() {
		return progetto;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Progetto(timelogger.domain.Progetto value) {
		this.progetto = value;
	}
	
	private timelogger.domain.Progetto getORM_Progetto() {
		return progetto;
	}
	
	public String toString() {
		return "Fattura";
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
