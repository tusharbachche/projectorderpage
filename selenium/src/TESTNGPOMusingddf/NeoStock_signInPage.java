package TESTNGPOMusingddf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStock_signInPage {
@FindBy (xpath=("(//input[@type='number'])[1]")) private WebElement mobileNumberField;
@FindBy(xpath=("//a[@id='lnk_signup1']")) private WebElement signinclick;
public NeoStock_signInPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void entermobileNumber(String mobNumber)
{
	mobileNumberField.sendKeys(mobNumber);
}
public void signinclick()
{
	signinclick.click();
}
}
