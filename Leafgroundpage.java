package week1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leafgroundpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver",".\\drivers\\Chromedriver\\chromedriver1.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.findElementById("email").sendKeys("kavin@acqueon.com");
		driver.findElementByXPath("//input[@value='Append ']").sendKeys("Kavin",Keys.TAB);
		String text=driver.findElementByName("username").getAttribute("value");
		System.out.println(text);
		driver.findElementByXPath("(//input[@name='username'])[2]").clear();
		boolean Status=driver.findElementByXPath("//input[@disabled='true']").isEnabled();
		System.out.println(Status);

	}

}
