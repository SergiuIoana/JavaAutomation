package ProjectAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;

public class PracticeFormTest {

    public WebDriver driver;

    @Test
    public void automationMethod() {

        //Deschidem un browser de Chrome
        driver = new ChromeDriver();

        //Accesam o pagina web
        driver.get("https://demoqa.com/");

        //Facem browse-ul in modul maximize
        driver.manage().window().maximize();

        //Facem un scroll
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400);");

        //Declaram un element
        WebElement ElementsField = driver.findElement(By.xpath("//h5[contains(text(),'Forms')]"));
        ElementsField.click();

        WebElement WebTablesField = driver.findElement(By.xpath("//span[contains(text(),'Practice Form')]"));
        WebTablesField.click();

        WebElement firstNameElement = driver.findElement(By.id("firstName"));
        String firstNameValue = "Sergiu";
        firstNameElement.sendKeys(firstNameValue);

        WebElement lastNameElement = driver.findElement(By.id("lastName"));
        String lastNameValue = "Ioana";
        lastNameElement.sendKeys(lastNameValue);

        WebElement userEmailElement = driver.findElement(By.id("userEmail"));
        String userEmailValue = "sergiu.ioana@endava.com";
        userEmailElement.sendKeys(userEmailValue);

        WebElement mobileNumberElement = driver.findElement(By.cssSelector("input[placeholder='Mobile Number']"));
        String mobileNumberValue = "0744444444";
        mobileNumberElement.sendKeys(mobileNumberValue);

        WebElement pictureElement = driver.findElement(By.id("uploadPicture"));
        File file = new File("src/test/resources/1.png");
        pictureElement.sendKeys(file.getAbsolutePath());



    }
}