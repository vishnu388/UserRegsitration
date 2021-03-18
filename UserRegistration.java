package UserValid;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
	public boolean validateFirstName(String FirstName) {
		String regExp = "[A-Z][A-Za-z]{3,}";
		Pattern pattern = Pattern.compile(regExp);
		Matcher matcher=pattern.matcher(FirstName);
		return matcher.matches();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your FirstName");
		String FirstName=sc.next();
		boolean result=new UserRegistration().validateFirstName(FirstName);
		System.out.println(result);

	}

}
