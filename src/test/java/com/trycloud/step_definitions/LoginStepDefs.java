package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user use username {string} and passcode {string}")
    public void user_use_username_and_passcode(String username, String password) {
        loginPage.login(username);

    }

    @When("user click the login button")
    public void user_click_the_login_button() {
        loginPage.loginButton.click();
    }

    @Then("user should be at the dashboard page")
    public void user_should_be_at_the_dashboard_page() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("dashboard"));

    }

}
