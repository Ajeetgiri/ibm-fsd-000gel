package comm.example;

public class Messaging {
	private String message;
	private static Messaging messaging;

	private Messaging(String message) {
		super();
		this.message = message;
	}

	private Messaging() {
		super();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public static Messaging getMessaging() {
		return messaging;
	}

	public static void setMessaging(Messaging messaging) {
		Messaging.messaging = messaging;
	}
	
	@Override
	public String toString() {
		return "Messaging [message=" + message + "]";
	}

	public static Messaging CreateMessage() {
		if(messaging==null) {
			messaging = new Messaging();
		}
		return messaging;
		
	}
	
     public static Messaging CreateMessage(String name) {
    	 if(messaging==null) {
 			messaging = new Messaging(name);
 		}
 		return messaging;
	}
	

}
