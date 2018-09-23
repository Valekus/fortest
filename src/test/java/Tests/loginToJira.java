package Tests;

import Pages.loginToJiraPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class loginToJira {
    public static void main(String[] args){
        open("http://jira.hillel.it:8080/login.jsp");
        loginToJiraPage login = new loginToJiraPage();
        login.enterUserName("webinar5");
        login.enterUserPass("webinar5");
        login.clickToEnterButton();
        login.onPage();
    }
}
