package week1;


import org.openqa.selenium.chrome.ChromeDriver;

public class Fonts {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",".\\drivers\\Chromedriver\\chromedriver1.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		String bgcolor=driver.findElementByTagName("h2").getCssValue("background-color");
		
		System.out.println(bgcolor);
		
		String fontsize=driver.findElementByXPath("//label[@for='username']").getCssValue("font-size");
		
		System.out.println(fontsize);
		
		int size = driver.findElementByClassName("decorativeSubmit").getSize().getWidth();
		
		System.out.println(size);
		
	int loc = driver.findElementById("username").getLocation().getX();
		
		System.out.println(loc);
		
		
	}

}
