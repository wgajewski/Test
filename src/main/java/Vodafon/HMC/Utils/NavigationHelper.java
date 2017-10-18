package Vodafon.HMC.Utils;


import Vodafon.PageObject;
import Vodafon.Storefront.Pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class NavigationHelper extends PageObject {
    public NavigationHelper(WebDriver driver) {
        super(driver);
    }

    private String LoginPage = "https://10.10.200.10/hmc/hybris/";

    public NavigationHelper GoToHMCLogin() {
        driver.get(LoginPage);
        return new NavigationHelper(driver);
    }
}
