package thread;

public class StackConsumer implements Runnable{

private Mystack myStack;
	
	
	public StackConsumer(Mystack myStack) {
		super();
		this.myStack = myStack;
	}


	@Override
	public void run() {
		for(int i=0;i<26;i++)
		{
			try {
				System.out.println(myStack.pop());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	

}
