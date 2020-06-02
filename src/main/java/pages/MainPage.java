package pages;

import com.codeborne.selenide.SelenideElement;
import helpers.ConfigHelper;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage extends BasicPage{
    ConfigHelper configHelper = new ConfigHelper();
    private SelenideElement inputLogin = $(By.xpath("//input[@name='login']"));
    private SelenideElement inputPassword = $(By.xpath("//input[@name='password']"));
    private SelenideElement clickLogin = $(By.cssSelector("button.ui-btn:nth-child(3)"));


    public void setInputLogin(){
        inputLogin.val(configHelper.getLoginUser());
    }

    public void setInputPassword(){
        inputPassword.val(configHelper.getPasswordUser());
    }

    public void clickLogin(){
        clickLogin.click();
    }

}
