package UserValid;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
	public boolean validateEmail(String Email) {
		String regExp = "^[a-zA-Z0-9]+([.+_-]{0,1}+[a-zA-Z0-9])*+[@]+[a-zA-Z]+[.]+[a-zA-Z]{2,4}+([.]{1}+[a-zA-Z]{0,2})*";
		Pattern pattern = Pattern.compile(regExp);
		Matcher matcher=pattern.matcher(Email);
		return matcher.matches();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Email");
		String Email=sc.next();
		boolean result=new UserRegistration().validateEmail(Email);
		System.out.println(result);

	}

}

