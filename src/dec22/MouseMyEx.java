package dec22;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMyEx {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		//close banner window
		ac.sendKeys(Keys.ESCAPE).build().perform();
		WebElement electronics=driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/ul/li[1]/span"));
		ac.moveToElement(electronics).build().perform();
		Thread.sleep(5000);
	    WebElement men=driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/ul/li[3]/span"));
	    ac.moveToElement(men).build().perform();
	    Thread.sleep(2000);
	    WebElement women=driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/ul/li[4]/span"));
	    ac.moveToElement(women);
	    ac.build().perform();
        ac.moveToElement(driver.findElement(By.linkText("Dress Material")));
        ac.click();
        ac.pause(4000);
        ac.build().perform();
	    Thread.sleep(5000);
	    driver.close();
	}

}
