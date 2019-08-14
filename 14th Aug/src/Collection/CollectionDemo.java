package Collection;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class CollectionDemo {
	static Scanner sc = new Scanner(System.in);
	private String str[];
	private Set<String> set;
    
	public CollectionDemo() {
		System.out.println("Number of elements in the Array");
		str = new String[sc.nextInt()];
		for (int i = 0; i < str.length; i++) {
			System.out.println("Name ");
			str[i] = sc.next().toString();
		}
		set = new HashSet<String>();
		for (String s : str) {
			if (!set.add(s)) {
				System.out.println("Duplicate elemet found cant be added " + s);
			}
		}
	}

	public void displayCollection() {
		java.util.Iterator<String> i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next().toString());
		}
	}
}
