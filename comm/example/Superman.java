package comm.example;

public class Superman extends Fly {

	@Override
	public void takeoff() {
	  System.out.println("superman take off");
		
	}

	@Override
	public void fly() {
		System.out.println("superman fly");
		
	}

	@Override
	public void land() {
		System.out.println("superman lands");
		
	}

}
