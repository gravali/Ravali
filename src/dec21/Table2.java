package dec21;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		//store table
		WebElement table=driver.findElement(By.id("customers"));
		//get collection of rows in a table
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		System.out.println("no.of rows are:"+rows.size());
		String expcountry="Germany";
		boolean countryexist=false;
		
		for(int i=1;i<rows.size();i++)
		{
			//get collection of cols in arow
			List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
			
			for(int j=0;j<cols.size();j++)
			{
			 String celltext=cols.get(j).getText();
			 System.out.println(celltext);
			 
			 
			 if(celltext.equalsIgnoreCase(expcountry))
			 {
				 System.out.println(expcountry+" "+"found at"+(i)+" "+(j+1)+"columns");
			 }
			}
			
			System.out.println();
			System.out.println("====================");
		}	
		
		driver.close();

	}

}
