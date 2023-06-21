package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Login {
    public SelenideElement
            login = $(By.xpath("//*[@class='HeaderTools swoop-login']")),
            email = $("#emailinp"),
            password = $("#feed-password"),
            authorisation = $("#AuthBtn"),
            alert = $("#authInfo");
}
