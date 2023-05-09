package com.saucedemo.page;

import com.aventstack.extentreports.Status;
import com.saucedemo.customlisteners.CustomListeners;
import com.saucedemo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ProductPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Products')]")
    WebElement productsText;
    public String getProductsText() {
        String message1 = getTextFromElement(productsText);
        CustomListeners.test.log(Status.PASS, "get Products Text");
        Reporter.log("get Products Text" + productsText.toString());
        return message1;
    }
    @CacheLookup
    @FindBy(xpath = "//div[@id='']")
    WebElement list;
    public String getItemNumberOnProductsPage() {
        String message2 = getTextFromElement(list);
        CustomListeners.test.log(Status.PASS, "getItem Number On ProductsPage");
        Reporter.log("getItem Number On ProductsPage" + list.toString());
        return message2;
    }
}