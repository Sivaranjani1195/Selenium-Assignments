package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class PVRApps {
	
	//Booking tickets in PVR Cinema application

	public static void main(String[] args) throws InterruptedException {
		
		// Launching Chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		//Maximizing the window
		driver.manage().window().maximize();
		
		//Loading PVR Cinemas URL
		driver.get("http://www.pvrcinemas.com/");
		
		//Implementing implicit wait to wait for finding element in web page for each element
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Toggle to Cinema  
		driver.findElement(By.xpath("//span[@class='filter-pvr-active']/parent::div")).click();
		
		//Selecting "Select Cinema" dropdown
		driver.findElement(By.xpath("(//div[contains(@class,'p-hidden-accessible p-dropdown-hidden-select')]/following-sibling::span)[2]")).click();
		
		//Selecting Cinema theatre from "Select Cinema" dropdown
		driver.findElement(By.xpath("(//ul[@class='p-dropdown-items']//span)")).click();
		
		//Selecting Date
		driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
		
		//Selecting Movie
		Thread.sleep(500);
		driver.findElement(By.xpath("(//ul[@class='p-dropdown-items']/li)[2]")).click();
		
		Thread.sleep(500);
		//Selecting Timing
		driver.findElement(By.xpath("(//ul[@class='p-dropdown-items']//span)[1]")).click();
		
		//Clicking on book button
		driver.findElement(By.xpath("//button[@type='submit']/span")).click();
		
		//Accepting Terms and Condition popup
		driver.findElement(By.xpath("//div[@class='accpet-btn-flow-seat']/button[2]")).click();
		
		//Selecting seats
		driver.findElement(By.xpath("//span[@class='seat-current-pvr']/parent::td")).click();
		
		//Click on proceed button
		driver.findElement(By.xpath("//div[@class='register-btn']/button")).click();
		
		//Printing seat information 
		String seatInfo = driver.findElement(By.xpath("//div[@class='ticket-value']/p")).getText();
		System.out.println("The seat information is: "+seatInfo);
		
		//Printing selected seat number
		String seatNo12 = driver.findElement(By.xpath("//div[@class='seat-number']/p")).getText();
		System.out.println("First selected seat is: "+seatNo12);
		
		
		//Printing grand total
		String grandTotal = driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']//span")).getText();
		System.out.println("The grandtotal is: "+grandTotal);
		
		//Clicking on Proceed button
		driver.findElement(By.xpath("//div[@class='register-btn col-md-3']/button")).click();
		
		//Closing the popup window
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		
		//Getting title of current page
		String titleOfCurrentPage = driver.getTitle();
		System.out.println("The current page title is: "+titleOfCurrentPage);
		
		//Closing window
		driver.close();
		
	}

}
