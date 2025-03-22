package homeassignments;

public class CheckBoxButton extends Button {
	public void clickCheckButton() {
		System.out.println("clickCheckButton");
		
	}
	
	public static void main(String[] args) {
		CheckBoxButton b= new CheckBoxButton();
		b. click();
		b.setText("Check");
		b.submit();
		b.clickCheckButton();
	}
	

}
