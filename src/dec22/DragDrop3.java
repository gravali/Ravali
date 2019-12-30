package dec22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop3 {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		driver.switchTo().frame(0);
		WebElement src=driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]"));
		WebElement dst=driver.findElement(By.xpath("//p[contains(text(),'Drop here')]"));
		ac.dragAndDrop(src, dst).build().perform();
		Thread.sleep(5000);
		driver.close();

	}

}
