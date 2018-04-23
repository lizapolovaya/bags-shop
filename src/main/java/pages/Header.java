package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by liza on 4/24/18.
 */
public class Header {
    @FindBy(xpath = "//li/a/font/font")
    WebElement bagsLink;

    @FindBy(xpath = "//li[2]/a/font/font")
    WebElement designerLink;

    @FindBy(xpath = "//li[3]/a/font/font")
    WebElement fitsTheBagLink;

    @FindBy(xpath = "//img[@alt='Fashionette'])[2]")
    WebElement siteLogo;

    @FindBy(css = "a[title=\"Sale\"] > font > font")
    WebElement saleLink;

    @FindBy(linkText = "New")
    WebElement newLink;

    @FindBy(className = "icon icon--user")
    WebElement userIcon;

    @FindBy(className = "search")
    WebElement searchIcon;
}
