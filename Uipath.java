package week1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Uipath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\Chromedriver\\chromedriver1.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://acme-test.uipath.com/account/login");
		driver.manage().window().maximize();
		
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		
		driver.findElementById("email").sendKeys(Keys.TAB);
		driver.findElementById("password").sendKeys("leaf@12");
		driver.findElementById("buttonLogin").click();
		Thread.sleep(1000);
		WebElement ele = driver.findElementByXPath("(//button[contains(@class,'btn btn-default')])[5]");
		Actions builder= new Actions(driver);
		builder.moveToElement(ele).perform();
		Thread.sleep(1000);
		driver.findElementByLinkText("Search for Vendor").click();
		driver.findElementById("vendorName").sendKeys("Blue Lagoon");
		driver.findElementById("buttonSearch").click();
		String cname=driver.findElementByXPath("//td[text()='France']").getText();
		System.out.println("Country Name is : "+cname);
		driver.findElementByLinkText("Log Out").click();
		driver.close();
		

	}

}
