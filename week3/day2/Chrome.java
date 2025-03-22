package week3.day2;

public class Chrome extends Browser {

	private void openInc() {
		System.out.println("Chrome Method - openInc");
     }
	
	private void clearCache() {
		System.out.println("Chrome Method - clearCache");

	}
	
	public static void main(String[] args) {
		Chrome c= new Chrome();
		c.openInc();
		c.closeBrowser();
		c.navigateBack();
		c.openURL();
		c.clearCache();
	}
}
