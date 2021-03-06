package list;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Sdetail {
	public static int id;
	private String name;
	private String address;
	Set<Sdetail> s = new HashSet<Sdetail>();
	private static Scanner sc = new Scanner(System.in);

	public Sdetail() {
		super();
	}

	public Sdetail(int id, String name, String adress) {
		super();
		this.id = id;
		this.name = name;
		this.address = adress;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return address;
	}

	public void setAdress(String address) {
		this.address = address;
	}

	public void updateDetail(int id) {
		Iterator<Sdetail> i = s.iterator();
		while (i.hasNext()) {
			Sdetail d = i.next();

			if (d.getId() == id) {
				System.out.println("enter new id");
				id = sc.nextInt();
				System.out.println("enter new name");
				name = sc.next();
				System.out.println("enter new address");
				address = sc.next();
				d.setId(id);
				d.setName(name);
				d.setAdress(address);

			}
		}
	}

	public void deleteDetail(int id) {
		Iterator<Sdetail> i = s.iterator();
		while (i.hasNext()) {
			Sdetail d = i.next();
			if (d.getId() == id) {
				// System.out.println(i.toString());
				i.remove();
			}
		}

	}

	public void addDetail(int id, String name, String address) {
		s.add(new Sdetail(id, name, address));
	}

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", adress=" + address + ", s=" + s + "]";
	}

	public void viewDetail() {

		System.out.println(s.toString());

	}

}
