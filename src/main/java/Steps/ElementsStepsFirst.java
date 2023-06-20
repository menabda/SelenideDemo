package Steps;

import Pages.ElementsPageFirst;

public class ElementsStepsFirst {
    ElementsPageFirst elementsPage = new ElementsPageFirst();
    public void ClickOnLogin(){
        elementsPage.login.click();
    }
    public void FillEmailAndPassword(){
        elementsPage.email.sendKeys("test@gmail.com");
        elementsPage.password.sendKeys("123123asdASD");
        elementsPage.authorisation.click();
    }

    public String GetAlert() throws InterruptedException {
        Thread.sleep(3000);

        return elementsPage.alert.getText();
    }
    public boolean PasswordIsClear() {
        return elementsPage.password.text().equals("");
    }
}
