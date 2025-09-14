package io.loop.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.loop.pages.GoogleSearchPage;
import io.loop.utilities.BrowserUtils;
import io.loop.utilities.ConfigurationReader;
import io.loop.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class GoogleSearchStepDefs {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @Given("user is on Google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get(ConfigurationReader.getProperties("google.url"));
    }
    @When("user types Loop Academy in the google search box and clicks enter")
    public void user_types_loop_academy_in_the_google_search_box_and_clicks_enter() {
        googleSearchPage.searchBox.sendKeys("Loop Academy" + Keys.ENTER);
    }
    @Then("user should be able to see Loop Academy - Google search in the google title Story:")
    public void user_should_be_able_to_see_loop_academy_google_search_in_the_google_title_story() {
        String actual = Driver.getDriver().getTitle();
        assertEquals("Expected does not match", "Loop Academy - Google Search", actual);
    }

    @When("user types {string} in the google search box and clicks enter")
    public void user_types_in_the_google_search_box_and_clicks_enter(String input) {
        googleSearchPage.searchBox.sendKeys(input +  Keys.ENTER);

    }
    @Then("user should be able to see {string} in the google title")
    public void user_should_be_able_to_see_search_in_the_google_title(String expectedTitle) {
        WebDriverWait wait = new WebDriverWait( Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleIs(expectedTitle));
        String actual = Driver.getDriver().getTitle();
        assertEquals("Expected does NOT match actual", expectedTitle, actual);
    }

    @When("user searches for {string}")
    public void user_searches_for(String country) {
        googleSearchPage.searchBox.sendKeys("What is the capital of " + country + Keys.ENTER);
    }

    @Then("user should see {string} in the results as capital")
    public void user_should_be_able_to_see_in_the_results_as_capital(String capital) {
        assertEquals("Expected capital city: " + capital + " does not match ith actual one." + googleSearchPage.capital.getText(), capital, googleSearchPage.capital.getText() );
    }

    @Then("we love Loop Academy")
    public void we_love_loop_academy() {
        System.out.println("We love Loop");

    }

//    @Then("user searches the following items")
//    public void user_searches_the_following_items(List <String> items) {
//        for (String item : items) {
//            googleSearchPage.searchBox.clear();
//            googleSearchPage.searchBox.sendKeys(item +Keys.ENTER);
//            WebDriverWait wait = new WebDriverWait( Driver.getDriver(), Duration.ofSeconds(10));
//            wait.until(ExpectedConditions.titleIs(item + " - Google Search"));
//            assertEquals("expected does not match actual", item + " - Google Search", Driver.getDriver().getTitle());
//            BrowserUtils.takeScreenshot();
//        }
//
//        items.forEach(p-> {
//            googleSearchPage.searchBox.clear();
//            googleSearchPage.searchBox.sendKeys(p + Keys.ENTER);
//            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
//            wait.until(ExpectedConditions.titleIs(p + " - Google Search"));
//            assertEquals("Expected does not match the actual", p + " - Google Search", Driver.getDriver().getTitle());
//            BrowserUtils.takeScreenshot();
//        });
//
//
//
//    }
@Then("user searches the following items")
public void user_searches_the_following_items(List <Map<String,String> >items) {
   for (Map <String, String> item : items) {
       System.out.println("item.get(\"Items\") = " + item.get("items"));
       googleSearchPage.searchBox.clear();
       googleSearchPage.searchBox.sendKeys(item.get("items") + Keys.ENTER);
       WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
       wait.until(ExpectedConditions.titleIs(item.get("items") + " - Google Search"));
       assertEquals("Expected does not match the actual", item.get("items") + " - Google Search", Driver.getDriver().getTitle());
       BrowserUtils.takeScreenshot();

   }
}




}
