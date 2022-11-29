package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver chr = new ChromeDriver();
		chr.get("http://leaftaps.com/opentaps/control/main");
		chr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		chr.findElement(By.id("username")).sendKeys("Demosalesmanager");
		chr.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		chr.findElement(By.className("decorativeSubmit")).click();
		 chr.findElement(By.linkText("CRM/SFA")).click();
		 chr.findElement(By.linkText("Leads")).click();
		 chr.findElement(By.partialLinkText("Find")).click();
		 chr.findElement(By.xpath("(//a[@class='x-tab-right'])[3]//span[contains(@class,'x-tab-strip-text')]")).click();
		
		chr.findElement(By.name("emailAddress")).sendKeys("nandhini@gmail.com");
		
		chr.findElement(By.xpath("//button[contains(text(),'Find')]")).click();
		chr.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a[@class='linktext'])[1]")).click();
		String text1 = chr.findElement(By.id("viewLead_firstName_sp")).getText();
		chr.findElement(By.linkText("Duplicate Lead")).click();
		chr.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		String text2 = chr.findElement(By.id("viewLead_firstName_sp")).getText();
		if(text1.equals(text2))
			System.out.println("Record Created Successfully");
		else
			System.out.println("Record creation unsuccessfull");
	}

}
