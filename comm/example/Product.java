package comm.example;

public class Product {
	private int rate;
	private static int item;
	
	public Product() {
		
	}

	public static int getItem() {
		
		return item;
		
		
		
	}

	public Product(int rate) {
		item ++;
		this.rate = rate;
	
	}
	public String getRate() {
		return "item "+item+ "Rate of Item is"+rate;
		
	}

}
