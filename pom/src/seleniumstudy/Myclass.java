package seleniumstudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("https://vctcpune.com/");

	}

}
