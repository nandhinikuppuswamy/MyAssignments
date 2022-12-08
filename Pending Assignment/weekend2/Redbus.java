package weekend2.assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver chr = new ChromeDriver();
		chr.get("https://www.redbus.in");
		chr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//List<WebElement> autoSuggest = chr.findElements(By.xpath("//input[@id='src"));
		chr.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
		Thread.sleep(1000);
		chr.findElement(By.xpath("//input[@id='src']")).sendKeys(Keys.ENTER);
		
		chr.findElement(By.xpath("//input[@id='dest']")).sendKeys("Coimbatore");
		Thread.sleep(1000);
		chr.findElement(By.xpath("//input[@id='dest']")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		chr.findElement(By.id("onward_cal")).click();
		Thread.sleep(1000);
		chr.findElement(By.xpath("//td[@class='current day']/following::td")).click();
		Thread.sleep(1000);
		chr.findElement(By.id("search_btn")).click();
		Thread.sleep(5000);
		//WebElement Count = driver.findElement(By.xpath("//span[contains (@class,'busFound')]"));
		WebElement busFound = chr.findElement(By.xpath("//span[contains(@class,'busFound')]"));
		Thread.sleep(1000);
		System.out.println("No of buses:"+ busFound.getText());
		Thread.sleep(10000);
		WebElement we = chr.findElement(By.xpath("//label[text()='SLEEPER']/preceding-sibling::label"));
		JavascriptExecutor js = (JavascriptExecutor)chr;
		js.executeScript("arguments[0].click()", we);
		//document.
		//.click();
		Thread.sleep(5000);
		WebElement busname = chr.findElement(By.xpath("(//div[contains(@class,'bus-type')])[2]/preceding-sibling::div"));
		String strbusname = busname.getText();
		System.out.println("Name of second bus : "+strbusname);
		WebElement viewSeats = chr.findElement(By.xpath("(//div[contains(@class,'bus-type')])[2]/following::div[text()='View Seats']"));
		//System.out.println(viewSeats);
		js.executeScript("arguments[0].click()", viewSeats);
		
	}

}
