package list;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.xdevapi.Statement;

public class jdbcDemo {
	private static Properties properties = null;
	static {
		properties = new Properties();
		properties.put("JDBC_URL", "jdbc:mysql://localhost:3306/student");
		properties.put("USER", "root");
		properties.put("PASSWORD", "ajeet");
	}

	public jdbcDemo() {
		super();
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Connection connection = DriverManager.getConnection(properties.getProperty("JDBC_URL"),
				properties.getProperty("USER"), properties.getProperty("PASSWORD"));
		java.sql.Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from student");
		System.out.println("ID Name Address");
		while (resultSet.next()) {
			// System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " +
			// resultSet.getString(3));
			System.out.printf("\n%d %s %s", resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3));
		}

	}
}
