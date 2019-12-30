package dec21;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderTest {

	public static void main(String[] args) {
		String doj="16/January/2020";
		String dt,month,year;
		String[] temp=doj.split("/");
		dt=temp[0];
		month=temp[1];
		year=temp[2];
		String calyear,calmonth,caldt;
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		//click on date picker
		driver.findElement(By.id("DepartDate")).click();
		calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		System.out.println(calyear);
		//calyear should match doj year
		while(!calyear.equals(year))
		{
			//click on next button
			driver.findElement(By.className("nextMonth")).click();
			calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		System.out.println(calmonth);
		while(!calmonth.equals(month))
		{
			//click on next
			driver.findElement(By.className("nextMonth ")).click();
			calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		WebElement calendar=driver.findElement(By.className("calendar"));
		boolean flg=false;
		//get collection of rows
		List<WebElement>rows=calendar.findElements(By.tagName("tr"));
		for(int i=1;i<rows.size();i++)
		{
			//get collection of cols in rows
			List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
			for(int j=0;j<cols.size();j++)
			{
				caldt=cols.get(j).getText();
				System.out.println(caldt);
				if(caldt.equals(dt))
				{
					cols.get(j).click();
					flg=true;
					break;
				}
			}
			if(flg)
			{
				break;
			}
		}
		
		
		

	}

}
