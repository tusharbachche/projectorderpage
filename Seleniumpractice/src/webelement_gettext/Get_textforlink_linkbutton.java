package webelement_gettext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_textforlink_linkbutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\webdriver\\WEbdriver\\chromedriver.exe");
		WebDriver driver=(WebDriver) new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String text = driver.findElement(By.xpath("//button[@type='submit']")).getText();
		System.out.println(text);
		
		
	}

}
