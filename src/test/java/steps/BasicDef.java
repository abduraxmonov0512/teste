package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasicPage;

public class BasicDef {
    BasicPage basiPage = new BasicPage();

    @Then("Click {string} button")
    public void clickButton(String arg0)  {
        basiPage.clickButton(arg0);
    }


    @When("Click {string} text")
    public void clickText(String arg0) {
        basiPage.clickText(arg0);

    }

    @Then("Tittle content {string} is visible")
    public void tittleContentIsVisible(String arg0) {
        basiPage.titleContentIsVisible(arg0);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
