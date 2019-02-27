import java.util.Scanner;

public class Task1 { 
  public static void main(String[] args) { 
	Scanner in = new Scanner(System.in);
    	System.out.print("Enter first number:\n"); 
	int num1 = in.nextInt();
	System.out.print("Enter second number:\n"); 
	int num2 = in.nextInt();
	System.out.print("After the exchange of values\n");
 	num1=num1+num2;
	num2=num1-num2;
	num1=num1-num2;
	System.out.println("First number: " + num1);
    	System.out.println("Second number: " + num2);
	in.close();
      } 
} 