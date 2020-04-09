package week1;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiofindelems {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",".\\drivers\\Chromedriver\\chromedriver1.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		
		List<WebElement> eles = driver.findElementsByXPath("//input[@type='radio']");
		
		 int lsize=eles.size();
		 
		 System.out.println("No of radio buttons in the page :" + lsize);
		
		 driver.close();
}
}
