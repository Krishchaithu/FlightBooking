package appHook;

import driverFactory.BrowserConfig;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utils.ConfigFileReader;


public class hooks {

    private WebDriver driver;
    ConfigFileReader cr = new ConfigFileReader() ;
    private BrowserConfig browserConfig = new BrowserConfig();

    @Before
    public void LaunchBrowser()  {
            driver = browserConfig.getDriver(cr.getProperty("browser"));
    }

    @After
    public void tearDown(){
        driver.close();
        driver.quit();
    }

//    @After(order = 1)
//    public void screenshots(Scenario scenario){
//        if (scenario.isFailed()){
//            String scName = scenario.getName().replaceAll(" ","_");
//            byte[] srcPath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
////            scenario.attach(srcPath,"img/png",scName);
//        }
//    }

}
