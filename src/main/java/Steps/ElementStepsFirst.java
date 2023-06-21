package Steps;

import Data.DataLogin;
import Pages.Home;
import Pages.Login;
import com.codeborne.selenide.Condition;

public class ElementStepsFirst {
    Home home = new Home();
    Login login = new Login();
    DataLogin data = new DataLogin();
    public ElementStepsFirst ClickOnLogin(){
        home.login.click();
        return this;

    }
    public ElementStepsFirst FillEmailAndPassword(){
        login.email.sendKeys(data.email);
        login.password.sendKeys(data.password);
        login.authorisation.click();
        return this;
    }

    public ElementStepsFirst GetAlert() {
        login.alert.shouldBe(Condition.visible);
        login.alert.shouldHave(Condition.text(data.errorMessage));
        return this;
    }
    public ElementStepsFirst PasswordIsClear() {
        login.password.shouldBe(Condition.empty);
        return this;
    }
}
