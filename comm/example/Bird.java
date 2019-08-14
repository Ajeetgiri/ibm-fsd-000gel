package comm.example;

public class Bird extends Fly {

	@Override
	public void takeoff() {
		System.out.println("bird takeoff");
	}

	@Override
	public void fly() {
		System.out.println("bird fly");
		
	}

	@Override
	public void land() {
		System.out.println("bird lands");
		
	}

}
