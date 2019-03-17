import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    		System.out.println("Enter number of elements of array:\n"); 
		int n = in.nextInt();
		int[] arrayInt = createArrayInt(n);
        	System.out.println("Array -> " + Arrays.toString(arrayInt));
		printRevArrayInt(arrayInt);
    	}

    	static int[] createArrayInt(int size) {
        	if (size < 1) {
            		return null;
        	}
		int[] arrayInt = new int[size];
        	for( int i=0; i < arrayInt.length; i++) {
            		arrayInt[i] = (int)(Math.random()*9);
        	}
        	return arrayInt;
    	}

	static void printRevArrayInt(int[] array) {
		System.out.print("Reverce Array -> [");
		for( int i=array.length-1; i >= 0; i-- ) {
			if (i > 0)
            			System.out.print(array[i] + ", ");
			else
				System.out.print(array[i]);
		}
		System.out.print("]\n");
	}

}