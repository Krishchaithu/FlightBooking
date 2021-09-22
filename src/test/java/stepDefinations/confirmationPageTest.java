package stepDefinations;

import driverFactory.BrowserConfig;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.confirmationPage;

public class confirmationPageTest {
    private BrowserConfig browserConfig;
    private confirmationPage cp = new confirmationPage(browserConfig.getDriver());

    @Then("Verify heading is {string}")
    public void verify_heading_is(String string) {
        String head = cp.getHeading();
        Assert.assertEquals(string,head);
    }

    @Then("verify table contains Id status amount cardNumber Expiration auth code and date")
    public void verify_table_contains_id_status_amount_card_number_expiration_auth_code_and_date() {
        Assert.assertTrue(cp.verifyID());
        Assert.assertTrue(cp.verifyAmount());
        Assert.assertTrue(cp.verifyStatus());
        Assert.assertTrue(cp.verifyCardnumber());
        Assert.assertTrue(cp.verifyExpiration());
        Assert.assertTrue(cp.verifyDate());
        Assert.assertTrue(cp.verifyAuthCode());
    }

    @Then("Verify table values are not empty")
    public void verify_table_values_are_not_empty() {
        Assert.assertTrue(cp.getAmount() != null);
        Assert.assertTrue(cp.getAuthCode() != null);
        Assert.assertTrue(cp.getCardnummber()!= null);
        Assert.assertTrue(cp.getDate()!=null);
        Assert.assertTrue(cp.getExpiration()!=null);
        Assert.assertTrue(cp.getid()!= null);
        Assert.assertTrue(cp.getStatus()!=null);
    }
}
