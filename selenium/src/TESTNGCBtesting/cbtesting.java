package TESTNGCBtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class cbtesting {
	@Parameters("browserName")
	
  @Test
  
  public void cbtest (String bname) throws InterruptedException {
	  WebDriver driver = null;
	  if(bname.equals("Chrome"))
	  {	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\webdriver\\WEbdriver\\chromedriver.exe");
	 driver=new ChromeDriver();
  }
	  else if (bname.equals("Firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver","C:\\Program Files\\chromedriver\\webdriver\\WEbdriver.geckodriver.exe");
		  driver=new FirefoxDriver();
			driver.get("https://paytm.com/");
			
	  }
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
}
}