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

import org.orm.*;
import org.hibernate.Query;
import java.util.List;

public class ManagerFactory {
	public static Manager loadManagerByORMID(int ID) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return loadManagerByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Manager getManagerByORMID(int ID) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return getManagerByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Manager loadManagerByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return loadManagerByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Manager getManagerByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return getManagerByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Manager loadManagerByORMID(PersistentSession session, int ID) {
		try {
			return (Manager) session.load(timelogger.domain.Manager.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Manager getManagerByORMID(PersistentSession session, int ID) {
		try {
			return (Manager) session.get(timelogger.domain.Manager.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Manager loadManagerByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Manager) session.load(timelogger.domain.Manager.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Manager getManagerByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Manager) session.get(timelogger.domain.Manager.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Manager[] listManagerByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return listManagerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Manager[] listManagerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return listManagerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Manager[] listManagerByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From timelogger.domain.Manager as Manager");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Manager[]) list.toArray(new Manager[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Manager[] listManagerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From timelogger.domain.Manager as Manager");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Manager[]) list.toArray(new Manager[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Manager loadManagerByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return loadManagerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Manager loadManagerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return loadManagerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Manager loadManagerByQuery(PersistentSession session, String condition, String orderBy) {
		Manager[] managers = listManagerByQuery(session, condition, orderBy);
		if (managers != null && managers.length > 0)
			return managers[0];
		else
			return null;
	}
	
	public static Manager loadManagerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Manager[] managers = listManagerByQuery(session, condition, orderBy, lockMode);
		if (managers != null && managers.length > 0)
			return managers[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateManagerByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return iterateManagerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static java.util.Iterator iterateManagerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return iterateManagerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static java.util.Iterator iterateManagerByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From timelogger.domain.Manager as Manager");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static java.util.Iterator iterateManagerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From timelogger.domain.Manager as Manager");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Manager createManager() {
		return new timelogger.domain.Manager();
	}
	
	public static Manager loadManagerByCriteria(ManagerCriteria managerCriteria) {
		Manager[] managers = listManagerByCriteria(managerCriteria);
		if(managers == null || managers.length == 0) {
			return null;
		}
		return managers[0];
	}
	
	public static Manager[] listManagerByCriteria(ManagerCriteria managerCriteria) {
		return managerCriteria.listManager();
	}
}
