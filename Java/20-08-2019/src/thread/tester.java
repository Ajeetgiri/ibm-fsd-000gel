package thread;

public class tester {
	public static void main(String[] args) {
		Mystack mystack = new Mystack();
		MystackProducer p = new MystackProducer(mystack);
		Thread t1 = new Thread(p);
		t1.start();
		
		
		StackConsumer c = new StackConsumer(mystack);
		Thread t2 = new Thread(c);
		t2.start();
	}
	
}
