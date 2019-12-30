package dec26ng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void login() {
	  Reporter.log("Executing login test",true);
  }
  @Test
  public void compose() {
	  Reporter.log("Executing compose test",true);
  }
  @Test
  public void reply() {
	  Reporter.log("Executing reply test",true);
  }
  @BeforeTest
  public void beforeTest() {
	  Reporter.log("Running before test",true);
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("Running after test",true);
  }

}
