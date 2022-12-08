package weekend2.assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookMyShow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver chr = new ChromeDriver();
		chr.get("https://in.bookmyshow.com");
		chr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(1000);
		//List<WebElement> autoSuggest = chr.findElements(By.xpath("//input[@id='src"));
		chr.findElement(By.xpath("//input[@placeholder='Search for your city']")).sendKeys("Hyderabad");
		Thread.sleep(1000);
		chr.findElement(By.xpath("//input[@placeholder='Search for your city']")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		String cURL = chr.getCurrentUrl().toString();
		System.out.println(cURL);
		boolean blnURL = cURL.contains("hyderabad");
		System.out.println("Is Hyderabad Selected:"+blnURL);
		chr.findElement(By.xpath("//img[@alt='Love Today']")).click();
		Thread.sleep(1000);
		chr.findElement(By.xpath("//span[text()='Book tickets']")).click();
		Thread.sleep(1000);
		String str1 = chr.findElement(By.xpath("(//a[@class='__venue-name'])[1]")).getText();
		System.out.println(str1);
		chr.findElement(By.xpath("(//a[@class='__venue-name'])[1]/following::div[@class='venue-info-text']")).click();
		Thread.sleep(500);
		//chr.findElement(By.className("details-text")).click();
		List<WebElement> wements = chr.findElements(By.xpath("//div[@class='facility-text']"));
		boolean blnParking = false;
		for(int i=0;i<wements.size();i++)
		{
			if(wements.get(i).getText().trim().equals("Parking Facility"))
			{
				System.out.println("Parking available");
				blnParking = true;
			}
		}
		if(blnParking == false)
			System.out.println("Parking not available");
		
		chr.findElement(By.xpath("//div[@class='cross-container']")).click();
		chr.findElement(By.xpath("//div[contains(@class,'_available')][1]")).click();
		chr.findElement(By.id("btnPopupAccept")).click();
		chr.findElement(By.id("pop_1")).click();
		chr.findElement(By.id("proceed-Qty")).click();
		chr.findElement(By.xpath("//a[@class='_available'][1]")).click();
		
		chr.findElement(By.id("btmcntbook")).click();
		Thread.sleep(1000);
		String str5 = chr.findElement(By.id("subTT")).getText().toString();
		System.out.println("subtotal:"+str5);
	}

}
