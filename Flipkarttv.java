package week1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkarttv {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\Chromedriver\\chromedriver1.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//button[text()='✕']").click();
		WebElement ele = driver.findElementByXPath("//span[text()='TVs & Appliances']");
		
		Actions builder=new Actions(driver);
		builder.moveToElement(ele).perform();
		Thread.sleep(3000);
		
		driver.findElementByXPath("//a[text()='LG']").click();
		Thread.sleep(3000);
		String text = driver.findElementByXPath("//div[@class='_3wU53n']").getText();
		
		System.out.println(text);
	}

}
