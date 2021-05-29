package com.zerobank.stepdefinitions;

import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PayBillsStepDefs {

    @Then("the user completes the successful pay operation")
    public void the_user_completes_the_successful_pay_operation() {


        BrowserUtils.waitFor(3);
        PayBillsPage payBillsPage=new PayBillsPage();

        BrowserUtils.waitFor(3);
        // choose payee
        Select payeeDropList= new Select(payBillsPage.payeeDrop);
        payeeDropList.selectByValue("apple");

        BrowserUtils.waitFor(3);
        // choose account
        Select accountDropList = new Select(payBillsPage.accountDrop);
        accountDropList.selectByVisibleText("Loan");

        BrowserUtils.waitFor(3);
        // fill amount
        payBillsPage.amountInput.sendKeys("100");

        BrowserUtils.waitFor(3);
        /*
        WebDriver driver=new ChromeDriver();

        payBillsPage.fillDate(driver,payBillsPage.dateInput,"2020-02-11");
*/
        payBillsPage.dateInput.sendKeys("2020-02-11");
        BrowserUtils.waitFor(3);
        payBillsPage.description.sendKeys("loan");

        payBillsPage.payButton.click();

        BrowserUtils.waitFor(3);

    }



    @Then("the successful submission message should be displayed")
    public void the_successful_submission_message_should_be_displayed() {

        BrowserUtils.waitFor(3);
        PayBillsPage payBillsPage=new PayBillsPage();

       String actualMessage=payBillsPage.successfulMessage.getText();

        System.out.println("actualMessage = " + actualMessage);

    }

    @Then("the user completes pay operation without enter the amount")
    public void the_user_completes_pay_operation_without_enter_the_amount() {

        BrowserUtils.waitFor(3);
        PayBillsPage payBillsPage=new PayBillsPage();

        BrowserUtils.waitFor(3);
        // choose payee
        Select payeeDropList= new Select(payBillsPage.payeeDrop);
        payeeDropList.selectByValue("apple");

        BrowserUtils.waitFor(3);
        // choose account
        Select accountDropList = new Select(payBillsPage.accountDrop);
        accountDropList.selectByVisibleText("Loan");

        BrowserUtils.waitFor(3);
        // fill amount

        // put blank for test
        /*
        WebDriver driver=new ChromeDriver();

        payBillsPage.fillDate(driver,payBillsPage.dateInput,"2020-02-11");
*/
        payBillsPage.dateInput.sendKeys("2020-02-11");
        BrowserUtils.waitFor(3);
        payBillsPage.description.sendKeys("loan");

        payBillsPage.payButton.click();

        BrowserUtils.waitFor(3);

    }

    @Then("the failed message should be displayed")
    public void the_failed_message_should_be_displayed() {

        BrowserUtils.waitFor(3);
        PayBillsPage payBillsPage=new PayBillsPage();

        String actualMessage=payBillsPage.amountInput.getAttribute("validationMessage");
        BrowserUtils.waitFor(3);
        System.out.println("actualMessage = " + actualMessage);



    }


}
