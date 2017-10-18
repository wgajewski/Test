package Vodafon.Storefront.Pages;


import Vodafon.Storefront.Utils.NavigationHelper;
import Vodafon.PageObject;
import Vodafon.Storefront.Utils.WebUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

import static Vodafon.Storefront.Utils.WebUtils.timestamp;

public class MainPage extends PageObject {
    public MainPage(WebDriver driver) {super(driver);}

   // private Actions builder = new Actions(driver);
    private WebDriver.Timeouts wait1;
    private WebDriverWait wait2;

    @FindBy(id = "user-out-popover")
    private WebElement LogIn_Icon;

    @FindBy(xpath = "//*[@id=\"login_formt\"]/fieldset/div[5]/a")
    private WebElement GoToEmail;

    @FindBy(id = "loginLinkLoginHeader")
    private WebElement title;

    @FindBy(id = "j_username")
    private WebElement Username;

    @FindBy(id = "j_password")
    private WebElement Password;

    @FindBy(id = "logbtn")
    private WebElement LogInButton;

    @FindBy(xpath = "//a[@data-js='search']")
    private WebElement SearchIcon;

    @FindBy(xpath = "//*[@id=\"ajax\"]/div/div/form/fieldset/div[1]/div/label/input")
    private WebElement SearchText;

    @FindBy(xpath = " //*[@id=\"ajax\"]/div/div/form/fieldset/div[1]/div/button")
    private WebElement SearchButton;


    public MainPage SearchForQuery(String query) throws Exception {
        SearchIcon.click();
        Thread.sleep(1000);
        SearchText.clear();
        SearchText.sendKeys(query);
        SearchButton.click();
        return new MainPage(driver);}

    public MainPage logInProcess(String username, String password) throws Exception {
        LogIn_Icon.click();
        Thread.sleep(500);
        GoToEmail.click();
        this.Username.sendKeys(username);
        this.Password.sendKeys(password);
        LogInButton.click();


        String user = driver.findElement(By.xpath("//*[@id=\"login__prompt\"]/a[1]/strong")).getText();

        if (!user.equals(username)) {
            System.out.println("User is not logged as" +username+"Screenshot saved in ./target/screenshots/" + timestamp());
            WebUtils.captureScreen(driver);
            System.exit(1);
        }

        return new MainPage(driver);}

    public MainPage Clear_Basket() throws Exception {
        NavigationHelper NH = new NavigationHelper(driver);

        if (driver.findElement(By.xpath("//*[@id=\"basketTab\"]")).isDisplayed()) {
            do {
                Thread.sleep(2000);
                driver.findElement(By.xpath("//*[@id=\"basketTab\"]")).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("//*[contains(@id,'RemoveProduct')]")).click();
                Thread.sleep(2000);
            }
            while (driver.findElement(By.xpath("//*[@id=\"basketTab\"]")).isDisplayed());

        }
        return new MainPage(driver);}
}





