package week1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".\\drivers\\Chromedriver\\chromedriver1.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
		
		String title=driver.getTitle();
		
		System.out.println(title);
		
		driver.navigate().refresh();
		
		driver.getCurrentUrl();
		
		driver.close();
		
		

	}

}
