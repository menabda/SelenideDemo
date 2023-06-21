import Steps.ElementStepsFirst;
import Steps.ElementStepsSecond;
import Steps.ElementStepsThird;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AllTests {
    ElementStepsFirst elementStepsFirst = new ElementStepsFirst();
    ElementStepsSecond elementStepsSecond = new ElementStepsSecond();
    ElementStepsThird elementStepsThird = new ElementStepsThird();
    @BeforeClass
    public void configs() {
        Configuration.timeout = 20000;
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";

    }
    @BeforeMethod
    public void Swoop() {
        Selenide.open("https://swoop.ge/");
    }
    @Test
    public void FirstMethod(){

        elementStepsFirst
                .ClickOnLogin()
                .FillEmailAndPassword()
                .GetAlert()
                .PasswordIsClear();

    }
    @Test
    public void SecondMethod(){
        elementStepsSecond
                .ClickLogin()
                .NavigateToRegistration()
                .ValidateIndividual()
                .ClickRegButton()
                .SubscribeCheck()
                .AlertCheck()
                ;
    }
    @Test
    public void ThirdMethod() {
        elementStepsThird
                .ClickCategory()
                .FilterPrice()
                .CheckPrices()
                ;

    }

}
