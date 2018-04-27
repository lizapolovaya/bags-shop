package tests;

import base.TestBase;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertFalse;


/**
 * Created by liza on 4/25/18.
 */
public class LoginPageTest extends TestBase{
    LoginPage loginPage;

    @Test
    public void CanLogin(){
        loginPage.goTo();
        loginPage.entersEmail("hello@me.com");
        loginPage.entersPassword("password12345");
        loginPage.pressesLogibBtn();

        assertFalse (loginPage.isAt(), "user is still on login page");

    }


}
