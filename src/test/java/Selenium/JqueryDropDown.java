package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class JqueryDropDown {

	@Test
	public void navigation() {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		option.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.xpath("(//input[@class='comboTreeInputBox'])[1]")).click();
	    selectChoiceValue(driver,"choice 2","choice 3");
	}
	public static void selectChoiceValue(WebDriver driver,String ...value) {
	   List<WebElement> choiceList = driver.findElements(By.xpath("//ul//li//span[@class='comboTreeItemTitle']"));
	   if(!value[0].equalsIgnoreCase("all")) {
		   for(WebElement list:choiceList) {
			   String text = list.getText();
			   for(String val:value) {
				   if(text.equals(val)) {
					   list.click();
					   break;
				   }
			   }
		   }
	   }
	   else {
		   for(WebElement item:choiceList) {
			   item.click();
		   }
	   }
	}
}
