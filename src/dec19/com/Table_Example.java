package dec19.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Example {

	public static void main(String[] args) {
	 
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Html%20pages/qedgetable.html");
		driver.manage().window().maximize();
		//get data from table
		String tabletext=driver.findElement(By.xpath("//table/tbody/tr[3]//td[2]")).getText();
		System.out.println(tabletext);
		//Store table into webelement
		WebElement table=driver.findElement(By.name("qedgetech"));
		//get collection of rows in a table
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		System.out.println("no.of rows:"+rows.size());
		for(int i=1;i<rows.size();i++)
		{
			//get collection of columns in rows
			List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
			System.out.println("row number:"+i+" "+"no.of cols in a row:"+cols.size());
			
		}
		driver.close();
		
	}

}
