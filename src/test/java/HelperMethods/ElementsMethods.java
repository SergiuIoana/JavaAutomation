package HelperMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.List;

public class ElementsMethods {
    WebDriver driver;
    JavascriptExecutor js;
    Actions actions;

    public ElementsMethods(WebDriver driver) {
        this.driver = driver;
        js = (JavascriptExecutor) driver;
        this.actions = new Actions(driver);
    }

    public void clickOnElements(WebElement element) {
        element.click();
    }

    public void fillElement(WebElement element, String value) {
        element.sendKeys(value);
    }

    public void uploadPicture(WebElement element) {
        File file = new File("src/test/resources/1.png");
        element.sendKeys(file.getAbsolutePath());
    }

    public void selectElementFromListByText(List<WebElement> elementsList, String value) {
        for (int i = 0; i < elementsList.size(); i++) {
            if (elementsList.get(i).getText().equals(value)) {
                clickOnElements(elementsList.get(i));
                break;
            }
        }
    }

    public void fillWithActions(WebElement webelement, String value){
        actions.sendKeys(value).perform();
        //merge si cu build perform
        waitVisibilityElement(webelement);
        actions.sendKeys(Keys.ENTER).perform();
    }

    public void waitVisibilityElement(WebElement webElement){
        //definim un wait explicit ca sa astepte dupa vizibilitatea elementului
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.visibilityOf(webElement));

    }

    public void fillElementWithEnter(WebElement element, String value) {
        element.sendKeys(value);
        element.sendKeys(Keys.ENTER);
    }


    public void selectByVisibleText(WebElement element, String text) {
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    public void fillMultipleValues(WebElement element, List<String> values) {
        for (String value : values) {
            element.sendKeys(value);
            element.sendKeys(Keys.ENTER);
        }
    }

    public void clickMultipleElementsByListOfValues(List<WebElement> elements, List<String> values) {
        for (String value : values) {
            for (WebElement element : elements) {
                if (element.getText().equals(value)) {
                    element.click();
                }
            }
        }
    }

    public void displayContentOfElement(WebElement element) {
        System.out.println("Textul din element este: " + element.getText());
    }
}






