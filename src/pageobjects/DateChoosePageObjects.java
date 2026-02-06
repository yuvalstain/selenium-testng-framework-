package pageobjects;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DateChoosePageObjects extends BasePage {
    public DateChoosePageObjects(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "travel_start_date")
    public WebElement travelStartDate;

    @FindBy(id = "travel_end_date")
    public WebElement travelEndDate;

    @FindBy(xpath = "//*[@id='nextButton' and @tabindex='0']")
    public WebElement nextBtnToPassengers;


}
