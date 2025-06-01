package ProjectAutomation.HelperMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertMethods {
    WebDriver driver;

    public AlertMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void interactWithAlertsOK(){
        Alert alertOk = driver.switchTo().alert();
        alertOk.accept();
    }

    public void explicitAlertWait(){
        //Definim un wait explicit ca sa astepte dupa alerta
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.alertIsPresent());
    }

    public void interactWithDelayAlert(){
        explicitAlertWait();
        Alert alertDelayOk = driver.switchTo().alert();
        //ne mutam cu focusul pe alerta
        alertDelayOk.accept();
    }

    public void alertMessageDismiss() {
        Alert alertDelayOk = driver.switchTo().alert();
        alertDelayOk.dismiss();
    }

    public void interactWithInputAlerts(String personalName) {
        Alert alertPrompt = driver.switchTo().alert();
        alertPrompt.sendKeys(personalName);
        alertPrompt.accept();
    }
}
