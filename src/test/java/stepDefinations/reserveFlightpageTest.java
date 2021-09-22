package stepDefinations;

import driverFactory.BrowserConfig;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.reserveFlightPage;

public class reserveFlightpageTest {
    private BrowserConfig browserConfig;
    private reserveFlightPage fp = new reserveFlightPage(browserConfig.getDriver()) ;
//    fp = homepage.
@Then("verify page heading {string}")
public void verify_page_heading(String string) {
//        fp = fp.submit();
    String heading = fp.VerifyHeading();
    Assert.assertEquals(heading,string);
}

    @Then("verify table with headings")
    public void verify_table_with_headings() {
        Assert.assertTrue(fp.verifyTableHeadingairline());
        Assert.assertTrue(fp.verifyTableHeadingchose());
        Assert.assertTrue(fp.verifyTableHeadingarive());
        Assert.assertTrue(fp.verifyTableHeadingdepart());
        Assert.assertTrue(fp.verifyTableHeadingflight());
        Assert.assertTrue(fp.verifyTableHeadingprice());
    }

    @Then("select first button choose this flight")
    public void select_first_button_choose_this_flight() {
        fp.chooseflight();
    }

    @Then("Verify depaart heading contains {string} and Arrive heading contains {string}")
    public void verify_depaart_heading_contains_and_arrive_heading_contains(String depart, String arrive) {
    String actualDepart = fp.departFlight();
    String actualArrive = fp.arriveFlight();
    Assert.assertTrue(actualDepart.contains(depart) && actualArrive.contains(arrive));
    }

    @Then("verify first row airline is {string}")
    public void verify_first_row_airline_is(String string) {
    String actualAirline = fp.getAirline();
    Assert.assertTrue(actualAirline.contains(string));
    }

    @Then("verify first row price is {string}")
    public void verify_first_row_price_is(String string) {
    String actualPriceValue = fp.getPriceValue();
    Assert.assertTrue(actualPriceValue.contains(string));

    }
    @Then("Verify Airline is  {string}")
    public void verify_airline_is(String string) {

    }

    @Then("Verify price is {string}")
    public void verify_price_is(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
