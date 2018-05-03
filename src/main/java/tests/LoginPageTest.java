package tests;

import base.TestBase;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Test;
import pages.LoginPage;


/**
 * Created by liza on 4/25/18.
 */
public class LoginPageTest extends TestBase{

    LoginPage loginPage = new LoginPage();

    @Test
    public void CanLogin(){
        loginPage.open();

        loginPage.entersPassword("hello0305@yopmail.com");
        loginPage.entersPassword("Password1");
        loginPage.pressesLogibBtn();

        WebDriverRunner.url().contains("https://www.fashionette.de/account/customer");
    }


}
