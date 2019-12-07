package dec7.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checking_Text {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		String exptext="gmail";
		String acttext=driver.findElement(By.partialLinkText("Gm")).getText();
		if(acttext.equalsIgnoreCase(exptext))
		{
			System.out.println("Text is matching:"+exptext+" "+acttext);
			
		}
		else
		{
			System.out.println("Text is not matching"+exptext+" "+acttext);
		
		}
		Thread.sleep(5000);
		driver.close();
		
			
		

	}

}
