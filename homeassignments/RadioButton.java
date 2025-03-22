package homeassignments;

public class RadioButton extends Button {
public void selectRadioButton() {
	System.out.println("selectRadioButton");
}
	public static void main(String[] args) {
		RadioButton r = new RadioButton();
		r.click();
		r.setText("Radio");
		r.submit();
		r.selectRadioButton();
		
		
	}

}
