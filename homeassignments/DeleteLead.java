package homeassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
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
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("CRM")).click();
		
		//Clicking on Leads
		driver.findElement(By.linkText("Leads")).click();
		
		//Clicking on Create Leads
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Entering FN, LN & Company Name,Department name,Description,Phone number
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Sivaranjani");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("M");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Ammu");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Automation Testing");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Learning xpath locators");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("msivaranjani1195@gmail.com");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneCountryCode']")).clear();
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneCountryCode']")).sendKeys("91");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneAreaCode']")).sendKeys("79048");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("33475");
		
		//Clicking on Create Lead
		driver.findElement(By.name("submitButton")).click();
			
		//Clicking on Find Leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		//Clicking on Phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		
		//Entering on Phone Number
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
		driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("7904");
		
		//Clicking on FindLeads
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//Capturing Lead id
		Thread.sleep(3000);
		WebElement LI = driver.findElement(By.xpath("(//a[@class='linktext'])[4]"));
		String leadID = LI.getText();
		System.out.println(leadID);
		
		//Selecting lead from lead list
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		
		//Deleting selected lead by clicking on delete
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		
		//Clicking on Find Leads link
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		//Clicking on Name and ID
		driver.findElement(By.xpath("//span[contains(text(),'Name')]")).click();
		
		//Entering lead id again in Lead id field to find deleted lead 
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		
		//Clicking on FindLeads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(5000);
		String vm= driver.findElement(By.xpath("//div[contains(text(),'No records')]")).getText();
		String DM = "No records to display";	
		
		if(vm.equals(DM))
			
		{
			System.out.println("There is no records to display");
		}
		
		else
		{
			System.out.println("Error");
		}
		
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
		
	}

}
