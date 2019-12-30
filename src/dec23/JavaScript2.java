package dec23;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScript2 {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location='http://www.flipkart.com'");
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.ESCAPE).perform();
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(5000);
		/*WebElement Brand=driver.findElement(By.linkText("Skirts"));
		js.executeScript("window.scrollIntoView",Brand);
		Brand.click();
		Thread.sleep(5000);
		String pagetitle=js.executeScript("return document.title").toString();
		System.out.println(pagetitle);*/
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(5000);
		driver.close();
		 

	}

}
