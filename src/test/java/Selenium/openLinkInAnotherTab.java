package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class openLinkInAnotherTab {

	@Test
	public void newTab() {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("https://www.google.com/");
		//driver.get("https://www.nopcommerce.com/");
		//String tab = Keys.chord(Keys.CONTROL,Keys.RETURN);
		//driver.findElement(By.xpath("(//ul//li//a[contains(text(),'Get started')])[1]")).sendKeys(tab);
		driver.findElement(By.name("q")).sendKeys("London times",Keys.ENTER);
		Actions action =new Actions(driver);
		action.keyDown(Keys.CONTROL).moveToElement(driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]")))
		.click().build().perform();
		
		
	}
}
