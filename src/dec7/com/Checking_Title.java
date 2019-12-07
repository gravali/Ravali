package dec7.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checking_Title {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		String exptitle="google";
		String acttitle=driver.getTitle();
		if(exptitle.equalsIgnoreCase(acttitle))
		{
			System.out.println("Title is matching:"+exptitle+" "+acttitle);
		}
		else
		{
			System.out.println("title is not matching:"+exptitle+" "+acttitle);
		}
Thread.sleep(5000);
driver.close();
	}

}
