package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by liza on 4/24/18.
 */
public class HomePage {

    private SelenideElement header = $(By.className("header__background"));

    private SelenideElement footerNavigationBar = $(By.className("footer__navigation"));

}
