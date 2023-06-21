package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.impl.WebElementsCollectionWrapper;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class RestCategory {
    public SelenideElement
        minprice = $(By.xpath("//*[@id='sidebar-container']//*[@id='minprice']")),
        maxprice = $(By.xpath("//*[@id='sidebar-container']//*[@id='maxprice']")),
        searchBtn = $(By.xpath("(//*[@class='submit-button'])[2]"))

            ;
        public ElementsCollection prices = $$(By.xpath("//*[@class='discounted-prices']/p[1]"));

}
