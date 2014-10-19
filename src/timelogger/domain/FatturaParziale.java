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

public class FatturaParziale extends timelogger.domain.Fattura {
	public FatturaParziale() {
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
	
	private java.util.Date dataInizio;
	
	private java.util.Date dataFine;
	
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
	
	public String toString() {
		String out;
		if(dataInizio!=null)
		out="dal:"+this.dataInizio.toString()+" al:"+this.dataFine.toString()+";";
		else
		out="dall'inizio del progetto al:"+this.dataFine.toString()+";";	
		return out;
	}
	
	@Override
	public int compareTo(Object arg0) {
		FatturaParziale fp=(FatturaParziale)arg0;
		return this.dataFine.compareTo(fp.getDataFine());
	}
	
}
