package dec28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng_Demo2 {
	static WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
	driver=new ChromeDriver();
	driver.get("http://www.newtours.demoaut.com/");
	driver.manage().window().maximize();
	Reporter.log("Running setup",true);
	}
	@Test(priority=0,invocationCount=2)
	public void Register() throws Throwable
	{
	driver.findElement(By.partialLinkText("REG")).click();
	Thread.sleep(5000);
	Reporter.log("Executing Registerlink test",true);
	}
	@Test(priority=2)
	public void hotels() throws Throwable
	{
	driver.findElement(By.partialLinkText("Hot")).click();
	Thread.sleep(5000);
	Reporter.log("Executing Hotels link test",true);
	}
	@Test(priority=1)
	public void signon() throws Throwable
	{
	driver.findElement(By.partialLinkText("SIG")).click();
	Thread.sleep(5000);
	Reporter.log("Executing signon link test",true);
	}
	@AfterMethod
	public void teardown() throws Throwable
	{
	Thread.sleep(5000);	
	driver.close();
	Reporter.log("Running teardown",true);
	Thread.sleep(5000);
	}
}
