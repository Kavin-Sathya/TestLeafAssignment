package week1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Servicenow {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Ecllipse\\Ec_test\\Selenium\\drivers\\Chromedriver\\chromedriver1.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://dev92474.service-now.com/nav_to.do?uri=%2Fhome.do%3F");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.switchTo().frame("gsft_main");
		Thread.sleep(2000);
		
		driver.findElementById("user_name").sendKeys("admin");
		driver.findElementById("user_password").sendKeys("India@123");
		driver.findElementById("sysverb_login").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//input[@id='filter']").sendKeys("Incident");
		Thread.sleep(3000);
		driver.findElementByXPath("//div[text()='Create New']").click();
		Thread.sleep(3000);
		driver.switchTo().frame("gsft_main");
		Thread.sleep(2000);
		String incidentID=driver.findElementByXPath("//input[@id='incident.number']").getAttribute("value");
		System.out.println(incidentID);
		driver.findElementByXPath("//span[@class='icon icon-search']").click();
		Thread.sleep(3000);
		String fwind = driver.getWindowHandle();
		Set<String> allwind = driver.getWindowHandles();
		int len=allwind.size();
		List<String> winName=new ArrayList<String>(allwind);
		String handle=winName.get(len-1);
		driver.switchTo().window(handle);
		Thread.sleep(3000);
		driver.findElementByXPath("//a[text()='Abel Tuter']").click();
		driver.switchTo().window(fwind);
		Thread.sleep(2000);
		driver.switchTo().frame("gsft_main");
		WebElement dd = driver.findElementByXPath("//select[@id='incident.category']");
		Select dd1=new Select(dd);
		dd1.selectByVisibleText("Software");
		Thread.sleep(2000);
		WebElement dd2 = driver.findElementByXPath("//select[@id='incident.subcategory']");
		Select dd3=new Select(dd2);
		dd3.selectByVisibleText("Operating System");
		WebElement dd4 = driver.findElementByXPath("//select[@id='incident.contact_type']");
		Select dd5=new Select(dd4);
		dd5.selectByVisibleText("Walk-in");
		WebElement dd6 = driver.findElementByXPath("//select[@id='incident.state']");
		Select dd7=new Select(dd6);
		dd7.selectByVisibleText("In Progress");
		WebElement dd8 = driver.findElementByXPath("//select[@id='incident.urgency']");
		Select dd9=new Select(dd8);
		dd9.selectByVisibleText("1 - High");
		driver.findElementByXPath("(//span[@class='icon icon-search'])[4]").click();
		Thread.sleep(1000);
		String fwind1 = driver.getWindowHandle();
		Set<String> allwind1 = driver.getWindowHandles();
		int len1=allwind.size();
		List<String> winName1=new ArrayList<String>(allwind1);
		String handle1=winName1.get(len1-1);
		driver.switchTo().window(handle1);
		driver.findElementByXPath("//a[text()='Openspace']").click();
		driver.switchTo().window(fwind1);
		driver.switchTo().frame("gsft_main");
		driver.findElementByXPath("//input[@id='incident.short_description']").sendKeys("Creating Incident For the Purpose of Management");
		driver.findElementByXPath("//button[@id='sysverb_insert']").click();
		driver.findElementByXPath("//input[@class='form-control']").sendKeys(incidentID,Keys.ENTER);
		driver.findElementByXPath("//a[@class='linked formlink']").click();
		String eincidentID=driver.findElementByXPath("//input[@id='incident.number']").getAttribute("value");
		System.out.println(eincidentID);
		if(eincidentID.contains(incidentID)) {
			System.out.println("Incident Number matches");
		}
		else
		{
			System.out.println("Incident Number NOT matching");
		}
		
		WebElement dd10 = driver.findElementByXPath("//select[@id='incident.impact']");
		Select dd11=new Select(dd10);
		dd11.selectByVisibleText("1 - High");
		driver.findElementByXPath("//select[@id='incident.impact']").sendKeys("Successfully Created an incident");
		driver.findElementByXPath("//textarea[@id='activity-stream-textarea']").sendKeys("Done Right");
		driver.findElementByXPath("//button[@id='sysverb_update']").click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElementByXPath("//span[text()='System Administrator']").click();
		driver.findElementByXPath("//a[text()='Logout']").click();
		driver.close();
	}

}
