import com.codeborne.selenide.Configuration;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features",
        strict = false
)
public class RunTest {
    @BeforeClass
    public static void setupClass(){
        WebDriverManager.chromedriver().setup();
        //Configuration.headless = true;
    }
}
