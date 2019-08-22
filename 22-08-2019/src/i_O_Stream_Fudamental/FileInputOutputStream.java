package i_O_Stream_Fudamental;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStream {
	public static void main(String[] args) throws IOException {
	File inputFile =new File("Ajeet.txt");
	File outputFile =new File("Giri.txt");
	FileInputStream in = new FileInputStream(inputFile);
	FileOutputStream out = new FileOutputStream(inputFile);
	int c;
	
while ((c=in.read())!=-1){
	System.out.println(c);
	out.write(c);
	
}
System.out.println("FileInputStream is used to read the file");
in.close();
out.close();
}

}
