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
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div[1]/div/div/div[1]/div/button")
    private WebElement firstBuy;

    // Methods
    public void clickFirstBuy() {
        firstBuy.click();
    }
}
