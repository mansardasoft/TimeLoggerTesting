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

public class FatturaParzialeFactory {
	public static FatturaParziale loadFatturaParzialeByORMID(int ID) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return loadFatturaParzialeByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static FatturaParziale getFatturaParzialeByORMID(int ID) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return getFatturaParzialeByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static FatturaParziale loadFatturaParzialeByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return loadFatturaParzialeByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static FatturaParziale getFatturaParzialeByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return getFatturaParzialeByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static FatturaParziale loadFatturaParzialeByORMID(PersistentSession session, int ID) {
		try {
			return (FatturaParziale) session.load(timelogger.domain.FatturaParziale.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static FatturaParziale getFatturaParzialeByORMID(PersistentSession session, int ID) {
		try {
			return (FatturaParziale) session.get(timelogger.domain.FatturaParziale.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static FatturaParziale loadFatturaParzialeByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (FatturaParziale) session.load(timelogger.domain.FatturaParziale.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static FatturaParziale getFatturaParzialeByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (FatturaParziale) session.get(timelogger.domain.FatturaParziale.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static FatturaParziale[] listFatturaParzialeByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return listFatturaParzialeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static FatturaParziale[] listFatturaParzialeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return listFatturaParzialeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static FatturaParziale[] listFatturaParzialeByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From timelogger.domain.FatturaParziale as FatturaParziale");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (FatturaParziale[]) list.toArray(new FatturaParziale[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static FatturaParziale[] listFatturaParzialeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From timelogger.domain.FatturaParziale as FatturaParziale");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (FatturaParziale[]) list.toArray(new FatturaParziale[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static FatturaParziale loadFatturaParzialeByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return loadFatturaParzialeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static FatturaParziale loadFatturaParzialeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return loadFatturaParzialeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static FatturaParziale loadFatturaParzialeByQuery(PersistentSession session, String condition, String orderBy) {
		FatturaParziale[] fatturaParziales = listFatturaParzialeByQuery(session, condition, orderBy);
		if (fatturaParziales != null && fatturaParziales.length > 0)
			return fatturaParziales[0];
		else
			return null;
	}
	
	public static FatturaParziale loadFatturaParzialeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		FatturaParziale[] fatturaParziales = listFatturaParzialeByQuery(session, condition, orderBy, lockMode);
		if (fatturaParziales != null && fatturaParziales.length > 0)
			return fatturaParziales[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateFatturaParzialeByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return iterateFatturaParzialeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static java.util.Iterator iterateFatturaParzialeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return iterateFatturaParzialeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static java.util.Iterator iterateFatturaParzialeByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From timelogger.domain.FatturaParziale as FatturaParziale");
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
	
	public static java.util.Iterator iterateFatturaParzialeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From timelogger.domain.FatturaParziale as FatturaParziale");
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
	
	public static FatturaParziale createFatturaParziale() {
		return new timelogger.domain.FatturaParziale();
	}
	
	public static FatturaParziale loadFatturaParzialeByCriteria(FatturaParzialeCriteria fatturaParzialeCriteria) {
		FatturaParziale[] fatturaParziales = listFatturaParzialeByCriteria(fatturaParzialeCriteria);
		if(fatturaParziales == null || fatturaParziales.length == 0) {
			return null;
		}
		return fatturaParziales[0];
	}
	
	public static FatturaParziale[] listFatturaParzialeByCriteria(FatturaParzialeCriteria fatturaParzialeCriteria) {
		return fatturaParzialeCriteria.listFatturaParziale();
	}
}
