package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.After;
import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;

/**
 * Created by liza on 4/24/18.
 */
public class TestBase {

    WebDriver webDriver;
    private static String baseUrl = "https://www.fashionette.de";

    @Before
    public void setUp(){
        WebDriver webDriver = new ChromeDriver();
        webDriver.get(baseUrl);
    }



    @After
    public void tearDown(){
        if (webDriver != null) {
            webDriver.quit();
    }

}

}
