package ClientManagement.Dto;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Repository;

import ClientManagement.Dao.ClientDao;
import ClientManagement.Dao.CountryDao;
import ClientManagement.Dao.GenderDao;
import ClientManagement.Dao.MaritalDao;
import ClientManagement.Entity.Client;
import ClientManagement.Entity.Country;
import ClientManagement.Entity.Gender;
import ClientManagement.Entity.MaritalStatus;

@Repository
public class ClientDto {
	
	@Autowired
	GenderDao genderDao;
	@Autowired
	MaritalDao maritalDao;
	@Autowired
	CountryDao countryDao;

	private String clientID;
	private String firstName;
	private String lastName;
	private String gender;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateOfBirth;
	private String identityNumber;
	private String marital;
	private String address;
	private String country;

	public ClientDto() {
		super();
	}

	public ClientDto castToClientDto(Client client) {

		ClientDto clientDto = new ClientDto();

		clientDto.setClientID(client.getClientID());
		clientDto.setFirstName(client.getFirstName());
		clientDto.setLastName(client.getLastName());
		clientDto.setGender(getGender(client.getGenderId()));
		clientDto.setDateOfBirth(client.getDateOfBirth());
		clientDto.setIdentityNumber(client.getIdentityNumber());
		clientDto.setMarital(getMaritalStatus(client.getMaritalId()));
		clientDto.setAddress(client.getAddress());
		clientDto.setCountry(getCountry(client.getCountryId()));

		return clientDto;
	}

	public String getGender(int genderId) {

		List<Gender> genders = genderDao.getAll();

		for (Gender item : genders) {
			if (item.getId() == genderId)
				return item.getGender();
		}
		return null;
	}

	public String getMaritalStatus(int maritalStatusId) {
		
		List<MaritalStatus> maritals = maritalDao.getAll();

		for (MaritalStatus item : maritals) {
			if (item.getId() == maritalStatusId)
				return item.getMaritalStatus();
		}
		return null;
	}

	public String getCountry(int countryId) {

		List<Country> countries = countryDao.getAll();

		for (Country item : countries) {
			if (item.getId() == countryId)
				return item.getCountry();
		}
		return null;
	}

	public String getClientID() {
		return clientID;
	}

	public void setClientID(String clientID) {
		this.clientID = clientID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public String getMarital() {
		return marital;
	}

	public void setMarital(String marital) {
		this.marital = marital;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
