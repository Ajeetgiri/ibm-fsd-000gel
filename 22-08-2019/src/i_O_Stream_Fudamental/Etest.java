package i_O_Stream_Fudamental;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import serialization.Employee;

public class Etest {
	public static void main(String[] args) throws IOException {
	AddEmployee_using_io s1 = new AddEmployee_using_io();
	
try {
	s1.AddEmployee("Ajeet.txt");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}
}