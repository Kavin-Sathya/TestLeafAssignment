package week1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectaction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\Chromedriver\\chromedriver1.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/selectable.html");
		driver.manage().window().maximize();
		
		WebElement ele1 = driver.findElementByXPath("//ol[@id='selectable']/li[4]");
		WebElement ele2 = driver.findElementByXPath("//ol[@id='selectable']/li[7]");
		
		Actions builder=new Actions(driver);
		builder.clickAndHold(ele1).click(ele2).perform();

	}

}
