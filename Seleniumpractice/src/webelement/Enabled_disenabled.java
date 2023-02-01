package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Enabled_disenabled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\webdriver\\WEbdriver\\chromedriver.exe");
		WebDriver driver=(WebDriver) new ChromeDriver();
		driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
		Thread.sleep(1000);
		WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
		boolean result=button.isEnabled();
	System.out.println(result);
	driver.findElement(By.id("mobileNumber")).sendKeys("8208893597");
	Thread.sleep(1000);
	if(button.isEnabled())
	{
		boolean result1=button.isEnabled();
		System.out.println("current status is "+result);
	button.click();
	}
	else
	{
		System.out.println("OTP is not Enabled");
	}
		}

	}


