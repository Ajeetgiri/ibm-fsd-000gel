package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public abstract class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee employee = new Employee("10",2000,"Ajeet","MP");
		System.out.println("Employee to write"+employee);
		FileOutputStream out = null;
		try {
			out = new FileOutputStream("employee.out");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ObjectOutputStream oos = new ObjectOutputStream(out);
		try {
			oos.writeObject(employee);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			oos.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("Problem Serializing"+e);
		FileInputStream in = null;
		try {
			in = new FileInputStream("employee.out");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ObjectInputStream ois = new ObjectInputStream(in);
		ois.readObject();
		
	}

	}


