package ProjectAutomation.ShareData;

import logger.LoggerUtility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Hooks extends ShareData{

    public String testName;

    @BeforeMethod
    public void prepareEnvironment(){
        testName = this.getClass().getSimpleName();
        LoggerUtility.startTestCase(testName);
        prepareBrowser();
    }

    @AfterMethod
    public void clearEnvironment(){
        clearBrowser();
        //pentru moment toate sunt bune
        LoggerUtility.endTestCase(testName);
    }

}
