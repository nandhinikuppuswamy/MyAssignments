package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumhandson3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver chr = new ChromeDriver();
		chr.get(" https://en-gb.facebook.com/");
		chr.manage().window().maximize();
		 chr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 chr.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		 chr.findElement(By.name("firstname")).sendKeys("Nandhini");
		 chr.findElement(By.name("lastname")).sendKeys("Kuppuswamy");
		 chr.findElement(By.name("reg_email__")).sendKeys("nk1986@gmail.com");
		 chr.findElement(By.name("reg_passwd__")).sendKeys("crmsfa");
		 WebElement webel = chr.findElement(By.name("birthday_day"));
		Select selObj = new Select(webel);
		selObj.selectByValue("18");
		
		WebElement webel1 = chr.findElement(By.name("birthday_month"));
		Select selObj1 = new Select(webel1);
		selObj1.selectByIndex(4);
		
		WebElement webel2 = chr.findElement(By.name("birthday_year"));
		Select selObj2 = new Select(webel2);
		selObj2.selectByValue("1996");	
		chr.findElement(By.xpath("//label[text()='Female']")).click();

		
		
		 
		 
		 
		 //Enter the first name
		// Step 8: Enter the last name
		// Step 9: Enter the mobile number
		// Step 10: Enterthe password
		// Step 11: Handle all the three drop downs
		// Step 12: Select the radio button "Female" 
		/*chr.findElement(By.id("username")).sendKeys("Demosalesmanager");
		chr.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		chr.findElement(By.className("decorativeSubmit")).click();*/
	}

}
