package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//*[@id='user_login']")
    public WebElement username;

    @FindBy(css="[id='user_password']")
    public WebElement password;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement signIn;


    public void login(String usernameStr,String passwordStr){
        username.sendKeys(usernameStr);
        password.sendKeys(passwordStr);
        signIn.click();
    }
}
