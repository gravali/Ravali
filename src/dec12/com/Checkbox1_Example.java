package dec12.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox1_Example {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		//verify check box is active or not
	     WebElement checkbox=driver.findElement(By.name("remember"));
	     Boolean value=checkbox.isSelected();
	     System.out.println(value);
	     if(!checkbox.isSelected())
	     {
	    	 //check 
	    	 checkbox.click();
	    	 
	     }
	     else
	     {
	    	 checkbox.click();
	    	 
	     }
	     Thread.sleep(3000);
	     driver.close();
	   

	}

}
