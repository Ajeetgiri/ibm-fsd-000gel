package i_O_Stream_Fudamental;

import java.io.IOException;

public class Etest {
	public static void main(String[] args) {
	AddEmployee_using_io s1 = new AddEmployee_using_io();
	
try {
	s1.AddEmployee("Ajeet.txt");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}