package UserValid;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
	public boolean validatePassword(String Password) {
		String regExp = "[a-zA-Z[@]0-9]{8,}";
		Pattern pattern = Pattern.compile(regExp);
		Matcher matcher=pattern.matcher(Password);
		return matcher.matches();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Password");
		String Password=sc.next();
		boolean result=new UserRegistration().validatePassword(Password);
		System.out.println(result);
	}

}




