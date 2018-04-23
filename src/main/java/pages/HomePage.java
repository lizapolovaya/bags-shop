package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by liza on 4/24/18.
 */
public class HomePage {

    @FindBy(className = "header__background")
    WebElement header;

    @FindBy(className = "footer__navigation")
    WebElement footerNavigationBar;
}
