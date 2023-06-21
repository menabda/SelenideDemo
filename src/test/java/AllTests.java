import Steps.ElementsStepsFirst;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AllTests {
    ElementsStepsFirst elementsSteps = new ElementsStepsFirst();
    @BeforeClass
    public void configs() {
        Configuration.timeout = 20000;
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Selenide.open("https://swoop.ge/");
    }
    @Test
    public void FirstMethod(){

        elementsSteps
                .ClickOnLogin().FillEmailAndPassword();
        Assert.assertEquals(elementsSteps.GetAlert(),"მეილი ან პაროლი არასწორია, თუ დაგავიწყდათ პაროლი,გთხოვთ ისარგებლოთ პაროლის აღდგენის ფუნქციით!");
        Assert.assertTrue(elementsSteps.PasswordIsClear());
    }

}
