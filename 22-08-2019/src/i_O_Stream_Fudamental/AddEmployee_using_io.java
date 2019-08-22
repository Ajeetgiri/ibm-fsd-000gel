package i_O_Stream_Fudamental;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.sql.SQLException;

import jdbc.Employee;
import jdbc.EmployeeServiceImpl;

public class AddEmployee_using_io {
	private BufferedReader reader;
	private Buffer writer;
	static String [] st = new String[4];
	
	public void AddEmployee(String source) throws IOException {
		
		try {
			reader = new BufferedReader(new FileReader(source));
			EmployeeServiceImpl s1= new EmployeeServiceImpl();
			String s =reader.readLine();
			while(s!=null) {
			
			st=s.split("\\s");
			System.out.println(st [0]+""+st [1]+""+st [2]+""+st [3]);
			s1.createEmployee(new Employee(Integer.parseInt(st[0]),st[1],st[2],st[3]));
			s = reader.readLine();}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
