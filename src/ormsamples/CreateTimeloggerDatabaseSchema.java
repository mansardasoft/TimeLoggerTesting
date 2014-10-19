/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class CreateTimeloggerDatabaseSchema {
	public static void main(String[] args) {
		try {
            System.out.println("Starting");
			ORMDatabaseInitiator.createSchema(timelogger.domain.TimeloggerPersistentManager.instance());
			timelogger.domain.TimeloggerPersistentManager.instance().disposePersistentManager();
            System.out.println("Done");
		}
		catch (Exception e) {
            System.out.println("Error");
			e.printStackTrace();
		}
	}
}
