package dec7.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Xpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://orangehrm.qedgetech.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Qedge123!@#");
		driver.findElement(By.cssSelector("#btnLogin")).submit();
		Thread.sleep(5000);
		if(driver.getCurrentUrl().contains("dash"))
		{
			System.out.println("Login success");
		}
		else
		{
			//Display error message
			String message=driver.findElement(By.id("spanMessage")).getText();
			System.out.println("Login fail"+" "+message);
		}
		Thread.sleep(5000);
		driver.close();
		
	}

}
