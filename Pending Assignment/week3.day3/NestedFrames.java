package week3.day3.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver chr = new ChromeDriver();
		chr.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		//chr.quit();
		chr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		chr.manage().window().maximize();
		
		//Thread.sleep(1000);
		chr.switchTo().frame("frame1");
		chr.findElement(By.xpath("//b[@id='topic']/following::input")).sendKeys("Testing Frame1");
		chr.switchTo().frame("frame3");
		chr.findElement(By.xpath("//input[@id='a']")).click();
		Thread.sleep(1000);
		chr.switchTo().defaultContent();
		Thread.sleep(1000);
		chr.switchTo().frame("frame2");
		WebElement weSelect = chr.findElement(By.id("animals"));
		Select selObj = new Select(weSelect);
		selObj.selectByIndex(2);
	}

}
