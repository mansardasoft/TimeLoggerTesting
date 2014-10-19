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

public class ConsulenteFactory {
	public static Consulente loadConsulenteByORMID(int ID) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return loadConsulenteByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Consulente getConsulenteByORMID(int ID) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return getConsulenteByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Consulente loadConsulenteByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return loadConsulenteByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Consulente getConsulenteByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return getConsulenteByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Consulente loadConsulenteByORMID(PersistentSession session, int ID) {
		try {
			return (Consulente) session.load(timelogger.domain.Consulente.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Consulente getConsulenteByORMID(PersistentSession session, int ID) {
		try {
			return (Consulente) session.get(timelogger.domain.Consulente.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Consulente loadConsulenteByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Consulente) session.load(timelogger.domain.Consulente.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Consulente getConsulenteByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Consulente) session.get(timelogger.domain.Consulente.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Consulente[] listConsulenteByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return listConsulenteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Consulente[] listConsulenteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return listConsulenteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Consulente[] listConsulenteByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From timelogger.domain.Consulente as Consulente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Consulente[]) list.toArray(new Consulente[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Consulente[] listConsulenteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From timelogger.domain.Consulente as Consulente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Consulente[]) list.toArray(new Consulente[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Consulente loadConsulenteByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return loadConsulenteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Consulente loadConsulenteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return loadConsulenteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Consulente loadConsulenteByQuery(PersistentSession session, String condition, String orderBy) {
		Consulente[] consulentes = listConsulenteByQuery(session, condition, orderBy);
		if (consulentes != null && consulentes.length > 0)
			return consulentes[0];
		else
			return null;
	}
	
	public static Consulente loadConsulenteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Consulente[] consulentes = listConsulenteByQuery(session, condition, orderBy, lockMode);
		if (consulentes != null && consulentes.length > 0)
			return consulentes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateConsulenteByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return iterateConsulenteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static java.util.Iterator iterateConsulenteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return iterateConsulenteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static java.util.Iterator iterateConsulenteByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From timelogger.domain.Consulente as Consulente");
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
	
	public static java.util.Iterator iterateConsulenteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From timelogger.domain.Consulente as Consulente");
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
	
	public static Consulente createConsulente() {
		return new timelogger.domain.Consulente();
	}
	
	public static Consulente loadConsulenteByCriteria(ConsulenteCriteria consulenteCriteria) {
		Consulente[] consulentes = listConsulenteByCriteria(consulenteCriteria);
		if(consulentes == null || consulentes.length == 0) {
			return null;
		}
		return consulentes[0];
	}
	
	public static Consulente[] listConsulenteByCriteria(ConsulenteCriteria consulenteCriteria) {
		return consulenteCriteria.listConsulente();
	}
}
