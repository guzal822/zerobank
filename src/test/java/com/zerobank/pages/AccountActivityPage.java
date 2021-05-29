package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivityPage extends BasePage {


    @FindBy(xpath = "//*[@id='aa_accountId']")
    public WebElement accountDropDown;

    @FindBy(xpath = "//table[@class='table table-condensed table-hover']/thead//th")
    public List<WebElement> transactionsColumn;

    public List<String> getDropOption(WebElement webElement) {
        Select accountList = new Select(webElement);

        List<WebElement> accountOptions = accountList.getOptions();

        return BrowserUtils.getElementsText(accountOptions);
    }

}
