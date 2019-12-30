package dec12.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyItem {
	public static void main(String[] args)throws Throwable {
		String expitem="Computers";
		Boolean itemexist=false;
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();

		Select dropdown=new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement>itemlist=dropdown.getOptions();
		System.out.println(itemlist.size());
		for(int i=0;i<itemlist.size();i++)
		{
			String itemname=itemlist.get(i).getText();
			System.out.println(itemname);
	        //verify expitem is exist or not
				if(expitem.equalsIgnoreCase(itemname))
				{
					itemexist=true;
					break;
				}
					
		}
		Thread.sleep(5000);
		if(itemexist)
		{
			System.out.println("itemfound:"+expitem);
		}
		else
		{
			System.out.println("item not found:"+expitem);
		}
		

	}

}
