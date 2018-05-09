package pages;

import base.Extensions;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by liza on 4/24/18.
 */
public class LoginPage {


        private SelenideElement emailField = $(By.name("email"));

        private SelenideElement passwordField = $(By.name("password"));

        private SelenideElement loginBtn = $(By.cssSelector("button.btn__submit"));

        private SelenideElement backBtn = $(By.className("icon--small icon--cross-big-red"));

        private SelenideElement forgotPasswordLink = $(By.cssSelector("a.forgot-password-toggle > font > font"));

        private SelenideElement siteLogo = $(By.className("logo-claim"));

        private SelenideElement validationError = $(By.className("login__errortext login--modal__response-error"));



        public LoginPage open(){
                Selenide.open("/login");
                return this;
        }

        public LoginPage entersEmail(String email){
                emailField.setValue(email);
                return  this;
        }

        public LoginPage entersPassword(String password){
                passwordField.setValue(password);
                return this;
        }

        public LoginPage pressesLoginBtn()
        {
                loginBtn.click();
                return this;
        }

        public boolean isAt(){
                String title = Extensions.getCurrentUrl();
                return title.contains(Configuration.baseUrl);
        }

        public void WaitUntilValidationErrorDisplayed(){
                validationError.shouldBe(Condition.visible);
        }

        public boolean validationErrorDisplayed(){
                return validationError.isDisplayed();
        }


}
