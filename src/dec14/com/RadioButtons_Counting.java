package dec14.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons_Counting {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		List<WebElement>radiobutton=driver.findElements(By.xpath("//form/nav/ul/li/label/strong"));
	    System.out.println(radiobutton.size());
	    for(int i=0;i<radiobutton.size();i++)
	    {    
	    	boolean value=radiobutton.get(i).isSelected();
	    	System.out.println(value);
	    	System.out.println(radiobutton.get(i).getText());
	    	
	    	if(!radiobutton.get(i).isSelected())
	    	{
	    		radiobutton.get(i).click();
	    	}
	    		Thread.sleep(5000);
	    		
	 	    }
	    Thread.sleep(5000);
		driver.close();

	}

}
