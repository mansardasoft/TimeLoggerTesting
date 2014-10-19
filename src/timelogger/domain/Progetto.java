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

public class Progetto {
	public Progetto() {
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
			if(getClienteAssociato() != null) {
				getClienteAssociato().projects.remove(this);
			}
			
			if(getAdmin() != null) {
				getAdmin().projects.remove(this);
			}
			
			timelogger.domain.SottoProgetto[] lSottoprogettis = sottoprogetti.toArray();
			for(int i = 0; i < lSottoprogettis.length; i++) {
				lSottoprogettis[i].setProgetto(null);
			}
			timelogger.domain.Fattura[] lFattures = fatture.toArray();
			for(int i = 0; i < lFattures.length; i++) {
				lFattures[i].setProgetto(null);
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
			if(getClienteAssociato() != null) {
				getClienteAssociato().projects.remove(this);
			}
			
			if(getAdmin() != null) {
				getAdmin().projects.remove(this);
			}
			
			timelogger.domain.SottoProgetto[] lSottoprogettis = sottoprogetti.toArray();
			for(int i = 0; i < lSottoprogettis.length; i++) {
				lSottoprogettis[i].setProgetto(null);
			}
			timelogger.domain.Fattura[] lFattures = fatture.toArray();
			for(int i = 0; i < lFattures.length; i++) {
				lFattures[i].setProgetto(null);
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
		if (key == timelogger.domain.ORMConstants.KEY_PROGETTO_SOTTOPROGETTI) {
			return ORM_sottoprogetti;
		}
		else if (key == timelogger.domain.ORMConstants.KEY_PROGETTO_FATTURE) {
			return ORM_fatture;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == timelogger.domain.ORMConstants.KEY_PROGETTO_ADMIN) {
			this.admin = (timelogger.domain.Admin) owner;
		}
		
		else if (key == timelogger.domain.ORMConstants.KEY_PROGETTO_CLIENTEASSOCIATO) {
			this.clienteAssociato = (timelogger.domain.Cliente) owner;
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
	
	private timelogger.domain.Cliente clienteAssociato;
	
	private timelogger.domain.Admin admin;
	
	private String titolo;
	
	private java.util.Date dataInizio;
	
	private java.util.Date dataFine = null;
	
	private java.util.List ORM_sottoprogetti = new java.util.ArrayList();
	
	private java.util.List ORM_fatture = new java.util.ArrayList();
	
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
	
	public void setDataInizio(java.util.Date value) {
		this.dataInizio = value;
	}
	
	public java.util.Date getDataInizio() {
		return dataInizio;
	}
	
	public void setDataFine(java.util.Date value) {
		this.dataFine = value;
	}
	
	public java.util.Date getDataFine() {
		return dataFine;
	}
	
	public void setAdmin(timelogger.domain.Admin value) {
		if (admin != null) {
			admin.projects.remove(this);
		}
		if (value != null) {
			value.projects.add(this);
		}
	}
	
	public timelogger.domain.Admin getAdmin() {
		return admin;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Admin(timelogger.domain.Admin value) {
		this.admin = value;
	}
	
	private timelogger.domain.Admin getORM_Admin() {
		return admin;
	}
	
	public void setClienteAssociato(timelogger.domain.Cliente value) {
		if (clienteAssociato != null) {
			clienteAssociato.projects.remove(this);
		}
		if (value != null) {
			value.projects.add(this);
		}
	}
	
	public timelogger.domain.Cliente getClienteAssociato() {
		return clienteAssociato;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_ClienteAssociato(timelogger.domain.Cliente value) {
		this.clienteAssociato = value;
	}
	
	private timelogger.domain.Cliente getORM_ClienteAssociato() {
		return clienteAssociato;
	}
	
	private void setORM_Sottoprogetti(java.util.List value) {
		this.ORM_sottoprogetti = value;
	}
	
	private java.util.List getORM_Sottoprogetti() {
		return ORM_sottoprogetti;
	}
	
	public final timelogger.domain.SottoProgettoListCollection sottoprogetti = new timelogger.domain.SottoProgettoListCollection(this, _ormAdapter, timelogger.domain.ORMConstants.KEY_PROGETTO_SOTTOPROGETTI, timelogger.domain.ORMConstants.KEY_SOTTOPROGETTO_PROGETTO, timelogger.domain.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Fatture(java.util.List value) {
		this.ORM_fatture = value;
	}
	
	private java.util.List getORM_Fatture() {
		return ORM_fatture;
	}
	
	public final timelogger.domain.FatturaListCollection fatture = new timelogger.domain.FatturaListCollection(this, _ormAdapter, timelogger.domain.ORMConstants.KEY_PROGETTO_FATTURE, timelogger.domain.ORMConstants.KEY_FATTURA_PROGETTO, timelogger.domain.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		String aux;
		int support=55;
		String report="<html>Progetto"+this.titolo+";<br>";
		if(this.dataInizio!=null)report+="Data Inizio: "+this.dataInizio.toString()+";<br>";
		else report+="Data Inizio: Non inserita;<br>";
		if(this.dataFine!=null)report+="Data Fine:"+this.dataFine.toString()+";<br>";
		else report+="Data Fine: Non inserita;<br>";
		report+="Sottoprogetti:<br><ul>";
		for(int i=0;i<this.sottoprogetti.size();i++)
		{
			aux=this.sottoprogetti.get(i).getTitolo()+" associato al manager "+this.sottoprogetti.get(i).getManager().getCognome()+". Durata: "+
					this.sottoprogetti.get(i).getDurataStimata()+" Budget: "+this.sottoprogetti.get(i).getBudgetStimato();
			if(aux.length()>=support) aux=aux.substring(0, support-1)+"<br>"+aux.substring(support, aux.length()-1);
			report+="<li>"+aux+"</li><br>";
		
		}
		report+="</ul>";
		report+="Fatture:<br><ul>";
		for(int i=0;i<this.fatture.size();i++)
		{
			report+="<li>"+this.fatture.get(i).toString()+"</li><br>";
		}
		report+="</ul></hmtl>";
		return report;
	}

}
