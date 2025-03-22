package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//Placing order in Amazon application
public class AmazonApp {

	public static void main(String[] args) throws InterruptedException {
		
				// Launching Chrome browser
				ChromeDriver driver = new ChromeDriver();
				
				//Maximizing the window
				driver.manage().window().maximize();
				
				//Loading amazon URL
				driver.get("https://www.amazon.in/");
				
				//Implementing implicit wait to wait for finding element in web page for each element
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				//Entering "Bags for boys"" in search box
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
				
				//Clicking first option from suggestion
				Thread.sleep(500);
				driver.findElement(By.xpath("//div[@id='sac-suggestion-row-1-cell-1']/div")).click();
				
				//Getting total number of results for searched item
				String resultOfTotal = driver.findElement(By.xpath("(//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']/span)[1]")).getText();
				System.out.println("Total number of result is: "+resultOfTotal);
				System.out.println("-----------------------------------------------");
				
				//Checking first check box option from brand option
				driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
				
				//Checking first check box option from brand option
				driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();//Following or preceeding
				
				//Selecting filter option
				driver.findElement(By.xpath("//span[@class='a-button-inner']")).click();
				
				//Selecting New arrivals from filter
				driver.findElement(By.xpath("//option[text()='Newest Arrivals']")).click();
				
				//Getting bag information of first item from the list
				String bagInfo = driver.findElement(By.xpath("(//h2[@class='a-size-base-plus a-spacing-none a-color-base a-text-normal'])[1]")).getText();
				System.out.println("Bag information is: "+bagInfo);
				System.out.println("-----------------------------------------------");
				
				//Getting price discount information of first item from the list
				String discountedPrice = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
				System.out.println("Discount is: "+discountedPrice);
				System.out.println("-----------------------------------------------");
				
				//Getting title of the current page
				String titleOfCurrentPage = driver.getTitle();
				System.out.println("Title of current page is: "+titleOfCurrentPage);
	}

}
