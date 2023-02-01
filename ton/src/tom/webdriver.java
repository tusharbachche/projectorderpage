package tom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\webdriver\\chromedriver\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("https://paytm.com/");
	}

}
