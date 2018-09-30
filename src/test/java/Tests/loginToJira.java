package Tests;

import Pages.loginToJiraPage;
import Properties.ConfigProperties;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.testng.AssertJUnit.assertEquals;


public class loginToJira {
    String login;
    String pass;
    String jUrl;
    @BeforeTest
    public void setup(){
        Configuration.remote = "http://localhost:4444/wd/hub";
        Configuration.browser = "chrome";
        ConfigProperties config = new ConfigProperties();
        login = config.DataPropertiesFromFile("login");
        pass = config.DataPropertiesFromFile("password");
        jUrl = config.DataPropertiesFromFile("jiraUrl");
    }

    @Test(priority = 1)
    public void loginToJira(){
        open(jUrl);
        loginToJiraPage loginTo = new loginToJiraPage();
        String pageTitle = "/html/head/title";

        loginTo.LoginToJira(login, pass);
        assertEquals($(By.xpath(pageTitle)).innerText(), "System Dashboard - Hillel IT School JIRA");

}
}
