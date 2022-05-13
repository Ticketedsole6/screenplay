package com.pageautomation.tests.stepdefinitions;

import com.pageautomation.automation.interactions.OpenTheBrowser;
import com.pageautomation.automation.tasks.SecureAreaValidations;
import com.pageautomation.automation.tasks.SetLogin;
import com.pageautomation.automation.ui.LoginPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SecureLoginStepDefinitions {
    @Managed
    private WebDriver driver;

    @Before
    public void actorSetUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("actor").can(BrowseTheWeb.with(driver));
    }

    @Given("^that a web user wants to login in page automation$")
    public void thatAWebUserWantsToLoginInPageAutomation() {
        theActorInTheSpotlight().attemptsTo(OpenTheBrowser.on(LoginPage.URL));
    }

    @When("^he writes the correct credentials$")
    public void heWritesTheCorrectCredentials() {
        theActorInTheSpotlight().attemptsTo(SetLogin.loginSccesfull());
    }

    @Then("^he should see the section secure page$")
    public void heShouldSeeTheSectionSecurePage() {
        theActorInTheSpotlight().attemptsTo(SecureAreaValidations.validations());
    }
}
