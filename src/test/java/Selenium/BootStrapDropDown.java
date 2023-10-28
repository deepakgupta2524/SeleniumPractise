package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDropDown {

	@Test
	public void navigation() {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		option.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(option);
		boolean flag=true;
		driver.get("https://www.hdfcbank.com/");
		driver.findElement(By.linkText("Select Product Type")).click();
		List<WebElement> product_types = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']//li"));
		for(WebElement type:product_types) {
			if(type.getText().equals("Vehicle Insurance")) {
				type.click();
				flag=true;
			}
		 }
		}
}
