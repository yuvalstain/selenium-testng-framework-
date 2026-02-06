package pageobjects;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PassengersPageObjects extends BasePage {
    public PassengersPageObjects(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "#genderTitle")
    public WebElement genderTitle;

    @FindBy(css = ".jss259")
    public WebElement passengerTitle;

}
