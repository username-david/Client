package ClientManagement.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import ClientManagement.Entity.Gender;
import ClientManagement.Entity.Mapper.GenderMapper;

@Repository
public class GenderDao implements EntityDao<Gender> {

	@Autowired
	public JdbcTemplate jdbcTemplate;

	public List<Gender> getAll() {

		List<Gender> genderList = new ArrayList<Gender>();
		String sqlQuery = "select * from Gender";

		genderList = jdbcTemplate.query(sqlQuery, new GenderMapper());
		return genderList;
	}
}
