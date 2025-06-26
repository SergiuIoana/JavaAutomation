package ProjectAutomation.Tests;

import ProjectAutomation.HelperMethods.WindowsMethods;
import ProjectAutomation.Pages.CommonPage;
import ProjectAutomation.Pages.HomePage;
import ProjectAutomation.ShareData.Hooks;
import ProjectAutomation.ShareData.ShareData;
import extentUtility.ExtentUtility;
import extentUtility.ReportStep;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class BrowserWindowsTab extends Hooks {

    public WebDriver driver;
    public WindowsMethods windowsMethods;
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
        windowsMethods = new WindowsMethods(driver);
        homePage = new HomePage(driver);
        commonPage = new CommonPage(driver);

        //Facem un scroll
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400);");

        //Declaram un element
        //WebElement alertFrameWindowElement = driver.findElement(By.xpath("//h5[contains(text(),'Alerts, Frame & Windows')]"));
        //alertFrameWindowElement.click();
        homePage.goToDesiredMenu("Alerts, Frame & Windows");
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user enters on Alerts, Frame & Windows menu");

        //WebElement browserWindowsElement = driver.findElement(By.xpath("//span[contains(text(),'Browser Windows')]"));
        //browserWindowsElement.click();
        commonPage.goToDesiredSubMenu("Browser Windows");
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user enters on Browser Windows sub-menu");

        WebElement tabElement = driver.findElement(By.id("tabButton"));
        tabElement.click();

        // getWindowHandles returneaza ferestrele deschise
        List<String> tabList = new ArrayList<>(driver.getWindowHandles());
        //driver.switchTo().window(tabList.get(1));
        windowsMethods.switchToOpenedWindow();
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user enters interacts with new tab process");

        WebElement sampleHeadingElement = driver.findElement(By.id("sampleHeading"));
        System.out.println("Textul din new tab este : " + sampleHeadingElement.getText());
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user enters interacts with new window process");

        // Inchidem fereastra
        windowsMethods.closeTab();

        // Revenim la prima fereastra
        //driver.switchTo().window(tabList.get(0));
        windowsMethods.switchToMainWindow();

        WebElement windowButtonElement = driver.findElement(By.id("windowButton"));
        windowButtonElement.click();

        List<String> windowList = new ArrayList<>(driver.getWindowHandles());
        //driver.switchTo().window(windowList.get(1));
        windowsMethods.switchToOpenedTab();

        WebElement sampleHeadingWindowElement = driver.findElement(By.id("sampleHeading"));
        System.out.println("Textul din new window este : " + sampleHeadingWindowElement.getText());

        // Inchidem fereastra
        windowsMethods.closeWindow();
        // Revenim la prima fereastra
        //driver.switchTo().window(tabList.get(0));
        windowsMethods.switchToMainWindow();
    }
}
