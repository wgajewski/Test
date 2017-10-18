package Vodafon.Storefront.Pages;


import Vodafon.PageObject;
import Vodafon.Storefront.Utils.MethodHelper;
import Vodafon.Storefront.Utils.WebUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static Vodafon.Storefront.Utils.WebUtils.timestamp;
import static org.junit.Assert.assertEquals;

public class Choose_Tariff extends PageObject {
    public Choose_Tariff(WebDriver driver) {
        super(driver);
    }

    MethodHelper MH = new MethodHelper(driver);


    @FindBy(linkText = "Megrendelem")
    private WebElement addtocartbutton;

    /**
     * @param TariffName - possible names -
     *                   Go EU E 2év
     *                   Go Medium EU D 2év
     *                   Go+ EU B 2év
     *                   Red Basic EU+ XM 2év
     *                   Red Medium EU+ XM 2év
     *                   Red Extra EU+ XM 2év
     */

    public Choose_Tariff choosePostpaidTariff(String mobile, String TariffName) throws Exception {
        Actions builder = new Actions(driver);

        List<WebElement> AmountOfMobiles = driver.findElements(By.cssSelector(".servicePlanName_1"));

        if (AmountOfMobiles.isEmpty()) {
            System.out.println("Redirection to TariffList failed. Screenshot saved in ./target/screenshots/" + timestamp());
            WebUtils.captureScreen(driver);
            System.exit(1);
        }


        String ClearedchosenTariff1 = TariffName.replace("You", "");
        String ClearedchosenTariff2 = ClearedchosenTariff1.replace("e-Pack", "");

       List<WebElement> tariffList = driver.findElements(By.xpath("//p[@aria-hidden]"));
        for (int i = 0; i < tariffList.size(); i++) {
            if (tariffList.get(i).getAttribute("outerText").contains(ClearedchosenTariff2)) {
                tariffList.get(i).click();
                List<WebElement> list = driver.findElements(By.cssSelector("p.font-20 strong"));
                String chosenMobile= list.get(2).getAttribute("textContent");
                assertEquals(chosenMobile,mobile);
                break;
            }
        }
        try
        {
            driver.findElement(By.xpath("//div[@class='device-details__device-infos-wrapper']//p[.='" + mobile + "']"));
        }
        catch (Exception e) {
            System.out.println(e + "Chosen mobile different than" + mobile + " Screenshot saved in ./target/screenshots/" + timestamp());
            WebUtils.captureScreen(driver);
        }
        List<WebElement> ExtrasList = driver.findElements(By.cssSelector(".form__label--checkable"));
        if (ExtrasList.isEmpty()) {
            System.out.println("Redirection to Basket failed. Screenshot saved in ./target/screenshots/" + timestamp());
            WebUtils.captureScreen(driver);
            System.exit(1);
        }









        MH.isElementPresent(By.linkText("Megrendelem"));
        //Thread.sleep(1000);
        driver.findElement(By.linkText("Megrendelem")).click();
        return new Choose_Tariff(driver);
    }


    /**
     * @param TariffName - possible names -
     *                   Vodafone Net+
     *                   Vodafone Tuti
     *                   Vodafone Max L
     *                   Vodafone Max M
     **/

    public Choose_Tariff ChoosePrepaidTariff(String TariffName) throws Exception {
        Actions builder = new Actions(driver);

        
        switch (TariffName) {
            case "Vodafone Net+":
                driver.findElement(By.className("servicePlanName_18")).click();
                break;

            case "Vodafone Tuti":
                driver.findElement(By.className("servicePlanName_22")).click();
                break;

            case "Vodafone Max L":
                driver.findElement(By.className("servicePlanName_14")).click();
                break;

            case "Vodafone Max M":
                driver.findElement(By.className("servicePlanName_15")).click();
                break;



        }

        MH.isElementPresent(By.linkText("Megrendelem"));

        driver.findElement(By.linkText("Megrendelem")).click();
        return new Choose_Tariff(driver);
    }
}

