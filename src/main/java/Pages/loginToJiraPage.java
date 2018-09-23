package Pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class loginToJiraPage {
    String userNameXpath = "//*[@id=\'login-form-username\']";
    String userPassXpath = "//*[@id=\'login-form-password\']";
    String loginButtonXpath = "//*[@id=\"login-form-submit\"]";
    String onPage = "//body/div[1]/section/dashboard/div[1]/div/div[1]/div/div[1]/h1";

    public void enterUserName(String userName){$(By.xpath(userNameXpath)).sendKeys("webinar5");}
    public void enterUserPass(String userPass){$(By.xpath(userPassXpath)).sendKeys("webinar5");}
    public void clickToEnterButton(){$(By.xpath(loginButtonXpath)).click();}
    public boolean onPage(){return $(By.xpath(onPage)).isDisplayed();}
}
