package UserValid;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
	public boolean validateMobileNumber(String MobileNumber) {
		String regExp = "^[0-9]{2}[-][0-9]{10}$";
		Pattern pattern = Pattern.compile(regExp);
		Matcher matcher=pattern.matcher(MobileNumber);
		return matcher.matches();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your MobileNumber");
		String MobileNumber=sc.next();
		boolean result=new UserRegistration().validateMobileNumber(MobileNumber);
		System.out.println(result);

	}

}


