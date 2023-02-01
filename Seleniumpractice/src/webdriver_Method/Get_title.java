package webdriver_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_title {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\webdriver\\WEbdriver\\chromedriver.exe");
		WebDriver driver=(WebDriver) new ChromeDriver();
		
		driver.get("https://paytm.com/");
			
			Thread.sleep(1000);
	String Title=driver.getTitle();
	System.out.println("Title is"+Title);
	driver.get("https:www.google.com/");
	String url=driver.getCurrentUrl();
	System.out.println("Url is "+url);
	}

}
