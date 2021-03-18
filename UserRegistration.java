package UserValid;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
	public boolean validateSpecialCharacter(String SpecialCharacter) {
		String regExp = "^(?=.*?[a-z])(?=.*?[A-Z])(?=.*?[0-9]).{8,}#";
		Pattern pattern = Pattern.compile(regExp);
		Matcher matcher=pattern.matcher(SpecialCharacter);
		return matcher.matches();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your SpecialCharacter");
		String SPCharacter=sc.next();
		boolean result=new UserRegistration().validateSpecialCharacter(SPCharacter);
		System.out.println(result);

	}

}





