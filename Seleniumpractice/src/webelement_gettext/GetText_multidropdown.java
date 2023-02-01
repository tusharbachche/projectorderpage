package webelement_gettext;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetText_multidropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\webdriver\\WEbdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.get("http://output.jsbin.com/osebed/2");
		Thread.sleep(1000);
		WebElement Fruits = driver.findElement(By.id("fruits"));
		Select s=new Select(Fruits);
		Thread.sleep(100);
		s.deselectAll();
		s.selectByIndex(0);
		Thread.sleep(100);
		s.selectByIndex(2);
		Thread.sleep(100);
		s.selectByIndex(3);
		Thread.sleep(100);
	List<WebElement> alloptions = s.getAllSelectedOptions();
	Iterator<WebElement> it = alloptions.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next().getText());
	}
	System.out.println("=============================================");
	
	for (int i=0;i<=alloptions.size()-1;i++)
	{
		System.out.println(alloptions.get(i).getText());
	}
		
		
	}

}
