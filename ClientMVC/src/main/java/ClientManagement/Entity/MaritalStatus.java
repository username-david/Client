package ClientManagement.Entity;

public class MaritalStatus extends BaseEntity {
	
	private String maritalStatus;
	private String maritalSymbol;
	
	public MaritalStatus() {
		super();
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getMaritalSymbol() {
		return maritalSymbol;
	}

	public void setMaritalSymbol(String maritalSymbol) {
		this.maritalSymbol = maritalSymbol;
	}
	
	
	
}
