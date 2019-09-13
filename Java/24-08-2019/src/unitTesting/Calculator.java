package unitTesting;

public class Calculator {
	private int x;
	private int y;
	private int result;
	
	public Calculator(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	
	}
	
	
	public int AddMethod() {
	
    result =x+y;
    return result;
	}

public int Compare() {
	if (x>y) {
		return 1;
	}else {
		return -1;
	}
}
}
