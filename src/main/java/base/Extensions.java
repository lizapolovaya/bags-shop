package base;

import com.codeborne.selenide.WebDriverRunner;

public class Extensions {


    public static String getCurrentUrl(){
        return WebDriverRunner.url();
    }

}
