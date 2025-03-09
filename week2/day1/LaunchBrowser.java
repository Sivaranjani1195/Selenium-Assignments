package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static void main(String[] args) {
		
		//Launching chrome browser
		ChromeDriver driver=new ChromeDriver();
		
		//Loading URL 
		driver.get("https://www.facebook.com/");
		
		//Maximizing the window
		driver.manage().window().maximize();
		
		//Getting title of the current page
		String title = driver.getTitle();
		System.out.println(title);
		
		//Closing the window
		driver.close();
		
		}

}
