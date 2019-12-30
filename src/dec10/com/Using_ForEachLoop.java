package dec10.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_ForEachLoop {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		//get collection of links
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("no.of links are:"+links.size());
		for(WebElement each:links)
		{
			String linktext=each.getText();
			String linkurl=each.getAttribute("href");
			System.out.println(linktext+"\n"+linkurl);
		}
		Thread.sleep(5000);
		driver.close();

	}

}
