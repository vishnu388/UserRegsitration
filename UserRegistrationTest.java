import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_whenProper_ShouldReturnTrue() {
        UserRegistration usr=new UserRegistration();
        boolean result=usr.validateFirstName("Vishnu");
        Assert.assertTrue(result);

    }
    @Test
    public void givenFirstName_whenProper_ShouldReturnFalse() {
        UserRegistration usr=new UserRegistration();
        boolean result=usr.validateFirstName("vishnu");
        Assert.assertFalse(result);

    }
    @Test
    public void givenLastName_whenProper_ShouldReturnTrue() {
        UserRegistration usr=new UserRegistration();
        boolean result=usr.validateLastName("Vardhan");
        Assert.assertTrue(result);

    }

    @Test
    public void givenLastName_whenProper_ShouldReturnFalse() {
        UserRegistration usr=new UserRegistration();
        boolean result=usr.validateLastName("vardhan");
        Assert.assertFalse(result);

    }

    @Test
    public void givenMob_Number_ShouldReturnTrue() {
        UserRegistration usr =new UserRegistration();
        boolean result=usr.validateMobileNumber("91-8106261925");
        Assert.assertTrue(result);
    }
    @Test
    public void givenMob_Number_ShouldReturnFalse() {
        UserRegistration usr =new UserRegistration();
        boolean result=usr.validateMobileNumber("8106261925");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_ShouldReturnTrue() {
        UserRegistration usr = new UserRegistration();
        boolean result=usr.validatePassword("Vishnu@388");
        Assert.assertTrue(result);

    }


}
