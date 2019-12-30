package dec28;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshot {
	WebDriver driver;
  @Test
  public void screenshot() {
	  driver=new ChromeDriver();
	  driver.get("https://www.office.com/");
	  driver.manage().window().maximize();
	  DateFormat df=new SimpleDateFormat("dd_mm_yyyy hh_MM_ss");
	  Date d=new Date();
	  String datef=df.format(d);
	  File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  //copy screen into local drive
	 
	 
}
}
