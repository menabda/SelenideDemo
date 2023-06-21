import Steps.ElementStepsFirst;
import Steps.ElementStepsSecond;
import Steps.ElementStepsThird;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Configs.class)
public class AllTests extends Configs{

    ElementStepsFirst elementStepsFirst = new ElementStepsFirst();
    ElementStepsSecond elementStepsSecond = new ElementStepsSecond();
    ElementStepsThird elementStepsThird = new ElementStepsThird();


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
