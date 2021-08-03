package ClientManagement.Entity.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ClientManagement.Entity.Gender;

public class GenderMapper implements RowMapper<Gender> {
	
	public Gender mapRow(ResultSet rs, int rowNum) throws SQLException {

		Gender gender = new Gender();

		gender.setId(rs.getInt("id"));
		gender.setGender(rs.getString("Gender"));
		gender.setGenderSymbol(rs.getString("Gender Symbol"));

		return gender;
	}
}
