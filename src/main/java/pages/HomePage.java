package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.WaitUtil;
import util.WebDriverUtil;

import java.util.List;

public class HomePage extends WebTestBase {
    @FindBy(xpath="//a[@class='newsletter__close newsletter__trigger']")
    WebElement firstAdd;

    @FindBy(xpath = "//a[@class='user-controls__ul__li__a']")
    WebElement myAccountBtn;

    @FindBy(xpath=" ")
    List<WebElement> allElements;


    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    public void closeFirstAdd(){
        WaitUtil.waitUntilElementToClickable(firstAdd);
    }
    public void clickOnMyAccountBtn(){
        WaitUtil.waitUntilElementToClickable(myAccountBtn);
    }

    public boolean myAccountBtnDisplayed(){
        return WebDriverUtil.isElementDisplayed(myAccountBtn);
    }
}
