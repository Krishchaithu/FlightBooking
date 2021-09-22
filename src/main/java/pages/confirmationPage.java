package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class confirmationPage {
    WebDriver driver;
//    constructor
    public confirmationPage(WebDriver driver){
        this.driver = driver;
    }

//    locators
    private By heading = By.xpath("//h1");
    private By Id = By.xpath("//tbody/tr[1]/td[1]");
    private By IdValue = By.xpath("//tbody/tr[1]/td[2]");
    private By status = By.xpath("//tbody/tr[2]/td[1]");
    private By statusValue = By.xpath("//tbody/tr[2]/td[2]");
    private By amount = By.xpath("//tbody/tr[3]/td[1]");
    private By amountValue = By.xpath("//tbody/tr[3]/td[2]");
    private By cardNumber = By.xpath("//tbody/tr[4]/td[1]");
    private By cardnumberValue = By.xpath("//tbody/tr[4]/td[2]");
    private By expiration = By.xpath("//tbody/tr[5]/td[1]");
    private By expirationValue = By.xpath("//tbody/tr[5]/td[2]");
    private By authCode = By.xpath("//tbody/tr[6]/td[1]");
    private By authCodeValue = By.xpath("//tbody/tr[6]/td[2]");
    private By date = By.xpath("//tbody/tr[7]/td[1]");
    private By dateValue = By.xpath("//tbody/tr[7]/td[2]");

//    pageactions
    public String getHeading(){
        return driver.findElement(heading).getText();
    }
    public boolean verifyID(){
        return driver.findElement(Id).isDisplayed();
    }
    public boolean verifyStatus(){
        return driver.findElement(status).isDisplayed();
    }
    public boolean verifyAmount(){
        return driver.findElement(amount).isDisplayed();
    }
    public boolean verifyCardnumber(){
        return driver.findElement(cardNumber).isDisplayed();
    }
    public boolean verifyExpiration(){
        return driver.findElement(expiration).isDisplayed();
    }
    public boolean verifyAuthCode(){
        return driver.findElement(authCode).isDisplayed();
    }
    public boolean verifyDate(){
        return driver.findElement(date).isDisplayed();
    }
    public String getid(){
        return driver.findElement(IdValue).getText();
    }
    public String getStatus(){
        return driver.findElement(statusValue).getText();
    }
    public String getAmount(){
        return driver.findElement(amountValue).getText();
    }
    public String getCardnummber(){
        return driver.findElement(cardnumberValue).getText();
    }
    public String getExpiration(){
        return driver.findElement(expirationValue).getText();
    }
    public String getAuthCode(){
        return driver.findElement(authCodeValue).getText();
    }
    public String getDate(){
        return driver.findElement(dateValue).getText();
    }


}
