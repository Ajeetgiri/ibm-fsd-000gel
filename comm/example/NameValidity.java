package comm.example;

public class NameValidity extends Throwable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 907884397897918513L;

	
	private String message;


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public NameValidity(String message) {
		super();
		this.message = message;
	}


	public NameValidity() {
		super();
	}
	
	
}

