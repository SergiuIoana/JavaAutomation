package ProjectAutomation.Pages;

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
        } catch(NoSuchElementException ignored){

        }
        //Scrolul asta nu merge nu stiu de ce
        //javascriptHelpers.scrollDown(400);
        elementsMethods.selectElementFromListByText(elements, menu);
    }


}
