package com.zerobank.pages;


import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    @FindBy(css = "[id='account_summary_tab']")
    public WebElement accountSummary;

    @FindBy(css = "[id='account_activity_tab']")
    public WebElement accountActivity;

    @FindBy(id="transfer_funds_tab")
    public WebElement transferFunds;

    @FindBy(id="pay_bills_tab")
    public WebElement payBills;

    @FindBy(id="money_map_tab")
    public WebElement myMoneyMap;

    @FindBy(id="online_statements_tab")
    public WebElement onlineStatements;

    @FindBy(id="logout_link")
    public WebElement logout;

    @FindBy(partialLinkText = "Login and/or password are wrong.")
    public WebElement errorMessage;

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }



public String getErrorMessage(){

      return  errorMessage.getText();
}

    public void navigateToTab(String tabName) {

        String tabLocator = "//ul[@class=\"nav nav-tabs\"]//a[text()='"+tabName+"']";
        BrowserUtils.waitForClickablility(By.xpath(tabLocator), 2);
        Driver.get().findElement(By.xpath(tabLocator)).click();

    }


}
