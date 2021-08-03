package ClientManagement.Entity.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ClientManagement.Entity.Country;

public class CountryMapper implements RowMapper<Country> {

	public Country mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Country country = new Country();

		country.setId(rs.getInt("id"));
		country.setCountry(rs.getString("Country"));
		country.setCountrySymbol(rs.getString("Country Symbol"));
		
		return country;
	}

}
