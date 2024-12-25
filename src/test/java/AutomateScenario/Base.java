package AutomateScenario;
import pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.github.cdimascio.dotenv.Dotenv;

public class Base {
    private WebDriver driver;
    protected LoginPage loginPage;
    

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        Dotenv dotenv = Dotenv.load();

        // Get the base URL
        String baseUrl = dotenv.get("BASE_URL");
        driver.get(baseUrl);
        loginPage = new LoginPage(driver);
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
