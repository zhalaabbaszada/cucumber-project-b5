package io.loop.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.loop.pages.HW_WikipediaPage;
import io.loop.utilities.DocuportConstants;
import io.loop.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class HW_WikipediaStepDefs {
    HW_WikipediaPage hW_WikipediaPage = new HW_WikipediaPage();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org/");
        String expectedWikiTitle = "Wikipedia";
        assertEquals("Actual does not match expected", expectedWikiTitle, Driver.getDriver().getTitle());
    }
    @When("User types {string} in the wiki search box and search for it")
    public void user_types_in_the_wiki_search_box(String searchObject) {
        hW_WikipediaPage.searchBox.sendKeys(searchObject + Keys.ENTER);
    }
    @Then("User sees {string} is in the wiki title")
    public void user_sees_is_in_the_wiki_title(String expected) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(DocuportConstants.LARGE));
        wait.until(ExpectedConditions.titleContains(expected));
        assertEquals("Actual does not match expected", expected, Driver.getDriver().getTitle());
    }
    @Then("User sees {string} is in the header")
    public void user_sees_is_in_the_header(String expected) {
        assertEquals("Actual does not match expected", expected, hW_WikipediaPage.header.getText());
    }
    @Then("User sees {string} is in the image header")
    public void user_sees_is_in_the_image_header(String expected) {
        assertEquals("Actual does not match expected", expected, hW_WikipediaPage.imageHeader.getText());

    }
}
