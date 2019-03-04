class Triangles
{
	public static int TrRightTop(int a)
	{	
		int j=0;
		while(j<=a)
		{
 			int i=0;
			while(i<=j)
			{
				System.out.print("*");
    				i++;
			}  
			System.out.println();
			j++;
     		}
		return a;
	}
 
	public static int TrRightBotton(int a)
	{	
		int j=0;
		while(j<=a)
		{
 			int i=0;
			while(i<=a-j)
			{
				System.out.print("*");
    				i++;
			}  
			System.out.println();
			j++;
     		}
		return a;
	}

	public static int TrLeftBotton(int a)
	{	
		int j=0;
		while(j<=a)
		{
 			int i=0;
			while(i<=a)
			{
				if (i<j)
					System.out.print(" ");
				else
					System.out.print("*");
    				i++;
			}  
			System.out.println();
			j++;
     		}
		return a;
	}

	public static int TrLeftTop(int a)
	{	
		int j=0;
		while(j<=a)
		{
 			int i=0;
			while(i<=a)
			{
				if (i<a-j)
					System.out.print(" ");
				else
					System.out.print("*");
    				i++;
			}  
			System.out.println();
			j++;
     		}
		return a;
	}

	public static void main(String[] args)
	{
		//int c=TrRightTop(5);
		//System.out.println();
		//c=TrRightBotton(5);
		//System.out.println();
		//c=TrLeftBotton(5);	
		//System.out.println();
		//c=TrLeftTop(5);	
		
		int c, a=5, i;

		System.out.print("1)\n");
		c=TrRightTop(a);
		c=TrRightBotton(a);
		System.out.println();

		System.out.print("2)\n");
 		i=0;
		while(i<=a)
		{
			System.out.println();
			i++;
		}  
		c=TrLeftBotton(a);
		System.out.println();


		System.out.print("3)\n");
 		i=0;
		while(i<=a)
		{
			System.out.println();
			i++;
		}  
		c=TrLeftTop(a);
		System.out.println();

		System.out.print("4)\n");
		c=TrLeftTop(a);
		c=TrLeftBotton(a);
		System.out.println();


	}
}