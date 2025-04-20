package ProjectAutomation;

import HelperMethods.AlertMethods;
import HelperMethods.ElementsMethods;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.AssertJUnit.assertEquals;

public class AlertTest {
    public WebDriver driver;
    public ElementsMethods elementsMethods;
    public AlertMethods alertMethods;

    @Test
    public void automationMethod() {

        //Deschidem un browser de Chrome
        driver = new ChromeDriver();

        //Accesam o pagina web
        driver.get("https://demoqa.com/");

        //Definim un wait implicit pentru un interval maxim de timp
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

        //Facem browse-ul in modul maximize
        driver.manage().window().maximize();

        // Initializare obiect
        elementsMethods = new ElementsMethods(driver);
        alertMethods = new AlertMethods(driver);

        //Facem un scroll
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400);");

        //Declaram un element
        WebElement alertFrameWindowElement = driver.findElement(By.xpath("//h5[contains(text(),'Alerts, Frame & Windows')]"));
        //alertFrameWindowElement.click();
        elementsMethods.clickOnElements(alertFrameWindowElement);

        WebElement alertElement = driver.findElement(By.xpath("//span[contains(text(),'Alerts')]"));
        //alertElement.click();
        elementsMethods.clickOnElements(alertElement);

        WebElement alertOkElement = driver.findElement(By.id("alertButton"));
        //alertOkElement.click();
        elementsMethods.clickOnElements(alertOkElement);

        //Alert
        //Alert alertOk = driver.switchTo().alert();
        //ne mutam cu focusul pe alerta
        //alertOk.accept();
        alertMethods.interractWithAlertsOK();

        // Alert delay
        WebElement alertDelayOkElement = driver.findElement(By.id("timerAlertButton"));
        //alertDelayOkElement.click();
        elementsMethods.clickOnElements(alertDelayOkElement);

        //Definim un wait explicit ca sa astepte dupa alerta
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        //wait.until(ExpectedConditions.alertIsPresent());

        //Alert alertDelayOk = driver.switchTo().alert();
        //ne mutam cu focusul pe alerta
        //alertDelayOk.accept();
        alertMethods.interractWithAlertsOK();

        //Alert confirmation
        WebElement alertConfirmationElement = driver.findElement(By.id("confirmButton"));
        alertConfirmationElement.click();

        Alert alertConfirmation = driver.switchTo().alert();
        alertConfirmation.dismiss();

        //Assert the Cancel message
        WebElement cancelElement = driver.findElement(By.id("confirmResult"));
        assertEquals("You selected Cancel", cancelElement.getText());

        //Alert Promt
        WebElement alertPromtElement = driver.findElement(By.id("promtButton"));
        alertPromtElement.click();

        Alert alertPromt = driver.switchTo().alert();
        alertPromt.sendKeys("Sergiu");
        alertPromt.accept();

    }
}
