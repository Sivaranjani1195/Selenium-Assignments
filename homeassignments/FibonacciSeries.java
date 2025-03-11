package homeassignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number =100;
		
		int num1 = 0;
		int num2 = 1;
		
		for(int i=0; i<number;i++) {
			System.out.println(num1);
		
		int num3 = num2+num1;
		num1=num2;
		num2=num3;
		
		//System.out.println(num3);
		
		}

	}

}
