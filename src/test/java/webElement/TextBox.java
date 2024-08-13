package webElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TextBox 
{
	WebDriver driver;

	@Test
	public void withPlaceHolder()
	{
		 driver = new ChromeDriver();
		 driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
	}
	
	@Test
	public void withoutPlaceHolder()
	{
		
	}
	
	@Test
	public void withToolTip()
	{
		
	}
	
	@Test
	public void multilineTextArea()
	{
		
	}
	
	
	@Test
	public void disabled()
	{
		
	}
	
}
