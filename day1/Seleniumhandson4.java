package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumhandson4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver chr = new ChromeDriver();
		chr.get("http://leaftaps.com/opentaps/control/main");
		
		chr.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		chr.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		chr.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		 chr.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		 //chr.findElement(By.xpath("//a[text()='Kuppuswamy']")).click();

		 chr.findElement(By.xpath("//a[text()='Leads']")).click();
		 chr.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		 chr.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("HCL");
		chr.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Nandhini");
		chr.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("K");
		chr.findElement(By.xpath("//textarea[@name='description']")).sendKeys("My first handson in selenium.");
		chr.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("nandhini.kuppuswamys@gmail.com");
		
		WebElement webel = chr.findElement(By.name("generalStateProvinceGeoId"));
		Select selObj = new Select(webel);
			 
			selObj.selectByIndex(5);
			 chr.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		

	}

}
