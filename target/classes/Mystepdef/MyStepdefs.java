package Mystepdef;

import io.cucumber.java.en.Then;

public class MyStepdefs {
    Facebook fc=new Facebook();
    @Then("user navigate to home page")
    public void userNavigateToHomePage() {
        fc.user();
    }
}
