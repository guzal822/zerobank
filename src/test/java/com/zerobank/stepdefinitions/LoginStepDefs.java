package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import cucumber.api.java.en.When;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Opening the login page");
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("the user enter the valid credential")
    public void the_user_enter_the_valid_credential() {
        LoginPage loginPage = new LoginPage();
        loginPage.login(ConfigurationReader.get("valid_username"), ConfigurationReader.get("valid_password"));

    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        String actualTitle = Driver.get().getTitle();
        String expectedTitle = "Account Summary";

        System.out.println("actualTitle = " + actualTitle);
        System.out.println("expectedTitle = " + expectedTitle);
        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }

    @When("the user enter the wrong username with right password")
    public void the_user_enter_the_wrong_username_with_right_password() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("wrongUsername", ConfigurationReader.get("valid_password"));

    }

    @Then("the user should not be able to login")
    public void the_user_should_not_be_able_to_login() {
        String actualTitle = Driver.get().getTitle();
        String expectedTitle = "Account Summary";
      Assert.assertNotEquals(expectedTitle,actualTitle);
    }

    @Then("the user should see error message")
    public void the_user_should_see_error_message() {
       String actualErrorMessage= Driver.get().findElement(By.cssSelector("[class='alert alert-error']")).getText();
       String expectedErrorMessage="Login and/or password are wrong.";

       Assert.assertEquals(expectedErrorMessage,actualErrorMessage);


    }


    @When("the user enter the right username with wrong password")
    public void the_user_enter_the_right_username_with_wrong_password() {
        LoginPage loginPage = new LoginPage();
        loginPage.login(ConfigurationReader.get("valid_username"),"wrongPassword");
    }

    @When("the user enter the blank username with right password")
    public void the_user_enter_the_blank_username_with_right_password() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("",ConfigurationReader.get("valid_password"));
    }

    @When("the user enter the right username with blank password")
    public void the_user_enter_the_right_username_with_blank_password() {
        LoginPage loginPage = new LoginPage();
        loginPage.login(ConfigurationReader.get("valid_username"),"");
    }

    @When("the user enter the invalid information")
    public void the_user_enter_the_invalid_information() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("/*#$*&","@#%^&*/");
    }

    @When("the user is logged in")
    public void the_user_is_logged_in() {

        Driver.get().get(ConfigurationReader.get("url"));

        BrowserUtils.waitFor(5);
        LoginPage loginPage = new LoginPage();


        loginPage.login(ConfigurationReader.get("valid_username"), ConfigurationReader.get("valid_password"));

        BrowserUtils.waitFor(5);
    }



}
