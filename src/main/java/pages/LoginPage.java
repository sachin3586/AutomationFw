package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.WaitUtil;
import util.WebDriverUtil;

public class LoginPage extends WebTestBase{
    @FindBy(id="username")
    WebElement loginUsernameTextbox;

    @FindBy(id="password")
    WebElement loginPasswordTextbox;

    @FindBy(name="login")
    WebElement loginBtn;

    @FindBy(xpath="//strong[text()='ERROR']")
    WebElement errorElement;


    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    public void login(String userName, String password){

        WebDriverUtil.sendKeysToElement(loginUsernameTextbox,userName);
        WebDriverUtil.sendKeysToElement(loginPasswordTextbox,password);
        WaitUtil.waitUntilElementToClickable(loginBtn);
    }
    public String getTextOfErrorElement(){
        return WebDriverUtil.getTextOfElement(errorElement);
    }
}
