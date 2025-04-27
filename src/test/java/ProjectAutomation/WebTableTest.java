package ProjectAutomation;

import Pages.CommonPage;
import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class WebTableTest {

    public WebDriver driver;
    public HomePage homePage;
    public CommonPage commonPage;

    @Test
    public void automationMethod(){

        //Deschidem un browser de Chrome
        driver = new ChromeDriver();

        //Accesam o pagina web
        driver.get("https://demoqa.com/");

        //Facem browse-ul in modul maximize
        driver.manage().window().maximize();

        // Initializare obiect
        homePage = new HomePage(driver);
        commonPage = new CommonPage(driver);

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
        //WebElement ElementsField = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]"));
        //ElementsField.click();
        homePage.goToDesiredMenu("Elements");

        //WebElement WebTablesField = driver.findElement(By.xpath("//span[contains(text(),'Web Tables')]"));
        //WebTablesField.click();
        commonPage.goToDesiredSubMenu("Web Tables");

        List<WebElement> tableElements = driver.findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -even' or @class='rt-tr -odd']"));
        Integer actualTableSize = tableElements.size();

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

        List<WebElement> expectedTableElements = driver.findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -even' or @class='rt-tr -odd']"));
        Integer expectedTableSize = actualTableSize+1;
        Assert.assertEquals(expectedTableElements.size(), expectedTableSize);

        String actualTableValue = expectedTableElements.get(3).getText();
        Assert.assertTrue(actualTableValue.contains(firstNameValue));
        Assert.assertTrue(actualTableValue.contains(lastNameValue));
        Assert.assertTrue(actualTableValue.contains(emailValue));
        Assert.assertTrue(actualTableValue.contains(ageValue));
        Assert.assertTrue(actualTableValue.contains(salaryValue));
        Assert.assertTrue(actualTableValue.contains(departmentValue));

    }
}
