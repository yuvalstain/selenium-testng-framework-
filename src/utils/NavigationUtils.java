package utils;

import org.openqa.selenium.WebDriver;

public class NavigationUtils {

    private WebDriver driver;

    public NavigationUtils(WebDriver driver) {
        this.driver = driver;
    }

    public void goTo(String url) {
        driver.get(url);
    }

    public void back() {
        driver.navigate().back();
    }

    public void forward() {
        driver.navigate().forward();
    }

    public void refresh() {
        driver.navigate().refresh();
    }
}