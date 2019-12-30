package dec22;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//launch url
		js.executeScript("window.location='https://accounts.google.com/'");
		Thread.sleep(4000);
		//print title and length of title
		String pagetitle=js.executeScript("return document.title").toString();
		System.out.println("title:"+pagetitle);
		System.out.println("title length:"+pagetitle.length());
		//print url and url lenth
		String url=js.executeScript("return document.URL").toString();
		System.out.println("url is:"+url);
		System.out.println("url length is:"+url.length());
		//print domain name and length of domain
		String domain=js.executeScript("return document.domain").toString();
		System.out.println("domain name:"+domain);
		System.out.println("domain length is:"+domain.length());
		driver.close();

	}

}
