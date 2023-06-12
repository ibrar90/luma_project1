package pageObject;


import base.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class home_page extends Config {

    public home_page(WebDriver driver) {

        PageFactory.initElements(driver, this);
        Config.driver = driver;
    }



    public void userpassqty(int i) {
    }
}
