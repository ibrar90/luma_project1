package pageObject;

import base.Config;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;

public class signup_pagee extends Config {

    public signup_pagee(WebDriver driver) {

        PageFactory.initElements(driver, this);
        Config.driver = driver;


    }


    @FindBy(how = How.NAME,using = "firstname")
    public WebElement fnLocator;
    @FindBy(how = How.NAME, using = "lastname")
    public WebElement LnLocator;
    @FindBy(how = How.NAME, using = "email")
    public WebElement emailLocator;
    @FindBy(how = How.NAME, using = "password")
    public WebElement passwordLocator;
    @FindBy(how = How.NAME, using = "password_confirmation")
    public WebElement passwordconfirmLocator;


    Faker faker = new Faker();

    public void enterFirstName() {
        String fnName = faker.name().firstName();
        fnLocator.sendKeys(fnName);
    }

    public void enterLastName() {
        String Lnname = faker.name().lastName();
        LnLocator.sendKeys(Lnname);


    }
    public void enterFirstName_DD(String fnName){
        fnLocator.sendKeys(fnName);
    }
    public void enterLastName_DD(String lnName) {
        LnLocator.sendKeys(lnName);

    }
    public void enterEmail() {
       // emailLocator.sendKeys(faker.internet().emailAddress());
        String lm_domain = "@GMAIL.com";
        String firstName = faker.name().firstName().toLowerCase();
        String lastName = faker.name().lastName().toLowerCase();
        String randomNum = faker.number().digits(2);
        String fullEmail = firstName + lastName + randomNum + lm_domain;
        System.out.println(fullEmail);
        emailLocator.sendKeys(fullEmail);
    }

public void password() {
    String firstName = faker.name().firstName().toUpperCase();
    String lastName = faker.name().lastName().toLowerCase();
    String randomNum = faker.number().digits(5);

    String pass = firstName + lastName + randomNum;
    System.out.println(pass);
    passwordLocator.sendKeys(pass);
    passwordconfirmLocator.sendKeys(pass);






    }


    }

    //public void createanaccount (String button) {
        //if (button.contains("Create new account")) {
        //    CreateanAccount.click();
