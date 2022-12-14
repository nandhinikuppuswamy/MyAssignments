package wek4.day3assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;



import io.cucumber.java.After;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ParentSales {

	

	public ChromeDriver chr;
	@Parameters({ "url", "UserName", "Password" })
	@BeforeMethod
	public void preCondition(String url, String UserName, String Password) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//ChromeDriver chr = new ChromeDriver();
		ChromeOptions chOptions=new ChromeOptions();
		chOptions.addArguments("--disable-notifications");
		chr=new ChromeDriver(chOptions);
		chr.get(url);
		//chr.quit();
		chr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		chr.manage().window().maximize();
		chr.findElement(By.id("username")).sendKeys(UserName);
		chr.findElement(By.id("password")).sendKeys(Password);
		chr.findElement(By.id("Login")).click();
	
	}
	@AfterMethod
	public void postcondition() {
		// TODO Auto-generated method stub
		chr.close();
	
	}

}
