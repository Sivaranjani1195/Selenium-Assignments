package homeassignments;

public class TextField extends WebElement{
	
	public void getText() {
		System.out.println("Text");

	}

	public static void main(String[] args) {
		TextField tf = new TextField();
		tf.click();
		tf.getText();
		tf.setText("textfield");
		
	}
}
