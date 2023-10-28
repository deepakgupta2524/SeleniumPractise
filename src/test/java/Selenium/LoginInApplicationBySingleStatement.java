package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class LoginInApplicationBySingleStatement {

	@Test
	public void loginSingleStatement() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("https://www.nopcommerce.com/en/login?returnUrl=%2Fen%2Fdemo");
		Actions action=new Actions(driver);
		Action seriesOfAction = action.moveToElement(driver.findElement(By.id("Username")))
				.click().sendKeys("Deepak",Keys.TAB).sendKeys("password123",Keys.ENTER).build();
		seriesOfAction.perform();
	}
}
