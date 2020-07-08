package pageobjects;

import base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Step1Page extends PageBase {

    public static String PAGE_URL = "https://www.utest.com/signup/personal";

    public Step1Page(WebDriver driver) { super(driver); }

    @FindBy(id = "firstName")
    private WebElement firstNameField;

    @FindBy (id = "firstNameError")
    private WebElement firstNameError;

    @FindBy (id = "lastName")
    private WebElement lastNameField;

    @FindBy (id = "lastNameError")
    private WebElement lastNameError;

    @FindBy (id = "email")
    private WebElement emailField;

    @FindBy (id = "emailError")
    private WebElement emailError;

    @FindBy (xpath = "//*[@id=\"birthMonth\"]/input[1]")
    private WebElement birthMonthField;

    @FindBy (xpath = "//*[@id=\"birthDay\"]/div[1]/span/span[2]")
    private WebElement birthDayField;

    @FindBy (id = "birthYear")
    private WebElement birthYearField;

    @FindBy (id = "birthDateError")
    private WebElement birthDateError;

    @FindBy (id = "languages")
    private WebElement languagesDropbox;

    @FindBy (xpath = "/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/a")
    private WebElement nextButton;

    public void openPage(){
        driver.get(PAGE_URL);
        wait(5);
    }

    public void setFirstName(String firstName){
        firstNameField.clear();
        firstNameField.sendKeys(firstName);
    }

    public String getFirstNameError(){
        return firstNameError.getText().toString();
    }

    public void setLastName(String lastName){
        lastNameField.clear();
        lastNameField.sendKeys(lastName);
    }

    public String getLastNameError(){
        return lastNameError.getText().toString();
    }

    public void setEmail(String email){
        emailField.clear();
        emailField.sendKeys(email);
    }

    public String getEmailError(){
        return emailError.getText().toString();
    }

    public void setMonth(int index){
        Select dropdown = new Select(birthMonthField);
        dropdown.selectByIndex(index);
    }

    public void setDay(int index){
        Select dropdown = new Select(birthDayField);
        dropdown.selectByIndex(index);
    }

    public void setYear(int index){
        Select dropdown = new Select(birthYearField);
        dropdown.selectByIndex(index);
    }

    public String getDateOfBirthError(){
        return birthDateError.getText().toString();
    }

    public void setLanguage (int index){
        Select dropdown = new Select(languagesDropbox);
        dropdown.selectByIndex(index);
    }

    public void clickButton(){
        nextButton.click();
    }
}
