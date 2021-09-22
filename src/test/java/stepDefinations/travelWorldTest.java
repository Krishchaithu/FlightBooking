package stepDefinations;

import driverFactory.BrowserConfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.travelHomePage;

public class travelWorldTest {
    private BrowserConfig browserConfig ;
    private travelHomePage homePage = new travelHomePage(browserConfig.getDriver());
//    WebDriver driver;

    @Given("Travel world home page")
    public void travel_world_home_page() {
        homePage.Launch();
    }

    @Then("Verify page title is {string}")
    public void verify_page_title_is(String string) {
        String title = homePage.pageTitle();
        Assert.assertEquals(string,title);
    }

    @Then("page heading is {string}")
    public void page_heading_is(String string) {
        String head = homePage.verifyHeading();
        Assert.assertEquals(string,head);
    }

    @Then("verify destination of the week! The Beach! link is available")
    public void verify_destination_of_the_week_the_beach_link_is_available() {
        Assert.assertTrue(homePage.verifyDestLink());
    }

    @Then("select departure city as {string}")
    public void select_departure_city_as(String string) {
        homePage.selectFromLoc(string);
    }

    @Then("select destination city as {string}")
    public void select_destination_city_as(String string) {
        homePage.selectToLoc(string);
    }

    @Then("click on find flight button")
    public void click_on_find_flight_button() {
        homePage.submit();
    }

}
