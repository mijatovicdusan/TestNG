package class02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

//goto syntax
//verify that login btn is displayed
//verify that login btn is enabled
//close browser

public class ExamplesAssertion {

    WebDriver driver;
    @BeforeMethod
    public void launchingWebsite(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }


@Test
public void LoginBtnIsDisplayed(){

//login
    WebElement logIn = driver.findElement(By.xpath("//*[@id='btnLogin']"));

    boolean isdisplayed = logIn.isDisplayed();
    Assert.assertTrue(isdisplayed);

// use soft assertion because you have more that 1 assertion

    SoftAssert soft=new SoftAssert();
// assertion
    soft.assertTrue(isdisplayed);
// test if it is enabled
    boolean isenabled = logIn.isEnabled();
//assertion
    soft.assertTrue(isenabled);
// assert all
    soft.assertAll();


}




    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }


}
