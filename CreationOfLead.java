package weekly1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreationOfLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Login Screen
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("demosalesmanager");
	driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	
	//CRM/SFA Link
	driver.findElement(By.linkText("CRM/SFA")).click();
	
	//Lead tab
	
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
		
	//Input details
	
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Lead");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Organization");
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("DSW");
	driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Creation");
	driver.findElement(By.className("smallSubmit")).click();
	
	
	//Verify the Title
	String WebTitle = driver.getTitle();
	String usertitle = "View Lead | opentaps CRM";
	
	System.out.println(usertitle.equals(WebTitle));    	
    driver.close();	
	}

}

	