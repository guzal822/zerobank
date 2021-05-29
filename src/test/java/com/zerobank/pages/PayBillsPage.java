package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class PayBillsPage extends BasePage {


    @FindBy(css = "[name='payee']")
    public WebElement payeeDrop;

    @FindBy(css = "[name='account']")
    public WebElement accountDrop;

    @FindBy(css = "[name='amount']")
    public WebElement amountInput;

    @FindBy(css = "[id='sp_date']")
    public WebElement dateInput;

    @FindBy(xpath = "//table[@class='ui-datepicker-calendar']/tbody//td")
    public List<WebElement> dateTableTd;

    @FindBy(css = "[id='sp_description']")
    public WebElement description;

    @FindBy(css = "[value='Pay']")
    public WebElement payButton;

    @FindBy(css = "[id='alert_content']")
    public WebElement successfulMessage;


}
