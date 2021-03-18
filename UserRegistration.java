package UserValid;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
	public boolean validateNumericNumber(String NumericNumber) {
		String regExp = "^(?=.*?[a-z])(?=.*?[A-Z])(?=.*?[0-9]).{8,}$";
		Pattern pattern = Pattern.compile(regExp);
		Matcher matcher=pattern.matcher(NumericNumber);
		return matcher.matches();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your NumericLetter");
		String Numeric=sc.next();
		boolean result=new UserRegistration().validateNumericNumber(Numeric);
		System.out.println(result);

	}

}




