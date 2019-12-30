package dec28;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
public class Using_Dependencies {
	static WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();	
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		Reporter.log("Running setup",true);
	}
	@Test(groups="webapp")
	public void registerlink()throws Throwable
	{
		driver.findElement(By.partialLinkText("REG")).click();
		Thread.sleep(4000);
		Reporter.log("Executing register Test",true);
	}
	@Test(dependsOnMethods="registerlink")
	public void hotellink()throws Throwable
	{
		driver.findElement(By.partialLinkText("Hot")).click();
		Thread.sleep(4000);
		Reporter.log("Executing hotels Test",true);
	}
	@Test(dependsOnMethods="hotellink")
	public void signonlink()throws Throwable
	{
		driver.findElement(By.partialLinkText("SIG")).click();
		Thread.sleep(4000);
		Reporter.log("Executing signon Test",true);
	}
	@AfterTest
	public void teearDown()throws Throwable
	{
		Thread.sleep(4000);
		driver.close();	
		Reporter.log("Running teardown",true);
	}
}


