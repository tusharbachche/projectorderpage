package webelement_DropDown;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Single_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\webdriver\\WEbdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		 driver.findElement(By.xpath("//a[contains(@id, 'u_0_0')]")).click();
		 Thread.sleep(1000);
		WebElement Day = driver.findElement(By.id("day"));
		Select s= new Select (Day);
		Thread.sleep(1000);
		s.selectByValue("1");
		Thread.sleep(500);
		
		s.selectByIndex(1);
		Thread.sleep(500);
		s.selectByVisibleText("2");
		Thread.sleep(500);
		
		//Thread.sleep(1000);
	
		System.out.println(s.getFirstSelectedOption().getText());
	
		
		Thread.sleep(1000);
		WebElement Month = driver.findElement(By.id("month"));
	Select s1=new Select(Month);
	
		s1.selectByIndex(0);
		 Thread.sleep(500);
		 s1.selectByIndex(3);
		 Thread.sleep(500);
		List<WebElement> monthoption = s1.getOptions();
				System.out.println(monthoption.size());
				System.out.println("=====================================================");
				
				
		 
			
		
	}

}
