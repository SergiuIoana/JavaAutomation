package ProjectAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableTest {

    public WebDriver driver;

    @Test
    public void automationMethod(){

        //Deschidem un browser de Chrome
        driver = new ChromeDriver();

        //Accesam o pagina web
        driver.get("https://demoqa.com/");

        //Facem browse-ul in modul maximize
        driver.manage().window().maximize();

        //Cautare elemente in UI se face dupa :
        // 1.Id
        // 2.Class
        // 3.Name
        // 4. Se foloseste xpath
        // 1.Tag
        // 2.Atribut
        // 3.Valoare

        //Facem un scroll
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400);");
        //(0,400) reprezinte coordonatele de pe un site X si Y

        //Declaram un element
        WebElement ElementsField = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]"));
        ElementsField.click();

        WebElement WebTablesField = driver.findElement(By.xpath("//span[contains(text(),'Web Tables')]"));
        WebTablesField.click();

        WebElement AddField = driver.findElement(By.id("addNewRecordButton"));
        AddField.click();

        WebElement FirstNameField = driver.findElement(By.id("firstName"));
        String firstNameValue = "Sergiu";
        FirstNameField.sendKeys(firstNameValue);

        WebElement LastNameField = driver.findElement(By.id("lastName"));
        String lastNameValue = "Ioana";
        LastNameField.sendKeys(lastNameValue);

        WebElement EmailField = driver.findElement(By.id("userEmail"));
        String emailValue = "testing@testing.com";
        EmailField.sendKeys(emailValue);

        WebElement AgeField = driver.findElement(By.id("age"));
        String ageValue = "31";
        AgeField.sendKeys(ageValue);

        WebElement SalaryField = driver.findElement(By.id("salary"));
        String salaryValue = "10000000";
        SalaryField.sendKeys(salaryValue);

        WebElement DepartmentField = driver.findElement(By.id("department"));
        String departmentValue = "QA";
        DepartmentField.sendKeys(departmentValue);

        WebElement SubmitField = driver.findElement(By.id("submit"));
        SubmitField.click();

    }

}