package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.DriverFactory;
import org.testng.Assert;
import utils.NavigationUtils;

public class MyFirstTest {
    NavigationUtils navigation =  new NavigationUtils(DriverFactory.getDriver());

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = DriverFactory.getDriver();
    }

    @Test
    public void firstNavigationTest() {

        navigation.goTo("https://digital.harel-group.co.il/travel-policy");
        Assert.assertEquals(driver.getCurrentUrl(), "https://digital.harel-group.co.il/travel-policy", "URL is incorrect");
        System.out.println("Opened URL: " + driver.getCurrentUrl());
        System.out.println("Title: " + driver.getTitle());

    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
