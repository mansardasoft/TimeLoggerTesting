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

public class FatturaFactory {
	public static Fattura loadFatturaByORMID(int ID) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return loadFatturaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Fattura getFatturaByORMID(int ID) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return getFatturaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Fattura loadFatturaByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return loadFatturaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Fattura getFatturaByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return getFatturaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Fattura loadFatturaByORMID(PersistentSession session, int ID) {
		try {
			return (Fattura) session.load(timelogger.domain.Fattura.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Fattura getFatturaByORMID(PersistentSession session, int ID) {
		try {
			return (Fattura) session.get(timelogger.domain.Fattura.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Fattura loadFatturaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Fattura) session.load(timelogger.domain.Fattura.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Fattura getFatturaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Fattura) session.get(timelogger.domain.Fattura.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Fattura[] listFatturaByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return listFatturaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Fattura[] listFatturaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return listFatturaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Fattura[] listFatturaByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From timelogger.domain.Fattura as Fattura");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Fattura[]) list.toArray(new Fattura[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Fattura[] listFatturaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From timelogger.domain.Fattura as Fattura");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Fattura[]) list.toArray(new Fattura[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Fattura loadFatturaByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return loadFatturaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Fattura loadFatturaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return loadFatturaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Fattura loadFatturaByQuery(PersistentSession session, String condition, String orderBy) {
		Fattura[] fatturas = listFatturaByQuery(session, condition, orderBy);
		if (fatturas != null && fatturas.length > 0)
			return fatturas[0];
		else
			return null;
	}
	
	public static Fattura loadFatturaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Fattura[] fatturas = listFatturaByQuery(session, condition, orderBy, lockMode);
		if (fatturas != null && fatturas.length > 0)
			return fatturas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateFatturaByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return iterateFatturaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static java.util.Iterator iterateFatturaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return iterateFatturaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static java.util.Iterator iterateFatturaByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From timelogger.domain.Fattura as Fattura");
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
	
	public static java.util.Iterator iterateFatturaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From timelogger.domain.Fattura as Fattura");
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
	
	public static Fattura createFattura() {
		return new timelogger.domain.Fattura();
	}
	
	public static Fattura loadFatturaByCriteria(FatturaCriteria fatturaCriteria) {
		Fattura[] fatturas = listFatturaByCriteria(fatturaCriteria);
		if(fatturas == null || fatturas.length == 0) {
			return null;
		}
		return fatturas[0];
	}
	
	public static Fattura[] listFatturaByCriteria(FatturaCriteria fatturaCriteria) {
		return fatturaCriteria.listFattura();
	}
}
