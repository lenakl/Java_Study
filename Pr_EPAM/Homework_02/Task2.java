import java.util.Scanner;

public class Task2 { 
  public static void main(String[] args) { 
	Scanner in = new Scanner(System.in);
    	System.out.print("Enter a three-digit number:\n"); 
	int num1 = in.nextInt();
	if (num1%1000<100) 
		System.out.print("This number is not three-digit\n"); 
	else
	{
		int dig1=num1/100;
		int dig2=num1%100/10;
		int dig3=num1%10;
		System.out.println("First digit: " + dig1);
		System.out.println("Second digit: " + dig2);
		System.out.println("Third digit: " + dig3);
		int num2=dig3*100+dig2*10+dig1;
		System.out.println("The number which collected from  its numbers in reverse order: " + num2);
 		int diff=num1-num2;
		System.out.println("The difference: " + diff);
	}	
	in.close();
      } 
} 