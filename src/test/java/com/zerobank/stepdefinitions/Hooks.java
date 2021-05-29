package com.zerobank.stepdefinitions;


import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("\tthis is coming from Before method");
    }

    @After
    public void tearDown(){
        System.out.println("\tthis is coming from After method\n");
        BrowserUtils.waitFor(3);
        Driver.closeDriver();
    }

    @Before("@db")
    public void setUpDatabase(){
        System.out.println("\tConnect to database");
    }

    @After("@db")
    public void tearDownDatabase(){
        System.out.println("\tclosing database");
    }

    @After
    public void tearDown(Scenario scenario){
        //if the scenario fails take the screenshot
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot,"image/png");
        }

        Driver.closeDriver();
    }
}
