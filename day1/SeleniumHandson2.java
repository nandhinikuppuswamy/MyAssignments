package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumHandson2 {

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
		 chr.findElement(By.partialLinkText("Find")).click();
		 chr.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Nandhini");
		 chr.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
		 //chr.findElement(By.xpath("//a[contains(text(),'15486')]")).click();
		 chr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 chr.findElement(By.xpath("//a[text()='Kuppuswamy']")).click();
		 chr.findElement(By.xpath("//a[text()='Edit']")).click();
		 chr.findElement(By.id("updateLeadForm_companyName")).clear();
		 chr.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
			chr.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();

			chr.close();
		 
		 //driver.findElement(By.xpath("//a[text()='15487']")).click();
		// chr.findElement(By.partialLinkText("Find")).click();

	}

}
