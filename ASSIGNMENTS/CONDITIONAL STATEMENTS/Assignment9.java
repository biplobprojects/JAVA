import java.util.Scanner;

public class Assignment9	 {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int number1, number2, number3;
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the First Number : ");
		number1 = sc.nextInt();	
		
		System.out.print(" Please Enter the Second Number : ");
		number2 = sc.nextInt();	
		
		System.out.print(" Please Enter the third Number : ");
		number3 = sc.nextInt();	
		
		if(number1 >= number2 && number1 >= number3) 
	    {
			System.out.println(  number1+"is the largest number");          
	    } 
	    else if (number2 >= number1 && number2 >= number3)
	    { 
	    	System.out.println(number2+"is the largest number");        
	    } 
	    else 
	    {
	    	System.out.println(number3+"is the largest number");
	    }		
	}	
}
