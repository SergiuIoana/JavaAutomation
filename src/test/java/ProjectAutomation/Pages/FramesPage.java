package ProjectAutomation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FramesPage extends CommonPage {

    @FindBy(id = "frame1")
    WebElement bigFrameElement;

    @FindBy(xpath = "//h1[@id='sampleHeading']")
    WebElement sampleHeadingFrameElement;

    @FindBy(id = "frame2")
    WebElement smallFrameElement;

    public FramesPage(WebDriver driver) {
        super(driver);
    }


    public void bigFrame() {
//        frames.switchTo(bigFrameElement);
        driver.switchTo().frame(bigFrameElement);
        WebElement sampleHeadingBigFrameElement = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
        System.out.println("Textul din noul window este: " + sampleHeadingBigFrameElement.getText());
        Assert.assertTrue(sampleHeadingBigFrameElement.getText().contains("This is a sample page"));
    }

    public void smallFrame() {
        framesMethods.switchToFrame(smallFrameElement);
        WebElement sampleHeadingBigFrameElement = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
        System.out.println("Textul din noul window este: " + sampleHeadingBigFrameElement.getText());
        Assert.assertTrue(sampleHeadingBigFrameElement.getText().contains("This is a sample page"));
    }


}
