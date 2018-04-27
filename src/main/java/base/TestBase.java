package base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by liza on 4/24/18.
 */
public class TestBase {

    WebDriver webDriver;
    private static String baseUrl = "https://www.fashionette.de";

    @BeforeEach
    public void setUp(){
        WebDriver webDriver = new ChromeDriver();
        webDriver.get(baseUrl);
    }



    @AfterEach
    public void tearDown(){
        if (webDriver != null) {
            webDriver.quit();
    }

}

}
