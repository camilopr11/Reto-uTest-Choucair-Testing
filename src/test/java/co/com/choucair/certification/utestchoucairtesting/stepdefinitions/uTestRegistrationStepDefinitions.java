package co.com.choucair.certification.utestchoucairtesting.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class uTestRegistrationStepDefinitions {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Camilo wants to register on uTest website$")
    public void thanCamiloWantsToRegisterOnUTestWebsite() {

    }


    @When("^he fills all required personal information$")
    public void heFillsAllRequiredPersonalInformation() {

    }

    @Then("^he completes the registration process successfully$")
    public void heCompletesTheRegistrationProcessSuccessfully() {

    }
}