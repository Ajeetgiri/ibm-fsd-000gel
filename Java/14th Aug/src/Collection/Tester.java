package Collection;
import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(in);
		 String name;
		 System.out.println("Enter the name of coach");
		name = scanner.next();
		TennisCoach myCoach = new TennisCoach();
		myCoach.createCoach(name, Level.HIGH);
		out.println(myCoach.CoachDetails().toString());
		

	}

}
