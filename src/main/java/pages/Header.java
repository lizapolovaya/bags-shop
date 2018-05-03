package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by liza on 4/24/18.
 */
public class Header {

    private SelenideElement bagsLink = $(By.xpath("//li/a/font/font"));
    private SelenideElement designerLink = $(By.xpath("//li[2]/a/font/font"));
    private SelenideElement fitsTheBagLink = $(By.xpath("//li[3]/a/font/font"));
    private SelenideElement siteLogo = $(By.xpath("//img[@alt='Fashionette'])[2]"));
    private SelenideElement saleLink = $(By.cssSelector("a[title=\"Sale\"]"));
    private SelenideElement newLink = $(By.cssSelector("a[title=\"New\"]"));
    private SelenideElement userIcon = $(By.className("icon icon--user"));
    private SelenideElement searchIcon = $(By.className("search"));

}
