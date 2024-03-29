package thread;

public class MystackProducer implements Runnable {
	private Mystack myStack;

	public MystackProducer(Mystack myStack) {
		super();
		this.myStack = myStack;
	}

	@Override
	public void run() {
		for (int i = 0; i < 26; i++) {
			try {
				myStack.push((char) ((char) i + 65));
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

	}

}
