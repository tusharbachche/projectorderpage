package dyanamic_elements;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Un_orderedList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\webdriver\\WEbdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("honda");
		Thread.sleep(1000);
	List<WebElement>searchresult = driver.findElements(By.xpath("(//ul[@class='G43f7e'][1]/li)"));
	for (WebElement s:searchresult) {
		System.out.println(s.getText());
	}
	System.out.println("=======================================================================");
		
	for(WebElement s1:searchresult)
	{
		String  expected="honda activa 6g";
		String actual=s1.getText();
		if(expected.equals(actual))
		{
			System.out.println(s1.getText());
			s1.click();
		}
		System.out.println("=============================================");

	}
	}

}
