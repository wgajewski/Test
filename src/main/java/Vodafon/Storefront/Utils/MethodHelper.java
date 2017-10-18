package Vodafon.Storefront.Utils;


import Vodafon.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MethodHelper extends PageObject {
    public MethodHelper(WebDriver driver) {
        super(driver);
    }

    public MethodHelper isElementPresent(By locator) {

        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.elementToBeClickable(locator));

        } catch (TimeoutException e) {


        }
        return new MethodHelper(driver);
    }
}
