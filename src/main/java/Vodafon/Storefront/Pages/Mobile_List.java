package Vodafon.Storefront.Pages;

import Vodafon.PageObject;
import org.openqa.selenium.*;

public class Mobile_List extends PageObject {
    public Mobile_List(WebDriver driver) {
        super(driver);
    }


    public Mobile_List choose_mobile(String mobile) throws Exception {
        Thread.sleep(1000);
        try {
            driver.findElement(By.linkText(mobile)).click();
        }
        catch (NoSuchElementException e){
            JavascriptExecutor js = (JavascriptExecutor) driver;
            for (int i = 0; i < 8; i++) {
                js.executeScript("window.scrollBy(0,10000)", "");
                Thread.sleep(500);
                try {
                    driver.findElement(By.linkText(mobile)).click();
                    break;
                } catch (NoSuchElementException f) {
                    continue;
                } catch (ElementNotVisibleException f) {
                    continue;
                }
            }

        }
        catch (ElementNotVisibleException e) {


            JavascriptExecutor js = (JavascriptExecutor) driver;
            for (int i = 0; i < 8; i++) {
                js.executeScript("window.scrollBy(0,10000)", "");
                Thread.sleep(500);
                try {
                    driver.findElement(By.linkText(mobile)).click();
                    break;
                } catch (NoSuchElementException f) {

                } catch (ElementNotVisibleException f) {

                }
            }

        }
        return new Mobile_List(driver);

    }
}







