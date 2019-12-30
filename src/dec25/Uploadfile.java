package dec25;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Uploadfile {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("http://orangehrm.qedgetech.com/");
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.name("btnAdd")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("firstName")).sendKeys("rav");
		driver.findElement(By.id("lastName")).sendKeys("abc");
		WebElement choosefile=driver.findElement(By.id("photofile"));
		ac.moveToElement(choosefile);
		ac.click();
		ac.build().perform();
		Runtime.getRuntime().exec("D:\\autoItscript\\uploaded.exe");
		driver.findElement(By.id("btnSave")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.close();
		
		
		
		

	}

}
