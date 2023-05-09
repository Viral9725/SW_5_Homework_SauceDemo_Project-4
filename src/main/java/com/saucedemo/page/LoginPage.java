package com.saucedemo.page;

import com.aventstack.extentreports.Status;
import com.saucedemo.customlisteners.CustomListeners;
import com.saucedemo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(id = "user-name")
    WebElement usernameField;
    public void enterUsername(String userName) {
        CustomListeners.test.log(Status.PASS, "enter Username");
        sendTextToElement(usernameField, userName);
        Reporter.log("enter Username" + usernameField.toString());
    }
    @CacheLookup
    @FindBy(id = "password")
    WebElement passwordField;
    public void enterPassword(String password) {
        CustomListeners.test.log(Status.PASS, "enter Password");
        sendTextToElement(passwordField, password);
        Reporter.log("enter Password" + passwordField.toString());
    }
    @CacheLookup
    @FindBy(id = "login-button")
    WebElement loginLink;
    public void clickOnLoginLink() {
        CustomListeners.test.log(Status.PASS, "click On LoginLink");
        clickOnElement(loginLink);
        Reporter.log("click On LoginLink" + loginLink.toString());
    }
}
