package dec7.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize_Method {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement nametext=driver.findElement(By.id("u_0_m"));
		//get height and width of an element
		Dimension dim=nametext.getSize();
		System.out.println("Height:"+dim.getHeight()+" "+dim.getWidth());
		
		//get attribute of an element
		String linkurl=driver.findElement(By.partialLinkText("Create ")).getAttribute("href");
		System.out.println(linkurl);
		driver.close();
	}

}
