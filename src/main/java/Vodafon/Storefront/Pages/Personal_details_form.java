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

/**
 * Created by Grzegorz Gałuszka on 26.05.2017.
 */
public class Personal_details_form extends PageObject {

    public Personal_details_form(WebDriver driver) {super(driver);}

    @FindBy(id = "mobileNumber")
    private WebElement mobile;

    @FindBy(name = "contactEmailAddress")
    private WebElement email;

    @FindBy(id = "lastName")
    private WebElement lastName;

    @FindBy(id = "firstName")
    private WebElement firstName;

    @FindBy(id = "birthPlace")
    private WebElement birthPlace;


    @FindBy(name = "DOB")
    private WebElement DOB;

    @FindBy(id = "mothersMaidenName")
    private WebElement mothersMaidenName;

    @FindBy(xpath = "//*[@id=\"simple-tabs-0\"]/div[1]/div/div[2]/fieldset/div[16]/div/label[1]/span")
    private WebElement sex;

    @FindBy(xpath = "//select[@id='identification_select']//option[2]")
    private WebElement idType;

    @FindBy(id = "idNumber")
    private WebElement idNumber;


    @FindBy(id = "home_postcode")
    private WebElement postcode;

    @FindBy(id = "home_townCity")
    private WebElement town;

    @FindBy(id = "home_streetName")
    private WebElement street;

    @FindBy(id = "home_streetType")
    private WebElement streetType;

    @FindBy(id = "home_houseNo")
    private WebElement houseNo;

    @FindBy(id = "personalinfoConfirm")
    private WebElement Confirm;






    public void fill_details_form(TestUser testUser) {

        List<WebElement> detailsForm = driver.findElements(By.cssSelector(".js-form-label"));
        if (detailsForm.isEmpty()) {
            System.out.println("Redirection to Basket failed. Screenshot saved in ./target/screenshots/" + timestamp());
            WebUtils.captureScreen(driver);
            System.exit(1);
        }


        this.mobile.clear();
        this.mobile.sendKeys(testUser.getMobile());

        this.email.clear();
        this.email.sendKeys(testUser.getEmail());

        this.lastName.clear();
        this.lastName.sendKeys(testUser.getLastName());

        this.firstName.clear();
        this.firstName.sendKeys(testUser.getFirstName());

        this.birthPlace.clear();
        this.birthPlace.sendKeys(testUser.getBirthPlace());

        this.DOB.clear();
        this.DOB.sendKeys(testUser.getDOB());

        this.mothersMaidenName.clear();
        this.mothersMaidenName.sendKeys(testUser.getMothersMaidenName());

        sex.click();

        idType.click();

        this.idNumber.clear();
        this.idNumber.sendKeys(testUser.getIdNumber());

        this.postcode.clear();
        this.postcode.sendKeys(testUser.getPostcode());

        this.town.clear();
        this.town.sendKeys(testUser.getTown());

        this.street.clear();
        this.street.sendKeys(testUser.getStreet());

        this.streetType.clear();
        this.streetType.sendKeys(testUser.getStreetType());

        this.houseNo.clear();
        this.houseNo.sendKeys(testUser.getHouseNo());

        Confirm.click();


    }


}
