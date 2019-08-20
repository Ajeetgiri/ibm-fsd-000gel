package thread;

public class MyThreadDemo implements Runnable {
	public static void main(String[] args) {
		MyThreadDemo thread = new MyThreadDemo();
		Thread t1 = new Thread(thread);
		Thread t2 = new Thread(thread);
		t1.start();
		System.out.println(t1.isAlive());
		t2.start();
		System.out.println(t2.isAlive());

	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 20; i++) {
				System.out.println("==>:" + i);
				if (i == 10) {
					Thread.yield();

				}
			}
		} catch (Exception e) {

		}
	}
}