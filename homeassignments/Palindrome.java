package homeassignments;


public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 2131;
		int rem = 0;
		
		for (int i = num ; i>0; i=i/10) {
			rem= (rem*10) + (i%10);
			
		}
		System.out.println(num);	
		if(num==rem)
		{
			System.out.println("Palindrome");
		
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
	
	}

}
