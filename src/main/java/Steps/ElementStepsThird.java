package Steps;

import Pages.Home;
import Pages.Login;
import Pages.RestCategory;
import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;

public class ElementStepsThird {
    Home home = new Home();
    RestCategory rest = new RestCategory();
    public ElementStepsThird ClickCategory() {
        home.restCategory.click();

        return  this;
    }
    public ElementStepsThird FilterPrice(){
        rest.minprice.sendKeys("170");
        rest.maxprice.sendKeys("180");
        rest.searchBtn.click();
        return this;
    }
    public String substring(String str) {
        {
            str = str.substring(0, str.length() - 1);

            return str;
        }
    }
    public ElementStepsThird CheckPrices() {
        rest.prices.shouldHave(CollectionCondition.size(21));
        boolean status = true;

        for (SelenideElement sel : rest.prices){
            String s = substring(sel.getText());
            int i = Integer.parseInt(s);
            if (i <= 180 && i >= 170){

            }else {
                status= false;
            }
            System.out.println(i);
        }

        Assert.assertTrue(status);
        return  this;
    }
}
