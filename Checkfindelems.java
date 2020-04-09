package week1;


import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkfindelems {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",".\\drivers\\Chromedriver\\chromedriver1.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		

		List<WebElement> eles1 = driver.findElementsByXPath("//input[@type='checkbox']");
		 
			for (WebElement cb : eles1) {
				
				
				if(!cb.isSelected()) {
	
				cb.click();
	
}
	
}
			//driver.close();
	}
}



