package comm.example;

public class AddArg {

	public static void main(String[] args) {
		int sum =0;
		for (String a:args) {
			try {
            sum+=Integer.parseInt(a);
            
		}catch (NumberFormatException nfe) {
			System.out.println(args[1]);
			System.err.println("number format occured");

	}
System.out.println("sum "+sum);
}
}
} 