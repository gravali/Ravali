package dec11.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox_Items {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("REG")).click();
		Select listbox=new Select(driver.findElement(By.name("country")));
		//get collection of items in a listbox
		List<WebElement>items=listbox.getOptions();
		System.out.println("no.of items are:"+items.size());
		for(int i=0;i<items.size();i++)
		{
			String itemname=items.get(i).getText();
			System.out.println(itemname);
			Thread.sleep(1000);
			items.get(i).click();
		}
		Thread.sleep(6000);
		driver.close();

	}

}
