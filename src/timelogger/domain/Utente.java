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

public class Utente extends timelogger.domain.Persona {
	public Utente() {
	}
	
	protected String username;
	
	protected String password;
	
	protected java.util.Date dataAssunzione;
	
	protected java.util.Date dataLicenziamento = null;
	
	public void setUsername(String value) {
		this.username = value;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setDataAssunzione(java.util.Date value) {
		this.dataAssunzione = value;
	}
	
	public java.util.Date getDataAssunzione() {
		return dataAssunzione;
	}
	
	public void setDataLicenziamento(java.util.Date value) {
		this.dataLicenziamento = value;
	}
	
	public java.util.Date getDataLicenziamento() {
		return dataLicenziamento;
	}
	
	public void createCommands() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return super.toString();
	}
	
}
