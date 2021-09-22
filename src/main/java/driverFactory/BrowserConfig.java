package driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import utils.ConfigFileReader;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class BrowserConfig {

    public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
    static ConfigFileReader cr = new ConfigFileReader();

    public  WebDriver getDriver(String browser) {
        try {
            if (browser.equals("chrome")) {
                System.setProperty("webdriver.chrome.driver",cr.getProperty("driverPath") );
                tlDriver.set(new ChromeDriver());
            } else if (browser.equals("firefox")) {
                System.setProperty("webdriver.gecko.driver", cr.getProperty("driverPath"));
                tlDriver.set(new FirefoxDriver());
            } else if (browser.equals("safari")) {
                tlDriver.set(new SafariDriver());
            } else if (browser.equalsIgnoreCase("remote")) {
                System.setProperty("webdriver.chrome.driver",cr.getProperty("driverPath"));
                Map<String,String> me = new HashMap<>();
                me.put("deviceName", "Nexus 5");
                ChromeOptions co = new ChromeOptions();
                co.setExperimentalOption("mobileEmulation",me);
                co.setCapability("browserName","chrome");
                tlDriver.set(new RemoteWebDriver(new URL("http://192.168.55.105:4444/wd/hub"),co));
            } else {
                System.out.println("Please pass the correct browser value: " + browser);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();
        return getDriver();
    }


    public static synchronized WebDriver getDriver() {
        return tlDriver.get();
    }

}
