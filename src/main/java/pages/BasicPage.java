package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class BasicPage {
    public void clickButton(String text) {
        $(byXpath("//button[text()='" + text + "']")).click();
    }

    public void titleContentIsVisible(String text) {
        //$(By.xpath("//*[text()='" + text + "']")).shouldBe(Condition.visible);
        $(By.className("iac-section-container")).lastChild().shouldHave(Condition.text(text));
    }

    public void clickText(String text){
        $(byText(text)).click();
    }
}
