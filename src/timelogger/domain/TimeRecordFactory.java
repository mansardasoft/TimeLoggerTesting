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

public class TimeRecordFactory {
	public static TimeRecord loadTimeRecordByORMID(int ID) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return loadTimeRecordByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static TimeRecord getTimeRecordByORMID(int ID) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return getTimeRecordByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static TimeRecord loadTimeRecordByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return loadTimeRecordByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static TimeRecord getTimeRecordByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return getTimeRecordByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static TimeRecord loadTimeRecordByORMID(PersistentSession session, int ID) {
		try {
			return (TimeRecord) session.load(timelogger.domain.TimeRecord.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static TimeRecord getTimeRecordByORMID(PersistentSession session, int ID) {
		try {
			return (TimeRecord) session.get(timelogger.domain.TimeRecord.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static TimeRecord loadTimeRecordByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (TimeRecord) session.load(timelogger.domain.TimeRecord.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static TimeRecord getTimeRecordByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (TimeRecord) session.get(timelogger.domain.TimeRecord.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static TimeRecord[] listTimeRecordByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return listTimeRecordByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static TimeRecord[] listTimeRecordByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return listTimeRecordByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static TimeRecord[] listTimeRecordByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From timelogger.domain.TimeRecord as TimeRecord");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (TimeRecord[]) list.toArray(new TimeRecord[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static TimeRecord[] listTimeRecordByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From timelogger.domain.TimeRecord as TimeRecord");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (TimeRecord[]) list.toArray(new TimeRecord[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static TimeRecord loadTimeRecordByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return loadTimeRecordByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static TimeRecord loadTimeRecordByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return loadTimeRecordByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static TimeRecord loadTimeRecordByQuery(PersistentSession session, String condition, String orderBy) {
		TimeRecord[] timeRecords = listTimeRecordByQuery(session, condition, orderBy);
		if (timeRecords != null && timeRecords.length > 0)
			return timeRecords[0];
		else
			return null;
	}
	
	public static TimeRecord loadTimeRecordByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		TimeRecord[] timeRecords = listTimeRecordByQuery(session, condition, orderBy, lockMode);
		if (timeRecords != null && timeRecords.length > 0)
			return timeRecords[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTimeRecordByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return iterateTimeRecordByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static java.util.Iterator iterateTimeRecordByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = timelogger.domain.TimeloggerPersistentManager.instance().getSession();
			return iterateTimeRecordByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static java.util.Iterator iterateTimeRecordByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From timelogger.domain.TimeRecord as TimeRecord");
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
	
	public static java.util.Iterator iterateTimeRecordByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From timelogger.domain.TimeRecord as TimeRecord");
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
	
	public static TimeRecord createTimeRecord() {
		return new timelogger.domain.TimeRecord();
	}
	
	public static TimeRecord loadTimeRecordByCriteria(TimeRecordCriteria timeRecordCriteria) {
		TimeRecord[] timeRecords = listTimeRecordByCriteria(timeRecordCriteria);
		if(timeRecords == null || timeRecords.length == 0) {
			return null;
		}
		return timeRecords[0];
	}
	
	public static TimeRecord[] listTimeRecordByCriteria(TimeRecordCriteria timeRecordCriteria) {
		return timeRecordCriteria.listTimeRecord();
	}
}
