package week3.day2.assignment;

import java.time.Duration;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.hc.core5.http.impl.nio.ClientHttp1StreamDuplexer;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chittorgarh {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver chr = new ChromeDriver();
		chr.get("https://www.chittorgarh.com/");
		chr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(1000);
		chr.findElement(By.id("navbtn_stockmarket")).click();
		Thread.sleep(500);
		chr.findElement(By.linkText("NSE Bulk Deals")).click();
		Thread.sleep(1000);
		List<WebElement> secNms = chr.findElements(By.xpath("(//div[contains(@class,'table-responsive')])[2]//tbody//td[3]"));
		
		Thread.sleep(1000);
		Set<String> strDup = new TreeSet<String>();
		for(int i=0;i<secNms.size();i++)
		{
			strDup.add(secNms.get(i).getText());
			
			
		}
		System.out.println("original size"+secNms.size());
		System.out.println("duplicate size"+strDup.size());
		System.out.println(strDup);
		int size1=strDup.size();
		int size2=secNms.size();
		if(size1!=size2)
			System.out.println("duplicates found and removed");
			
		
		
	}

}
