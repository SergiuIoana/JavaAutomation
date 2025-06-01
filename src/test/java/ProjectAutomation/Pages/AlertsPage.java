package ProjectAutomation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import ProjectAutomation.HelperMethods.JavascriptHelpers;
import ProjectAutomation.HelperMethods.AlertMethods;
import ProjectAutomation.HelperMethods.ElementsMethods;

public class AlertsPage extends CommonPage{

    @FindBy(id = "alertButton")
    WebElement alertOkElement;

    @FindBy(id = "timerAlertButton")
    WebElement alertDelayElement;

    @FindBy(id = "confirmButton")
    WebElement alertMessageElement;

    @FindBy(id = "confirmResult")
    WebElement confirmResultElement;

    @FindBy(id = "promtButton")
    WebElement alertPromptElement;

    @FindBy(id = "promptResult")
    WebElement promptResultElement;

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    public void showAlertOk() {
//        javascriptHelpers.forceClick(alertOkElement);
        elementsMethods.clickOnElements(alertOkElement);
        alertMethods.interactWithAlertsOK();
    }

    public void showAlertDelayed() {
        elementsMethods.clickOnElements(alertDelayElement);
        alertMethods.interactWithDelayAlert();
    }

    public void alertMessageDismiss() {
        elementsMethods.clickOnElements(alertMessageElement);
        alertMethods.alertMessageDismiss();
        Assert.assertTrue(confirmResultElement.getText().contains("You selected Cancel"));
    }

    public void alertPrompt() {
        elementsMethods.clickOnElements(alertPromptElement);
        alertMethods.interactWithInputAlerts("Sergiu Ioana");
        Assert.assertTrue(promptResultElement.getText().contains("You entered " + "Sergiu Ioana"));
    }





}
