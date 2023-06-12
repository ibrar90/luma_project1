package stepDef;

import base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pageObject.signup_pagee;

public class SignupSteps extends Config {

    signup_pagee tk = new signup_pagee(driver);

    @And("user enter FirstName and LastName")
    public void userEnterFirstNameAndLastName() {
       tk.enterFirstName();
       tk.enterLastName();
    }
    
    @And("user enter valid email address")
    public void userEnterValidEmailAddress() {
        tk.enterEmail();

    }     @And("user enter password")
        public void userEnterPassword() {tk.password();

    }

    @And("user enter confirm password")
    public void userEnterConfirmPassword() {;


    }


    @When("user click on Create an Account button on bottom")
    public void userClickOnCreateAnAccountButtonOnBottom() {driver.findElement(By.xpath("//*[@id='form-validate']/div/div[1]/button/span")).click();

    }
    @Then("user should be able to get  new sign up account")
    public void userShouldBeAbleToGetNewSignUpAccount() {

        String act = driver.getTitle();
        String exp = "My Account";
        Assert.assertEquals(act, exp);
    }

    @And("user enter {string} and {string} Name")
    public void userEnterAndName(String FirstName, String LastName) {
        tk.enterFirstName_DD(FirstName);
        tk.enterLastName_DD(LastName);
    }
}
