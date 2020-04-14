package week1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",".\\drivers\\Chromedriver\\chromedriver1.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//button[text()='Alert Box']").click();
		
		 org.openqa.selenium.Alert alert = driver.switchTo().alert();
		 
		 String text1=alert.getText();
		 
		 System.out.println(text1);
		 
		 alert.accept();
		 
		 driver.findElementByXPath("//button[text()='Confirm Box']").click();
		 String text2=alert.getText();
		 
		 System.out.println(text2);	
		 
		 alert.dismiss();
		 
		 driver.findElementByXPath("//button[text()='Prompt Box']").click();
		 
		 String text3=alert.getText();
		 
		 System.out.println(text3);		
		
		alert.sendKeys("Servion");
		alert.accept();
		
		driver.findElementByXPath("//button[text()='Sweet Alert']").click();
		
		driver.findElementByXPath("//button[text()='OK']").click();

	}

}
