import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static final String firstNamePattern =  "^[A-Z][a-zA-Z]{3,3}";
    public static final String lastNamePattern =  "^[A-Z][a-zA-Z]{3,3}";
    public static final String emailPattern =  "^([^\\.][a-zA-Z]+[\\.+_-]{0,1}[0-9][^\\.]@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}[\\.][a-z^la]*)$";
    public static final String mobilePattern =  "^(91\\s*[7-9][0-9]{9})$";
    public static final String passwordPattern =  "^(?=.[A-Z])(?=.[0-9])(?=.*[!@#&()-[{}]:;',?/~$^+=<>]).{8,8}$";

    public static boolean validatePattern(String argument, String regExp) throws UserRegistrationException {

        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(argument);
        if(matcher.matches()) {
            return true;
        }else {

            throw new UserRegistrationException("please enter valid input which is not null");
        }
    }
    public static void ifValidOuput(String regExpString, String[] testSamples) {
        Arrays.stream(testSamples).forEach(testString -> {
                    try {
                        if (validatePattern(testString, regExpString)) {
                            System.out.println(" Valid : ");
                        }else
                            System.out.println(" Invalid : ");
                    } catch (UserRegistrationException e) {
                        System.out.println(e.getMessage());
                    }
                }
        );
    }

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration system to ensure all Validations");
        System.out.println("Enter your first name");
        String[] firstName = {"Vishnu", "vi", "vishnu"};
        ifValidOuput(firstNamePattern, firstName);

        System.out.println("Enter your last name");
        String[] lastName = {"Vardhan", "vardhan", "va"};
        ifValidOuput(lastNamePattern, lastName);

        System.out.println("Enter your email");
        String[] email = {"vishnu388@gmail.com", "abc-100@gmail.com", "vardhan@yahoo.com"};
        ifValidOuput(emailPattern, email);

        System.out.println("Enter your mobile format");
        String[] mobileFormat = {"91-8106261925", "8106261925", "9989988301"};
        ifValidOuput(mobilePattern, mobileFormat);

        System.out.println("Enter your password rules");
        String[] passwordRules = {"Vishnu*1", "vishnu1", "vishnu388"};
        ifValidOuput(passwordPattern, passwordRules);



    }
}
