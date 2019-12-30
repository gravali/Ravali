package dec10.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_Listbox {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/r.php");
		driver.manage().window().maximize();
		//store month list box into select class
		Select monthlist=new Select(driver.findElement(By.id("month")));
		//verify month list is single or multi slection
		Boolean value=monthlist.isMultiple();
		System.out.println(value);
		//store year list box into select class
		Select yearlist=new Select(driver.findElement(By.id("year")));
		//store day list box into select class
		Select daylist=new Select(driver.findElement(By.id("day")));
		//verify year list box is single or multi selection
		Boolean value1=yearlist.isMultiple();
		System.out.println(value1);
		//select one item from day list
		daylist.selectByVisibleText("8");
		System.out.println(daylist.getFirstSelectedOption().getText());
		//select one item from month list
		monthlist.selectByVisibleText("Aug");
		System.out.println(monthlist.getFirstSelectedOption().getText());
		//select one item from year list
		yearlist.selectByVisibleText("2001");
		System.out.println(yearlist.getFirstSelectedOption().getText());
		Thread.sleep(5000);
		
		//select one item from year list using value
		yearlist.selectByValue("2000");
		System.out.println(yearlist.getFirstSelectedOption().getText());
		//select one item from monthlist using index   
		monthlist.selectByIndex(12);
		System.out.println(monthlist.getFirstSelectedOption().getText());
		Thread.sleep(5000);
		driver.close();

	}

}
