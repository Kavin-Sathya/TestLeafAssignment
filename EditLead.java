package week1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElementByLinkText("Find Leads").click();
		
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByName("emailAddress").sendKeys("kavin@acqueon.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		String name=driver.findElementByXPath("(//a[@class='linktext'])[4]").getText();
		System.out.println(name);
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		driver.findElementByLinkText("Duplicate Lead").click();
		String title=driver.getTitle();
		
		System.out.println(title);
		driver.findElementByName("submitButton").click();
		String fname = driver.findElementById("viewLead_firstName_sp").getText();
		String oFName="Kavin";
		
		System.out.println(fname);
		if(fname.contains(oFName))
		{
			System.out.println("Name Captured correct");
		}
		else
		{
			System.out.println("Name is NOT Captured correct");
		}
		driver.close();
	}

}
