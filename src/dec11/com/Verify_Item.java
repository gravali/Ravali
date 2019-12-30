package dec11.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Item {

	public static void main(String[] args) {
		String Expitem="Baby";
		Boolean itemlist=false;
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Select element=new Select
	List<WebElement>items=element.getOptions();
		System.out.println("no.of itrems are:"+items.size());
	}

}
