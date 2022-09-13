package co.com.choucair.certification.utestchoucairtesting.stepdefinitions;

import co.com.choucair.certification.utestchoucairtesting.model.Utest_Data;
import co.com.choucair.certification.utestchoucairtesting.questions.Answer;
import co.com.choucair.certification.utestchoucairtesting.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
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
        OnStage.theActorInTheSpotlight().attemptsTo(FillPersonalInfo.theForm(data), FillUserAddress.theForm(data),
                FillDevicesInfo.theForm(data), FillUserPassword.theForm(data));

    }

    @Then("^he completes the registration process successfully$")
    public void heCompletesTheRegistrationProcessSuccessfully(List<Utest_Data> question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }
}
