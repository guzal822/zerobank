package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class NavigationStepDefs {

    @Then("the title should contains {string} types")
    public void the_title_should_contains_types(String expectedAccountType) {

        System.out.println("expectedAccountType = " + expectedAccountType);

        String actualAccountType = new AccountSummaryPage().getAccountType(expectedAccountType);

        System.out.println("actualAccountType = " + actualAccountType);

        Assert.assertEquals(expectedAccountType, actualAccountType);
    }

    @Then("the credit accounts have columns as listed below")
    public void the_credit_accounts_have_columns_as_listed_below(List<String> expectedColumns) {
        System.out.println("expectedColumns.size = " + expectedColumns.size());
        System.out.println("expectedColumns = " + expectedColumns);

        AccountSummaryPage accountSummaryPage = new AccountSummaryPage();
        
        List<String> actualColumns = BrowserUtils.getElementsText(accountSummaryPage.creditAccountColumn);
        System.out.println("actualColumns size= " + actualColumns.size());
        System.out.println("actualColumns = " + actualColumns);

        Assert.assertEquals(expectedColumns, actualColumns);

    }

    @Then("the user should navigate to {string}")
    public void the_user_should_navigate_to(String expectedTab) {

        BrowserUtils.waitFor(5);
        System.out.println("expectedTitle = " + expectedTab);
        AccountActivityPage accountActivityPage = new AccountActivityPage();
        accountActivityPage.navigateToTab(expectedTab);
        String actualTitle = Driver.get().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertTrue(actualTitle.contains(expectedTab));

        BrowserUtils.waitFor(5);
    }


    @Then("the page should have the title {string}")
    public void the_page_should_have_the_title(String expectedTitle) {

        String actualTitle = Driver.get().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    @Then("Account drop down default option should be {string}")
    public void account_drop_down_default_option_should_be(String expectedDefault) {
        System.out.println("expectedDefault = " + expectedDefault);

        Select dropList=new Select(new AccountActivityPage().accountDropDown);
       String actualDefault= dropList.getFirstSelectedOption().getText();

        System.out.println("actualDefault = " + actualDefault);

        Assert.assertEquals(expectedDefault,actualDefault);

    }

    @Then("Account drop down should have the following options")
    public void account_drop_down_should_have_the_following_options(List<String> expectedOptions) {
        System.out.println("expectedOptions.size() = " + expectedOptions.size());
        System.out.println("expectedOptions = " + expectedOptions);

        AccountActivityPage accountActivityPage = new AccountActivityPage();
        List<String> actualOptions=accountActivityPage.getDropOption(accountActivityPage.accountDropDown);

        System.out.println("actualOptions.size() = " + actualOptions.size());
        System.out.println("actualOptions = " + actualOptions);

        Assert.assertEquals(expectedOptions,actualOptions);
    }

    @Then("Transactions table should have clolumn listed below")
    public void transactions_table_should_have_clolumn_listed_below(List<String> expectedColumn) {

        System.out.println("expectedColumn.size() = " + expectedColumn.size());
        System.out.println("expectedColumn = " + expectedColumn);

        AccountActivityPage accountActivityPage=new AccountActivityPage();
        BrowserUtils.waitFor(3);
        List<String> actualColumn=BrowserUtils.getElementsText(accountActivityPage.transactionsColumn);

        System.out.println("actualColumn.size() = " + actualColumn.size());
        System.out.println("actualColumn = " + actualColumn);

        Assert.assertEquals(expectedColumn,actualColumn);
    }
}
