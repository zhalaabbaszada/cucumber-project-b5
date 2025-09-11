package io.loop.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.loop.pages.HomePage;
import io.loop.pages.LoginPage;
import io.loop.utilities.BrowserUtils;
import io.loop.utilities.ConfigurationReader;
import io.loop.utilities.DocuportConstants;
import io.loop.utilities.Driver;

import static org.junit.Assert.assertTrue;

public class LoginStepDefs {
    LoginPage loginPage =  new LoginPage();
    HomePage homePage =  new HomePage();

    @Given("user is on Docuport login page")
    public void user_is_on_docuport_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperties("docuportBETA"));
    }
    @When("user enters username for client")
    public void user_enters_username_for_client() {
        BrowserUtils.waitForClickable(loginPage.loginButton, DocuportConstants.MEDIUM);
        assertTrue("Login button is not displayed",loginPage.loginButton.isDisplayed());
        loginPage.userNameInput.sendKeys(DocuportConstants.USERNAME_CLIENT);
    }

    @When("user enters password for client")
    public void user_enters_password_for_client() {
        loginPage.passwordInput.sendKeys(DocuportConstants.PASSWORD_ALL_ROLES);
    }

    @When("user clicks login button")
    public void user_clicks_login_button() {
        loginPage.loginButton.click();
    }

    @Then("user should be able to see the home page for client")
    public void user_should_be_able_to_see_the_home_page_for_client() throws InterruptedException {
        Thread.sleep(3000);
        homePage.continueButton.click();
        Thread.sleep(3000);
        assertTrue("Home Page is not loaded", homePage.logo.isDisplayed());
    }
    @When("user enters username for employee")
    public void user_enters_username_for_employee() {
        loginPage.userNameInput.sendKeys(DocuportConstants.USERNAME_EMPLOYEE);
    }
    @When("user enters password for employee")
    public void user_enters_password_for_employee() {
        loginPage.passwordInput.sendKeys(DocuportConstants.PASSWORD_ALL_ROLES);
    }
    @Then("user should be able to see the home page for employee")
    public void user_should_be_able_to_see_the_home_page_for_employee() {
        assertTrue("Home Page is not loaded", homePage.logo.isDisplayed());
    }
    @When("user enters username for advisor")
    public void user_enters_username_for_advisor() {
        loginPage.userNameInput.sendKeys(DocuportConstants.USERNAME_ADVISOR);
    }
    @When("user enters password for advisor")
    public void user_enters_password_for_advisor() {
        loginPage.passwordInput.sendKeys(DocuportConstants.PASSWORD_ALL_ROLES);
    }
    @Then("user should be able to see the home page for advisor")
    public void user_should_be_able_to_see_the_home_page_for_advisor() {
        assertTrue("Home Page is not loaded", homePage.logo.isDisplayed());
    }
    @When("user enters username for supervisor")
    public void user_enters_username_for_supervisor() {
        loginPage.userNameInput.sendKeys(DocuportConstants.USERNAME_SUPERVISOR);
    }
    @When("user enters password for supervisor")
    public void user_enters_password_for_supervisor() {
        loginPage.passwordInput.sendKeys(DocuportConstants.PASSWORD_ALL_ROLES);
    }
    @Then("user should be able to see the home page for supervisor")
    public void user_should_be_able_to_see_the_home_page_for_supervisor() {
        assertTrue("Home Page is not loaded", homePage.logo.isDisplayed());
    }
}
