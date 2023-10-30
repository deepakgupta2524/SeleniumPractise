package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GetTitleOfThePage {

	@Parameters("Browser")
	@Test
	public void startBrowser(String localbrowser) {
		System.out.println("Parameter browser is :"+localbrowser);
		WebDriver driver = null;
		
		if(localbrowser.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
		}else if(localbrowser.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();
		}else if(localbrowser.equalsIgnoreCase("Firefox")) {
			driver=new FirefoxDriver();
		}else {
			System.out.println("Enter driver is not correct driver :"+localbrowser);
		}
		driver.manage().window().maximize();
		driver.get("https://practice.automationtesting.in/my-account/");
		Assert.assertTrue(driver.getTitle().contains("My Account – Automation Practice Site"), "Title does'nt match");
		driver.quit();
	}
}
