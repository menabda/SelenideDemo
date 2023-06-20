import Steps.ElementsStepsFirst;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstTest {
    ElementsStepsFirst elementsSteps = new ElementsStepsFirst();
    @BeforeClass
    public void configs() {
        Configuration.timeout = 20000;
        //System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
        //System.setProperty("selenide.browser", "Chrome");
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
    }
    @Test
    public void FirstMethod() throws InterruptedException {
        Selenide.open("https://swoop.ge/");
        elementsSteps.ClickOnLogin();
        elementsSteps.FillEmailAndPassword();
        Assert.assertEquals(elementsSteps.GetAlert(),"მეილი ან პაროლი არასწორია, თუ დაგავიწყდათ პაროლი,გთხოვთ ისარგებლოთ პაროლის აღდგენის ფუნქციით!");
        Assert.assertTrue(elementsSteps.PasswordIsClear());
    }

}
