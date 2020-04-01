package week1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Fblogin {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver",".\\drivers\\Chromedriver\\chromedriver1.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/login/");
		driver.manage().window().maximize();
		driver.findElementById("email").sendKeys("classy.kid20@yahoo.in");
		driver.findElementById("pass").sendKeys("jesusloves");
		Thread.sleep(2000);
		driver.findElementByName("login").click();
		driver.close();
		
	}

}
