package AutomateScenario;

import Pages.Login_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class Base {
    WebDriver driver;
    Login_Page loginPage;
    @BeforeClass
    public void setup()
    {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        loginPage= new Login_Page(driver);
        driver.manage().window().maximize();
    }
   @AfterClass
        public void tearDown()
    {
       driver.quit();
    }

}
