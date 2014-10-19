package timelogger.utilities;

import java.util.Date;

public interface Converter {

	/**
	 * 
	 * @param date
	 * @return 
	 */
	abstract Date toDate(String date);
}