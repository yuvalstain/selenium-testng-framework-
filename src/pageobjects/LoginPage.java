package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void login(String user, String password) {
		driver.findElement(By.cssSelector("")).sendKeys(user);
		driver.findElement(By.cssSelector("")).sendKeys(password);
		driver.findElement(By.cssSelector("")).click();
	}
}
