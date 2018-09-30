package Tests;

import Pages.CheckPageSizePage;
import Steps.loginSteps;
import Steps.prpofileSteps;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static org.testng.Assert.assertEquals;

public class checkPageSize {
    @BeforeTest
    public void Setup(){
        Configuration.remote = "http://localhost:4444/wd/hub";
        Configuration.browser = "chrome";

        loginSteps login = new loginSteps();
        login.LoginToJira();

        prpofileSteps openUserProfile = new prpofileSteps();
        openUserProfile.OpenUserProfile();
    }

    @Test(priority = 1)

    public void pageSizeCheck()throws InterruptedException {
        String successMessage = "//*[@id='userprofile-notify']/text()[normalize-space()]";
        CheckPageSizePage updatePageSize = new CheckPageSizePage();
        updatePageSize.pageSize("20");

        String pageSizeView = "//*[@id = 'up-p-pagesize']";
        Thread.sleep(1000);
        assertEquals($(By.xpath(pageSizeView)).waitUntil(Condition.visible, 2000).getText(),"20");
    }

    @AfterTest
    public void returnPageSizeValue(){
        CheckPageSizePage updatePageSize = new CheckPageSizePage();
        updatePageSize.pageSize("50");

        String pageSizeView = "//*[@id = 'up-p-pagesize']";
        //Thread.sleep(1000);
        assertEquals($(By.xpath(pageSizeView)).waitUntil(Condition.visible, 2000).getText(),"50");
    }

}
