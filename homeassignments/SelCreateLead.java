package homeassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelCreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launching browser and get in the leaftaps application by loading leaftap URL
				ChromeDriver driver=new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/");
				
				//Maximizing the browser
				driver.manage().window().maximize();
				
				//Logining into the leaftap application
				driver.findElement(By.id("username")).sendKeys("democsr");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				
				//Clicking on CRM/SFA hyperlink
				driver.findElement(By.partialLinkText("CRM/SFA")).click();
				
				//Clicking on Leads
				driver.findElement(By.linkText("Leads")).click();
				
				//Clicking on Create Leads
				driver.findElement(By.linkText("Create Lead")).click();
				
				//Entering FN, LN & Company Name,title
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sivaranjani");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
				driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("createlead");
						
				//Clicking on Create Lead
				driver.findElement(By.name("submitButton")).click();
				
				//Printing current page title
				String title = driver.getTitle();
				System.out.println("Title of the current page is: " +title);
				
				//Closing current window
				driver.close();
	}

}
