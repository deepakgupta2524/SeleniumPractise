package Selenium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleBrowserWindow {

	@Test
	public void windowHandle() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		Set<String> list = driver.getWindowHandles();
		Iterator<String> it = list.iterator();
		String psession = it.next();
		System.out.println("psession:"+psession);
		
		String Csession = it.next();
		System.out.println("Csession:"+Csession);
		
		List<String> windowIDList=new ArrayList<String>(list);
		String pplist = windowIDList.get(0);
		String cclist = windowIDList.get(1);
		System.out.println("pplist:"+pplist);
		System.out.println("cclist:"+cclist);
		
		driver.switchTo().window(cclist);
		driver.findElement(By.xpath("(//button[text()='Book a Free Demo'])[2]")).click();
		driver.switchTo().window(pplist);
	}
}
