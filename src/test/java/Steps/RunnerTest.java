package Steps;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = ("src/test/resources/Features"),
        glue = {"Steps"},
        tags = "@Depot",
        plugin = {"pretty", "html:target/HTMLReports/report.html"}
)
public class RunnerTest {

}
