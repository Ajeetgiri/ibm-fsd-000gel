package Swing;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jdbc.MyConnectionFactory;

public class RS2XMLCConfig {
	private MyConnectionFactory factory;
	public Connection connection;
	public RS2XMLCConfig() throws SQLException {
		factory = MyConnectionFactory.createObject();
		connection =factory.getConnection();
	}
	public ResultSet getAllEmployee() throws SQLException {
		Statement st =connection.createStatement();
		ResultSet rs = st.executeQuery("select * from employee");
		return rs;
		
	}

}
