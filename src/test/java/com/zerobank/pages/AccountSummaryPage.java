package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.List;

public class AccountSummaryPage extends BasePage {


    @FindBy(xpath = "//*[@class='board-header'][1]")
    public WebElement cashAccounts;

    @FindBy(xpath = "//*[@class='board-header'][2]")
    public WebElement investmentAccounts;

    @FindBy(xpath = "//*[@class='board-header'][3]")
    public WebElement creditAccounts;

    @FindBy(xpath = "//*[@class='board-header'][4]")
    public WebElement loanAccounts;

    @FindBy(xpath = "(//table)[3]/thead//th")
    public List<WebElement> creditAccountColumn;


    public String getAccountType(String accountType) {

        String xpathDynamic = "//*[text()='" + accountType + "']";

        String elementText = Driver.get().findElement(By.xpath(xpathDynamic)).getText();

        return elementText;


    }


}
