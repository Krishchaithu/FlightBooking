package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class purchasePage {
    WebDriver driver;

//  constructor
    public purchasePage(WebDriver driver) {
        this.driver = driver;
    }

//    locators
    private By heading = By.xpath("//h2");
    private By Airline = By.xpath("//h2/following-sibling::p[1]");
    private By FlightNumber = By.xpath("//h2/following-sibling::p[2]");
    private By price = By.xpath("//h2/following-sibling::p[3]");
    private By ArbitaryFee = By.xpath("//h2/following-sibling::p[4]");
    private By TotalCost = By.xpath("//h2/following-sibling::p[5]");
    private By heading1 = By.xpath("//h2/following-sibling::p[6]");
    private By FirstName = By.id("inputName");
    private By address = By.id("address");
    private By city = By.id("city");
    private By state = By.id("state");
    private By zipCode = By.id("zipCode");
    private By creditCardNumber = By.id("creditCardNumber");
    private By month = By.id("creditCardMonth");
    private By year = By.id("creditCardYear");
    private By nameOnCard = By.id("nameOnCard");
    private By rememberme = By.id("rememberMe");
    private By purchaseFlight = By.xpath("//*[@type='submit']");

//    page actions
    public String VerifyHeading(){
        return driver.findElement(heading).getText();
    }
    public String airLine(){
        return driver.findElement(Airline).getText();
    }
    public boolean VerifyairLine(){
        return driver.findElement(Airline).isDisplayed();
    }
    public String flightNumber(){
        return driver.findElement(FlightNumber).getText();
    }
    public boolean VerifyflightNumber(){
        return driver.findElement(FlightNumber).isDisplayed();
    }
    public String price(){
        return driver.findElement(price).getText();
    }
    public boolean Verifyprice(){
        return driver.findElement(price).isDisplayed();
    }
    public String arbitaryFee(){
        return driver.findElement(ArbitaryFee).getText();
    }
    public boolean VerifyarbitaryFee(){
        return driver.findElement(ArbitaryFee).isDisplayed();
    }
    public String totalCost(){
        return driver.findElement(TotalCost).getText();
    }
    public boolean VerifytotalCost(){
        return driver.findElement(TotalCost).isDisplayed();
    }
    public String VerifyHeading1(){
        return driver.findElement(heading1).getText();
    }
    public void enterFirstname(String string){
        driver.findElement(FirstName).sendKeys(string);
    }
    public void enterAddress(String string){
        driver.findElement(address).sendKeys(string);
    }
    public void enterCity(String string){
        driver.findElement(city).sendKeys(string);
    }
    public void enterState(String string){
        driver.findElement(state).sendKeys(string);
    }
    public void enterZipCode(String string){
        driver.findElement(zipCode).sendKeys(string);
    }
    public void enterCardnum(String string){
        driver.findElement(creditCardNumber).sendKeys(string);
    }
    public void enterMonth(String string){
        driver.findElement(month).sendKeys(string);
    }
    public void enterYear(String string){
        driver.findElement(year).sendKeys(string);
    }
    public void enterNameonCard(String string){
        driver.findElement(nameOnCard).sendKeys(string);
    }
    public void checkRememberme(){
        if (!driver.findElement(rememberme).isSelected()){
            driver.findElement(rememberme).click();
        }
    }
    public void purchaseFlight(){
        driver.findElement(purchaseFlight).click();
    }

}
