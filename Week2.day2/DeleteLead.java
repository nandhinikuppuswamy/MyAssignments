package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
		 chr.findElement(By.xpath("(//a[@class='x-tab-right'])[2]//span[contains(@class,'x-tab-strip-text')]")).click();
		
		chr.findElement(By.name("phoneNumber")).sendKeys("9876534");
		
		chr.findElement(By.xpath("//button[contains(text(),'Find')]")).click();
		//schr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 

			 
		String str1 = (chr.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a[@class='linktext'])[1]")).getText());
		//String str1 = lnkID.getText();
		 System.out.println(str1);
		chr.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a[@class='linktext'])[1]")).click();
		 		
		 
				
		chr.findElement(By.linkText("Delete")).click();
		chr.findElement(By.partialLinkText("Find")).click();
		chr.findElement(By.xpath("//label[text()='Lead ID:']/following::input[@name='id']")).sendKeys(str1);
		chr.findElement(By.xpath("//button[contains(text(),'Find')]")).click();
		
		String recFound=chr.findElement(By.className("x-paging-info")).getText();
		if(recFound == "No records to display")
			System.out.println("Record Deleted Successfully.");
		else
				System.out.println("Record Not Deleted.");
		
		
		
			
		
	}

}
