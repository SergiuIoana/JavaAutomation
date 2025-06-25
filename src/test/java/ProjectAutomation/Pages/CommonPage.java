package ProjectAutomation.Pages;


import logger.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ProjectAutomation.HelperMethods.AlertMethods;
import ProjectAutomation.HelperMethods.ElementsMethods;
import ProjectAutomation.HelperMethods.FramesMethods;
import ProjectAutomation.HelperMethods.JavascriptHelpers;
import ProjectAutomation.HelperMethods.WindowsMethods;
import java.util.List;

public class CommonPage {

    protected WebDriver driver;
    protected ElementsMethods elementsMethods;
    protected JavascriptHelpers javascriptHelpers;
    protected AlertMethods alertMethods;
    protected FramesMethods framesMethods;
    protected WindowsMethods windowsMethods;

    public CommonPage(WebDriver driver) {
        this.driver = driver;
        this.elementsMethods = new ElementsMethods(driver);
        this.javascriptHelpers = new JavascriptHelpers(driver);
        this.alertMethods = new AlertMethods(driver);
        this.framesMethods = new FramesMethods(driver);
        this.windowsMethods = new WindowsMethods(driver);
        PageFactory.initElements(driver, this);
    }

    // Identificam WebElementele specifice pentru sub-pagini
    @FindBy(xpath = "//span[@class='text']")
    private List<WebElement> elements;

    // Facem metode specifice pentru subpagina
    public void goToDesiredSubMenu(String submenu){
        javascriptHelpers.scrollDown(400);
        LoggerUtility.infoLog("The user scrolls down the page");

        elementsMethods.selectElementFromListByText(elements, submenu);
        LoggerUtility.infoLog("The user selects from submenu the option with the value: " + submenu);
    }
}
