package ClientManagement.Entity.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ClientManagement.Entity.MaritalStatus;

public class MaritalStatusMapper implements RowMapper<MaritalStatus> {
	public MaritalStatus mapRow(ResultSet rs, int rowNum) throws SQLException {

		MaritalStatus maritalStatus = new MaritalStatus();

		maritalStatus.setId(rs.getInt("id"));
		maritalStatus.setMaritalStatus(rs.getString("Marital Status"));
		maritalStatus.setMaritalSymbol(rs.getString("Marital Symbol"));

		return maritalStatus;
	}
}
