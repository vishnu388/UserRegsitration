import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static final String firstNamePattern = "^[A-Z][a-z]{2,}";
    public static final String lastNamePattern = "^[A-Z][a-z]{2,}";
    public static final String emailPattern = "^[a-zA-Z0-9]+([.+-_][a-zA-Z0-9]+)*@[a-zA-z0-9]+.[a-zA-Z]{2,4}(.[a-zA-Z]{2,4})$";
    public static final String mobileNumberPattern = "^[0-9]{2}[-][0-9]{10}$";
    public static final String passwordPattern = "^(?=.*?[a-z])(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[!@#$%^&)*(-+)]).{8,}$";
    public static boolean validatePattern(String usrInput, String regExp) throws UserExceptions {
        try {
            Pattern pattern = Pattern.compile(regExp);
            Matcher matcher = pattern.matcher(usrInput);
            return matcher.matches();
        }catch (NullPointerException e){
            throw new UserExceptions("Enter valid input which is not null.");
        }
    }
    public static void ifValidOutputAfterTest(String regExpString, String[] testSamples){
        for (String testString : testSamples) {
            try {
                if (validatePattern(testString, regExpString)) {
                    System.out.printf(" Valid  : %s\n", testString);
                } else
                    System.out.printf("Invalid : %s\n", testString);
            } catch (UserExceptions ue) {
                System.out.println(ue.getMessage());
            }
        }

    }

    public static void main(String args[]) {
        String[] firstNameList= {"Vishnu","Vishn", "vishnu", null, ""};
        ifValidOutputAfterTest(firstNamePattern, firstNameList);

        String[] lastNameList= {"Vardhan", "Vardha", "vardhan"};
        ifValidOutputAfterTest(lastNamePattern, lastNameList);

        String[] emailList= {"abc@yahoo.com" ,"abc-100@yahoo.com" ,"abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net",
                "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com", "a.b1.00@abc.net", "abc", "abc@.com.my",
                "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com",
                "abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"};
        ifValidOutputAfterTest(emailPattern, emailList);

        String[] mobileNumberList= {"91-8106261925", "8106261925"};
        ifValidOutputAfterTest(mobileNumberPattern, mobileNumberList);

        String[] passwordList= {"A.vishnu@38", "avishnu@388"};
        ifValidOutputAfterTest(passwordPattern, passwordList);
    }
}
