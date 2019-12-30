package dec11.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listbox3 {

	public static void main(String[] args) throws Throwable {
		String expcity="hyderabad";
		Boolean itemexist=false;
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("FromTag")).sendKeys("hyd");
		Thread.sleep(5000);
		//get collection of items with given keyword
		List<WebElement>cities=driver.findElements(By.xpath("html/body/ul[1]/li/a"));
		System.out.println(cities.size());
		for(int i=0;i<cities.size();i++)
		{
			String itemname=cities.get(i).getText();
			Thread.sleep(1000);
			System.out.println(itemname);
			if(expcity.toUpperCase().contains(itemname.toUpperCase()))
			{
				itemexist=true;
				break;
			}
			if(itemexist)
			{
				System.out.println("item found"+expcity);
			}
			else
			{
				System.out.println("item not found:"+expcity);
			}
		}
		Thread.sleep(5000);
		
		

	}

}
