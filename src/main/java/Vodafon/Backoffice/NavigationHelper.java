package Vodafon.Backoffice;


import Vodafon.PageObject;
import com.gargoylesoftware.htmlunit.Page;
import org.openqa.selenium.WebDriver;
import sun.rmi.runtime.Log;

public class NavigationHelper extends PageObject {
    public NavigationHelper(WebDriver driver) {super(driver);}

    private String LoginPage = "https://37.59.19.116:9002/backoffice/login.zul";

    public NavigationHelper GoToLogin(){
     driver.get(LoginPage);
     return new NavigationHelper(driver);
    }
}
