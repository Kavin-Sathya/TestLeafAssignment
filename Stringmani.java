package week1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Stringmani {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",".\\drivers\\Chromedriver\\chromedriver1.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		Thread.sleep(2000);
		String text=driver.findElementByTagName("h2").getText();
		
		String output=text.substring(7);
		
		System.out.println(output);
		
		driver.close();
		
		}

}
