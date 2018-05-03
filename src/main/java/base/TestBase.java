package base;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;

/**
 * Created by liza on 4/24/18.
 */
public class TestBase {

    @BeforeEach
    public void setUp(){
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://www.fashionette.de";

    }



//    @AfterEach
//    public void tearDown(){
//        if (webDriver != null) {
//            webDriver.quit();
//    }

}


