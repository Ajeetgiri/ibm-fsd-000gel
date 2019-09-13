package Problem_statement_Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;

public class AgeComparator implements Comparator{

ArrayList<Employee> list1 = new ArrayList<Employee>();
	

	public AgeComparator() {
		super();
	}

	public void setEmployee(Set<Employee> list) {
		
		for(Employee e :list) {
		list1.add(e);
		}
		Collections.sort(list1,new AgeComparator());
		
	}
	
	public ArrayList<Employee> getEmployee(){
		return list1;
	}

	@Override
	public int compare(Object o1, Object o2) {
		Employee s1 = (Employee) o1;
		Employee s2 = (Employee) o2;
		if (s1.getAge() == s2.getAge()) {
			if (s1.getDate() == s2.getDate()) {
				return 0;
			} 
			else if (s1.getDate().after(s2.getDate())) {
				return 1;
			}
			else {
				return -1;
			}
		} 
		else if (s1.getAge() > s2.getAge()) {
			return 1;
		}
		else {
			return -1;
		}
	}
	


	

}
