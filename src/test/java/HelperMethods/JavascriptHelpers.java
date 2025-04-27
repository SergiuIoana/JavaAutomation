package HelperMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavascriptHelpers {
    WebDriver driver;
    JavascriptExecutor javaScriptExecutor;

    public JavascriptHelpers(WebDriver driver) {
        this.driver = driver;
        this.javaScriptExecutor = (JavascriptExecutor) driver;
    }

    public void scroll(int x, int y) {
        // Facem scroll ca sa fie elementul vizibil
        // in cas ca nu incape pe pagina
        // Javascript Executor ajuta atunci cand metodele standard din selenium nu ne ajuta
        javaScriptExecutor.executeScript("window.scrollBy(0," + x + ", " + y + ")");
    }

    public void scrollDown(int y) {
        scroll(0,y);
    }

    public void scrollRight(int x) {
        scroll(x,0);
    }

    public void forceClick(WebElement element) {
        // Cand nu poti face click pe element (ex o reclama se suprapune) se poate folosi force click
        // JavascriptExecutor iti permite sa faci actiuni extra
        javaScriptExecutor.executeScript("arguments[0].click();", element);
    }

}
