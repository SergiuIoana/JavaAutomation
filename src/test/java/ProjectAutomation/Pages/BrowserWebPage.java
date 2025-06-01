package ProjectAutomation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrowserWebPage extends CommonPage {

    @FindBy(id = "tabButton")
    WebElement newTabElement;
    @FindBy(id = "sampleHeading")
    WebElement sampleHeadingElement;
    @FindBy(id = "windowButton")
    WebElement newWindowElement;
    @FindBy(id = "sampleHeading")
    WebElement sampleHeadingElement2;

    public BrowserWebPage(WebDriver driver) {
        super(driver);
    }

    public void clickNewTab() {
        elementsMethods.clickOnElements(newTabElement);
        windowsMethods.switchToSecondTab();
    }

    public void clickWindowedTab() {
        elementsMethods.clickOnElements(newWindowElement);
        windowsMethods.switchToSecondTab();
    }
}
