package UserValid;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
	public boolean validateFirstName(String FirstName) {
		String regExp = "[A-Z][A-Za-z]{3,}";
		Pattern pattern = Pattern.compile(regExp);   //uc-1
		Matcher matcher=pattern.matcher(FirstName);
		return matcher.matches();
	}
	public boolean validateLastName(String LastName) {
		String regExp = "[A-Z][A-Za-z]{3,}";
		Pattern pattern = Pattern.compile(regExp);
		Matcher matcher=pattern.matcher(LastName);    //uc-2
		return matcher.matches();
	}
	public boolean validateEmail(String Email) {
		String regExp = "^[a-zA-Z0-9]+([.+_-]{0,1}+[a-zA-Z0-9])*+[@]+[a-zA-Z]+[.]+[a-zA-Z]{2,4}+([.]{1}+[a-zA-Z]{0,2})*";
		Pattern pattern = Pattern.compile(regExp);
		Matcher matcher=pattern.matcher(Email);    //uc-3
		return matcher.matches();
	}
	public boolean validateMobileNumber(String MobileNumber) {
		String regExp = "^[0-9]{2}[-][0-9]{10}$";
		Pattern pattern = Pattern.compile(regExp);     //uc-4
		Matcher matcher=pattern.matcher(MobileNumber);
		return matcher.matches();
	}
	public boolean validatePassword(String Password) {
		String regExp = "[a-zA-Z[@]0-9]{8,}";
		Pattern pattern = Pattern.compile(regExp);
		Matcher matcher=pattern.matcher(Password);     //uc-5
		return matcher.matches();
	}
	public boolean validateUpperCase(String UpperCase) {
		String regExp = "^(?=.*?[A-Z])(?=.*?[a-z]).{8,}$";
		Pattern pattern = Pattern.compile(regExp);
		Matcher matcher=pattern.matcher(UpperCase);    //uc-6
		return matcher.matches();
	}
	public boolean validateNumericNumber(String NumericNumber) {
		String regExp = "^(?=.*?[a-z])(?=.*?[A-Z])(?=.*?[0-9]).{8,}$";
		Pattern pattern = Pattern.compile(regExp);       //uc-7
		Matcher matcher=pattern.matcher(NumericNumber);
		return matcher.matches();
	}
	public boolean validateSpecialCharacter(String SpecialCharacter) {
		String regExp = "^(?=.*?[a-z])(?=.*?[A-Z])(?=.*?[0-9]).{8,}#";
		Pattern pattern = Pattern.compile(regExp);        //uc-8
		Matcher matcher=pattern.matcher(SpecialCharacter);
		return matcher.matches();
	}
	public boolean validateCheckEmail(String CheckEmail) {
		String regExp = "^[a-zA-Z0-9]+([.+-_][a-zA-Z0-9]+)*@[a-zA-z0-9]+.[a-zA-Z]{2}([.][a-zA-Z]{2,4})?$";
		Pattern pattern = Pattern.compile(regExp);
		Matcher matcher=pattern.matcher(CheckEmail);    //uc-9
		return matcher.matches();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your valid Emails");
		String Email=sc.next();
		boolean result=new UserRegistration().validateCheckEmail(Email);
		System.out.println(result);
		
		
		
	}

}





