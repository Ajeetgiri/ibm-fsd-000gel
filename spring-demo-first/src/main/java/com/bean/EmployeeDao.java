package com.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

public class EmployeeDao {
private DataSource dataSource;
	
	
	public DataSource getDataSource() {
		return dataSource;
	}


	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}


	
	
	public void createEmployee(Employee employee)
	{
		try {
			Connection connection=dataSource.getConnection();
			PreparedStatement pst=connection.prepareStatement("insert into employe1(name) values(?)");
			pst.setString(1, employee.getFirstName());
			pst.executeUpdate();
			System.out.println("inseerted..!");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
		public void ViewEmployee() throws SQLException {
			Connection connection =dataSource.getConnection();
			PreparedStatement pst= connection.prepareStatement("select *from employe1");
			ResultSet resultset =pst.executeQuery();
			while(resultset.next()) {
				System.out.println("ID :" + resultset.getInt(1)+""+ " Name: "+ resultset.getString(2) );
			}
		}
		public void DeleteData(int id) throws SQLException {
			Connection connection =dataSource.getConnection();
			PreparedStatement pst= connection.prepareStatement("delete from employe1 where id=(?)");
			pst.setInt(1,id);
			pst.executeUpdate();
			ViewEmployee();
			
		}
		public void UpdateData(String name ,int id) throws SQLException {
			Connection connection =dataSource.getConnection();
			PreparedStatement pst= connection.prepareStatement("update employe1 set name=(?) where id=(?) ");
			pst.setString(1,name);
			pst.setInt(2,id);
			pst.executeUpdate();
			ViewEmployee();

}}