package ClientManagement.Dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityDao<T> {
	
	public List<T> getAll();
}
