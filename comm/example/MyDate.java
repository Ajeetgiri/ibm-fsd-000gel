package comm.example;

public class MyDate {
private int day;
private int month;
private int year;
public void createDate(int d,int m, int y) {
	if(d>30) {
	System.out.println("Invalid Date");
	System.exit(0);
	}
	if(m>12) {
		System.out.println("Invalid Month");
		System.exit(0);
		}
	if(y<1986 && y>2099) {
		System.out.println("Invalid Year");
		System.exit(0);
		}
else {
day=d;
month=m;
year=y;
}
}
public String getDate() {
	return "Date is"+day+":"+month+":"+year;
}
}