package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FreeRangeNavegacaoSteps {

    @Given("I navigate to www.freerangetesters.com")
    public void navigateToWebsite() {
        System.out.println("Opening website");
    }

    @When("I try to access the free sections through the navigation bar")
    public void accessFreeSections() {
        System.out.println("Accessing free sections");
    }

    @Then("I am redirected to the right page")
    public void validateRedirection() {
        System.out.println("Validating redirection");
    }
}
