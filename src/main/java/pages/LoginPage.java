package pages;

import base.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by liza on 4/24/18.
 */
public class LoginPage {


        @FindBy(name = "email")
        WebElement emailField;

        @FindBy(name = "password")
        WebElement passwordField;

        @FindBy(className = "btn__submit")
        WebElement loginBtn;

        @FindBy(className = "icon--small icon--cross-big-red")
        WebElement backBtn;

        @FindBy(css = "a.forgot-password-toggle > font > font")
        WebElement forgotPasswordLink;

        @FindBy(className = "logo-claim")
        WebElement siteLogo;

        public void goTo(){
                Browser.goTo("/login");
        }

        public void entersEmail(String email){
                emailField.sendKeys(email);
        }

        public void entersPassword(String password){
                passwordField.sendKeys(password);
        }

        public void pressesLogibBtn(){
                loginBtn.click();
        }

        public boolean isAt(){
                return Browser.Url().contains("/login");
        }
}
