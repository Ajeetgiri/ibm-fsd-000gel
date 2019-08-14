package comm.example;

public class Pemployee extends Person {
	private int salary;
	
	
	
	public Pemployee(int salary) {
		super(2,"Ajeet","Fsd");
		this.salary = salary;
	}



	@Override
	public String getDetail() {
		return super.getDetail()+ " salary "+salary;
	}
	

}
