package comm.example;

public class Innertest {

	public static void main(String[] args) {
		InnerClass ic = new InnerClass();
		ic.OuterClass();
		InnerClass.Square s = ic.new Square();
		s.InnerClass();
		

	}

}
