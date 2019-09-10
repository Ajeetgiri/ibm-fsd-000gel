package comm.example.spring;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class Jtemplate extends JdbcTemplate {
	
	@Autowired
	private DataSource dataSource;
	
	@PostConstruct
	public void Setter() {
		setDataSource(dataSource);
	}
	

}
