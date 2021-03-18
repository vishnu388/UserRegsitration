package UserValid;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
	public boolean validateLowerCase(String LowerCase) {
		String regExp = "^(?=.*?[a-z])(?=.*?[A-Z]).{8,}$";
		Pattern pattern = Pattern.compile(regExp);
		Matcher matcher=pattern.matcher(LowerCase);
		return matcher.matches();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your LowerLetter");
		String Lower=sc.next();
		boolean result=new UserRegistration().validateLowerCase(Lower);
		System.out.println(result);

	}

}




