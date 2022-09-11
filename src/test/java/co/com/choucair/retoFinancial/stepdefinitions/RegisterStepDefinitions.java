package co.com.choucair.retoFinancial.stepdefinitions;

import co.com.choucair.retoFinancial.model.RegisterData;
import co.com.choucair.retoFinancial.questions.Answer;
import co.com.choucair.retoFinancial.tasks.Join;
import co.com.choucair.retoFinancial.tasks.OpenUp;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class RegisterStepDefinitions {

    @Before
    public void setStage(){ OnStage.setTheStage(new OnlineCast()); }

    @Given("^than Angie needs join to the UTest community$")
    public void thanAngieNeedsJoinToTheUTestCommunity() {
        OnStage.theActorCalled("Angie").wasAbleTo(OpenUp.thePage());
    }

    @When("^she completes the registration form$")
    public void sheCompletesTheRegistrationForm(List<RegisterData> registerData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Join.onThePage(registerData.get(0).getFirstName(),
                registerData.get(0).getLastName(), registerData.get(0).getMail(),
                registerData.get(0).getMonth(), registerData.get(0).getDay(),
                registerData.get(0).getYear(), registerData.get(0).getPassword()));
    }

    @Then("^system displays a welcome message:$")
    public void systemDisplaysAWelcomeMessage(List<RegisterData> registerData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(registerData.get(0).getMessage())));
    }

}
