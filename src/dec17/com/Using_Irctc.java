package dec17.com;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Irctc {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in");
		driver.manage().window().maximize();
		Thread.sleep(4000);	
		String parent=driver.getWindowHandle();
driver.findElement(By.xpath("//span[@class='allcircle circleone']")).click();
driver.findElement(By.xpath("//span[@class='allcircle circletwo']")).click();
driver.findElement(By.xpath("//label[contains(text(),'RAIL DRISHTI')]")).click();
driver.findElement(By.xpath("//span[contains(@class,'allcircle circlefour')]")).click();
ArrayList<String>brw=new ArrayList<>(driver.getWindowHandles());
System.out.println(brw);
Iterator<String>x=brw.iterator();
while(x.hasNext())
{
	String child=x.next();
if(!parent.equals(child))
{
	String title=driver.switchTo().window(child).getTitle();
	System.out.println(title);
	Thread.sleep(5000);
	driver.close();
	Thread.sleep(5000);
}
}
driver.switchTo().window(parent);
System.out.println(driver.getTitle());
Thread.sleep(5000);
driver.close();

	}

}
