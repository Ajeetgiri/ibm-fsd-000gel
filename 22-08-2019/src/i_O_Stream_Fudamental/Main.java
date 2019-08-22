package i_O_Stream_Fudamental;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String a0,a1,a2;
		if(args.length!=3) {
			a0="Ajeet.txt";
			a1="Giri.txt";
			a2="0";
		}else {
			a0=args[0];
			a1=args[1];
			a2=args[2];
			
			
			
		}

	
	Encrptying s = new Encrptying();
	System.out.println("Displaying the content");
	s.encrpt(a0, a1, Integer.parseInt(a2));
	s.viewFileContent(a1);
}
}