package pageobjects;

import base.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Step2Page extends PageBase {


    public Step2Page(WebDriver driver) { super(driver); }

    @FindBy (tagName = "h1")
    private WebElement title;

    public boolean isPageOpened(){
        return title.getText().toString().contains("Step 2: ");
    }
}
