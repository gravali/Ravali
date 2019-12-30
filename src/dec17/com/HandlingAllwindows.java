package dec17.com;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAllwindows {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://naukri.com");
	    driver.manage().window().maximize();
	    String parent=driver.getWindowHandle();
	    //get collection of child windows
	    ArrayList<String>win=new ArrayList<String>(driver.getWindowHandles());
	    System.out.println(win);
	    Iterator<String>x=win.iterator();
	    while(x.hasNext())
	    {
	    	String child=x.next();
	    	if(!parent.equals(child))
	    	{
	    		String pagetitle=driver.switchTo().window(child).getTitle();
	    		System.out.println(pagetitle);
	    		Thread.sleep(4000);
	    		driver.manage().window().maximize();
	    		Thread.sleep(4000);
	    		driver.close();
	    		Thread.sleep(5000);
	    	}
	    }
	    driver.switchTo().window(parent);
	    Thread.sleep(5000);
	    
	}

}
