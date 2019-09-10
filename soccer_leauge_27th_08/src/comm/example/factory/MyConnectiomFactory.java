package comm.example.factory;

import java.sql.Connection;
import java.sql.SQLException;

import javax.activation.DataSource;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.naming.Context;

public class MyConnectiomFactory {
	private static javax.sql.DataSource dataSource=null;
	private static Connection connection=null;
	
	public static Connection getMySqlConnectionForHR()
	{
		try {
			
			
			Context initContext = new InitialContext();
			Object o  = initContext.lookup("java:/comp/env/jdbc/mysql");
			dataSource=(javax.sql.DataSource)o;
			
			 connection= dataSource.getConnection();
			
		} catch (NamingException ne) {
			ne.printStackTrace();
			
		} catch (SQLException se) {
			// TODO Auto-generated catch block
			se.printStackTrace();
		}
		return connection;
	}
	
	
}