package classes;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import testbase.WebTestBase;

public class HomeTest extends WebTestBase {

    public HomePage homePage;
    public LoginPage loginPage;
    public MyAccountPage myAccountPage;

    public HomeTest(){
        super();
    }


    @BeforeMethod
    public void beforeMethod(){
        initialization();
        homePage=new HomePage();
        loginPage=new LoginPage();
        myAccountPage=new MyAccountPage();

    }

    @Test(description = "Verify My Account Btn is displayed on home page")
    public void verifyMyAccountBtnDisplayed(){
        SoftAssert softAssert=new SoftAssert();
        homePage.closeFirstAdd();
        softAssert.assertTrue(homePage.myAccountBtnDisplayed(),"myAccount btn should be displayed");
        softAssert.assertAll();

    }

    @AfterMethod
    public void afterMethod(){
        driver.close();
    }


}
