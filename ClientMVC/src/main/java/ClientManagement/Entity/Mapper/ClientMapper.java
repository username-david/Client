package ClientManagement.Entity.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ClientManagement.Entity.Client;

public class ClientMapper implements RowMapper<Client> {

	public Client mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Client client = new Client();

		client.setClientID(rs.getString("Client Number"));
		client.setFirstName(rs.getString("First Name"));
		client.setLastName(rs.getString("Last Name"));
		client.setGenderId(rs.getInt("Gender_id"));
		client.setDateOfBirth(rs.getDate("Date of Birth"));
		client.setIdentityNumber(rs.getString("Indentity Number"));
		client.setMaritalId(rs.getInt("Marital_id"));
		client.setAddress(rs.getString("Address"));
		client.setCountryId(rs.getInt("Country_id"));

		return client;
	}

}
