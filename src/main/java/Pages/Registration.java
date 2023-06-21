package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Registration {
    public SelenideElement
            registrationTitle = $(By.xpath("//*[text()='რეგისტრაცია']")),
            individualPerson = $(By.xpath("//*[text()='ფიზიკური პირი']")),
            registrationBtn = $(By.xpath("//*[@class='dashbord-registration']")),
            newsletter = $("#pIsSubscribedNewsletter"),
            nameAlert = $("#physicalInfoMassage")
            ;
}
