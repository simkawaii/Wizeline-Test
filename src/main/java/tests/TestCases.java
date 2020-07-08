package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.Step1Page;
import pageobjects.Step2Page;

public class TestCases extends TestBase {

    Step1Page step1Page;
    Step2Page step2Page;

    @Test (description = "Verify invalid email format when creating an account")
    public void inputInvalidEmail(){
        step1Page = new Step1Page(driver);
        step1Page.openPage();
        step1Page.setEmail("test123456");
        step1Page.clickButton();
        Assert.assertEquals(step1Page.getEmailError(), "Enter valid email");
    }

    @Test (description = "Submit the form successfully")
    public void submitFormSuccessfully(){
        step1Page = new Step1Page(driver);

        step1Page.openPage();
        step1Page.setFirstName("Sim");
        step1Page.setLastName("Tran");
        step1Page.setEmail("test123456@gmail.com");
        step1Page.setMonth(1);
        step1Page.setMonth(10);
        step1Page.setYear(10);
        step1Page.clickButton();

        step2Page = new Step2Page(driver);
        Assert.assertTrue(step2Page.isPageOpened());
    }
}
