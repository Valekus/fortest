package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;

public class loginToJiraPage {
    String userNameXpath = "//*[@id=\'login-form-username\']";
    String userPassXpath = "//*[@id=\'login-form-password\']";
    String loginButtonXpath = "//*[@id=\"login-form-submit\"]";
    String onPage = "//body/div[1]/section/dashboard/div[1]/div/div[1]/div/div[1]/h1";

    public  void LoginToJira(String login, String password){
        $(By.xpath(userNameXpath)).sendKeys(login);
        $(By.xpath(userPassXpath)).sendKeys(password);
        $(By.xpath(loginButtonXpath)).sendKeys(Keys.ENTER);
        $(By.xpath(onPage)).isDisplayed();
    }

    /*public void enterUserName(String userName){$(By.xpath(userNameXpath)).sendKeys("webinar5");}
    public void enterUserPass(String userPass){$(By.xpath(userPassXpath)).sendKeys("webinar5");}
    public void clickToEnterButton(){$(By.xpath(loginButtonXpath)).click();}
    public boolean onPage(){return $(By.xpath(onPage)).isDisplayed();}*/
}
