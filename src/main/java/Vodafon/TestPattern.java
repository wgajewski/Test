package Vodafon;

import Vodafon.SQLDev.pages.DBOperations;
import Vodafon.Storefront.Pages.*;
import Vodafon.Storefront.Utils.NavigationHelper;
import Vodafon.Storefront.Utils.WebUtils;
import Vodafon.CALLBACK.callBack;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import Vodafon.Backoffice.Login;

/**
 * Created by wgaje_000 on 2017-05-25.
 */
public class TestPattern {
    protected static WebDriver driver;
    protected NavigationHelper NH;
    protected MainPage mainpage;
    protected Mobile_List ml;
    protected Choose_Tariff tariff;
    protected Basket kosaram;
    protected Personal_details_form pdf;
    protected Search search;
    protected ChoosePayment payment;
    protected Atekintes atekintes;
    protected WebUtils WebUtils;
    protected DBOperations dbOperations;
    protected callBack callback;


    @Parameters({"browserID", "username", "server"})


    @BeforeTest
    public void setUp(int browserID, String username, String server) throws Exception {
        String Chrome = new String("src/test/resources/chromedriver.exe");
        String FF = new String("src/test/resources/geckodriver.exe");


        switch (browserID) {
            case 1:
                System.setProperty("webdriver.gecko.driver",FF);
                driver = new FirefoxDriver();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;
            case 2:
                System.setProperty("webdriver.chrome.driver",Chrome);
                driver = new ChromeDriver();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;
        }
        mainpage = new MainPage(driver);
        pdf = new Personal_details_form(driver);
        search = new Search(driver);
        kosaram = new Basket(driver);
        tariff = new Choose_Tariff(driver);
        ml = new Mobile_List(driver);
        payment = new ChoosePayment(driver);
        atekintes= new Atekintes(driver);
        WebUtils = new WebUtils(driver);
        dbOperations = new DBOperations();
        callback = new callBack();

        switch (server) {
            case "10":
                NH = new NavigationHelper(driver);
                NH.GoToFrontPage10();
                break;

            case "37":
                NH = new NavigationHelper(driver);
                NH.GoToFrontPage37();
                break;

            case "local":

                NH = new NavigationHelper(driver);
                NH.GoToFrontPageLocal();
                break;
        }

        switch (username) {

            case "DDTRepUser":

                Login Login = new Login(driver);
                Login.LogInEnglish("DDTRepUser", "QAZwsx1234");
                break;

            case "spectator":

                Login = new Login(driver);
                Login.LogInEnglish("spectator", "1234");
                break;


            case "DDTTLUser":

                Login = new Login(driver);
                Login.LogInEnglish("DDTTLUser", "QAZwsx1234");
                break;


            case "OCVUser":

                Login = new Login(driver);
                Login.LogInEnglish("OCVUser", "1234");
                break;


            case "MASPEDTLUser":

                Login = new Login(driver);
                Login.LogInEnglish("MASPEDTLUser", "Qwerty1234");
                break;


            case "AccountSupportUser":

                Login = new Login(driver);
                Login.LogInEnglish("AccountSupportUser", "1234");
                break;


            case "ApplicationHelplineUser":

                Login = new Login(driver);
                Login.LogInEnglish("ApplicationHelplineUser", "1234");
                break;


            case "OCVTLUser":

                Login = new Login(driver);
                Login.LogInEnglish("OCVTLUser", "1234");
                break;


            case "CCUser":

                Login = new Login(driver);
                Login.LogInEnglish("CCUser", "1234");
                break;


            case "MASPEDRepUser":

                Login = new Login(driver);
                Login.LogInEnglish("MASPEDRepUser", "Qwerty1234");
                break;


            case "admin":

                Login = new Login(driver);
                Login.LogInEnglish("admin", "nimda");
                break;

            case "customer1":

                MainPage MainPage = new MainPage(driver);

                MainPage.logInProcess("customer1", "customer1");
                break;

            case "testergg":

                MainPage = new MainPage(driver);

                MainPage.logInProcess("testergg@test.test", "!QAZ2wsx");
                break;


        }


    }


    @AfterMethod
    public void cleanUp() {
        driver.manage().deleteAllCookies();
    }

   /* @AfterClass
    public static void tearDown() {
        driver.close();
    }

    @AfterTest
    public static void destruction() {
        driver.quit();
    }*/
}
