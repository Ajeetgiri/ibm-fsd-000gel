package comm.example;

public class Tv extends Electronics{
	private String brand;

	
	
	public Tv( String brand) {
		super(200);
		this.brand = brand;
	}



	public String bookDetail() {
		return super.getItem()+"tv brand "+brand;
		
		
	}
		
	}


