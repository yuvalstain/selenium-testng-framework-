package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
	WebDriver driver;

	public ProductPage(WebDriver driver) {	
		this.driver = driver;
	}
	
	public void chooseProduct(String name) {
		List<WebElement> list = driver.findElements(By.cssSelector(""));
		for (WebElement el:list) {
			if(el.getText().equalsIgnoreCase(name)) {
				el.click();
				break;
			}
		}
	}
	
	public void openCart() {
		driver.findElement(By.cssSelector("")).click();
	
	}
}
