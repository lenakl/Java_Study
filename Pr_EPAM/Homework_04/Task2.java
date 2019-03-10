import java.util.Scanner;

public class Task2 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter integer:");
		int num = in.nextInt();
		System.out.println("Binary view: " + convInt2Str(num));
	}
	
	public static String convInt2Str(int num1){
		String result = Integer.toString(num1, 2);
		return result;
	}
}