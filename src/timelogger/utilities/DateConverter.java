package timelogger.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;


public class DateConverter extends SimpleDateFormat implements Converter {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7966866340344338861L;

	public DateConverter() {
		this.applyPattern("yyMMddHHmmss");
		
	}

	public Date toDate(String stringdate) {
		Date turnback=new Date();
		try{
			turnback=super.parse(stringdate);
		}
		catch (Exception e)
		{
			
		}
		return turnback;
	}
}