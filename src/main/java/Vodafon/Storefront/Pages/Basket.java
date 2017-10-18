package Vodafon.Storefront.Pages;

import Vodafon.PageObject;
import Vodafon.Storefront.Utils.WebUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static Vodafon.Storefront.Utils.WebUtils.timestamp;
import static org.junit.Assert.assertEquals;

/**
 * Created by Grzegorz Gałuszka on 25.05.2017.
 */
public class Basket extends PageObject {
    public Basket(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//span[.='Kiegészítő szolgáltatások']")
    private WebElement dropdown_EU_Roaming;

    @FindBy(xpath = "//*[@outerText='Vodafone EU Roaming']")
    private WebElement EU_Roaming;

    @FindBy(xpath = "form__label--checkable")
    private List<WebElement> LabelList;
    @FindBy(xpath = "//*[@id=\"carttopersonalinfo\"]")
    private WebElement Proceed_Button;

    @FindBy(linkText = "My Vodafone")
    private WebElement myVodafoneButton;

    @FindBy(id = "basketTab")
    private WebElement basketTab;

    @FindBy(id = "minicart_btn")
    private WebElement minicart_btn;


    public Basket kosaram_proceed(String mobile, String TariffName) throws InterruptedException {
        Thread.sleep(2000);

        List<WebElement> ExtrasList = driver.findElements(By.cssSelector(".form__label--checkable"));
        if (ExtrasList.isEmpty()) {
            System.out.println("Redirection to Basket failed. Screenshot saved in ./target/screenshots/" + timestamp());
            WebUtils.captureScreen(driver);
            System.exit(1);
        }

        String chosenMobile= driver.findElement(By.cssSelector(".checkout__device-details p strong")).getAttribute("outerText");
        assertEquals(chosenMobile,mobile);
        List<WebElement> list = driver.findElements(By.cssSelector("p"));

        String chosenTariff= list.get(28).getAttribute("textContent");
        String ClearedchosenTariff = chosenTariff.replace(",", "");
        String ClearedchosenTariff1 = ClearedchosenTariff.replace("You", "");
        String ClearedchosenTariff2 = ClearedchosenTariff1.replace("e-Pack", "");


        String ClearedTariffName = TariffName.replace("You", "");
        String ClearedTariffName2 = ClearedTariffName.replace("e-Pack", "");

        assertEquals(ClearedTariffName2,ClearedchosenTariff2);


        dropdown_EU_Roaming.click();
            Thread.sleep(8000);
            List<WebElement> lista = driver.findElements(By.className("form__label--checkable"));
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).getText().equalsIgnoreCase("vodafone eu roaming")) {
                    lista.get(i).click();
                    break;
                } else {
                    continue;
                }
            }

            Thread.sleep(10000);
            Proceed_Button.click();
            return new Basket(driver);


        }
    }

