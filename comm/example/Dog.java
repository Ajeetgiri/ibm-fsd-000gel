package comm.example;

public class Dog {
private String name;
private String breed;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBreed() {
	return breed;
}
public void setBreed(String breed) {
	this.breed = breed;
}
public Dog(String name, String breed) {
	super();
	this.name = name;
	this.breed = breed;
}


public void createLivingBeing() {
	
	LivingBeing l1= new LivingBeing() {

		@Override
		public void walk() {
			System.out.println("Dog name is :"+getName()+" and its breed is "+getBreed()+" and it runs");
			
		}
	};
	l1.walk();
}
}
