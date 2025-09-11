package io.loop.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.loop.pages.HW_WebOrderLoginPages;
import io.loop.pages.HW_WebOrdersHomePages;
import io.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class HW_WebOrdersStepDefs {

    HW_WebOrderLoginPages loginPage =  new HW_WebOrderLoginPages();
    HW_WebOrdersHomePages homePage =  new HW_WebOrdersHomePages();
    @Given("user is on WebOrders Login Page")
    public void user_is_on_web_orders_login_page() {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }
    @When("user logs in with username {string} and password {string}")
    public void user_logs_in_with_username_and_password(String username, String password) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(loginPage.usernameField));
        loginPage.usernameField.sendKeys(username);
        loginPage.passwordField.sendKeys(password);
        loginPage.loginButton.click();
    }
    @Then("user should be able to see the home page")
    public void user_should_be_able_to_see_the_home_page() {
        String expected = "Web Orders";
        assertEquals("Actual does not match", expected, Driver.getDriver().getTitle());
    }
    @Then("user should be able to print out the count of the links")
    public void user_should_be_able_to_print_out_the_count_of_the_links() {
        System.out.println("Total links: " + homePage.links.size());
    }
    @Then("user should be able to print out each link test")
    public void user_should_be_able_to_print_out_each_link_test() {
        for (WebElement each : homePage.links){
            System.out.println(each.getText());
        }

    }
}
