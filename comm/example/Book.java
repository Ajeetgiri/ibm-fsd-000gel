package comm.example;

public class Book extends Product {
	
	private String Bname;
	private String Aname;
	public Book(String bname, String aname) {
		super(500);
		Bname = bname;
		Aname = aname;
		
	}
	public String bookDetail() {
		return super.getItem()+"book name "+Bname+" Author name"+Aname;
		
		
	}
	
	
	
	

}
