package tests;

import Actions.BaseActions;
import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.DateChoosePageObjects;
import pageobjects.DestinationPageObject;
import pageobjects.PassengersPageObjects;
import pageobjects.mainTravelInsurancePageObjects;
import utils.DateUtils;
import utils.DriverFactory;
import utils.WaitUtils;

public class TravelPolicyTest {

    public mainTravelInsurancePageObjects travelPage;
    public BaseActions actions =  new BaseActions(DriverFactory.getDriver());
    public DestinationPageObject destinationPage;
    public DateChoosePageObjects dateChoosePage;
    public PassengersPageObjects passengersPage;
    Actions systemAction;

    @BeforeMethod
    public void setUp() {
        WebDriver driver = DriverFactory.getDriver();
        driver.get("https://digital.harel-group.co.il/travel-policy");

        travelPage = new mainTravelInsurancePageObjects(driver);
        destinationPage = new DestinationPageObject(driver);
        dateChoosePage = new DateChoosePageObjects(driver);
        passengersPage = new PassengersPageObjects(driver);
        systemAction = new Actions(driver);
    }

    @Test
    public void purchaseTravelPolicy() throws InterruptedException {
        Thread.sleep(4000);
        travelPage.clickFirstBuy();
        System.out.println("לחץ לרכישה ראשונה");

        //destination page
        actions.click(destinationPage.canada);
        actions.click(destinationPage.nextPageToDateBtn);
        System.out.println("נבחר יעד");

        //date choose page
        String startDay = DateUtils.getTodayDate();
        String endDay = DateUtils.getDatePlusSevenDays();
        actions.setText(dateChoosePage.travelStartDate, startDay);
        actions.setText(dateChoosePage.travelEndDate, endDay);
        systemAction.sendKeys(Keys.TAB).build().perform();
        Thread.sleep(3000);
        System.out.println("נבחרו תאריכים " +startDay + " עד " + endDay);
        actions.click(dateChoosePage.nextBtnToPassengers);
        Thread.sleep(1000);

        //passengers page
        boolean isInPassengerPage = actions.isDisplayed(passengersPage.passengerTitle);
        System.out.println("arrived to passengers page");
        Assert.assertTrue(isInPassengerPage, "Test passed - arrived to passengers page");
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}