package ProjectAutomation.ShareData;

import ProjectAutomation.ShareData.browser.BrowserFactory;
import configFile.ConfigFile;
import configFile.configNode.ConfigurationNode;
import logger.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class ShareData {

    public WebDriver driver;

    public void prepareBrowser() {

        driver = new BrowserFactory().getBrowseFactory();
        LoggerUtility.infoLog("The browser was opened with success");
    }

    public void clearBrowser(){

        driver.quit();
        LoggerUtility.infoLog("The browser was closed with success");
    }

    public WebDriver getDriver() {
        return driver;
    }
}
