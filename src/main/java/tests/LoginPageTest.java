package tests;

import base.TestBase;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.UserAccountPage;

import static org.testng.Assert.assertTrue;


/**
 * Created by liza on 4/25/18.
 */
public class LoginPageTest extends TestBase{

    LoginPage loginPage = new LoginPage();
    UserAccountPage userAccountPage = new UserAccountPage();

    @Test
    public void CanLogin(){

        loginPage.open();

        loginPage.entersEmail("hello0305@yopmail.com");
        loginPage.entersPassword("Password1");
        loginPage.pressesLoginBtn();
        userAccountPage.waitForLogoutBtnToBeVisible();

        assertTrue(userAccountPage.isAt(), "User is not on the user account page");
    }

    @Test
    public void CanSeeValidationError(){

        loginPage.open();

        loginPage.entersEmail("hello0305@yopmail.com");
        loginPage.entersPassword("Password12");
        loginPage.pressesLoginBtn();
        loginPage.WaitUntilValidationErrorDisplayed();

        assertTrue(loginPage.validationErrorDisplayed(), "There is no validation error");
    }



}
