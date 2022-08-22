import java.util.Scanner;
public class Assgn23{                   //Java program to print Fibonacci number series upto a given number
                                                                      //Expected Out 17: - 0 1 1 2 3 5 8 13:
    public static void main(String[] args){
		
		int term,a=0,b=1,c;
		System.out.println("enter term");
		
		Scanner sc = new Scanner(System.in);
		term = sc.nextInt();
	
	for(int i = 1; i<=term; i++){
	
	
	System.out.println(a+ " ");
	c=a+b;
	a=b;
	b=c;
	}
	}
	}