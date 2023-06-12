package stepDef;

import base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import pageObject.home_page;

public class HomepgSteps extends Config {

    home_page hp = new home_page(driver);
    @And("users click on {string} button from menu bar")
    public void usersClickOnButtonFromMenuBar(String buttontext) {driver.findElement(By.xpath("//*[@id='ui-id-3']/span[2]")).click();
    }

    @Then("users click on jackets")
    public void usersClickOnJackets() { driver.findElement(By.xpath("/html/body/div[2]/main/div[5]/div[2]/div[2]/div/ul[1]/li[2]/a")).click();
        
    }

    @And("user click on Juno Jacket")
    public void userClickOnJunoJacket() {driver.findElement(By.xpath("/html/body/div[2]/main/div[4]/div[2]/div/div/div[2]/div[2]/div[1]/div/div[4]/div/div/ol/li[2]/div/div/a/div[1]/div[2]/h3")).click();
        
    }

    @And("click on {string} box from size option")
    public void clickOnBoxFromSizeOption(String arg0) {driver.findElement(By.xpath("//*[@id='option-label-size-144-item-168']")).click();
        
    }

    @And("click on Green from Color box")
    public void clickOnGreenFromColorBox() {driver.findElement(By.xpath("//*[@id='option-label-color-93-item-53']")).click();
        
    }

    @And("put {int} for Qty box")
    public void putForQtyBox(int index) {hp.userpassqty(1);

    }

    @Then("user should successfully add Juno jacket in shopping cart")
    public void userShouldSuccessfullyAddJunoJacketInShoppingCart() {
    }


    @And("click on {string} button")
    public void clickOnButton(String button) {driver.findElement(By.xpath("//*[@id='product-addtocart-button']")).click();
        

    }

    @Then("user click on Shopping cart")
    public void userClickOnShoppingCart() {driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div[2]/div/div/div/a")).click();
    }
}
