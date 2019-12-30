package dec12.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Count {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().window().maximize();
		List<WebElement>l=driver.findElements(By.tagName("input"));
		System.out.println(l.size());
		int nor=0;
		for(int i=0;i<l.size();i++)
		{
			String x=l.get(i).getAttribute("type");
			if(x.equals("radio"))
			{
				nor=nor+1;
			}
		}
		System.out.println(nor);
		driver.close();

	}

}
