package SFstepFile;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class SfStepFile {
	public ChromeDriver chr;
	public Shadow sh;
	@Given ("Launch Salesforce application") 
	public void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		 chr = new ChromeDriver();
		chr.get(" https://login.salesforce.com");
		//chr.quit();
		chr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		chr.manage().window().maximize();
		
	}
	@And ("Login with Provided Credentials")
	public void Login() throws InterruptedException
	{
		chr.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		chr.findElement(By.id("password")).sendKeys("Testleaf$321");
		chr.findElement(By.id("Login")).click();
		Thread.sleep(1000);
	}
	@Then ("Click on Learn More link in Mobile Publisher and click Confirm")
	public void clickPublish() throws InterruptedException
	{
		chr.findElement(By.xpath("//button[contains(@title,'Learn More')]")).click();
		Set<String> allWindowHandles = chr.getWindowHandles();
        List<String> wndows = new ArrayList<String>(allWindowHandles);
        chr.switchTo().window(wndows.get(1));
        
		Thread.sleep(1000);
	}
	@Then ("Click Learning and Mouse hover on Learning On Trailhead")
	public void TrailHead() throws InterruptedException
	{
		chr.findElement(By.xpath("//button[@onclick='goAhead()']")).click();
		sh = new Shadow(chr);
		sh.findElementByXPath("//span[text()='Learning']").click();
		Thread.sleep(1000);
		WebElement we1 = sh.findElementByXPath("//span[text()='Learning on Trailhead']");
		Actions actChildWin = new Actions(chr);
		actChildWin.moveToElement(we1).perform();
		Thread.sleep(1000);
	}
	@And ("Select SalesForce Certification")
	public void SFCertificate() throws InterruptedException
	{
		sh.findElementByXPath("//a[text()='Salesforce Certification']").click();
		Thread.sleep(1000);
	}
	@And ("Choose Your Role as Salesforce Architect and verify the URL")
	public void SFArchitect() throws InterruptedException
	{
		chr.findElement(By.xpath("//img[@alt='Salesforce<br/>Architect']")).click();
		Thread.sleep(1000);
		String currUrl = chr.getCurrentUrl();
		Thread.sleep(1000);
	}
	@And ("Get the Text of Salesforce Architect")
	public void getTextSummary()
	{
		String strtxtSunn = chr.findElement(By.xpath("//h1[text()='Salesforce Architect']/following::div")).getText();
		System.out.println(strtxtSunn);
	}
	@And ("Get the List of Salesforce Architect Certifications Available")
	public void getList()
	{
		List<WebElement> welement = chr.findElements(By.xpath("//div[@class='credentials-card ']"));
		int wSize = welement.size();
		System.out.println("SF count"+wSize);
	}
	@Then ("Click on Application Architect")
	public void clickAppArch() throws InterruptedException
	{
		String currUrl = chr.getCurrentUrl();
		chr.findElement(By.linkText("Application Architect")).click();
		Thread.sleep(1000);
	}
	@And ("Get the List of Certifications available")
	public void getListCert()
	{
		List<WebElement> welement = chr.findElements(By.xpath("//div[@class='credentials-card_type']"));
		int wSize = welement.size();
		System.out.println("count"+wSize);
	}
}
