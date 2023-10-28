package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigationCommands {

	@Test
	public void navigateCommand() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("Mobile",Keys.ENTER);
		//driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().refresh();
		//driver.findElement(By.xpath("//div[@class='nav-fill']/child::div//a[contains(text(),'Sell')]")).click();
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().back();
	}
}
