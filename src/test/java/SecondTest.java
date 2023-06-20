import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;

public class SecondTest {
    @BeforeClass
    public void configs() {
        Configuration.timeout = 20000;
        System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
        System.setProperty("selenide.browser", "Chrome");
        //Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
    }
}
