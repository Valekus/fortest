package Tests;

import Pages.DragTaskOnBoardPage;
import Steps.loginSteps;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;


public class checkDragIssueOnBoard {
    @BeforeTest
    public void Setup(){
        Configuration.remote = "http://localhost:4444/wd/hub";
        Configuration.browser = "chrome";

        loginSteps login = new loginSteps();
        login.LoginToJira();

        open("http://jira.hillel.it:8080/secure/RapidBoard.jspa?rapidView=302&projectKey=QAAUT6&selectedIssue=QAAUT6-545");
    }

    @Test(priority = 1)

    public void checkDragIssue()throws InterruptedException{
        DragTaskOnBoardPage drag = new DragTaskOnBoardPage();

        drag.DragTasOnBoard();
    }

}
