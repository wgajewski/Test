package Vodafon.Storefront.Pages;

import Vodafon.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ThankYou extends PageObject {
    public ThankYou(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath ="//*[@id=\"content\"]/div[9]/div[2]/p/strong" )
    private WebElement OrderID;

    public ThankYou GetOrderId(){
    System.out.println("OrderID ="+OrderID.getText()) ;
    return new ThankYou(driver);
    }

}
