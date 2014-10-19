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

public class TimeRecord {
	public TimeRecord() {
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
			if(getConsulente() != null) {
				getConsulente().timerecords.remove(this);
			}
			
			if(getActivity() != null) {
				getActivity().timerecords.remove(this);
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
			if(getConsulente() != null) {
				getConsulente().timerecords.remove(this);
			}
			
			if(getActivity() != null) {
				getActivity().timerecords.remove(this);
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
		if (key == timelogger.domain.ORMConstants.KEY_TIMERECORD_ACTIVITY) {
			this.activity = (timelogger.domain.Task) owner;
		}
		
		else if (key == timelogger.domain.ORMConstants.KEY_TIMERECORD_CONSULENTE) {
			this.consulente = (timelogger.domain.Consulente) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private timelogger.domain.Consulente consulente;
	
	private timelogger.domain.Task activity;
	
	private java.sql.Timestamp inizio;
	
	private java.sql.Timestamp fine;
	
	private String commento;
	
	private boolean fatturato = false;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setInizio(java.sql.Timestamp value) {
		this.inizio = value;
	}
	
	public java.sql.Timestamp getInizio() {
		return inizio;
	}
	
	public void setFine(java.sql.Timestamp value) {
		this.fine = value;
	}
	
	public java.sql.Timestamp getFine() {
		return fine;
	}
	
	public void setCommento(String value) {
		this.commento = value;
	}
	
	public String getCommento() {
		return commento;
	}
	
	public void setFatturato(boolean value) {
		this.fatturato = value;
	}
	
	public boolean getFatturato() {
		return fatturato;
	}
	
	public void setActivity(timelogger.domain.Task value) {
		if (activity != null) {
			activity.timerecords.remove(this);
		}
		if (value != null) {
			value.timerecords.add(this);
		}
	}
	
	public timelogger.domain.Task getActivity() {
		return activity;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Activity(timelogger.domain.Task value) {
		this.activity = value;
	}
	
	private timelogger.domain.Task getORM_Activity() {
		return activity;
	}
	
	public void setConsulente(timelogger.domain.Consulente value) {
		if (consulente != null) {
			consulente.timerecords.remove(this);
		}
		if (value != null) {
			value.timerecords.add(this);
		}
	}
	
	public timelogger.domain.Consulente getConsulente() {
		return consulente;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Consulente(timelogger.domain.Consulente value) {
		this.consulente = value;
	}
	
	private timelogger.domain.Consulente getORM_Consulente() {
		return consulente;
	}
	
	public String toString() {
		return "ID "+this.ID+"inizio: "+this.inizio.toString()+"fine: "+this.fine.toString();
	}
	
}
