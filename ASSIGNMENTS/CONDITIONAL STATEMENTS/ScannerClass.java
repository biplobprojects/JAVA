import java.util.Scanner; 
class ScannerClass                //scanner is used to get input from the user:
{
public static void main(String[] args)
{
Scanner sc = new Scanner (System.in);
System.out.println("ENTER NAME");
String name = sc.next();         //next() is a method of Scanner class:

System.out.println("ENTER GENDER");
char gender = sc.next().charAt(0);

System.out.println("ENTER AGE");
int age = sc.nextInt();

System.out.println("ENTER number");
long phone = sc.nextLong();

System.out.println("Name:" +name);

System.out.println("Gender:" +gender);

System.out.println("Age:" +age);

System.out.println("Number:" +phone);
}
}



