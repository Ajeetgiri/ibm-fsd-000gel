package comm.example.spring;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

public class StudentDAO {
	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void createStudent(Student student) {
		try {
			Connection connection = dataSource.getConnection();
			PreparedStatement pst = connection
					.prepareStatement("insert into student1(firstname,lastname,country,language) values(?,?,?,?)");
			pst.setString(1, student.getFirstName());
			pst.setString(2, student.getLastname());
			pst.setString(3, student.getCountry());
			pst.setString(4, student.getFavoriteLanguage());

			pst.executeUpdate();
			System.out.println("inserted..!");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
