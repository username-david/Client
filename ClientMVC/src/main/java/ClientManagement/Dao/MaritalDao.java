package ClientManagement.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ClientManagement.Entity.MaritalStatus;
import ClientManagement.Entity.Mapper.MaritalStatusMapper;

@Repository
public class MaritalDao implements EntityDao<MaritalStatus> {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<MaritalStatus> getAll() {

		List<MaritalStatus> maritalList = new ArrayList<MaritalStatus>();
		String sqlQuery = "select * from MaritalStatus";

		maritalList = jdbcTemplate.query(sqlQuery.toString(), new MaritalStatusMapper());
		return maritalList;
	}
}
