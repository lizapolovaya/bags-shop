package pages;

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
        WebElement submitBtn;

        @FindBy(className = "icon--small icon--cross-big-red")
        WebElement backBtn;

        @FindBy(css = "a.forgot-password-toggle > font > font")
        WebElement forgotPasswordLink;

        @FindBy(className = "logo-claim")
        WebElement siteLogo;


    }

}
