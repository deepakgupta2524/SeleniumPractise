package Selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SortedDropDown {

	@Test
	public void sortedDD() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.twoplugs.com/");
		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
		WebElement drpElement = driver.findElement(By.name("category_id"));
		Select select=new Select(drpElement);
		List<WebElement> options = select.getOptions();
		ArrayList originalList=new ArrayList();
		ArrayList tempList=new ArrayList();
		
		for(WebElement op:options) {
			originalList.add(op.getText());
			tempList.add(op.getText());
		}
		
		Collections.sort(tempList);
		System.out.println("OriginalList :"+originalList);
		System.out.println("tempList :"+tempList);
	}
}
