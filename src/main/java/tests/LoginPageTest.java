package tests;

import base.TestBase;
import com.sun.tools.javac.util.Assert;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

/**
 * Created by liza on 4/25/18.
 */
public class LoginPageTest extends TestBase{
    WebDriver webDriver;
    LoginPage loginPage;

    @Test
    public void CanLogin(){
        loginPage.goTo();
        loginPage.entersEmail("hello@me.com");
        loginPage.entersPassword("password12345");
        loginPage.pressesLogibBtn();

        Assert.assertFalse(loginPage.isAt(), "user is still on login page");

    }


}
