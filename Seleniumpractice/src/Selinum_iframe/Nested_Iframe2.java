package Selinum_iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Nested_Iframe2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\webdriver\\WEbdriver\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
				Thread.sleep(1000);
				driver.switchTo().frame("frame1");
				Thread.sleep(1000);
				driver.findElement(By.tagName("input")).sendKeys("Tushar");
				driver.switchTo().frame("frame3");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id='a']")).click();
				Thread.sleep(1000);
				driver.switchTo().defaultContent();
				Thread.sleep(500);
				driver.switchTo().frame("frame2");
			WebElement Animals = driver.findElement(By.id("animals"));
			Select s=new Select(Animals);
			s.selectByIndex(1);
	}

}
