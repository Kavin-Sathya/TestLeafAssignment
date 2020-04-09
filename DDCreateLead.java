package week1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DDCreateLead {

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
		Thread.sleep(2000);
		WebElement dd = driver.findElementById("createLeadForm_dataSourceId");
		Select dd1=new Select(dd);
		dd1.selectByVisibleText("Employee");
		
		WebElement dd2 = driver.findElementById("createLeadForm_industryEnumId");
		Select dd3=new Select(dd2);
		
		List<WebElement> options = dd3.getOptions();
		int size=options.size();
		dd3.selectByIndex(size-1);
		
		//driver.findElementByXPath("(//input[@name='primaryEmail'])[4]").sendKeys("kavin@acqueon.com");
		//driver.findElementByXPath("(//input[@name='primaryPhoneNumber'])[4]").sendKeys("9840653566");
		//driver.findElementByName("submitButton").click();
		//Thread.sleep(2000);
		//String ptitle=driver.getTitle();
		//String pagename="View Lead | opentaps CRM";
		//if(pagename.contentEquals(ptitle)) {
			//System.out.println("Lead is created Successfully");
		//}
			//else
			//{
				//System.out.println("Lead is not created Successfully");
				
		//}
		
		//driver.close();
	}

}
