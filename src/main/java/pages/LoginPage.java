package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by liza on 4/24/18.
 */
public class LoginPage {


        private SelenideElement emailField = $(By.className("email"));

        private SelenideElement passwordField = $(By.className("password"));

        private SelenideElement loginBtn = $(By.className("btn__submit"));

        private SelenideElement backBtn = $(By.className("icon--small icon--cross-big-red"));

        private SelenideElement forgotPasswordLink = $(By.cssSelector("a.forgot-password-toggle > font > font"));

        private SelenideElement siteLogo = $(By.className("logo-claim"));

        private SelenideElement validationError = $(By.className("login__errortext login--modal__response-error"));



        public LoginPage open(){
                Selenide.open("/login");
                return this;
        }

        public LoginPage entersEmail(String email){
                emailField.setValue("email");
                return  this;
        }

        public LoginPage entersPassword(String password){
                passwordField.setValue(password);
                return this;
        }

        public LoginPage pressesLoginBtn(){
                loginBtn.click();
                return this;
        }

        public void isAt(){
                WebDriverRunner.url();
        }

        public boolean validationErrorDisplayed(){
                return validationError.isDisplayed();
        }


}
