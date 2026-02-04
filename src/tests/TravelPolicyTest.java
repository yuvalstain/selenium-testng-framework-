package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.mainTravelInsurancePageObjects;
import utils.DriverFactory;
import utils.WaitUtils;

public class TravelPolicyTest {

    private mainTravelInsurancePageObjects travelPage;

    @BeforeMethod
    public void setUp() {
        WebDriver driver = DriverFactory.getDriver();
        driver.get("https://digital.harel-group.co.il/travel-policy");

        travelPage = new mainTravelInsurancePageObjects(driver); // auto-initialized
    }

    @Test
    public void verifyPageTitle() throws InterruptedException {
        Thread.sleep(7000);
        travelPage.clickFirstBuy();
        System.out.println("לחץ לרכישה ראשונה");
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}