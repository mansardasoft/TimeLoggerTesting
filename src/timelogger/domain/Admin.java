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

public class Admin extends timelogger.domain.Utente {
	public Admin() {
	}
	
	public boolean deleteAndDissociate() {
		try {
			timelogger.domain.Progetto[] lProjectss = projects.toArray();
			for(int i = 0; i < lProjectss.length; i++) {
				lProjectss[i].setAdmin(null);
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
			timelogger.domain.Progetto[] lProjectss = projects.toArray();
			for(int i = 0; i < lProjectss.length; i++) {
				lProjectss[i].setAdmin(null);
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
		if (key == timelogger.domain.ORMConstants.KEY_ADMIN_PROJECTS) {
			return ORM_projects;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private java.util.Set ORM_projects = new java.util.HashSet();
	
	private void setORM_Projects(java.util.Set value) {
		this.ORM_projects = value;
	}
	
	private java.util.Set getORM_Projects() {
		return ORM_projects;
	}
	
	public final timelogger.domain.ProgettoSetCollection projects = new timelogger.domain.ProgettoSetCollection(this, _ormAdapter, timelogger.domain.ORMConstants.KEY_ADMIN_PROJECTS, timelogger.domain.ORMConstants.KEY_PROGETTO_ADMIN, timelogger.domain.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}

	public void createCommands()
	{
		GuiBuilder.getInstance().createAdminCommands();
	}
	
}
