package 

dec7.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myscript_Newtour {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
		//click on register link
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(5000);
		System.out.println("page title:"+driver.getTitle());
		Thread.sleep(5000);
	//contact information
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("ravali");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("g");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("955035682");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("ravaligundagani@gmail.com");
		Thread.sleep(5000);
		//mailing information
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("5-5/2/0/c,Telephone colony");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Telangana");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("500092");
		driver.findElement(By.cssSelector("table:nth-child(2) tbody:nth-child(1) tr:nth-child(12) td:nth-child(2) > select:nth-child(1)")).sendKeys("INDIA");
		Thread.sleep(5000);
		//User Information
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ravali");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("123456");
		driver.findElement(By.cssSelector("table:nth-child(2) tbody:nth-child(1) tr:nth-child(18) td:nth-child(1) > input:nth-child(1)")).submit();
		Thread.sleep(5000);
		//after submission
		if(driver.getCurrentUrl().contains("create_account_success"))
		{
			System.out.println("Registration success");
			
		}
		else
		{
			System.out.println("Registration failed");
			
		}
		Thread.sleep(5000);
	     driver.close();
		
		

	}

}
