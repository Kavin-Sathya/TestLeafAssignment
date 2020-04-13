package week1;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",".\\drivers\\Chromedriver\\chromedriver1.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement ele = driver.findElementByXPath("//a[text()='Women']");
		
		Actions builder=new Actions(driver);
		
		builder.moveToElement(ele).perform();
		
		driver.findElementByXPath("//a[text()='Jackets & Coats']").click();
		
		String text = driver.findElementByXPath("//span[@class='title-count']").getText();
		
		//System.out.println(text);
		
		String total = text.replaceAll("\\D","");
		
		System.out.println(total);
		
		int totalInt = Integer.parseInt(total);
		
		System.out.println("Total Searched result : "+totalInt);
		

		String text1 = driver.findElementByXPath("//label[text()='Jackets']").getText();
		
		//System.out.println(text1);
		
		String totalJack=text1.replaceAll("\\D", "");
		
		int totalJackInt = Integer.parseInt(totalJack);
		
		System.out.println("Total Jackets : "+totalJackInt);
		
		String text2 = driver.findElementByXPath("//label[text()='Coats']").getText();
		
		//System.out.println(text2);
		
		String totalCoats=text2.replaceAll("\\D", "");
		
		int totalCoatInt = Integer.parseInt(totalCoats);
		
		System.out.println("Total Coats : "+totalCoatInt);
		
		
		int totaldress=totalJackInt+totalCoatInt;
		
		if(totalInt==totaldress)
		{
			System.out.println("Total is correct");
		}
		else
		{
			System.out.println("Total is NOT correct");	
		}
				
		
		driver.findElementByXPath("(//div[@class='common-checkboxIndicator'])[2]").click();
		driver.findElementByXPath("//div[@class='brand-more']").click();
		driver.findElementByXPath("(//input[@type='text'])[2]").sendKeys("Mango");
		driver.findElementByXPath("(//div[@class='common-checkboxIndicator'])[11]").click();
		driver.findElementByXPath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']").click();
		
		Thread.sleep(3000);
		
	List<WebElement> ele2 = driver.findElementsByXPath("//h3[@class='product-brand']");
	
	for (WebElement we : ele2) {
	
	String wetext=we.getText();
	
	if(!wetext.contains("MANGO")) {
		
		 System.out.println("Brands are Not Mango");
	}
	
	}		 
		System.out.println("Brands are Mango");
		
		WebElement ele5 = driver.findElementByXPath("//div[@class='sort-sortBy']");
		
		builder.moveToElement(ele5).perform();
		
		Thread.sleep(3000);
		
		WebElement ele8=driver.findElementByXPath("//label[text()='Better Discount']");
		
		Actions builder1=new Actions(driver);
		
		builder1.click(ele8).perform();
		
		Thread.sleep(3000);
		
		List<WebElement> ele6 = driver.findElementsByXPath("//span[@class='product-discountedPrice']");
		
		String price=ele6.get(0).getText();
		
		String nprice=price.replaceAll("\\D","");
		
		int pri=Integer.parseInt(nprice);
		
		System.out.println("Price of 1st dress: "+ pri);
		
		WebElement ele9 = driver.findElementByXPath("//h3[text()='MANGO']");
		
		Actions builder3=new Actions(driver);
		
		builder3.moveToElement(ele9).perform();
		
		driver.findElementByXPath("(//span[@class='product-actionsButton product-wishlist product-prelaunchBtn'])[1]").click();
		
		}
	}		


