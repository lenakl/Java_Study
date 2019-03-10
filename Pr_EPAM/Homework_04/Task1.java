import java.util.Scanner;

public class Task1 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter string:");
		String str = in.nextLine();
		System.out.println("Unique chars: " + uniqChars(str));
	}
	
	public static String uniqChars(String str1){
		if ( checkString(str1) ) {
			String result = "";
			int len = str1.length();
			int index = 0;
			while (index < len) {
				char ch = str1.charAt(index);
				//System.out.println("Char: " + ch);
				String str2 = str1.substring(index+1);
				//System.out.println(str2);
				String str3 = str1.substring(0, index);
				//System.out.println(str3);
				if (str2.indexOf(ch) < 0 && str3.indexOf(ch) < 0) {
					result = result + ch;
					//System.out.println(result);
				}
				index++;
			}
			return result;
		}
		return null;
	}

	static boolean checkString(String s){
		return s != null && s.length() != 0 && s.trim().length() != 0;
		
	}
}