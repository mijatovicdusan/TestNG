package class04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
public class loginTest {

    //go to syntax hrms
    //verify that you get invalid credentials message on entering wrong username

    WebDriver driver;
    @BeforeMethod
    public void launchingWebsite(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    }

    @Test
    public void LoginWithInvalidCredentials () {

        //finding the username text box
        WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        //send username
        username.sendKeys("Admin");
        //finding password field
        WebElement password = driver.findElement(By.xpath("//input[@id = 'txtPassword']"));
        //send password
        password.sendKeys("123456");
        //finding element login btn
        WebElement logIn = driver.findElement(By.xpath("//*[@id='btnLogin']"));
        //click login
        logIn.click();
        //get the element message invalid credentials
        WebElement errorMsg= driver.findElement(By.xpath("//span[@id='spanMessage']"));
        //extract error message
        String actualError= errorMsg.getText();
        //assertion
        Assert.assertEquals(actualError,"Invalid credentials");

    }
    @AfterMethod
    public void closeBrowser () {

        driver.quit();
    }







}
