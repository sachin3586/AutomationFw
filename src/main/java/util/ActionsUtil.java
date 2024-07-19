package util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import testbase.WebTestBase;

public class ActionsUtil extends WebTestBase {
    public static Actions actions;

    public static void moveToElement(WebElement element) {
        actions = new Actions(driver);
        actions.moveToElement(element).
                build().
                perform();
    }

    public static void dragAndDropToElement(WebElement srcElement, WebElement destElement) {
        actions.dragAndDrop(srcElement, destElement).
                build().
                perform();

    }

}
