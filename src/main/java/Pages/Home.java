package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Home {
    public SelenideElement
            login = $(By.xpath("//*[@class='HeaderTools swoop-login']")),
            restCategory = $(By.xpath("(//*[@class='MoreCategories'])[3]"));

}
