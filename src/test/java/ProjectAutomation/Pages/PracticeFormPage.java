package ProjectAutomation.Pages;

import ObjectData.PracticeFormObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class PracticeFormPage extends CommonPage{

    /*
    WebDriver driver;
    ElementsMethods elementsMethods;
     public PracticeFormPage(WebDriver driver){
         this.driver = driver;
         elementsMethods = new ElementsMethods(driver);
        PageFactory.initElements(driver, this);
     }
    */

    @FindBy (id="firstName")
    private WebElement firstNameElement;
    @FindBy (id="lastName")
    private WebElement lastNameElement;
    @FindBy (id="userEmail")
    private WebElement userEmailElement;
    @FindBy (css = "input[placeholder='Mobile Number']")
    private WebElement mobileNumberElement;
    @FindBy (id = "uploadPicture")
    private WebElement pictureElement;
    @FindBy(xpath = "//label[@for='gender-radio-1']")
    private WebElement genderMaleElement;
    @FindBy(xpath = "//label[@for='gender-radio-2']")
    private WebElement genderFemaleElement;
    @FindBy(xpath = "//label[@for='gender-radio-3']")
    private WebElement genderOtherElement;
    @FindBy(id = "currentAddress")
    private WebElement addressElement;
    @FindBy(xpath = "react-select-3-input")
    private WebElement stateElement;
    @FindBy(id = "react-select-4-input")
    private WebElement cityElement;
    @FindBy(xpath = "//label[@for='hobbies-checkbox-1']")
    private WebElement sportHobbyElement;
    @FindBy(xpath = "//label[@for='hobbies-checkbox-2']")
    private WebElement readingHobbyElement;
    @FindBy(xpath = "//label[@for='hobbies-checkbox-3']")
    private WebElement musicHobbyElement;
    //@FindBy(xpath = "//div[@id='subjectsContainer']")
    //WebElement subjectsElement;
    @FindBy(id = "subjectsInput")
    private WebElement subjectsElement;

    public PracticeFormPage(WebDriver driver) {
        super(driver);
    }


    public void completeFirstRegion (PracticeFormObject practiceFormObject) {
        elementsMethods.fillElement(firstNameElement, practiceFormObject.getFirstName());
        elementsMethods.fillElement(lastNameElement, practiceFormObject.getLastName());
        elementsMethods.fillElement(userEmailElement, practiceFormObject.getEmail());
        elementsMethods.fillElement(addressElement, practiceFormObject.getAddress());
        elementsMethods.fillElement(mobileNumberElement, practiceFormObject.getMobileNo());
    }

    public void completeGender (PracticeFormObject practiceFormObject) {
        switch (practiceFormObject.getGender()) {
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

    public void completeSubjectWithList (PracticeFormObject practiceFormObject){
        elementsMethods.clickOnElements(subjectsElement);
        elementsMethods.fillMultipleValues(subjectsElement, practiceFormObject.getSubjects());
    }

    public void completeHobies (PracticeFormObject practiceFormObject){
        List<WebElement> hobiesElement = new ArrayList<>();
        hobiesElement.add(sportHobbyElement);
        hobiesElement.add(musicHobbyElement);
        hobiesElement.add(readingHobbyElement);
        elementsMethods.clickMultipleElementsByListOfValues(hobiesElement, practiceFormObject.getHobbies());
    }

    public void completeState(PracticeFormObject practiceFormObject){
        //javascriptHelpers.forceClick((stateElement));
        elementsMethods.clickOnElements(stateElement);
        elementsMethods.waitVisibilityElement(stateElement);
        elementsMethods.fillWithActions(stateElement, practiceFormObject.getState());
        //javascriptHelpers.forceClick(cityElement);
        elementsMethods.clickOnElements(cityElement);
        elementsMethods.waitVisibilityElement(cityElement);
        elementsMethods.fillWithActions(cityElement,practiceFormObject.getCity());
    }

}
