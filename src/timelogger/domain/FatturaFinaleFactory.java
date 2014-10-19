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

public class FatturaFinaleFactory {
	public static FatturaFinale loadFatturaFinaleByORMID(int ID) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return loadFatturaFinaleByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static FatturaFinale getFatturaFinaleByORMID(int ID) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return getFatturaFinaleByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static FatturaFinale loadFatturaFinaleByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return loadFatturaFinaleByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static FatturaFinale getFatturaFinaleByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return getFatturaFinaleByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static FatturaFinale loadFatturaFinaleByORMID(PersistentSession session, int ID) {
		try {
			return (FatturaFinale) session.load(timelogger.domain.FatturaFinale.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static FatturaFinale getFatturaFinaleByORMID(PersistentSession session, int ID) {
		try {
			return (FatturaFinale) session.get(timelogger.domain.FatturaFinale.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static FatturaFinale loadFatturaFinaleByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (FatturaFinale) session.load(timelogger.domain.FatturaFinale.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static FatturaFinale getFatturaFinaleByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (FatturaFinale) session.get(timelogger.domain.FatturaFinale.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static FatturaFinale[] listFatturaFinaleByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return listFatturaFinaleByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static FatturaFinale[] listFatturaFinaleByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return listFatturaFinaleByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static FatturaFinale[] listFatturaFinaleByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From timelogger.domain.FatturaFinale as FatturaFinale");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (FatturaFinale[]) list.toArray(new FatturaFinale[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static FatturaFinale[] listFatturaFinaleByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From timelogger.domain.FatturaFinale as FatturaFinale");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (FatturaFinale[]) list.toArray(new FatturaFinale[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static FatturaFinale loadFatturaFinaleByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return loadFatturaFinaleByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static FatturaFinale loadFatturaFinaleByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return loadFatturaFinaleByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static FatturaFinale loadFatturaFinaleByQuery(PersistentSession session, String condition, String orderBy) {
		FatturaFinale[] fatturaFinales = listFatturaFinaleByQuery(session, condition, orderBy);
		if (fatturaFinales != null && fatturaFinales.length > 0)
			return fatturaFinales[0];
		else
			return null;
	}
	
	public static FatturaFinale loadFatturaFinaleByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		FatturaFinale[] fatturaFinales = listFatturaFinaleByQuery(session, condition, orderBy, lockMode);
		if (fatturaFinales != null && fatturaFinales.length > 0)
			return fatturaFinales[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateFatturaFinaleByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return iterateFatturaFinaleByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static java.util.Iterator iterateFatturaFinaleByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return iterateFatturaFinaleByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static java.util.Iterator iterateFatturaFinaleByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From timelogger.domain.FatturaFinale as FatturaFinale");
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
	
	public static java.util.Iterator iterateFatturaFinaleByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From timelogger.domain.FatturaFinale as FatturaFinale");
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
	
	public static FatturaFinale createFatturaFinale() {
		return new timelogger.domain.FatturaFinale();
	}
	
	public static FatturaFinale loadFatturaFinaleByCriteria(FatturaFinaleCriteria fatturaFinaleCriteria) {
		FatturaFinale[] fatturaFinales = listFatturaFinaleByCriteria(fatturaFinaleCriteria);
		if(fatturaFinales == null || fatturaFinales.length == 0) {
			return null;
		}
		return fatturaFinales[0];
	}
	
	public static FatturaFinale[] listFatturaFinaleByCriteria(FatturaFinaleCriteria fatturaFinaleCriteria) {
		return fatturaFinaleCriteria.listFatturaFinale();
	}
}
