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

public class SottoProgetto implements Comparable{
	public SottoProgetto() {
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
			if(getManager() != null) {
				getManager().subprojects.remove(this);
			}
			
			if(getProgetto() != null) {
				getProgetto().sottoprogetti.remove(this);
			}
			
			timelogger.domain.Task[] lTaskss = tasks.toArray();
			for(int i = 0; i < lTaskss.length; i++) {
				lTaskss[i].setSottoprogetto(null);
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
			if(getManager() != null) {
				getManager().subprojects.remove(this);
			}
			
			if(getProgetto() != null) {
				getProgetto().sottoprogetti.remove(this);
			}
			
			timelogger.domain.Task[] lTaskss = tasks.toArray();
			for(int i = 0; i < lTaskss.length; i++) {
				lTaskss[i].setSottoprogetto(null);
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
		if (key == timelogger.domain.ORMConstants.KEY_SOTTOPROGETTO_TASKS) {
			return ORM_tasks;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == timelogger.domain.ORMConstants.KEY_SOTTOPROGETTO_PROGETTO) {
			this.progetto = (timelogger.domain.Progetto) owner;
		}
		
		else if (key == timelogger.domain.ORMConstants.KEY_SOTTOPROGETTO_MANAGER) {
			this.manager = (timelogger.domain.Manager) owner;
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
	
	private timelogger.domain.Manager manager;
	
	private timelogger.domain.Progetto progetto;
	
	private String titolo;
	
	private int durataStimata;
	
	private int totaleOre = 0;
	
	private int budgetStimato;
	
	private int pagaOraria;
	
	@SuppressWarnings("rawtypes")
	private java.util.List ORM_tasks = new java.util.ArrayList();
	
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
	
	public void setDurataStimata(int value) {
		this.durataStimata = value;
	}
	
	public int getDurataStimata() {
		return durataStimata;
	}
	
	public void setTotaleOre(int value) {
		this.totaleOre = value;
	}
	
	public int getTotaleOre() {
		return totaleOre;
	}
	
	public void setBudgetStimato(int value) {
		this.budgetStimato = value;
	}
	
	public int getBudgetStimato() {
		return budgetStimato;
	}
	
	public void setPagaOraria(int value) {
		this.pagaOraria = value;
	}
	
	public int getPagaOraria() {
		return pagaOraria;
	}
	
	public void setProgetto(timelogger.domain.Progetto value) {
		if (progetto != null) {
			progetto.sottoprogetti.remove(this);
		}
		if (value != null) {
			value.sottoprogetti.add(this);
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
	
	public void setManager(timelogger.domain.Manager value) {
		if (manager != null) {
			manager.subprojects.remove(this);
		}
		if (value != null) {
			value.subprojects.add(this);
		}
	}
	
	public timelogger.domain.Manager getManager() {
		return manager;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Manager(timelogger.domain.Manager value) {
		this.manager = value;
	}
	
	private timelogger.domain.Manager getORM_Manager() {
		return manager;
	}
	
	private void setORM_Tasks(java.util.List value) {
		this.ORM_tasks = value;
	}
	
	private java.util.List getORM_Tasks() {
		return ORM_tasks;
	}
	
	public final timelogger.domain.TaskListCollection tasks = new timelogger.domain.TaskListCollection(this, _ormAdapter, timelogger.domain.ORMConstants.KEY_SOTTOPROGETTO_TASKS, timelogger.domain.ORMConstants.KEY_TASK_SOTTOPROGETTO, timelogger.domain.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	@Override
	public int compareTo(Object o) {
		SottoProgetto sp=(SottoProgetto)o;
		return this.titolo.compareTo(sp.getTitolo());
	}
	
	public String toString()
	{
		return this.getTitolo()+" [Budget: "+String.valueOf(this.getBudgetStimato())+" - Durata: "+String.valueOf(this.getDurataStimata())+"]";
	}
	
	public String riassuntoSubProject()
	{
		String s ="Titolo sotto progetto: "+this.titolo+" del progetto "+this.getProgetto().getTitolo()+"\n"
			     +"Manager associato: "+this.getManager().toString()+"\n"
				 +"Durata stimata: "+this.getDurataStimata()+"\n"
				 +"Budget stimato: "+this.getBudgetStimato()+"\n"
				 +"Paga Oraria: "+this.getPagaOraria()+"\n";
		
		if(this.tasks.size()==0) s+="Non ci sono ancora task associati";
		else
		{
			s+="Tasks: \n";
			for (int i = 0; i<this.tasks.size(); i++)
			{
				if(this.tasks.get(i).getConsulenteAssociato()!=null) 
					s+="    "+this.tasks.get(i).getTitolo()+" associato a "+this.tasks.get(i).getConsulenteAssociato().toString()+"\n";
				else
					s+="    "+this.tasks.get(i).getTitolo()+" non associato\n";
			}
		}
		return s;
	}
}
