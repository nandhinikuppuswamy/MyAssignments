package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumHandson1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver chr = new ChromeDriver();
		chr.get("http://leaftaps.com/opentaps/control/main");
		
		chr.findElement(By.id("username")).sendKeys("Demosalesmanager");
		chr.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		chr.findElement(By.className("decorativeSubmit")).click();
		 chr.findElement(By.linkText("CRM/SFA")).click();
		 chr.findElement(By.linkText("Leads")).click();
		 chr.findElement(By.partialLinkText("Create")).click();
		 chr.findElement(By.id("createLeadForm_companyName")).sendKeys("HCL");
		chr.findElement(By.id("createLeadForm_firstName")).sendKeys("Nandhini");
		chr.findElement(By.id("createLeadForm_lastName")).sendKeys("Kuppuswamy");
		chr.findElement(By.name("description")).sendKeys("My first handson in selenium.");
		chr.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("nandhini.kuppuswamys@gmail.com");
		WebElement webel = chr.findElement(By.name("generalStateProvinceGeoId"));
		Select selObj = new Select(webel);
			 
			selObj.selectByIndex(5);
			 chr.findElement(By.className("smallSubmit")).click();
			
			 
		 
		
		

	}

}
