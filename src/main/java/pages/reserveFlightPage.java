package pages;

import driverFactory.BrowserConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ConfigFileReader;

public class reserveFlightPage {
    WebDriver driver;

// constuctro of page
    public reserveFlightPage(WebDriver driver){
        this.driver = driver;
    }

//    by locator
private By heading1 = By.xpath("//h3");
    private By choose = By.xpath("//th[1]");
    private By flight = By.xpath("//th[2]");
    private By airline = By.xpath("//th[3]");
    private By depart = By.xpath("//th[4]");
    private By arive = By.xpath("//th[5]");
    private By price = By.xpath("//th[6]");
    private By priceValue = By.xpath("//tbody/tr[1]/td[6]");
    private By chooseFlight = By.xpath("//tr[1]//input[@type='submit']");



//    page actions
    public String VerifyHeading(){
        return driver.findElement(heading1).getText();
    }

    public boolean verifyTableHeadingchose(){
        return driver.findElement(choose).isDisplayed();
    }
    public boolean verifyTableHeadingflight(){
        return driver.findElement(flight).isDisplayed();
    }
    public boolean verifyTableHeadingairline(){
        return driver.findElement(airline).isDisplayed();
    }
    public boolean verifyTableHeadingdepart(){
        return driver.findElement(depart).isDisplayed();
    }
    public boolean verifyTableHeadingarive(){
        return driver.findElement(arive).isDisplayed();
    }
    public boolean verifyTableHeadingprice(){
        return driver.findElement(price).isDisplayed();
    }

    public void chooseflight(){
        driver.findElement(chooseFlight).click();
    }

    public String departFlight(){
        return driver.findElement(depart).getText();
    }
    public String arriveFlight(){
        return driver.findElement(arive).getText();
    }
    public String getAirline(){
        return driver.findElement(airline).getText();
    }
    public String getPriceValue(){
        return driver.findElement(priceValue).getText();
    }

}
