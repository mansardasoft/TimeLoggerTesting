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

public class TimeRecordListCollection extends org.orm.util.ORMList {
	public TimeRecordListCollection(Object owner, org.orm.util.ORMAdapter adapter, int ownerKey, int targetKey, int collType) {
		super(owner, adapter, ownerKey, targetKey, true, collType);
	}
	
	public TimeRecordListCollection(Object owner, org.orm.util.ORMAdapter adapter, int ownerKey, int collType) {
		super(owner, adapter, ownerKey, -1, false, collType);
	}
	
	/**
	* Return an iterator over the persistent objects
	* @return The persisten objects iterator
	*/
	public java.util.Iterator getIterator() {
		return super.getIterator(_ownerAdapter);
	}
	
	/**
	 * Add the specified persistent object to ORMList
	 * @param value the persistent object
	 */
	public void add(TimeRecord value) {
		if (value != null) {
			super.add(value, value._ormAdapter);
		}
	}
	
	/**
	 * Remove the specified persistent object from ORMList
	 * @param value the persistent object
	 */
	public void remove(TimeRecord value) {
		super.remove(value, value._ormAdapter);
	}
	
	/**
	 * Return true if ORMList contains the specified persistent object
	 * @param value the persistent object
	 * @return True if this contains the specified persistent object
	 */
	public boolean contains(TimeRecord value) {
		return super.contains(value);
	}
	
	/**
	 * Return an array containing all of the persistent objects in ORMList
	 * @return The persistent objects array
	 */
	public TimeRecord[] toArray() {
		return (TimeRecord[]) super.toArray(new TimeRecord[size()]);
	}
	
	/**
	 * Return an sorted array containing all of the persistent objects in ORMList
	 * @param propertyName Name of the property for sorting:<ul>
	 * <li>ID</li>
	 * <li>inizio</li>
	 * <li>fine</li>
	 * <li>commento</li>
	 * <li>fatturato</li>
	 * </ul>
	 * @return The persistent objects sorted array
	 */
	public TimeRecord[] toArray(String propertyName) {
		return toArray(propertyName, true);
	}
	
	/**
	 * Return an sorted array containing all of the persistent objects in ORMList
	 * @param propertyName Name of the property for sorting:<ul>
	 * <li>ID</li>
	 * <li>inizio</li>
	 * <li>fine</li>
	 * <li>commento</li>
	 * <li>fatturato</li>
	 * </ul>
	 * @param ascending true for ascending, false for descending
	 * @return The persistent objects sorted array
	 */
	public TimeRecord[] toArray(String propertyName, boolean ascending) {
		return (TimeRecord[]) super.toArray(new TimeRecord[size()], propertyName, ascending);
	}
	
	/**
	 * Return the persistent object at the specified position in ORMList.
	 * @param index - The specified position
	 * @return - The persistent object
	 */
	public TimeRecord get(int index) {
		return (TimeRecord) super.getImpl(index);
	}
	
	/**
	 * Remove the persistent object at the specified position in ORMList.
	 * @param index The specified position
	 * @return Removed persistent object
	 */
	public TimeRecord remove(int index) {
		TimeRecord value = get(index);
		if (value != null) {
			return (TimeRecord) super.removeImpl(index, value._ormAdapter);
		}
		return null;
	}
	
	/**
	 * Insert the specified persistent object at the specified position in ORMList.
	 * @param index The specified position
	 * @param value The specified persistent object
	 */
	public void add(int index, TimeRecord value) {
		if (value != null) {
			super.add(index, value, value._ormAdapter);
		}
	}
	
	/**
	 * Find the specified position of specified persistent object ORMList.
	 * @param value The persistent object
	 */
	public int indexOf(TimeRecord value) {
		return super.indexOf(value);
	}
	
	/**
	 * Replace the persistent object at the specified position in ORMList with the specified persistent object.
	 * @param index The specified position
	 * @param value The persistent object
	 * @return Return replaced object
	 */
	public TimeRecord set(int index, TimeRecord value) {
		return (TimeRecord) super.set(index, value);
	}
	
	protected PersistentManager getPersistentManager() throws PersistentException {
		return timelogger.domain.TimeloggerPersistentManager.instance();
	}
	
}

