class Pattern180{
	
	public static void printStar(int n)
	{
		int i,j,k=2*n-2;
		
		for(i=0;i<n;i++)
		{
			
			for(j=0;j<k;j++)
			{
				
				System.out.println("");
			}
			k=k - 2;
		
		for(j=0;j<=i;j++)
		{
			System.out.print("*");	
		}
		
		}
		System.out.println();
	}
public static void main(String[] args)
{
	int n =5;
	printStar(n);
}
	
	
	}