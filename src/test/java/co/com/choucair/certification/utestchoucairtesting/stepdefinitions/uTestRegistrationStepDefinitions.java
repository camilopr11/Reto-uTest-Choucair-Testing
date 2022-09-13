package co.com.choucair.certification.utestchoucairtesting.stepdefinitions;

import co.com.choucair.certification.utestchoucairtesting.model.Utest_Data;
import co.com.choucair.certification.utestchoucairtesting.tasks.FillPersonalInfo;
import co.com.choucair.certification.utestchoucairtesting.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class uTestRegistrationStepDefinitions {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Camilo wants to register on uTest website$")
    public void thanCamiloWantsToRegisterOnUTestWebsite() {
        OnStage.theActorCalled("Camilo").wasAbleTo(OpenUp.thePage());

    }


    @When("^he fills all required personal information$")
    public void heFillsAllRequiredPersonalInformation(List<Utest_Data> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(FillPersonalInfo.theForm(data));

    }

    @Then("^he completes the registration process successfully$")
    public void heCompletesTheRegistrationProcessSuccessfully() {

    }
}
