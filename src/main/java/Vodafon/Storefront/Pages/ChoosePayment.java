package Vodafon.Storefront.Pages;

import Vodafon.PageObject;
import Vodafon.Storefront.Utils.WebUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static Vodafon.Storefront.Utils.WebUtils.timestamp;

public class ChoosePayment  extends PageObject {





    public ChoosePayment(WebDriver driver) {super(driver);}

    @FindBy(xpath="//*[@id=\"Shipping-data_confirm\"]")
    private WebElement Agree;

    @FindBy(xpath = "//input[@id='staticConsent']/following-sibling::*")
    private WebElement staticConsent;

    @FindBy(xpath = "//*[@id=\"shippingDataForm\"]/div[1]/div[5]/div/label/span")
    private WebElement eaAdviceIndicatorConsent;

    @FindBy(xpath = "//*[@id=\"shippingDataForm\"]/div[1]/div[4]/div/label/span")
    private WebElement directoryServiceIndicatorConsent;

    @FindBy(xpath = "//*[@id=\"shippingDataForm\"]/div[1]/div[3]/div/label/span")
    private WebElement smsEmailLetterIndicatorConsent;

    @FindBy(xpath="//*[@id=\"shippingDataForm\"]/div[1]/div[6]/div/label/span")
    private WebElement thirdPartyIndicator;

    @FindBy(xpath="//input[@value= 'SPAY']/parent::*")
    private WebElement modeofPayment;

    //"//input[@value= 'SPAY']"


    public ChoosePayment Payment() throws Exception {



        List<WebElement> shoplist = driver.findElements(By.cssSelector(".shop-adresses"));
        if (shoplist.isEmpty()) {
            System.out.println("Redirection to ChoosePayment failed. Screenshot saved in ./target/screenshots/" + timestamp());
            WebUtils.captureScreen(driver);
            System.exit(1);
        }

        Thread.sleep(1000);
        //modeofPayment.click();
        Thread.sleep(1000);
        staticConsent.click();
        Thread.sleep(1000 );
        Agree.click();


        return new ChoosePayment(driver);
    }
}
