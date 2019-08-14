package comm.example;

public class Person {
	private int id;
	private String name;
	private String department;
	
	
	public Person() {
		super();
	}


	public Person(int id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}


	public String getDetail() {
		return "ID ="+id+ " Name = "+name+" Department ="+department;
		
	}

}
