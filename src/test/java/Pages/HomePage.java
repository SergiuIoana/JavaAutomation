package Pages;

import HelperMethods.ElementsMethods;
import HelperMethods.JavascriptHelpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    WebDriver driver;
    ElementsMethods elementsMethods;
    JavascriptHelpers javascriptHelpers;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        elementsMethods = new ElementsMethods(driver);
        javascriptHelpers = new JavascriptHelpers(driver);
        PageFactory.initElements(driver, this);
    }

    // Identificam WebElementele specifice pentru pagina
    @FindBy(xpath = "//h5")
    List<WebElement> elements;

    // Facem metode specifice pentru pagina
    public void goToDesiredMenu(String menu){
        //Scrolul asta nu merge nu stiu de ce
        //javascriptHelpers.scrollDown(400);
        elementsMethods.selectElementFromListByText(elements, menu);
    }


}
