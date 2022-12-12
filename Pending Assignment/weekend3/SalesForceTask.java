package weekend3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceTask {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//ChromeDriver chr = new ChromeDriver();
		ChromeOptions chOptions=new ChromeOptions();
		chOptions.addArguments("--disable-notifications");
		ChromeDriver chr=new ChromeDriver(chOptions);
		chr.get(" https://login.salesforce.com");
		//chr.quit();
		chr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		chr.manage().window().maximize();
		chr.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		chr.findElement(By.id("password")).sendKeys("Testleaf$321");
		chr.findElement(By.id("Login")).click();
		Thread.sleep(1000);
		chr.findElement(By.className("slds-icon-waffle")).click();
		chr.findElement(By.className("slds-button")).click();
		chr.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(1000);
		
		chr.findElement(By.xpath("(//input[@type='search'])[3]")).sendKeys("Tasks");
		//JavascriptExecutor js = (JavascriptExecutor)chr;
		//js.
		chr.findElement(By.xpath("//mark[text()='Tasks']")).click();
		Thread.sleep(1000);
		chr.findElement(By.xpath("(//div[@class='uiPopupTrigger'])//child::a")).click();
		Thread.sleep(1000);
		chr.findElement(By.xpath("(//li[@class='uiMenuItem'])/child::a")).click();
		Thread.sleep(1000);
		 chr.findElement(By.xpath("//label[text()='Subject']/following::input")).sendKeys("BootCamp");
		chr.findElement(By.xpath("(//div[@class='uiPopupTrigger'])[5]//child::a")).click();//click on that combo
		//WebElement we = chr.findElement(By.id("//label[text()='Ownership']/following::button"));
		for(int i = 0; i <= 4; i++){
		    Actions actions = new Actions(chr);
		    actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
		    
		}
		Actions actions1 = new Actions(chr);
	    actions1.sendKeys(Keys.ENTER).build().perform();//press enter
		chr.findElement(By.xpath("//span[text()='Save']")).click();
		//Thread.sleep(1000);
		WebElement weMsg = chr.findElement(By.xpath("//div[contains(@class,'forceToastMessage')]"));
		String strMsg = weMsg.getText();
		System.out.println(strMsg);
		if(strMsg.contains("BootCamp")) {
			System.out.println("Task Craeted.");
		}
		else
			System.out.println("Task not created.");
		
		//class="toastMessage slds-text-heading--small forceActionsText"
		
		
	}

}
