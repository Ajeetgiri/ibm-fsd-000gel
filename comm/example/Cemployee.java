package comm.example;

public class Cemployee extends Person {
	private int rate;
	
	
	public Cemployee(int rate) {
		super(2,"saket","fsd");
		this.rate = rate;
	}


	public String getDetail() {
		return super.getDetail()+ " rate "+ rate;
	}

}
