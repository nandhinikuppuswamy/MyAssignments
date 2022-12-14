package wek4.day3assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SaleforceContact extends ParentSales {
	@DataProvider(name="createContact")
	public String[][] createOpportunity() {
		String [] [] data=new String [2][1];
		data[0][0]="Nandhini1 - Salesforce Contact1";
		data[1][0]="Nandhini2 - Salesforce Contact2";
		
		return data;
	}
	@Test(dataProvider="createContact")
	
	public void salesForceContactCreate(String strName) throws InterruptedException {
		// TODO Auto-generated method stub
			Thread.sleep(1000);
		chr.findElement(By.className("slds-icon-waffle")).click();
		chr.findElement(By.className("slds-button")).click();
		chr.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(10000);
		WebElement we = chr.findElement(By.xpath("//span[text()='Opportunities']"));
		JavascriptExecutor js = (JavascriptExecutor)chr;
		js.executeScript("arguments[0].click()", we);
		
		WebElement we1 = chr.findElement(By.xpath("//span[text()='Accounts']"));
		js.executeScript("arguments[0].click()", we1);
		chr.findElement(By.xpath("//div[text()='New']")).click();
		chr.findElement(By.xpath("//input[@name='Name']")).sendKeys(strName);
		chr.findElement(By.xpath("//label[text()='Ownership']/following::button")).click();//click on that combo
		//WebElement we = chr.findElement(By.id("//label[text()='Ownership']/following::button"));
		for(int i = 0; i <= 2; i++){
		    Actions actions = new Actions(chr);
		    actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
		    
		}
		Actions actions1 = new Actions(chr);
	    actions1.sendKeys(Keys.ENTER).build().perform();//press enter
		chr.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		Thread.sleep(2000);
		WebElement we2 = chr.findElement(By.xpath("//span[text()='Accounts']"));
		js.executeScript("arguments[0].click()", we2);
		//chr.findElement(By.xpath("//div[text()='New']")).click();
		Thread.sleep(2000);
		String strCheckName = chr.findElement(By.xpath("(//span[@class='triggerContainer'])[1]/preceding-sibling::a")).getText();
	      Thread.sleep(1000);
	      System.out.println(strCheckName);
	      if(strCheckName.equalsIgnoreCase(strName))
	      System.out.println("Account Created");
	     
	      
		}
		
	}


