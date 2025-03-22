package week3.day2;



public class Safari extends Browser {

	private void readerMode() {
		System.out.println("Safari Method - readerMode");

	}
	private void fullScreenMode() {
		System.out.println("Safari Method - fullScreenMode");

	}
	public static void main(String[] args) {
		Safari sf = new Safari();
		sf.openURL();
		sf.navigateBack();
		sf.closeBrowser();
		sf.readerMode();
		sf.fullScreenMode();
		
	}
}
