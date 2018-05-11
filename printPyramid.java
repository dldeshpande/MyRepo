class printPyramid{

public static void printStars(int n)
{
	int line,start;
	for( line=0;line<=n;line++)
	{
		for( start =0;start<=line;start++)
		{
			System.out.print("* ");
			
		}
		System.out.println();
		
	}
	
	
}
public static void main(String[] args)
{
	int n = 5;
	printStars(n);
	
}




}