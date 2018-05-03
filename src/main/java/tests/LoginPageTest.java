package tests;

import base.TestBase;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * Created by liza on 4/25/18.
 */
public class LoginPageTest extends TestBase{

    LoginPage loginPage = new LoginPage();

    @Test
    public void CanLogin(){

        loginPage.open();

        loginPage.entersEmail("hello0305@yopmail.com");
        loginPage.entersPassword("Password1");
        loginPage.pressesLoginBtn();

        assertTrue(WebDriverRunner.url().contains("https://www.fashionette.de/account/customer"), "User is not on a user dashboard");
    }

    @Test
    public void CanSeeValidationError(){

        loginPage.open();

        loginPage.entersEmail("hello0305@yopmail.com");
        loginPage.entersPassword("Password12");
        loginPage.pressesLoginBtn();

        assertTrue(loginPage.validationErrorDisplayed(), "There is no validation error");
    }



}
