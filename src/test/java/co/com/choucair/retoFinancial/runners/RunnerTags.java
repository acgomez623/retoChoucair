package co.com.choucair.retoFinancial.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/RegisterUTestFeature.feature",
        tags = "@stories",
        glue = "co.com.choucair.retoFinancial.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class RunnerTags {
}
