package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by liza on 4/24/18.
 */
public class Browser {

        private static WebDriver webDriver = new ChromeDriver();
        private static String baseUrl = "https://www.fashionette.de";


        public static void goTo(String relativeUrl)
        {
            webDriver.navigate().to(baseUrl + relativeUrl);
        }

        public static String Url(){
            return webDriver.getCurrentUrl();
    }

}
