package pomUsingDDf;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStoxDashbordPage {

	@FindBy(xpath=("(//a[text()='OK'])[2]")) private WebElement popupOkButton;
	//@FindBy(xpath="(//a[text()='Close'])[5]")private WebElement popupCloseButton;
	@FindBy(xpath = "//span[@id='lbl_username']") private WebElement username;
	@FindBy( xpath="//span[text()='Logout']") private WebElement logOutButton;
	public NeoStoxDashbordPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		String MainpageId = driver.getWindowHandle();
		System.out.println(MainpageId);
		

	}
	public void handlePopUp() throws InterruptedException
	{
		Thread.sleep(500);
		popupOkButton.click();
		Thread.sleep(500);
		//popupCloseButton.click();
	
	}
	
	
	
	public void validateUserName(String expectedUserName) 
	{
		
		
		String actualUserName= username.getText();
		
		if(expectedUserName.equals(actualUserName))
		{
			System.out.println("result is pased,actual and expected usernames are matching");
		}
		else
		{
			System.out.println(" result  is failed ");
	}
	}
	public void logOutFromNeoStox() throws InterruptedException
	{
		username.click();
		Thread.sleep(1000);
		logOutButton.click();
	}
}
