package pageobjects;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class mainTravelInsurancePageObjects extends BasePage {

    public mainTravelInsurancePageObjects(WebDriver driver) {
        super(driver);
    }


    // Web elements
    @FindBy(css = ".MuiButtonBase-root.MuiButton-root.jss34.jss13.MuiButton-contained.jss12.MuiButton-containedPrimary")
    private WebElement firstBuy;

    // Methods
    public void clickFirstBuy() {
        firstBuy.click();
    }
}
