package week1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\Chromedriver\\chromedriver1.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.findElementById("src").sendKeys("Chennai");
		Thread.sleep(3000);
		driver.findElementById("src").sendKeys(Keys.TAB);
		driver.findElementById("dest").sendKeys("Kanyakumari");
		Thread.sleep(3000);
		driver.findElementById("dest").sendKeys(Keys.TAB);
		Thread.sleep(3000);
		driver.findElementByXPath("(//td[text()='30'])[2]").click();
		driver.findElementById("search_btn").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//label[@class='cbox-label'])[4]").click();
		//Thread.sleep(2000);
		driver.findElementByXPath("(//label[@for='bt_SLEEPER'])[2]").click();
		//Thread.sleep(1000);
		driver.findElementByXPath("(//div[contains(@class,'w-15 fl')]//a)[2]").click();
		Thread.sleep(1000);
		driver.close();
		
	}

}
