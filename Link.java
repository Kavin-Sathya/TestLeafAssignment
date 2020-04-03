package week1;


import org.openqa.selenium.chrome.ChromeDriver;

public class Link {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",".\\drivers\\Chromedriver\\chromedriver1.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Link.html");
		
		String attribute = driver.findElementByLinkText("Find where am supposed to go without clicking me?").getAttribute("href");
		
		System.out.println(attribute);
		
		driver.findElementByLinkText("Verify am I broken?").click();
		
		String title=driver.getTitle();
		
		if(title.contains("404"))
		{
			System.out.println("Link is broken");
		}
		else
		{
			System.out.println("Link is NOT broken");
		}
			driver.close();
	}

}
