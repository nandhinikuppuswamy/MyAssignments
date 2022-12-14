package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class Salesforce {
	@Test
	public void sf1() throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver chr = new ChromeDriver();
		chr.get(" https://login.salesforce.com");
		//chr.quit();
		chr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		chr.manage().window().maximize();
		chr.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		chr.findElement(By.id("password")).sendKeys("Testleaf$321");
		chr.findElement(By.id("Login")).click();
		Thread.sleep(1000);
		chr.findElement(By.xpath("//button[contains(@title,'Learn More')]")).click();
		Set<String> allWindowHandles = chr.getWindowHandles();
        List<String> wndows = new ArrayList<String>(allWindowHandles);
        chr.switchTo().window(wndows.get(1));
        
		Thread.sleep(1000);
		chr.findElement(By.xpath("//button[@onclick='goAhead()']")).click();
		Shadow sh = new Shadow(chr);
		sh.findElementByXPath("//span[text()='Learning']").click();
		Thread.sleep(1000);
		WebElement we1 = sh.findElementByXPath("//span[text()='Learning on Trailhead']");
		Actions actChildWin = new Actions(chr);
		actChildWin.moveToElement(we1).perform();
		Thread.sleep(1000);
		sh.findElementByXPath("//a[text()='Salesforce Certification']").click();
		Thread.sleep(1000);
		chr.findElement(By.xpath("//img[@alt='Salesforce<br/>Architect']")).click();
		Thread.sleep(1000);
		String currUrl = chr.getCurrentUrl();
		chr.findElement(By.linkText("Application Architect")).click();
		Thread.sleep(1000);
		List<WebElement> welement = chr.findElements(By.xpath("//div[@class='credentials-card_type']"));
		int wSize = welement.size();
		System.out.println("count"+wSize);
		
	}

}
