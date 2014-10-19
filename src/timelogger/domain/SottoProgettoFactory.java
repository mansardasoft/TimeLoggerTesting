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

public class SottoProgettoFactory {
	public static SottoProgetto loadSottoProgettoByORMID(int ID) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return loadSottoProgettoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static SottoProgetto getSottoProgettoByORMID(int ID) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return getSottoProgettoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static SottoProgetto loadSottoProgettoByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return loadSottoProgettoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static SottoProgetto getSottoProgettoByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return getSottoProgettoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static SottoProgetto loadSottoProgettoByORMID(PersistentSession session, int ID) {
		try {
			return (SottoProgetto) session.load(timelogger.domain.SottoProgetto.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static SottoProgetto getSottoProgettoByORMID(PersistentSession session, int ID) {
		try {
			return (SottoProgetto) session.get(timelogger.domain.SottoProgetto.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static SottoProgetto loadSottoProgettoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (SottoProgetto) session.load(timelogger.domain.SottoProgetto.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static SottoProgetto getSottoProgettoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (SottoProgetto) session.get(timelogger.domain.SottoProgetto.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static SottoProgetto[] listSottoProgettoByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return listSottoProgettoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static SottoProgetto[] listSottoProgettoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return listSottoProgettoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static SottoProgetto[] listSottoProgettoByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From timelogger.domain.SottoProgetto as SottoProgetto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (SottoProgetto[]) list.toArray(new SottoProgetto[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static SottoProgetto[] listSottoProgettoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From timelogger.domain.SottoProgetto as SottoProgetto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (SottoProgetto[]) list.toArray(new SottoProgetto[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static SottoProgetto loadSottoProgettoByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return loadSottoProgettoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static SottoProgetto loadSottoProgettoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return loadSottoProgettoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static SottoProgetto loadSottoProgettoByQuery(PersistentSession session, String condition, String orderBy) {
		SottoProgetto[] sottoProgettos = listSottoProgettoByQuery(session, condition, orderBy);
		if (sottoProgettos != null && sottoProgettos.length > 0)
			return sottoProgettos[0];
		else
			return null;
	}
	
	public static SottoProgetto loadSottoProgettoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		SottoProgetto[] sottoProgettos = listSottoProgettoByQuery(session, condition, orderBy, lockMode);
		if (sottoProgettos != null && sottoProgettos.length > 0)
			return sottoProgettos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateSottoProgettoByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return iterateSottoProgettoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static java.util.Iterator iterateSottoProgettoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return iterateSottoProgettoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static java.util.Iterator iterateSottoProgettoByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From timelogger.domain.SottoProgetto as SottoProgetto");
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
	
	public static java.util.Iterator iterateSottoProgettoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From timelogger.domain.SottoProgetto as SottoProgetto");
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
	
	public static SottoProgetto createSottoProgetto() {
		return new timelogger.domain.SottoProgetto();
	}
	
	public static SottoProgetto loadSottoProgettoByCriteria(SottoProgettoCriteria sottoProgettoCriteria) {
		SottoProgetto[] sottoProgettos = listSottoProgettoByCriteria(sottoProgettoCriteria);
		if(sottoProgettos == null || sottoProgettos.length == 0) {
			return null;
		}
		return sottoProgettos[0];
	}
	
	public static SottoProgetto[] listSottoProgettoByCriteria(SottoProgettoCriteria sottoProgettoCriteria) {
		return sottoProgettoCriteria.listSottoProgetto();
	}
}
