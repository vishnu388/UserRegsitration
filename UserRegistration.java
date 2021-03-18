package UserValid;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
	public boolean validateLastName(String LastName) {
		String regExp = "[A-Z][A-Za-z]{3,}";
		Pattern pattern = Pattern.compile(regExp);
		Matcher matcher=pattern.matcher(LastName);
		return matcher.matches();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your LastName");
		String LastName=sc.next();
		boolean result=new UserRegistration().validateLastName(LastName);
		System.out.println(result);

	}

}
