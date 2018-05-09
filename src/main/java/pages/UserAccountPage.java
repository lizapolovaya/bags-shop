package pages;

import base.Extensions;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class UserAccountPage {

    private SelenideElement logoutBtn = $(By.className("account__logout"));

    public boolean isAt(){
        String title = Extensions.getCurrentUrl();
        return title.contains("https://www.fashionette.de/account/customer");
    }

    public void waitForLogoutBtnToBeVisible(){
        logoutBtn.shouldBe(Condition.visible);
    }

}
