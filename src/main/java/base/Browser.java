package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by liza on 4/24/18.
 */
public class Browser {

        public static WebDriver webDriver = new ChromeDriver();
        private static String baseUrl = "https://www.fashionette.de";
        private static WebDriver driver;


        public static void goTo(String relativeUrl)
        {
            webDriver.navigate().to(baseUrl + relativeUrl);
        }
    }

}
