package ClientManagement.Entity;

public class Country extends BaseEntity {
	
	private String country;
	private String countrySymbol;

	
	public Country() {
		super();
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountrySymbol() {
		return countrySymbol;
	}

	public void setCountrySymbol(String countrySymbol) {
		this.countrySymbol = countrySymbol;
	}

}
