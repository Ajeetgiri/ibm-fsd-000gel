package thread;

public class MyThreadDemo2 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.err.println("Ajeet Giri");
	}
	public static void main (String[]args) {
		MyThreadDemo2 three= new MyThreadDemo2();
		three.start();
		
	}
}
