package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MainPage;

public class MainPageDef {
    MainPage mainPage = new MainPage();

    @Then("input Login")
    public void inputLogin() {
        mainPage.setInputLogin();
    }

    @Then("input Password")
    public void inputPassword() {
        mainPage.setInputPassword();

    }

    @When("Click login")
    public void clickLogin() {
        mainPage.clickLogin();
    }

}
