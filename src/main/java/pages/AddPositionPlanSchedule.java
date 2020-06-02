package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AddPositionPlanSchedule extends BasicPage {
    private SelenideElement search = $(By.xpath("//input[@placeholder='Найти']"));
    private SelenideElement volume = $(By.xpath("//input[@class = 'control']"));
    private SelenideElement unit = $(By.xpath("//label[text()='Единица измерения']"));
    private SelenideElement cost = $(By.xpath("//label[text()='Цена за единицу']"));
    private SelenideElement currency = $(By.xpath("//label[text()='Валюта']"));

    public void setTypePositionPlanSchedule(String type){
        $(By.xpath("//div[@class='control']//div[contains(text(),',')]")).click();
        clickText(type);
    }

    public void setMonthPositionPlanSchedule(String month){
        clickText("Месяц");
        clickText(month);
    }

    public void setProductPositionPlanSchedule(String name){
        clickText("Товар");
        search.sendKeys(name);
        clickText(name);
    }

    public void setVolumePositionPlanSchedule(String volumeNum){
        volume.sendKeys(volumeNum);
    }

    public void setUnitPositionPlanSchedule(String name){
        unit.click();
        clickText(name);
    }

    public void setCostPositionPlanSchedule(String num){
        cost.sendKeys(num);
    }

    public void setCurrencyPositionPlanSchedule(String curr){
        currency.click();
        clickText(curr);
    }

    public void clickCreate(){
        clickText("Создать");
    }
}
