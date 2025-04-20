package ProjectAutomation;

import HelperMethods.ElementsMethods;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class PracticeFormTest {

    public WebDriver driver;
    public ElementsMethods elementsMethods;

    @Test
    public void automationMethod() {

        //Deschidem un browser de Chrome
        driver = new ChromeDriver();

        //Accesam o pagina web
        driver.get("https://demoqa.com/");

        //Facem browse-ul in modul maximize
        driver.manage().window().maximize();

        // Initializare obiect
        elementsMethods = new ElementsMethods(driver);

        //Facem un scroll
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400);");

        //Declaram un element
        WebElement elementsField = driver.findElement(By.xpath("//h5[contains(text(),'Forms')]"));
        // elementsField.click();
        elementsMethods.clickOnElements(elementsField);

        WebElement webTablesField = driver.findElement(By.xpath("//span[contains(text(),'Practice Form')]"));
        // webTablesField.click();
        elementsMethods.clickOnElements(webTablesField);

        WebElement firstNameElement = driver.findElement(By.id("firstName"));
        //String firstNameValue = "Sergiu";
        //firstNameElement.sendKeys(firstNameValue);
        elementsMethods.fillElement(firstNameElement, "Sergiu");

        WebElement lastNameElement = driver.findElement(By.id("lastName"));
        //String lastNameValue = "Ioana";
        //lastNameElement.sendKeys(lastNameValue);
        elementsMethods.fillElement(lastNameElement, "Ioana");

        WebElement userEmailElement = driver.findElement(By.id("userEmail"));
        //String userEmailValue = "sergiu.ioana@endava.com";
        //userEmailElement.sendKeys(userEmailValue);
        elementsMethods.fillElement(userEmailElement, "sergiu.ioana@endava.com");

        WebElement mobileNumberElement = driver.findElement(By.cssSelector("input[placeholder='Mobile Number']"));
        //String mobileNumberValue = "0744444444";
        //mobileNumberElement.sendKeys(mobileNumberValue);
        elementsMethods.fillElement(mobileNumberElement, "0744444444");

        WebElement pictureElement = driver.findElement(By.id("uploadPicture"));
        //File file = new File("src/test/resources/1.png");
        //pictureElement.sendKeys(file.getAbsolutePath());
        elementsMethods.uploadPicture(pictureElement);

        WebElement genderMaleElement = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
        WebElement genderFemaleElement = driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
        WebElement genderOtherElement = driver.findElement(By.xpath("//label[@for='gender-radio-3']"));
        List<WebElement> genderElement = new ArrayList<>();
        genderElement.add(genderMaleElement);
        genderElement.add(genderFemaleElement);
        genderElement.add(genderOtherElement);
        elementsMethods.selectElementFromListByText(genderElement, "Male");

    /*    String Gender = "Male";
        if(genderMaleElement.getText().equals(Gender)) {
            genderMaleElement.click();
        }
        else if(genderFemaleElement.getText().equals(Gender)){
            genderFemaleElement.click();
        }
        else if(genderOtherElement.getText().equals(Gender)){
            genderOtherElement.click();
        }
    */

        WebElement SubjectsElement = driver.findElement(By.id("subjectsInput"));
        String SubjectsValue = "Social Studies";
        SubjectsElement.sendKeys(SubjectsValue);
        SubjectsElement.sendKeys(Keys.ENTER);

        WebElement StateElement = driver.findElement(By.id("react-select-3-input"));
        js.executeScript("arguments[0].click();", StateElement);
        StateElement.sendKeys("NCR");
        StateElement.sendKeys(Keys.ENTER);

        WebElement CityElement = driver.findElement(By.id("react-select-4-input"));
        js.executeScript("arguments[0].click();", CityElement);
        CityElement.sendKeys("Delhi");
        CityElement.sendKeys(Keys.ENTER);

        WebElement submitElement = driver.findElement(By.id("submit"));
        js.executeScript("arguments[0].click();", submitElement);

    }


}
