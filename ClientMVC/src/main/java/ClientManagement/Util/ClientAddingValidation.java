package ClientManagement.Util;

public class ClientAddingValidation {

	public static boolean isAbleToAdd(int isFututeDate, int isUsedID) {
		if (isFututeDate == 1 || isUsedID == 1) {
			return false;
		} else {
			return true;
		}
	}
}
