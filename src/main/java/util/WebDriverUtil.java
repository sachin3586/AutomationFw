package util;

import org.openqa.selenium.WebElement;
import testbase.WebTestBase;

public class WebDriverUtil extends WebTestBase {
    public static void sendKeysToElement(WebElement element, String text) {
        element.sendKeys(text);
    }

    public static String getTextOfElement(WebElement element){


        String elementText=element.getText();


        return elementText;
    }
    public static boolean isElementDisplayed(WebElement element){
        return element.isDisplayed();

    }

}