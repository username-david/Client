package ClientManagement.Service;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ClientManagement.Dao.CountryDao;
import ClientManagement.Dao.GenderDao;
import ClientManagement.Dao.MaritalDao;
import ClientManagement.Entity.Country;
import ClientManagement.Entity.Gender;
import ClientManagement.Entity.MaritalStatus;

@Service
public class HomeService {
	
	@Autowired
	private GenderDao genderDao;
	@Autowired
	private CountryDao countryDao;
	@Autowired
	private MaritalDao maritalDao;
	
	public List<Country> getAllCountries() throws ParseException {
		return countryDao.getAll();
	}
	
	public List<Gender> getAllGenders() throws ParseException {
		return genderDao.getAll();
	}
	
	public List<MaritalStatus> getAllMaritalStatus() throws ParseException {
		return maritalDao.getAll();
	}
}
