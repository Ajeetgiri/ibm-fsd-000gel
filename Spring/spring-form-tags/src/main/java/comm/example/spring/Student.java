package comm.example.spring;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastname;
private String country;
	
	private LinkedHashMap<String, String> countryOptions;
	
	private String[] OperatingSystems;
	
	private String favoriteLanguage;
public Student() {
		
		// populate country options: used ISO country code
		countryOptions = new LinkedHashMap<String, String>();
		
		countryOptions.put("BRAZIL", "Brazil");
		countryOptions.put("FRANCE", "France");
		countryOptions.put("GERMANY", "Germany");
		countryOptions.put("INDIA", "India");
		countryOptions.put("USA", "United States of America");		

	}
	
	public String[] getOperatingSystems() {
	return OperatingSystems;
}

public void setOperatingSystems(String[] operatingSystems) {
	OperatingSystems = operatingSystems;
}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public Student(String firstName, String lastname) {
		super();
		this.firstName = firstName;
		this.lastname = lastname;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	

}
