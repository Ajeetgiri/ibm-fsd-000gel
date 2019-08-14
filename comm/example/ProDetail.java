package comm.example;

public class ProDetail {

	public static void main(String[] args) {
	  Book p = null;
	  p = new Book("abc","sad");
	  System.out.println(p.bookDetail());
	  Electronics q = null;
	  q = new Electronics(2019);
	  System.out.println(q.itemDetail());
	  Tv r = null;
	  r = new Tv ("onida");
	  System.out.println(r.bookDetail());
	}

}
