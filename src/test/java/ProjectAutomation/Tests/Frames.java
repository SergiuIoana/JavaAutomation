package ProjectAutomation.Tests;

import ProjectAutomation.HelperMethods.ElementsMethods;
import ProjectAutomation.HelperMethods.FramesMethods;
import ProjectAutomation.HelperMethods.JavascriptHelpers;
import ProjectAutomation.Pages.CommonPage;
import ProjectAutomation.Pages.HomePage;
import ProjectAutomation.ShareData.ShareData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Frames extends ShareData {
    //public WebDriver driver;
    public JavascriptHelpers javascriptHelpers;
    public ElementsMethods elementsMethods;
    public FramesMethods framesMethods;
    public HomePage homePage;
    public CommonPage commonPage;

    @Test
    public void automationMethod() {

        //Deschidem un browser de Chrome
        //driver = new ChromeDriver();

        //Accesam o pagina web
        //driver.get("https://demoqa.com/");

        //Facem browse-ul in modul maximize
        //driver.manage().window().maximize();

        //Initializare obiect
        javascriptHelpers = new JavascriptHelpers(getDriver());
        elementsMethods = new ElementsMethods(getDriver());
        framesMethods = new FramesMethods(getDriver());
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

        //WebElement frameElement = driver.findElement(By.xpath("//span[contains(text(),'Frames')]"));
        //frameElement.click();
        //elementsMethods.clickOnElements(frameElement);
        commonPage.goToDesiredSubMenu("Frames");

        //Scroll down din JavaHelpersMethods
        javascriptHelpers.scrollDown(400);

        WebElement frame1Element = getDriver().findElement(By.id("frame1"));
        //driver.switchTo().frame(frame1Element);
        framesMethods.switchToFrame(frame1Element);

        WebElement sampleHeadingFrameElement = getDriver().findElement(By.id("sampleHeading"));
        System.out.println("Textul din new frame este : " + sampleHeadingFrameElement.getText());

        // Ne ducem cu focusul inapoi pe pagina principala
        //driver.switchTo().defaultContent();
        framesMethods.switchToMainContent();

        WebElement frame2Element = getDriver().findElement(By.id("frame2"));
        //driver.switchTo().frame(frame2Element);
        framesMethods.switchToFrame(frame2Element);

        //Scroll
        js.executeScript("window.scrollBy(200,400);");

    }
}
