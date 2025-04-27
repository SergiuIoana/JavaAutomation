package Pages;

import HelperMethods.ElementsMethods;
import HelperMethods.JavascriptHelpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class PracticeFormPage {

    WebDriver driver;

    ElementsMethods elementsMethods;

    public PracticeFormPage(WebDriver driver){
        this.driver = driver;
        elementsMethods = new ElementsMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy (id="firstName")
    WebElement firstNameElement;
    @FindBy (id="lastName")
    WebElement lastNameElement;
    @FindBy (id="userEmail")
    WebElement userEmailElement;
    @FindBy (css = "input[placeholder='Mobile Number']")
    WebElement mobileNumberElement;
    @FindBy (id = "uploadPicture")
    WebElement pictureElement;
    @FindBy(xpath = "//label[@for='gender-radio-1']")
    WebElement genderMaleElement;
    @FindBy(xpath = "//label[@for='gender-radio-2']")
    WebElement genderFemaleElement;
    @FindBy(xpath = "//label[@for='gender-radio-3']")
    WebElement genderOtherElement;
    @FindBy(id = "currentAddress")
    WebElement addressElement;
    @FindBy(xpath = "react-select-3-input")
    WebElement stateElement;
    @FindBy(id = "react-select-4-input")
    WebElement cityElement;
    @FindBy(xpath = "//label[@for='hobbies-checkbox-1']")
    WebElement sportHobbyElement;
    @FindBy(xpath = "//label[@for='hobbies-checkbox-2']")
    WebElement readingHobbyElement;
    @FindBy(xpath = "//label[@for='hobbies-checkbox-3']")
    WebElement musicHobbyElement;
    //@FindBy(xpath = "//div[@id='subjectsContainer']")
    //WebElement subjectsElement;
    @FindBy(id = "subjectsInput")
    WebElement subjectsElement;


    public void completeFirstRegion (String firstName, String lastName, String email, String address, String mobileNo) {
        elementsMethods.fillElement(firstNameElement, firstName);
        elementsMethods.fillElement(lastNameElement, lastName);
        elementsMethods.fillElement(userEmailElement, email);
        elementsMethods.fillElement(addressElement, address);
        elementsMethods.fillElement(mobileNumberElement, mobileNo);
    }

    public void completeGender (String gender) {
        switch (gender) {
            case "Male":
                genderMaleElement.click();
                break;
            case "Female":
                genderFemaleElement.click();
                break;
            case "Other":
                genderOtherElement.click();
                break;
        }
    }

    public void completeSubject (String subject){
        elementsMethods.clickOnElements(subjectsElement);
        elementsMethods.fillWithActions(subjectsElement,subject);
    }

    public void completeSubjectWithList (List<String> list){
        elementsMethods.clickOnElements(subjectsElement);
        elementsMethods.fillMultipleValues(subjectsElement, list);
    }

    public void completeHobies (List<String> hobies){
        List<WebElement> hobiesElement = new ArrayList<>();
        hobiesElement.add(sportHobbyElement);
        hobiesElement.add(musicHobbyElement);
        hobiesElement.add(readingHobbyElement);
        elementsMethods.clickMultipleElementsByListOfValues(hobiesElement,hobies);
    }

}
