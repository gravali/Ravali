package dec17.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prompt {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Html%20pages/promp.html");
		driver.findElement(By.xpath("//html/body/fieldset/button")).click();
		Thread.sleep(5000);
		String alerttext=driver.switchTo().alert().getText();
		System.out.println(alerttext);
		driver.switchTo().alert().sendKeys("ravali");
		Thread.sleep(5000);
        driver.switchTo().alert().accept();
        Thread.sleep(5000);
        String msg=driver.findElement(By.id("promptdemo")).getText();
        System.out.println(msg);
        Thread.sleep(5000);
        driver.close();
	}

}
