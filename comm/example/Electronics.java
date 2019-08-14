package comm.example;

public class Electronics extends Product {


	private int year;

	public Electronics( int year) {
		super(7000);
		this.year = year;
	}

	
	public String itemDetail() {
		return super.getItem()+"item manufactured in  "+year;
		
		
	}
	

}
