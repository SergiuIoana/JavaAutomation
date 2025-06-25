package ProjectAutomation.Pages;

import logger.LoggerUtility;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends CommonPage {

    //WebDriver driver;
    //ElementsMethods elementsMethods;
    //JavascriptHelpers javascriptHelpers;

    @FindBy(xpath = "//p[text()='Consent']")
    private WebElement consentElement;

   /*
    public HomePage(WebDriver driver) {
        this.driver = driver;
        elementsMethods = new ElementsMethods(driver);
       javascriptHelpers = new JavascriptHelpers(driver);
       PageFactory.initElements(driver, this);
    }
   */

    // Identificam WebElementele specifice pentru pagina
    @FindBy(xpath = "//h5")
    private List<WebElement> elements;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    // Facem metode specifice pentru pagina
    public void goToDesiredMenu(String menu){
        try {
            elementsMethods.clickOnElements(consentElement);
            LoggerUtility.infoLog("The user clicks on consentElement");
        } catch(NoSuchElementException ignored){

        }
        javascriptHelpers.scrollDown(400);
        LoggerUtility.infoLog("The user scrolls down the page");

        elementsMethods.selectElementFromListByText(elements, menu);
        LoggerUtility.infoLog("The user selects from menu the option with the value: " + menu);
    }


}
