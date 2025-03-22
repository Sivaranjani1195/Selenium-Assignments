package week3.day2;

public class Edge extends Browser {

	private void takeSnap() {
		System.out.println("Edge Method - takeSnap");

	}
	private void clearCookies() {
		// TODO Auto-generated method stub
		System.out.println("Edge Method - clearCookies");
	}
	
	public static void main(String[] args) {
		Edge e= new Edge();
		e.openURL();
		e.closeBrowser();
		e.navigateBack();
		e.takeSnap();
		e.clearCookies();
		System.out.println(e.browserName);
		System.out.println(e.browserVersion);
	}
}
