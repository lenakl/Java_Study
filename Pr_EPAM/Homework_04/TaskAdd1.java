import java.util.Scanner;

public class TaskAdd1 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter integer from 10 and more:");
		int num = in.nextInt();
		if ( num < 10 )
			System.out.println("Integer is less than 10");
		else
			System.out.println("String view the last 2 rearranged characters: " + convInt2LastStr(num));
	}
	
	public static String convInt2LastStr(int num1){
		String result = Integer.toString(num1, 10);
		// Take last 2 charecters
		int len = result.length();
		String str1 = result.substring( len-2, len);
		// Rearrange 2 characters
		result = "" + result.substring( len-1, len) + result.substring( len-2, len-1);
		return result;
	}
}