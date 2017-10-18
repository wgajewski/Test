package Vodafon.Storefront.Utils;

import Vodafon.PageObject;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Grzegorz Gałuszka on 01.06.2017.
 */
public class WebUtils extends PageObject {public WebUtils(WebDriver driver) {super(driver);}

    static public void waitUntilSpinnerIsGone(WebDriver driver) {
        try {
            WebElement spinner = driver.findElement(By.id("processingOverlay"));
            while (spinner.isDisplayed()) {
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public static String timestamp() {
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    }


    public static String captureScreen(WebDriver driver) {
        String path;
        try {

            File scrnsht = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            path = "./target/screenshots/" + scrnsht.getName();
            File dest= new File("./target/screenshots/"+timestamp()+".png");
            FileUtils.copyFile(scrnsht, dest);
        }
        catch(IOException e) {
            path = "Failed to capture screenshot: " + e.getMessage();
        }
        return path;
    }


}
