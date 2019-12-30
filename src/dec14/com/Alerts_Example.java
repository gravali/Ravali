package dec14.com;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts_Example {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://www.primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		/*driver.findElement(By.name("login")).click();
		driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.close();*/
		

	}

}
