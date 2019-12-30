package dec17.com;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		//get parent window id
		String parent=driver.getWindowHandle();
		System.out.println("parent id::"+parent);
		//clik on terms link
		driver.findElement(By.partialLinkText("Te")).click();
		Thread.sleep(4000);
//get collection of all windows
Set<String>allwindows=driver.getWindowHandles();
System.out.println("all winbdow id::"+allwindows);
Thread.sleep(4000);
//iterate  all windows
for(String each:allwindows)
{
//parent should not be equal to child window
	if(!parent.equals(each))
	{
		//switch to child window
driver.switchTo().window(each);
Thread.sleep(4000);
driver.findElement(By.name("email")).sendKeys("pranga2010");
driver.findElement(By.name("pass")).sendKeys("test123");
driver.findElement(By.name("pass")).sendKeys(Keys.ENTER);
Thread.sleep(4000);
//switch to parent
driver.switchTo().window(parent);
Thread.sleep(4000);
driver.findElement(By.name("firstname")).sendKeys("testing");
driver.findElement(By.name("lastname")).sendKeys("ritameta");
Thread.sleep(4000);
driver.quit();
}
}

	}

}
