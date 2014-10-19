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

public class Consulente extends timelogger.domain.Utente {
	public Consulente() {
	}
	
	public boolean deleteAndDissociate() {
		try {
			timelogger.domain.Task[] lTaskss = tasks.toArray();
			for(int i = 0; i < lTaskss.length; i++) {
				lTaskss[i].setConsulenteAssociato(null);
			}
			timelogger.domain.TimeRecord[] lTimerecordss = timerecords.toArray();
			for(int i = 0; i < lTimerecordss.length; i++) {
				lTimerecordss[i].setConsulente(null);
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
			timelogger.domain.Task[] lTaskss = tasks.toArray();
			for(int i = 0; i < lTaskss.length; i++) {
				lTaskss[i].setConsulenteAssociato(null);
			}
			timelogger.domain.TimeRecord[] lTimerecordss = timerecords.toArray();
			for(int i = 0; i < lTimerecordss.length; i++) {
				lTimerecordss[i].setConsulente(null);
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
		if (key == timelogger.domain.ORMConstants.KEY_CONSULENTE_TASKS) {
			return ORM_tasks;
		}
		else if (key == timelogger.domain.ORMConstants.KEY_CONSULENTE_TIMERECORDS) {
			return ORM_timerecords;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.List getList(int key) {
			return this_getList(key);
		}
		
	};
	
	private int pagaFissa;
	
	private java.util.List ORM_tasks = new java.util.ArrayList();
	
	private java.util.List ORM_timerecords = new java.util.ArrayList();
	
	public void setPagaFissa(int value) {
		this.pagaFissa = value;
	}
	
	public int getPagaFissa() {
		return pagaFissa;
	}
	
	private void setORM_Tasks(java.util.List value) {
		this.ORM_tasks = value;
	}
	
	private java.util.List getORM_Tasks() {
		return ORM_tasks;
	}
	
	public final timelogger.domain.TaskListCollection tasks = new timelogger.domain.TaskListCollection(this, _ormAdapter, timelogger.domain.ORMConstants.KEY_CONSULENTE_TASKS, timelogger.domain.ORMConstants.KEY_TASK_CONSULENTEASSOCIATO, timelogger.domain.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Timerecords(java.util.List value) {
		this.ORM_timerecords = value;
	}
	
	private java.util.List getORM_Timerecords() {
		return ORM_timerecords;
	}
	
	public final timelogger.domain.TimeRecordListCollection timerecords = new timelogger.domain.TimeRecordListCollection(this, _ormAdapter, timelogger.domain.ORMConstants.KEY_CONSULENTE_TIMERECORDS, timelogger.domain.ORMConstants.KEY_TIMERECORD_CONSULENTE, timelogger.domain.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
	public void createCommands()
	{
		GuiBuilder.getInstance().createConsulentCommands();
	}
}
