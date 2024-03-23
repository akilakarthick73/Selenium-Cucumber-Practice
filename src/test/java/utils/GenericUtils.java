package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GenericUtils {

	public WebDriver driver;
	
	public GenericUtils(WebDriver driver)
	
	{
		this.driver = driver;
		
	}
	
	public void SwitchWindow()
	
	{
		driver.findElement(By.xpath("//a[text()='Top Deals']")).click();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		String parent= i1.next();
		String child = i1.next();
		driver.switchTo().window(child);
	}
	
	public void MaximizeWindow()
	
	{
		driver.manage().window().maximize();
	}
	
	public void WaitForElement()
	{
		
	}
	
}
