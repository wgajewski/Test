package Vodafon.Backoffice.Utils;


import Vodafon.PageObject;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends PageObject {
    public NavigationHelper(WebDriver driver) {super(driver);}

    private String LoginPage = "https://37.59.19.116:9002/backoffice/login.zul";

    public NavigationHelper GoToBOLogin(){
     driver.get(LoginPage);
     return new NavigationHelper(driver);
    }
}
