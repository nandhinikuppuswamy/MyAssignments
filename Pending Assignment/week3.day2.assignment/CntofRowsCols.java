package week3.day2.assignment;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CntofRowsCols {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver chr = new ChromeDriver();
		chr.get("https://html.com/tags/table/");
		Thread.sleep(1000);
		List<WebElement> weTableRow = chr.findElements(By.xpath("//table[@class='attributes-list']//tr"));
		System.out.println("no of table rows:"+weTableRow.size());
		List<WebElement> weTablecol = chr.findElements(By.xpath("(//table[@class='attributes-list']//tr)[2]/td"));
		System.out.println("no of table columns:"+weTablecol.size());
		
	}

}
