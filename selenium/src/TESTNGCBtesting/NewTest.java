package TESTNGCBtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  System.setProperty("webdriver.gecko.driver","C:\\Program Files\\chromedriver\\webdriver\\WEbdriver.geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	driver.get("https://paytm.com/");
		
  }
}
