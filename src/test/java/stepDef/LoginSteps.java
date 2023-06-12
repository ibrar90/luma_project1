package stepDef;

import base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pageObject.login_page;

public class LoginSteps extends Config {

    login_page lp = new login_page(driver);


    @Given("User in LUMA customer login page")
    public void userInLUMACustomerLoginPage() {


        String act = driver.getTitle();
        String exp = "Customer Login";
        Assert.assertEquals(act, exp);


    }

    @When("user enter valid  email address")
    public void userEnterValidEmailAddress() {
        lp.enterEmailAddress(Email_Address);
    }

    @And("user enter valid password")
    public void userEnterValidPassword() {
        lp.enterPassword(Password);
    }

    @And("user clicks on sign in button")
    public void userClicksOnSignInButton() {
        lp.clickOnLoginButton();
    }


    @Then("user should be successfully sign in")
    public void userShouldBeSuccessfullySignIn() {
        lp.userInLUMASignLnPage();
    }

    @When("user enter invalid  email address")
    public void userEnterInvalidEmailAddress() {
        lp.enterEmailAddress("fakeemail22@gmail.com");
    }

    @And("user enter invalid password")
    public void userEnterInvalidPassword() {
        lp.enterPassword("fakepassword1");
    }


    @Then("user should able to see error message")
    public void userShouldAbleToSeeErrorMessage() {


    }
    @And("user click on {string} button")
    public void userClickOnCreateAnAccountButton(String buttonText) {driver.findElement(By.linkText("Create an Account")).click();
}

    @And("login")
    public void login() {lp.enterEmailAddress(Email_Address);
        lp.enterPassword(Password);
        lp.clickOnLoginButton();
    }


   // @And("pass the captcha image")
   // public void passTheCaptchaImage() {lp.entercaptcha();}

    }





