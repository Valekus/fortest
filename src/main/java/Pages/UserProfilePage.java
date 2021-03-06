package Pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class UserProfilePage {

    String userDetailsButton = "//*[@id='header-details-user-fullname']";
    String viewProfile = "//*[@id='view_profile']";

    public void openProfileWindow(){
        $(By.xpath(userDetailsButton)).waitUntil(Condition.visible, 2000).click();
        $(By.xpath(viewProfile)).waitUntil(Condition.visible, 2000).click();
    }
}
