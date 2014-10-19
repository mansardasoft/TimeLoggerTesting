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

public class Task {
	public Task() {
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
			if(getConsulenteAssociato() != null) {
				getConsulenteAssociato().tasks.remove(this);
			}
			
			if(getSottoprogetto() != null) {
				getSottoprogetto().tasks.remove(this);
			}
			
			timelogger.domain.TimeRecord[] lTimerecordss = timerecords.toArray();
			for(int i = 0; i < lTimerecordss.length; i++) {
				lTimerecordss[i].setActivity(null);
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
			if(getConsulenteAssociato() != null) {
				getConsulenteAssociato().tasks.remove(this);
			}
			
			if(getSottoprogetto() != null) {
				getSottoprogetto().tasks.remove(this);
			}
			
			timelogger.domain.TimeRecord[] lTimerecordss = timerecords.toArray();
			for(int i = 0; i < lTimerecordss.length; i++) {
				lTimerecordss[i].setActivity(null);
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
	
	private java.util.List this_getList (int key) {
		if (key == timelogger.domain.ORMConstants.KEY_TASK_TIMERECORDS) {
			return ORM_timerecords;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == timelogger.domain.ORMConstants.KEY_TASK_SOTTOPROGETTO) {
			this.sottoprogetto = (timelogger.domain.SottoProgetto) owner;
		}
		
		else if (key == timelogger.domain.ORMConstants.KEY_TASK_CONSULENTEASSOCIATO) {
			this.consulenteAssociato = (timelogger.domain.Consulente) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.List getList(int key) {
			return this_getList(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private timelogger.domain.Consulente consulenteAssociato;
	
	private timelogger.domain.SottoProgetto sottoprogetto;
	
	private String titolo;
	
	private String descrizione;
	
	private boolean completato = false;
	
	private boolean fatturato = false;
	
	private java.util.List ORM_timerecords = new java.util.ArrayList();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setTitolo(String value) {
		this.titolo = value;
	}
	
	public String getTitolo() {
		return titolo;
	}
	
	public void setDescrizione(String value) {
		this.descrizione = value;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
	public void setCompletato(boolean value) {
		this.completato = value;
	}
	
	public boolean getCompletato() {
		return completato;
	}
	
	public void setFatturato(boolean value) {
		this.fatturato = value;
	}
	
	public boolean getFatturato() {
		return fatturato;
	}
	
	public void setSottoprogetto(timelogger.domain.SottoProgetto value) {
		if (sottoprogetto != null) {
			sottoprogetto.tasks.remove(this);
		}
		if (value != null) {
			value.tasks.add(this);
		}
	}
	
	public timelogger.domain.SottoProgetto getSottoprogetto() {
		return sottoprogetto;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Sottoprogetto(timelogger.domain.SottoProgetto value) {
		this.sottoprogetto = value;
	}
	
	private timelogger.domain.SottoProgetto getORM_Sottoprogetto() {
		return sottoprogetto;
	}
	
	public void setConsulenteAssociato(timelogger.domain.Consulente value) {
		if (consulenteAssociato != null) {
			consulenteAssociato.tasks.remove(this);
		}
		if (value != null) {
			value.tasks.add(this);
		}
	}
	
	public timelogger.domain.Consulente getConsulenteAssociato() {
		return consulenteAssociato;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_ConsulenteAssociato(timelogger.domain.Consulente value) {
		this.consulenteAssociato = value;
	}
	
	private timelogger.domain.Consulente getORM_ConsulenteAssociato() {
		return consulenteAssociato;
	}
	
	private void setORM_Timerecords(java.util.List value) {
		this.ORM_timerecords = value;
	}
	
	private java.util.List getORM_Timerecords() {
		return ORM_timerecords;
	}
	
	public final timelogger.domain.TimeRecordListCollection timerecords = new timelogger.domain.TimeRecordListCollection(this, _ormAdapter, timelogger.domain.ORMConstants.KEY_TASK_TIMERECORDS, timelogger.domain.ORMConstants.KEY_TIMERECORD_ACTIVITY, timelogger.domain.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID())+" - "+this.getTitolo();
	}
	
}
