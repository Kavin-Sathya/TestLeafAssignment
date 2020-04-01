package week1;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver",".\\drivers\\Chromedriver\\chromedriver1.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		Thread.sleep(2000);
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Servion");
		
		driver.findElementById("createLeadForm_firstName").sendKeys("Kavin");
		driver.findElementById("createLeadForm_lastName").sendKeys("Sathya");
		driver.findElementByName("submitButton").click();
		Thread.sleep(2000);
		String ptitle=driver.getTitle();
		String pagename="View Lead | opentaps CRM";
		if(pagename.contentEquals(ptitle)) {
			System.out.println("Lead is created Successfully");
		}
			else
			{
				System.out.println("Lead is not created Successfully");
				
		}
		
		driver.close();
	}

}
