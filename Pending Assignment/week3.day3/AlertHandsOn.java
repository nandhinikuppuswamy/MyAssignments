package week3.day3.assignment;

import java.time.Duration;

import org.apache.poi.poifs.property.Parent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandsOn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver chr = new ChromeDriver();
		chr.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		//chr.quit();
		chr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		chr.manage().window().maximize();
		
		Thread.sleep(2000);
		chr.switchTo().frame("iframeResult");
		chr.findElement(By.xpath("//button[text()='Try it']")).click();
		//Thread.sleep(1000);
		chr.switchTo().alert().sendKeys("Nandhini");
		chr.switchTo().alert().accept();
		//chr.close();
		Thread.sleep(1000);
		
		Thread.sleep(1000);
		WebElement weReturnTxt = chr.findElement(By.xpath("//p[@id='demo']"));
		String strContains = weReturnTxt.getText();
		System.out.println(strContains);
		if(strContains.contains("Nandhini"))
		System.out.println("Printed name is reflecting.");
		chr.quit();
	}

}
