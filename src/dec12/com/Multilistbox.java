package dec12.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multilistbox {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Multi.html");
		driver.manage().window().maximize();
		Select dropdown=new Select(driver.findElement(By.name("multiSelection")));
		Boolean value=dropdown.isMultiple();
		System.out.println(value);
		//select 6 items 
		dropdown.selectByIndex(3);
		Thread.sleep(3000);
		dropdown.selectByIndex(4);
		Thread.sleep(3000);
		dropdown.selectByIndex(0);
		Thread.sleep(3000);
		dropdown.selectByIndex(1);
		Thread.sleep(3000);
		dropdown.selectByIndex(8);
		Thread.sleep(3000);
		dropdown.selectByIndex(6);
		Thread.sleep(3000);
		//count no.of items which are selected above
		List<WebElement>itemslist=dropdown.getAllSelectedOptions();
		System.out.println("no.of items selected are:"+itemslist.size());
		for(int i=0;i<itemslist.size();i++)
		{
			String itemname=itemslist.get(i).getText();
			System.out.println(itemname);
		}
		//deselct items from list
		dropdown.deselectByIndex(3);
		Thread.sleep(1000);
		dropdown.selectByIndex(4);
		Thread.sleep(1000);
		dropdown.deselectAll();
		Thread.sleep(5000);
		
	}   
	

}
