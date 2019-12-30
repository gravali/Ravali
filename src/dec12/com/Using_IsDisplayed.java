package dec12.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_IsDisplayed {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		WebElement reentermail=driver.findElement(By.name("reg_email_confirmation__"));
		boolean value=reentermail.isDisplayed();
		System.out.println(value);
		

	}

}
