package Pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DragTaskOnBoardPage {

    String onlyMyIssueButtonXPath = "//div/dl/div/dd[1]";
    String qaaut6Task545Xpath = "//div[2]/ul/li[1]/div/div[1]";
    String devColumnXpath = "//div[1]/div/div[2]/ul/li[2]";
    String projectDDXxpath = "//nav/div/div/ul/li[2]";         //"//*[@id=\"browse_link\"";
    String qaautoProjectXpath = "//*[@id=\"admin_main_proj_link_lnk\"]";

    public void DragTasOnBoard(){
        //$(By.xpath(projectDDXxpath)).waitUntil(Condition.visible, 2000).click();
        //$(By.id(qaautoProjectXpath)).waitUntil(Condition.visible, 2000).click();

        $(By.xpath(onlyMyIssueButtonXPath)).waitUntil(Condition.visible, 2000).click();
        $(By.xpath(qaaut6Task545Xpath)).waitUntil(Condition.visible, 3000).dragAndDropTo($(By.xpath(devColumnXpath)));

    }
}
