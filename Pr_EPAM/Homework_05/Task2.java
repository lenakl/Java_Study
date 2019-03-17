import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    		System.out.println("Enter number of elements of array:\n"); 
		int n = in.nextInt();
		int[] arrayInt = createArrayInt(n);
        	System.out.println("Array -> " + Arrays.toString(arrayInt));
		printCountSumNeg(arrayInt);
    	}

    	static int[] createArrayInt(int size) {
        	if (size < 1) {
            		return null;
        	}
		int[] arrayInt = new int[size];
        	for( int i=0; i < arrayInt.length; i++) {
            		arrayInt[i] = (int)(Math.random()*20-10);
        	}
        	return arrayInt;
    	}

	static void printCountSumNeg(int[] array) {
		int k = 0;
		int sum = 0;
		for( int i=0; i < array.length; i++ ) {
			if (array[i] < 0) {
				k++;
				sum+=array[i];
			}        			
		}
		System.out.println("Number of negative elements -> "+ k);
		System.out.println("Sum of negative elements -> "+ sum);
	}

}