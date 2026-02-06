package pageobjects;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DestinationPageObject extends BasePage {

    public DestinationPageObject(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".jss171.jss181")
    public WebElement usa;

    @FindBy(css = ".jss171.jss182")
    public WebElement canada;

    @FindBy(css = ".MuiButtonBase-root.MuiButton-root.jss208.MuiButton-contained.jss164.MuiButton-containedPrimary")
    public WebElement nextPageToDateBtn;


}
