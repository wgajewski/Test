package Vodafon.HMC.pages;

import Vodafon.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Login extends PageObject {
        public Login(WebDriver driver) {
            super(driver);
        }

        @FindBy(xpath = "//input[@ytestid='j_username']")
        private WebElement username;

        @FindBy(xpath = "\"//input[@ytestid='j_password']\"")
        private WebElement password;

        @FindBy(xpath = "//*[@type='submit']")
        private WebElement submit;

        @FindBy(xpath = "//*[@ytestid='language']")
        private WebElement lang;

        public Login LogInMagyar(String username, String password) throws Exception {
            Select select = new Select(lang);

            this.username.sendKeys(username);
            this.password.sendKeys(password);
            select.selectByVisibleText("magyar");

            submit.click();
            return new Login(driver);

        }
        public Login LogInEnglish(String username, String password) throws Exception {
            Select select = new Select(lang);

            this.username.sendKeys(username);
            this.password.sendKeys(password);
            select.selectByVisibleText("english");

            submit.click();
            return new Login(driver);

        }

    }

