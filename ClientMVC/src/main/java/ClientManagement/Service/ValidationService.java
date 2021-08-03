package ClientManagement.Service;

import java.util.Date;

import ClientManagement.Util.DateValidation;
import ClientManagement.Util.IDValidation;

public class ValidationService {

	public static int checkIDNumber(String idNumber) {
		return IDValidation.checkIDNumber(idNumber);
	}

	public static int compareWithCurrentDate(Date date) {
		return DateValidation.compareWithCurrentDate(date);
	}
}
