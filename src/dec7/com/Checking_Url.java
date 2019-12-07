package dec7.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checking_Url {

	public static void main(String[] args)throws Throwable{
		WebDriver driver=new ChromeDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		String strurl="https://";
		String currenturl=driver.getCurrentUrl();
		if(currenturl.startsWith(strurl))
		{
			System.out.println("Url is Secured:"+strurl+" "+currenturl);
			
		}
		else
		{
			System.out.println("Url is not Secured:"+strurl+" "+currenturl);
		}
Thread.sleep(5000);
driver.close();

	}

}
