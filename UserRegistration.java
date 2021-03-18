package UserValid;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
	public boolean validateUpperCase(String UpperCase) {
		String regExp = "^(?=.*?[A-Z])(?=.*?[a-z]).{8,}$";
		Pattern pattern = Pattern.compile(regExp);
		Matcher matcher=pattern.matcher(UpperCase);
		return matcher.matches();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your UpperLetter");
		String Upper=sc.next();
		boolean result=new UserRegistration().validateUpperCase(Upper);
		System.out.println(result);

	}

}




