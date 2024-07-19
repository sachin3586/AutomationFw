package util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownUtil {
    public static Select select;

    public static void bootstrapDropdown(List<WebElement> elementList, String option){
        for (WebElement element:elementList){
            if (element.getText().equalsIgnoreCase(option)){
                element.click();
                break;
            }

        }
    }

    public static void selectOptionByVisibleText(WebElement element,String option){
        select=new Select(element);
        select.selectByVisibleText(option);

    }


}
