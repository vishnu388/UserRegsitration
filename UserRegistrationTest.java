import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue(){
        String testString = "Vishnu";
        try {
            Assert.assertTrue(UserRegistration.validatePattern(testString, UserRegistration.firstNamePattern));
        } catch (UserExceptions ue) {
            ue.printStackTrace();
        }
    }
    @Test
    public void givenFirstName_WhenInvalid_ShouldReturnFalse(){
        String testString = "vi";
        try {
            Assert.assertFalse(UserRegistration.validatePattern(testString, UserRegistration.firstNamePattern));
        } catch (UserExceptions ue) {
            ue.printStackTrace();
        }
    }
    @Test
    public void givenLastName_WhenValid_ShouldReturnTrue(){
        String testString = "Vardhan";
        try {
            Assert.assertTrue(UserRegistration.validatePattern(testString, UserRegistration.lastNamePattern));
        } catch (UserExceptions ue) {
            ue.printStackTrace();
        }
    }
    @Test
    public void givenLastName_WhenInvalid_ShouldReturnFalse(){
        String testString = "vardhan";
        try {
            Assert.assertFalse(UserRegistration.validatePattern(testString, UserRegistration.lastNamePattern));
        } catch (UserExceptions ue) {
            ue.printStackTrace();
        }
    }
    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue(){
        String testString = "abc@yahoo.com" ;
        try {
            Assert.assertTrue(UserRegistration.validatePattern(testString, UserRegistration.emailPattern));
        } catch (UserExceptions ue) {
            ue.printStackTrace();
        }
    }
    @Test
    public void givenEmail_WhenInvalid_ShouldReturnFalse(){
        String testString = "abc";
        try {
            Assert.assertFalse(UserRegistration.validatePattern(testString, UserRegistration.emailPattern));
        } catch (UserExceptions ue) {
            ue.printStackTrace();
        }
    }
    @Test
    public void givenMobileNumber_WhenValid_ShouldReturnTrue(){
        String testString = "91-8106261925";
        try {
            Assert.assertTrue(UserRegistration.validatePattern(testString, UserRegistration.mobileNumberPattern));
        } catch (UserExceptions ue) {
            ue.printStackTrace();
        }
    }
    @Test
    public void givenMobileNumber_WhenInvalid_ShouldReturnFalse(){
        String testString = "8106261925";
        try {
            Assert.assertFalse(UserRegistration.validatePattern(testString, UserRegistration.mobileNumberPattern));
        } catch (UserExceptions ue) {
            ue.printStackTrace();
        }
    }
    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue(){
        String testString = "A.Vishnu@388";
        try {
            Assert.assertTrue(UserRegistration.validatePattern(testString, UserRegistration.passwordPattern));
        } catch (UserExceptions ue) {
            ue.printStackTrace();
        }
    }
    @Test
    public void givenPassword_WhenInvalid_ShouldReturnFalse(){
        String testString = "vishnu388";
        try {
            Assert.assertFalse(UserRegistration.validatePattern(testString, UserRegistration.passwordPattern));
        } catch (UserExceptions ue) {
            ue.printStackTrace();
        }
    }


}
