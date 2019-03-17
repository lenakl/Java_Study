import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    		System.out.println("Enter number of elements of array:\n"); 
		int n = in.nextInt();
		int[] array1Int = createArrayInt(n);
		int[] array2Int = createArrayInt(n);
        	System.out.println("Array 1 -> " + Arrays.toString(array1Int));
		System.out.println("Array 2 -> " + Arrays.toString(array2Int));
		int[] arrayInt = new int[n];
		if (sumElemsArr1Arr2(arrayInt, array1Int, array2Int)==1)
			System.out.println("Array Sum -> " + Arrays.toString(arrayInt));
		else 
			System.out.println("Sizes of arrays do not match" );
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

	static int sumElemsArr1Arr2(int[] arraySum, int[] array1, int[] array2) {
		int n1=array1.length;
		int n2=array2.length;
		int n_sum=arraySum.length;
		if ( n_sum!=n1 || n_sum!=n2 )
			return 0;
		for( int i=0; i < n1; i++ ) {
			arraySum[i] = array1[i] + array2[i];			
		}
		return 1;
	}

}