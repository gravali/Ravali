package dec22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragSlider {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);	
		driver.switchTo().frame(0);
WebElement slider=driver.findElement(By.xpath("/html/body/div/span"));
ac.dragAndDropBy(slider, 300, 0).perform();
Thread.sleep(5000);
ac.dragAndDropBy(slider, -150, 0).perform();

	}

}
