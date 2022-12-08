package week3.day1.assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver chr = new ChromeDriver();
		chr.get("https://www.ajio.com/");
		chr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(1000);
		chr.findElement(By.name("searchVal")).sendKeys("bags");
		Thread.sleep(500);
		chr.findElement(By.name("searchVal")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		chr.findElement(By.xpath("//input[@name='genderfilter']/following::label[@for=\"Men\"]")).click();
		Thread.sleep(1000);
		chr.findElement(By.xpath("//input[@id='Men - Fashion Bags']/following::label[@for=\"Men - Fashion Bags\"]")).click();
		Thread.sleep(1000);
		String strCount = chr.findElement(By.xpath("//div[@class='filter']/child::div[@class=\"length\"]")).getText();
		System.out.println("No of items:"+strCount);	
		List<WebElement> lstBrands = chr.findElements(By.xpath("//div[@class='brand']"));
		for(int i=0;i<lstBrands.size();i++)
		{
			System.out.println(lstBrands.get(i).getText());
		}
		System.out.println("----------------------------------------------------------------------------------");
		List<WebElement> lstname = chr.findElements(By.xpath("//div[@class='nameCls']"));
		for(int i=0;i<lstname.size();i++)
		{
			System.out.println(lstname.get(i).getText());
		}
		
		
	}

}
