package pageObject;

import base.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class login_page extends Config {
    public login_page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        Config.driver = driver;
    }


    // locators
    @FindBy(how = How.NAME, using = "login[username]")
    public WebElement emailLocator;
    @FindBy(how = How.NAME, using = "login[password]")
    public WebElement passwordLocator;



    @FindBy(how = How.XPATH, using = "//*[@id='send2']/span")
    public WebElement loginButtonLocator;



    @FindBy(how = How.XPATH, using = "//*[@id='maincontent']/div[3]/div[2]/div/div/div")
    public WebElement invalidEmailOrPassErrorMsgLocator;



    // functions
    public void enterEmailAddress(String email) {
        emailLocator.sendKeys(email);
    }

    public void enterPassword(String pass) {
        passwordLocator.sendKeys(pass);
    }


        public void clickOnLoginButton () {
            loginButtonLocator.click();
        }


        public void userInLUMASignLnPage () {
        }


    }

