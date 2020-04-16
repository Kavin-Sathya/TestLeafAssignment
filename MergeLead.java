package week1;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

class MergeLead {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\Chromedriver\\chromedriver1.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		Thread.sleep(2000);
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("//img[@alt='Lookup']").click();
		
		Set<String> allwind = driver.getWindowHandles();
		
		String fwind = driver.getWindowHandle();
		
		for (String ewind : allwind) {
			
			driver.switchTo().window(ewind);
			
		}
		
		driver.findElementByName("firstName").sendKeys("Babu");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		Thread.sleep(3000);
		String text = driver.findElementByXPath("//a[@class='linktext']").getText();
		driver.findElementByXPath("//a[@class='linktext']").click();
		
		driver.switchTo().window(fwind);
		
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		
			Set<String> allwind1 = driver.getWindowHandles();
		
			for (String ewind1 : allwind1)
					{
			driver.switchTo().window(ewind1);
			
		}
		
		
		driver.findElementByName("firstName").sendKeys("Gopi");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		Thread.sleep(3000);
		
		driver.findElementByXPath("//a[@class='linktext']").click();
		
		driver.switchTo().window(fwind);
		
		driver.findElementByLinkText("Merge").click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		Thread.sleep(2000);
		
		driver.findElementByLinkText("Find Leads").click();
		
		driver.findElementByName("id").sendKeys(text);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		String text2 = driver.findElementByXPath("//div[text()='No records to display']").getText();
		
		//System.out.println(text2);
		if(text2.contains("No records to display"))
		{
		
		System.out.println("Leads are Merged");
	}
		else
		{
			System.out.println("Leads are NOT Merged");
		}
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		
		File desc=new File("./snaps/img1.png");
		
		FileUtils.copyDirectory(src, desc);

}
}
