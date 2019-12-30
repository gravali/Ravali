package dec9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountingLinks {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//driver.navigate().to("http://www.newtours.demoaut.com/");
		driver.navigate().to("https://www.google.co.in/");
		driver.manage().window().maximize();
		//get collection of links in apage which are stored in html tag 'a'
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("no of links in a page:"+links.size());
		for(int i=0;i<links.size();i++)
		{
			//print each link text
			String linktext=links.get(i).getText();
			//print url of link
			String linkurl=links.get(i).getAttribute("href");
			System.out.println(linktext+"\n"+linkurl);
		}
		driver.close();

	}

}
