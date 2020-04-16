package week1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listerail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\Chromedriver\\chromedriver1.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://erail.in/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MS",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("CAPE",Keys.TAB);
		
		boolean selected = driver.findElementById("chkSelectDateOnly").isSelected();
		 if(selected==true)
			 driver.findElementById("chkSelectDateOnly").click();
		
		 Thread.sleep(3000);
		 
		List<String> train=new ArrayList<String>(); 
		 
		List<WebElement> allrow = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr//td[2]");
		 
		 for (WebElement erow : allrow) {
			String name=erow.getText();
			 
			 train.add(name);
			 
		}
		 
		 Collections.sort(train);
		 
		int len= train.size();
		 
		 for(int i=0;i<len;i++) {
		 
		 System.out.println(train.get(i));
		 
		 
		 }
	}

}
