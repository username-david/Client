package ClientManagement.Util;

import java.util.Calendar;
import java.util.Date;

public class DateValidation {

	public static int isFutureDate(Date date) {

		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);

		Date currentDate = calendar.getTime();
		if (date.after(currentDate)) {
			return 1;
		}
		return 0;
	}
}
