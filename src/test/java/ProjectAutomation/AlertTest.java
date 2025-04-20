package ProjectAutomation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.AssertJUnit.assertEquals;

public class AlertTest {
    public WebDriver driver;

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

        //Facem un scroll
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400);");

        //Declaram un element
        WebElement alertFrameWindowElement = driver.findElement(By.xpath("//h5[contains(text(),'Alerts, Frame & Windows')]"));
        alertFrameWindowElement.click();

        WebElement alertElement = driver.findElement(By.xpath("//span[contains(text(),'Alerts')]"));
        alertElement.click();

        WebElement alertOkElement = driver.findElement(By.id("alertButton"));
        alertOkElement.click();

        //Alert
        Alert alertOk = driver.switchTo().alert();
        //ne mutam cu focusul pe alerta
        alertOk.accept();

        // Alert delay
        WebElement alertDelayOkElement = driver.findElement(By.id("timerAlertButton"));
        alertDelayOkElement.click();

        //Definim un wait explicit ca sa astepte dupa alerta
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alertDelayOk = driver.switchTo().alert();
        //ne mutam cu focusul pe alerta
        alertDelayOk.accept();

        //Alert confirmation
        WebElement alertConfirmationElement = driver.findElement(By.id("confirmButton"));
        alertConfirmationElement.click();

        Alert alertConfirmation = driver.switchTo().alert();
        alertConfirmation.dismiss();

        //Assert the Cancel message
        WebElement cancelElement = driver.findElement(By.id("confirmResult"));
        assertEquals(cancelElement.getText(), "You selected Cancel");

        //Alert Promt
        WebElement alertPromtElement = driver.findElement(By.id("promtButton"));
        alertPromtElement.click();

        Alert alertPromt = driver.switchTo().alert();
        alertPromt.sendKeys("Sergiu");
        alertPromt.accept();


    }
    }
