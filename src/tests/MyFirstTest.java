package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.DriverFactory;
import org.testng.Assert;

public class MyFirstTest {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = DriverFactory.getDriver();
    }

    @Test
    public void firstNavigationTest() {

        driver.get("https://www.automation.co.il");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.automation.co.il/", "URL is incorrect");
        System.out.println("Opened URL: " + driver.getCurrentUrl());
        System.out.println("Title: " + driver.getTitle());

        driver.get("https://www.google.com");


        System.out.println("Back to first site");

        driver.navigate().forward();
        System.out.println("Forward to Google");

        driver.navigate().refresh();
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
