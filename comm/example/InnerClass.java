package comm.example;

public class InnerClass {
	private String polygon;
	private int sides;
	
	public InnerClass() {
			}

	public void OuterClass() {
		System.out.println("Name of polygon will be given according to number of sides ");
		
	}
	public class Square{
		
		public void InnerClass() {
			sides = 4;
			polygon="square";
			//OuterClass();
			System.out.println("Name of polygon is "+polygon+ " having side "+sides);
			
			
			
		}
		}
	}

