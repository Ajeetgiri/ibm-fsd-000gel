package comm.example;

public class Account {
private int amount;
private String name;
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	Account p = (Account)obj;
	
	if(this.amount==p.amount && this.name==p.name) {
		return true;
	}
	else {
		return false;
	}

}
public static void main(String[] args) {
	Account a= new Account();
	a.setAmount(400);
	a.setName("Ajeet");
	
	Account a1= new Account();
	a1.setAmount(400);
	a1.setName("Ajeet");
	System.out.println(a.equals(a1));
	
	
}

}


