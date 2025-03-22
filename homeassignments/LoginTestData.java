package homeassignments;

public class LoginTestData extends TestData {
	
	private void enterUsername() {
		// TODO Auto-generated method stub
		System.out.println("Entered user name");
	}
	private void enterPassword() {
		// TODO Auto-generated method stub
		System.out.println("Entered password");
	}
	
	public static void main(String[] args) {
		LoginTestData TD = new LoginTestData();
		TD.enterPassword();
		TD.enterUsername();
		TD.navigateToHomePage();
		TD.enterCredentials();
		
	}
}
