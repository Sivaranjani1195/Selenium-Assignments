package homeassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelCreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launching browser and get in the leaftaps application by loading leaftap URL
				ChromeDriver driver=new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/");
				
				//Maximizing the browser
				driver.manage().window().maximize();
				
				//Logging into the leaftap application
				driver.findElement(By.id("username")).sendKeys("democsr");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				
				//Clicking on CRM/SFA hyperlink
				driver.findElement(By.partialLinkText("CRM/SFA")).click();
				
				//Clicking on Accounts tab
				driver.findElement(By.linkText("Accounts")).click();
				
				//Clicking on Create Account
				driver.findElement(By.partialLinkText("Create")).click();
				
				//Entering Account name
				driver.findElement(By.id("accountName")).sendKeys("Automation");
				
				//Entering descriptions : Selenium Automation Tester
				driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
				
				//Entering numberEmployees
				driver.findElement(By.id("numberEmployees")).sendKeys("2");
				
				//Entering Site Name as LeafTaps
				driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
				
				
				//Clicking on Create Account button
				driver.findElement(By.className("smallSubmit")).click();
				
				//Printing current page title
				String title = driver.getTitle();
				System.out.println("Title of the current page is: " +title);
				
				//Closing current window
				driver.close();
				
				

				
				
				
				
				
				

	}

}
