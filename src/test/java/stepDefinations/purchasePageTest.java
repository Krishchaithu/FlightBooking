package stepDefinations;

import driverFactory.BrowserConfig;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.purchasePage;

public class purchasePageTest {
    private BrowserConfig browserConfig;
    private purchasePage Ppage = new purchasePage(browserConfig.getDriver());

    @Then("verify page heading is {string}")
    public void verify_page_heading_is(String string) {
        String head = Ppage.VerifyHeading();
        Assert.assertEquals(string,head);
    }

    @Then("Verify Airline flightnummber price arbitary fee  and total cost")
    public void verify_airline_flightnummber_price_arbitary_fee_and_total_cost() {
        Assert.assertTrue(Ppage.VerifyairLine());
        Assert.assertTrue(Ppage.VerifyflightNumber());
        Assert.assertTrue(Ppage.Verifyprice());
        Assert.assertTrue(Ppage.VerifyarbitaryFee());
        Assert.assertTrue(Ppage.VerifytotalCost());
    }

    @Then("veirfy heading {string}")
    public void veirfy_heading(String string) {
        String head = Ppage.VerifyHeading1();
        Assert.assertEquals(string,head);
    }

    @Then("enter first name {string}")
    public void enter_first_name(String string) {
        Ppage.enterFirstname(string);
    }

    @Then("enter address {string}")
    public void enter_address(String string) {
        Ppage.enterAddress(string);
    }

    @Then("enter city {string}")
    public void enter_city(String string) {
        Ppage.enterCity(string);
    }

    @Then("enter state {string}")
    public void enter_state(String string) {
        Ppage.enterState(string);
    }

    @Then("enter zip code {string}")
    public void enter_zip_code(String string) {
        Ppage.enterZipCode(string);
    }

    @Then("enter card number {string}")
    public void enter_card_number(String string) {
        Ppage.enterCardnum(string);
    }

    @Then("entr month {string}")
    public void entr_month(String string) {
        Ppage.enterMonth(string);
    }

    @Then("enter year {string}")
    public void enter_year(String string) {
        Ppage.enterYear(string);
    }

    @Then("enter name on card {string}")
    public void enter_name_on_card(String string) {
        Ppage.enterNameonCard(string);
    }

    @Then("check rememberme")
    public void check_rememberme() {
        Ppage.checkRememberme();
    }

    @Then("submit purchase flight")
    public void submit_purchase_flight() {
        Ppage.purchaseFlight();
    }

}
