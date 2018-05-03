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


        public LoginPage open(){
                Selenide.open("/login");
                return this;
        }

        public void entersEmail(String email){
                emailField.setValue("email");
        }

        public void entersPassword(String password){
                passwordField.setValue(password);
        }

        public void pressesLogibBtn(){
                loginBtn.click();
        }

        public void isAt(){
                WebDriverRunner.url();
        }

}
