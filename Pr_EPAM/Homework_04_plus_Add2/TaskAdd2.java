import java.util.Scanner;

public class TaskAdd2 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer height from 1 to 9:");
		int ht = in.nextInt();
		if ( ht > 0 && ht < 10){
			System.out.println("Pyramid:");
			buildPyramid(ht);
		}
		else
			System.out.println("Height isn't from 1 to 9");
	}
	
public static int buildPyramid(int a)
	{	
		int j=0;
		while(j<=a)
		{
 			int i=0;
			int k=1;
			int t=0;
			while(i<=a*2)
			{
				
				if (i<a-j)
					System.out.print(" ");
				else {
					if (i<a) {
						System.out.print(k);
						k++;
					}
					else if (i==a)
						System.out.print(k);
					else if (i>a && k>1)
					{
						k--;
						System.out.print(k);
					}
					else
						System.out.print(" ");
					}

				}
    				i++;
			}  
			System.out.println();
			j++;
     		}
		return a;
	}
}