package ProjectAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BrowserWindowsTab {

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
        WebElement alertFrameWindowElement = driver.findElement(By.xpath("//h5[contains(text(),'Alerts, Frame & Windows')]"));
        alertFrameWindowElement.click();

        WebElement browserWindowsElement = driver.findElement(By.xpath("//span[contains(text(),'Browser Windows')]"));
        browserWindowsElement.click();

        WebElement tabElement = driver.findElement(By.id("tabButton"));
        tabElement.click();

        // getWindowHandles returneaza ferestrele deschise
        List<String> tabList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabList.get(1));

        WebElement sampleHeadingElement = driver.findElement(By.id("sampleHeading"));
        System.out.println("Textul din new tab este : " + sampleHeadingElement.getText());

        // Inchidem fereastra
        driver.close();

        // Revenim la prima fereastra
        driver.switchTo().window(tabList.get(0));

        WebElement windowButtonElement = driver.findElement(By.id("windowButton"));
        windowButtonElement.click();

        List<String> windowList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowList.get(1));

        WebElement sampleHeadingWindowElement = driver.findElement(By.id("sampleHeading"));
        System.out.println("Textul din new window este : " + sampleHeadingWindowElement.getText());

        // Inchidem fereastra
        driver.close();
        // Revenim la prima fereastra
        driver.switchTo().window(tabList.get(0));
    }
}
