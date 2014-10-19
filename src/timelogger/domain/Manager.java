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

import timelogger.presentation.graphicCommand.GuiBuilder;

public class Manager extends timelogger.domain.Utente {
	public Manager() {
	}
	
	public boolean deleteAndDissociate() {
		try {
			timelogger.domain.SottoProgetto[] lSubprojectss = subprojects.toArray();
			for(int i = 0; i < lSubprojectss.length; i++) {
				lSubprojectss[i].setManager(null);
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
			timelogger.domain.SottoProgetto[] lSubprojectss = subprojects.toArray();
			for(int i = 0; i < lSubprojectss.length; i++) {
				lSubprojectss[i].setManager(null);
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
	
	private java.util.Set this_getSet (int key) {
		if (key == timelogger.domain.ORMConstants.KEY_MANAGER_SUBPROJECTS) {
			return ORM_subprojects;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private java.util.Set ORM_subprojects = new java.util.HashSet();
	
	private void setORM_Subprojects(java.util.Set value) {
		this.ORM_subprojects = value;
	}
	
	private java.util.Set getORM_Subprojects() {
		return ORM_subprojects;
	}
	
	public final timelogger.domain.SottoProgettoSetCollection subprojects = new timelogger.domain.SottoProgettoSetCollection(this, _ormAdapter, timelogger.domain.ORMConstants.KEY_MANAGER_SUBPROJECTS, timelogger.domain.ORMConstants.KEY_SOTTOPROGETTO_MANAGER, timelogger.domain.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
	public void createCommands()
	{
		GuiBuilder.getInstance().createManagerCommands();
	}
	
	
}
