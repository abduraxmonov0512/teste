package steps;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.Before;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Hooks {
    private SelenideElement languageDropDown = $(By.xpath("//span[@class='title']"));
    private SelenideElement languageRu = $(By.xpath("//div[text()='Ru']"));
    @Before
    public void openPage(){
        open("http://demo.tender.mf.uz/");
        languageDropDown.click();
        languageRu.click();
    }
}
