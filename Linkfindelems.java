package week1;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkfindelems {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",".\\drivers\\Chromedriver\\chromedriver1.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		
		List<WebElement> eles = driver.findElementsByTagName("a");
		
		 int lsize=eles.size();
		 
		 System.out.println("No of links in the page :" + lsize);
		 
		 String name=eles.get(3).getText();
		 System.out.println(name);
		 
		 eles.get(0).click();
		 driver.close();
		 
}
}
