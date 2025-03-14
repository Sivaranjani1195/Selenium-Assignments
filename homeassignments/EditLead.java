package homeassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
				
				//Entering FN, LN & Company Name,Department name,Description
				driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
				driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Sivaranjani");
				driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("M");
				driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Ammu");
				driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Automation Testing");
				driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Learning xpath locators");
				driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("msivaranjani1195@gmail.com");
				
				
				//Selecting option from dropdown field
				WebElement DD = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
				Select SP = new Select(DD);
				SP.selectByVisibleText("New York");
				
				
				//Clicking on Create Lead
				driver.findElement(By.name("submitButton")).click();
				
				//Edit Lead
				driver.findElement(By.xpath("//a[text()='Edit']")).click();
				
				//Clearing the description
				driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
				
				//Entering important note
				driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("Learning xpath locators");
				
				//Updating the changes
				driver.findElement(By.xpath("//input[@value='Update']")).click();
						
				
				//Printing current page title
				String title = driver.getTitle();
				System.out.println("Title of the current page is: " +title);
				
				//Closing current window
				driver.close();
				
				
				
				
				
				
				

	}

}
