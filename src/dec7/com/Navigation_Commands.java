package dec7.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetTitle;

public class Navigation_Commands {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.co.in/");
		//click on gmail link
		driver.findElement(By.partialLinkText("Gm")).click();
		System.out.println("page title1:"+driver.getTitle());
		Thread.sleep(5000);
		//click on back button
		driver.navigate().back();
		System.out.println("page title2:"+driver.getTitle());
		Thread.sleep(5000);
		//click on forward button
		driver.navigate().forward();
		System.out.println("page title3:"+driver.getTitle());
		Thread.sleep(5000);
		//Reload page
		driver.navigate().refresh();
		System.out.println("page title4:"+driver.getTitle());
		Thread.sleep(5000);
		driver.close();

	}

}
