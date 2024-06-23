package weekly1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreationOfAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	// Login
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("demosalesmanager");
	driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	
	
	// CRM/SFA Link
	driver.findElement(By.linkText("CRM/SFA")).click();
	
	// Input details
	driver.findElement(By.linkText("Accounts")).click();
	driver.findElement(By.linkText("Create Account")).click();
	driver.findElement(By.id("accountName")).sendKeys("Selenium Automation Tester17");
	driver.findElement(By.id("numberEmployees")).sendKeys("100");
	driver.findElement(By.id("officeSiteName")).sendKeys("“LeafTaps");
	driver.findElement(By.className("smallSubmit")).click();
    
	
	//Verify title
	String title = driver.getTitle();
    System.out.println(title);
    String titlewebpage = "Account Details | opentaps CRM";
    System.out.println(title.equals(titlewebpage));    	
    driver.close();	
	}

}
