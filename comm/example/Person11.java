package comm.example;
import java.io.Serializable;
import java.util.Scanner;

public class Person11 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String fname;
	String lname;
	public String getFname() {
		return fname;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fname == null) ? 0 : fname.hashCode());
		result = prime * result + ((lname == null) ? 0 : lname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		Person11 p =(Person11)obj;
	
		if (this.fname==p.fname && this.lname== p.lname) {
			
			System.out.println("name cannot be same");
			return false;
		}
		else {
			return true;
		}
	}

	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public Person11() {
		super();
	}
	public Person11(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}
	

	@Override
	public String toString() {
		return "Person11 [fname=" + fname + ", lname=" + lname + "]";
	}
	
	public Person11 checkName(String fname, String lname) throws NameValidity {
		this.fname=fname;
		this.lname=lname;
		if (Character.isUpperCase(lname.charAt(0))==false||Character.isUpperCase(fname.charAt(0))==false) {
			System.err.println("error");
			throw new NameValidity("enter name having uppercase at intial character in first and last name");
		}
		return new Person11(fname,lname);

	} 
}


