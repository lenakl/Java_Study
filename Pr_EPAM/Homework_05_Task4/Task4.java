import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    	public static void main(String[] args) {
		int pos = 0;
		int neg = 0;

		Scanner in = new Scanner(System.in);
    		System.out.println("Enter number of elements of array:\n"); 
		int n = in.nextInt();
		int[] arrayInt = createArrayInt(n);
        	System.out.println("Array -> " + Arrays.toString(arrayInt));
		int[] arrayPosInt = new int[n];
		int[] arrayNegInt = new int[n];
		int[] arraySizes = new int[2];
		createPosNegArrs(arrayInt, arrayPosInt, arrayNegInt, arraySizes);


		int[] arrayPosInt1 = Arrays.copyOf(arrayPosInt, arraySizes[0]);
		arrayPosInt = arrayPosInt1;
                System.out.println("Array Pos -> " + Arrays.toString(arrayPosInt));
		int[] arrayNegInt1 = Arrays.copyOf(arrayNegInt, arraySizes[1]);
		arrayNegInt = arrayNegInt1;
		System.out.println("Array Neg -> " + Arrays.toString(arrayNegInt));

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

	static void createPosNegArrs(int[] arrayInt, int[] arrayPos, int[] arrayNeg, int[] arrayS) {
		int k_pos = 0;
		int k_neg = 0;

		for( int i=0; i < arrayInt.length; i++ ) {
			if (arrayInt[i] > 0) {
				arrayPos[k_pos]=arrayInt[i];
				k_pos++;
			}  
			else if (arrayInt[i] < 0) {
				arrayNeg[k_neg]=arrayInt[i];
				k_neg++;
			} 
		}
		arrayS[0]=k_pos;
		arrayS[1]=k_neg;
	}

}