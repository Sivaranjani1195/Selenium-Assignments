package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearningDropdown {

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
		
		//Entering FN, LN & Company Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sivaranjani");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
		
		//Selecting SOURCE dropdown using index method		
		WebElement sourcedd = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select DD = new Select(sourcedd);
		DD.selectByIndex(4);
		
		//Selecting MARKETING CAMPAIGN dropdown using VisibleText method
		WebElement mc = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select mcDD = new Select(mc);
		mcDD.selectByVisibleText("Automobile");
		
		
		//Selecting OWNERSHIP dropdown using value method
		WebElement os = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select osDD = new Select(os);
		osDD.selectByValue("OWN_SCORP");
		
		
		//Clicking on Create Lead
		driver.findElement(By.name("submitButton")).click();
		
		//Printing current page title
		String title = driver.getTitle();
		System.out.println("Title of the current page is: " +title);
		
		//Closing current window
		driver.close();
		

		
	
		
				

	}

}
