package week3.day3.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xalerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver chr = new ChromeDriver();
		chr.get("https://www.leafground.com/alert.xhtml");
		//chr.getScreenshotAs(png);
		chr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		chr.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement welement=chr.findElement(By.xpath("//h5[text()=' Alert (Simple Dialog)']/following-sibling::button"));
		welement.click();
		chr.switchTo().alert().accept();
		Thread.sleep(1000);
		
		WebElement welement2=chr.findElement(By.xpath("//h5[text()=' Alert (Confirm Dialog)']/following-sibling::button"));
		welement2.click();
		chr.switchTo().alert().dismiss();
		Thread.sleep(1000);
		
		WebElement welement3=chr.findElement(By.xpath("//h5[text()='Sweet Alert (Simple Dialog)']/following-sibling::button"));
		welement3.click();
		chr.findElement(By.xpath("//span[text()='Dismiss']")).click();
		
		WebElement welement4=chr.findElement(By.xpath("//h5[text()='Sweet Modal Dialog']/following-sibling::button"));
		welement4.click();
		Thread.sleep(1000);
		chr.findElement(By.xpath("//span[text()='Modal Dialog (Sweet Alert)']/following-sibling::a")).click();
		
		WebElement welement5=chr.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/following-sibling::button"));
		welement5.click();
		chr.switchTo().alert().sendKeys("nandhini");
		chr.switchTo().alert().accept();
		
		WebElement welement6=chr.findElement(By.xpath("//h5[text()='Sweet Alert (Confirmation)']/following-sibling::button"));
		welement6.click();
		//chr.switchTo().alert().sendKeys("nandhini");
		chr.findElement(By.xpath("//button[contains(@class,'ui-confirmdialog-yes')]")).click();
		
		WebElement welement7=chr.findElement(By.xpath("//h5[text()='Minimize and Maximize']/following-sibling::button"));
		welement7.click();
		Thread.sleep(1000);
		//chr.switchTo().alert().sendKeys("nandhini");
		//chr.findElement(By.xpath("//button[contains(@class,'ui-icon-extlink')]")).click();
		chr.findElement(By.xpath("//a[contains(@class,'ui-dialog-titlebar-minimize')]")).click();
		chr.findElement(By.xpath("//a[contains(@class,'ui-dialog-titlebar-maximize')]")).click();
		
		
		
	}

}
