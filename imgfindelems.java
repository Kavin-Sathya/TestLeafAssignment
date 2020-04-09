package week1;


import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class imgfindelems {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",".\\drivers\\Chromedriver\\chromedriver1.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		
		List<WebElement> eles = driver.findElementsByTagName("img");
		
		 int lsize=eles.size();
		 
		 System.out.println("No of image in the page :" + lsize);
		 
		 eles.get(lsize-1).click();
		 
		 System.out.println(driver.getTitle());
		 
		 }
}
