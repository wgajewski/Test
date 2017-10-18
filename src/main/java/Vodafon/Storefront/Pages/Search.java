package Vodafon.Storefront.Pages;

import Vodafon.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by wgaje_000 on 2017-05-29.
 */
public class Search extends PageObject {
    public Search(WebDriver driver) {
        super(driver);
    }


    public Search Search(String query) throws Exception {
        MainPage mainPage = new MainPage(driver);

        mainPage.SearchForQuery(query);
        Thread.sleep(1000);
        driver.findElement(By.linkText(query)).click();


        return new Search(driver);
    }
}
