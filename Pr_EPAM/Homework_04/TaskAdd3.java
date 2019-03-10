import java.util.Scanner;

public class TaskAdd3 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a sentence only with spaces between words:");
		String str = in.nextLine();
		System.out.println("Enter a number of word:");
		int num = in.nextInt();
		System.out.println("First character of word: " + findFirstCh(str, num));
	}
	
	public static String findFirstCh(String str1,int num1){
		if ( checkString(str1) ){
			String result = "";
			String str2 = str1.trim();
			char ch = ' ';
			int index = 0;
			int len = str1.length();
			int num_wd = 1;
			do {
				if ( num1 == 1 ){
					result = str2.substring( 0, 1);
					break;
				}
				else {
					index = str2.indexOf(ch);
					//System.out.println("index: " + index);
					if (index >= 0){
						num_wd++;
						str2 = str2.substring(index + 1);
					}
					else {
						result = null;
						break;
					}
					if ( num_wd == num1 ){
						result = str2.substring(0, 1);
						break;
					}
				}
			} while( result != null );
		 	return result;	
		}
		else
			return null;
	}

	static boolean checkString(String s){
		return s != null && s.length() != 0 && s.trim().length() != 0;	
	}
}