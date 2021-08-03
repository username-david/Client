package ClientManagement.Entity;

public class Gender extends BaseEntity {
	
	private String gender;
	private String genderSymbol;
	
	
	public Gender() {
		super();
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGenderSymbol() {
		return genderSymbol;
	}
	public void setGenderSymbol(String genderSymbol) {
		this.genderSymbol = genderSymbol;
	}
	
}
