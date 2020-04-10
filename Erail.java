package week1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver",".\\drivers\\Chromedriver\\chromedriver1.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://erail.in/");
		
		driver.manage().window().maximize();
		
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MS",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("CAPE",Keys.TAB);
		
		boolean selected = driver.findElementById("chkSelectDateOnly").isSelected();
		 if(selected==true)
			 driver.findElementById("chkSelectDateOnly").click();
		
		Thread.sleep(3000);
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		
		List<WebElement> tr = table.findElements(By.tagName("tr"));
		int size = tr.size();
		
		for (int i = 0; i < size; i++) {
			
			WebElement row = tr.get(i);
			
			List<WebElement> td = row.findElements(By.tagName("td"));
			
			String text = td.get(1).getText();
				
				System.out.println(text);
				
			}
			
			//String text = td.get(1).getText();
			
			//System.out.println(text);
			
		
	}

}
