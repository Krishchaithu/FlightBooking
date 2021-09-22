package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utils.ConfigFileReader;

public class travelHomePage {


    private WebDriver driver;
    private static ConfigFileReader cr = new ConfigFileReader();

    //    By locators
    private By depature = By.name("fromPort");
    private By destination = By.name("toPort");
    private By heading = By.xpath("//h1");
    private By findFlight = By.xpath("//input[@type='submit']");
    private By destLink = By.partialLinkText("destination of the week");

    //    constructor of this page
    public travelHomePage(WebDriver driver) {
        this.driver = driver;
    }


    //    page actions
    public void selectFromLoc(String string) {
        Select select = new Select(driver.findElement(depature));
        select.selectByValue(string);
    }

    public void selectToLoc(String string) {
        Select select = new Select(driver.findElement(destination));
        select.selectByValue(string);
    }

    public void submit() {
        driver.findElement(findFlight).submit();
    }

    public String verifyHeading() {
        return driver.findElement(heading).getText();
    }

    public String pageTitle() {
        return driver.getTitle();
    }

    public void Launch() {
        driver.get(cr.getProperty("site"));
    }

    public boolean verifyDestLink() {
        return driver.findElement(destLink).isDisplayed();
    }


}
