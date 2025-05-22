package ProjectAutomation;

import HelperMethods.AlertMethods;
import HelperMethods.ElementsMethods;
import HelperMethods.JavascriptHelpers;
import Pages.CommonPage;
import Pages.HomePage;
import ShareData.ShareData;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.AssertJUnit.assertEquals;

public class AlertTest extends ShareData {
    //public WebDriver driver;
    public ElementsMethods elementsMethods;
    public AlertMethods alertMethods;
    public JavascriptHelpers javascriptHelpers;
    public HomePage homePage;
    public CommonPage commonPage;

    @Test
    public void automationMethod() {

        //Deschidem un browser de Chrome
        //driver = new ChromeDriver();

        //Accesam o pagina web
        //driver.get("https://demoqa.com/");

        //Definim un wait implicit pentru un interval maxim de timp
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

        //Facem browse-ul in modul maximize
        //driver.manage().window().maximize();

        // Initializare obiect
        elementsMethods = new ElementsMethods(getDriver());
        alertMethods = new AlertMethods(getDriver());
        javascriptHelpers = new JavascriptHelpers(getDriver());
        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());

        //Facem un scroll
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,400);");

        //Declaram un element
        //WebElement alertFrameWindowElement = driver.findElement(By.xpath("//h5[contains(text(),'Alerts, Frame & Windows')]"));
        //alertFrameWindowElement.click();
        //elementsMethods.clickOnElements(alertFrameWindowElement);
        homePage.goToDesiredMenu("Alerts, Frame & Windows");

        //WebElement alertElement = driver.findElement(By.xpath("//span[contains(text(),'Alerts')]"));
        //alertElement.click();
        //elementsMethods.clickOnElements(alertElement);
        commonPage.goToDesiredSubMenu("Alerts");

        WebElement alertOkElement = getDriver().findElement(By.id("alertButton"));
        //alertOkElement.click();
        elementsMethods.clickOnElements(alertOkElement);

        //Alert
        //Alert alertOk = driver.switchTo().alert();
        //ne mutam cu focusul pe alerta
        //alertOk.accept();
        alertMethods.interactWithAlertsOK();

        // Alert delay
        WebElement alertDelayOkElement = getDriver().findElement(By.id("timerAlertButton"));
        //alertDelayOkElement.click();
        elementsMethods.clickOnElements(alertDelayOkElement);

        //Definim un wait explicit ca sa astepte dupa alerta
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        //wait.until(ExpectedConditions.alertIsPresent());

        //Alert alertDelayOk = driver.switchTo().alert();
        //ne mutam cu focusul pe alerta
        //alertDelayOk.accept();
        alertMethods.interactWithDelayAlert();

        //Alert confirmation
        WebElement alertConfirmationElement = getDriver().findElement(By.id("confirmButton"));
        //alertConfirmationElement.click();
        elementsMethods.clickOnElements(alertConfirmationElement);

        //Alert alertConfirmation = driver.switchTo().alert();
        //alertConfirmation.dismiss();
        alertMethods.alertMessageDismiss();

        //Assert the Cancel message
        WebElement cancelElement = getDriver().findElement(By.id("confirmResult"));
        assertEquals("You selected Cancel", cancelElement.getText());

        //Alert Promt
        WebElement alertPromtElement = getDriver().findElement(By.id("promtButton"));
        //alertPromtElement.click();
        elementsMethods.clickOnElements(alertPromtElement);

        //Alert alertPromt = driver.switchTo().alert();
        //alertPromt.sendKeys("Sergiu");
        //alertPromt.accept();
        //alertMethods.interactWithInputAlerts("Sergiu");
        alertMethods.interactWithInputAlerts("Sergiu");

        //Assert the text entered
        WebElement alertPromptResult = getDriver().findElement(By.id("promptResult"));
        assertEquals("You entered Sergiu", alertPromptResult.getText() );
    }
}
