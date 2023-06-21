package Steps;

import Data.DataLogin;
import Pages.Home;
import Pages.Login;
import com.codeborne.selenide.Condition;

public class ElementsStepsFirst {
    Home home = new Home();
    Login login = new Login();
    DataLogin data = new DataLogin();
    public ElementsStepsFirst ClickOnLogin(){
        home.login.click();
        return this;

    }
    public ElementsStepsFirst FillEmailAndPassword(){
        login.email.sendKeys(data.email);
        login.password.sendKeys(data.password);
        login.authorisation.click();
        return this;
    }

    public String GetAlert() {
        login.alert.shouldBe(Condition.visible);
        return login.alert.getText();
    }
    public boolean PasswordIsClear() {
        return login.password.text().equals("");
    }
}
