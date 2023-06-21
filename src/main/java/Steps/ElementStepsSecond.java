package Steps;

import Data.DataRegistration;
import Pages.Home;
import Pages.Registration;
import com.codeborne.selenide.Condition;

public class ElementStepsSecond {
    Home home = new Home();
    Registration registration = new Registration();
    DataRegistration dataRegistration = new DataRegistration();

    public ElementStepsSecond ClickLogin() {
        home.login.click();
        return this;
    }
    public ElementStepsSecond NavigateToRegistration() {
        registration.registrationTitle.click();
        return  this;

    }
    public ElementStepsSecond ValidateIndividual() {
        registration.individualPerson.shouldBe(Condition.visible).shouldBe(Condition.enabled);
        return this;
    }
    public ElementStepsSecond ClickRegButton() {
        registration.registrationBtn.click();
        return this;
    }
    public ElementStepsSecond SubscribeCheck() {
        registration.newsletter.shouldBe(Condition.checked);
        return this;
    }
    public ElementStepsSecond AlertCheck() {
        registration.nameAlert.shouldHave(Condition.text(dataRegistration.alertMsg));
        return this;
    }

}
