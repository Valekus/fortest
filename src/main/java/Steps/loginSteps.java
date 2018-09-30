package Steps;

import Pages.loginToJiraPage;
import Properties.ConfigProperties;
import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.open;

public class loginSteps {
    String login;
    String pass;
    String jUrl;

    public void LoginToJira(){
        Configuration.remote = "http://localhost:4444/wd/hub";
        Configuration.browser = "chrome";
        ConfigProperties config = new ConfigProperties();
        jUrl = config.DataPropertiesFromFile("jiraUrl");
        pass = config.DataPropertiesFromFile("password");
        login = config.DataPropertiesFromFile("login");

        open(jUrl);
        loginToJiraPage loginPage = new loginToJiraPage();
        loginPage.LoginToJira(login, pass);
    }
}
