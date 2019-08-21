package Problem_Statement_Password;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
	public static boolean  PasswordMatcher(String password) {
		String s ="^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$";
		if (s.matches(password)) {
			return true;
		}else {
		return false;
	}
	}
}

