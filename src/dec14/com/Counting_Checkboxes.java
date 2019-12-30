package dec14.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Counting_Checkboxes {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("file:///D:/Html%20pages/checkbox_1.html");
		driver.manage().window().maximize();
		List<WebElement>chklist=driver.findElements(By.tagName("input"));
		System.out.println(chklist.size());
		for(int i=0;i<chklist.size();i++)
		{
			boolean value=chklist.get(i).isSelected();
			System.out.println(value);
			String chkname=chklist.get(i).getAttribute("value");
			System.out.println(chkname);
			if(!chklist.get(i).isSelected())
			{
				//check it
				chklist.get(i).click();
			}
			else
			{
				//uncheck it
				chklist.get(i).click();
			}
			Thread.sleep(5000);
			
		}
		Thread.sleep(5000);
		driver.close();
		

	}

}
