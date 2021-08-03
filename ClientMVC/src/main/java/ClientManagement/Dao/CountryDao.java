package ClientManagement.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import ClientManagement.Entity.Country;
import ClientManagement.Entity.Mapper.CountryMapper;

@Repository
public class CountryDao implements EntityDao<Country> {
	
	@Autowired
	public JdbcTemplate jdbcTemplate;

	public List<Country> getAll() {

		List<Country> countryList = new ArrayList<Country>();
		String sqlQuery = "select * from Country";

		countryList = jdbcTemplate.query(sqlQuery, new CountryMapper());
		return countryList;
	}
}
