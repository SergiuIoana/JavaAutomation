package ProjectAutomation.ShareData.browser;

import ProjectAutomation.ShareData.browser.service.ChromeBrowserService;
import ProjectAutomation.ShareData.browser.service.EdgeBrowserService;
import configFile.ConfigFile;
import configFile.configNode.ConfigurationNode;
import configFile.configNode.DriverConfigNode;
import org.openqa.selenium.WebDriver;

import java.util.Locale;

public class BrowserFactory {

    public WebDriver getBrowseFactory() {

        String ciCd = System.getProperty("ciCd");
        String browser = System.getProperty("browser").toLowerCase(Locale.ROOT);

        ConfigurationNode configurationNode = ConfigFile.createConfigNode(ConfigurationNode.class);

        if (Boolean.parseBoolean(ciCd)){
           configurationNode.driverConfigNode.headless = "--headless";
        }
        else{
            browser = configurationNode.driverConfigNode.localBrowser;
        }

        switch (browser){
            case BrowserType.BROWSER_CHROME:
                ChromeBrowserService chromeService = new ChromeBrowserService();
                chromeService.openBrowser(configurationNode.driverConfigNode);
                return chromeService.getDriver();
            case BrowserType.BROWSER_EDGE:
                EdgeBrowserService edgeService = new EdgeBrowserService();
                edgeService.openBrowser(configurationNode.driverConfigNode);
                return edgeService.getDriver();
        }

        return null;
    }
}
