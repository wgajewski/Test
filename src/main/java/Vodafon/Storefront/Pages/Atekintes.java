package Vodafon.Storefront.Pages;

import Vodafon.PageObject;
import Vodafon.Storefront.Utils.TestData.TestUser;
import Vodafon.Storefront.Utils.WebUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static Vodafon.Storefront.Utils.WebUtils.timestamp;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class Atekintes extends PageObject {
    public Atekintes(WebDriver driver) {super(driver);}



    @FindBy(xpath = "//*[@id=\"overviewFormID\"]")
    private WebElement proceed;

    @FindBy(xpath = "//span[.='Személyes adataim']")
    private WebElement pesonalData;

    @FindBy(xpath = "//span[.='Állandó lakcímem']")
    private WebElement addressData;

    @FindBy(xpath = "//span[.='Szállítási adataim']")
    private WebElement deliveryData;

    @FindBy(xpath = "//span[.='Fizetési adataim']")
    private WebElement paymentData;


    public Atekintes SubmitOrder(String mobile, String TarrifName, TestUser testUser) throws Exception {


    Thread.sleep(500);
    List<WebElement> paymentMethods = driver.findElements(By.id("overviewFormID"));
    if (paymentMethods.isEmpty()) {
        System.out.println("Redirection to OrderSummary failed. Screenshot saved in ./target/screenshots/" + timestamp());
        WebUtils.captureScreen(driver);
        System.exit(1);
    }

        checkOrder(mobile, TarrifName);

        List<WebElement> dropDowns = driver.findElements(By.cssSelector(".accordion__item h3 svg"));

        for (int i = 0; i < dropDowns.size(); i++) {
            Thread.sleep(500);
            dropDowns.get(i).click();

            }

        //pesonalData.click();
        //addressData.click();
        //deliveryData.click();
        //paymentData.click();

        checkDetails(testUser);

        proceed.click();


    return new Atekintes(driver);
    }

    private void checkOrder(String mobile, String tarrifName) {

        List<WebElement> orderDetails = driver.findElements(By.cssSelector(".checkout__device-details p strong"));
        String mobile1 = orderDetails.get(0).getAttribute("textContent");


        assertEquals(mobile1,mobile);



        String chosenTariff= orderDetails.get(1).getAttribute("textContent");
        String ClearedchosenTariff = chosenTariff.replace(",", "");
        String ClearedchosenTariff1 = ClearedchosenTariff.replace("You", "");
        String ClearedchosenTariff2 = ClearedchosenTariff1.replace("e-Pack", "");

        String ClearedTariffName = tarrifName.replace("You", "");
        String ClearedTariffName2 = ClearedTariffName.replace("e-Pack", "");

        assertEquals(ClearedTariffName2,ClearedchosenTariff2);

        }



    private void checkDetails(TestUser testUser) {

        List<WebElement> customerDetails = driver.findElements(By.cssSelector(".js-accordion-content p strong"));


        String lastName1= customerDetails.get(0).getAttribute("textContent");
        String firstName1= customerDetails.get(1).getAttribute("textContent");
        String birthPlace1= customerDetails.get(2).getAttribute("textContent");
        String mothersMaidenName1 = customerDetails.get(3).getAttribute("textContent");
        String DOB1 = customerDetails.get(4).getAttribute("textContent");
        String idNumber1 = customerDetails.get(5).getAttribute("textContent");
        String email1 = customerDetails.get(6).getAttribute("textContent");
        String mobile1= customerDetails.get(7).getText();
        String postcode1 = customerDetails.get(9).getText();
        String town1 = customerDetails.get(10).getAttribute("textContent");
        String street1 = customerDetails.get(11).getText();
        String houseNo1 = customerDetails.get(12).getAttribute("textContent");

        String clearedMobile1 = mobile1.replace("+36[ ]", "");
        String clearedMobile = testUser.getMobile().replace("[]", "");

        assertEquals(lastName1,testUser.getLastName());
        assertEquals(firstName1,testUser.getFirstName());
        assertEquals(birthPlace1,testUser.getBirthPlace());
        assertEquals(mothersMaidenName1,testUser.getMothersMaidenName());
        assertEquals(DOB1,testUser.getDOB());
        assertEquals(idNumber1,testUser.getIdNumber());
        assertEquals(email1,testUser.getEmail());
        assertEquals(clearedMobile1,"+36 " + clearedMobile);
        assertEquals(postcode1,testUser.getPostcode());
        assertEquals(town1,testUser.getTown());
        assertEquals(street1,testUser.getStreet() + " " + testUser.getStreetType());
        assertEquals(houseNo1,testUser.getHouseNo());


    }


}