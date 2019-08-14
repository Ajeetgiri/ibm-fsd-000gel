package comm.example;

public class MyDate1 {
	private int x;
	private int y;
	private int z;

	public MyDate1() {
		this(10);
	}

	public MyDate1(int x) {
		this(x, 20);
	}

	public MyDate1(int x, int y) {
		this(x, y, 30);
	}

	public MyDate1(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public String getData() {
		return "X = " + this.x + "Y=" + this.y + " Z = " + this.z;

	}
}
