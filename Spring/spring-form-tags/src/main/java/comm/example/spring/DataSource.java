package comm.example.spring;

import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

import org.apache.commons.dbcp.BasicDataSource;

public class DataSource extends BasicDataSource {

	public void Setter() {
		setUsername("root");
		setUrl("jdbc:mysql://localhost:3306/employee");
		setPassword("ajeet");
		setDriverClassName("com.mysql.jdbc.Driver");
	}
}
