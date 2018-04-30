import java.util.Scanner;
class ArrayDemo4
{
	
	public  static void main(String[]args)
	{
		int n;
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter element you want to in array");
		n=scr.nextInt();
		int a[]=new int[n];
		System.out.println("Enter All element in array");
		
		
		for (int i=0;i<n;i++)
		{
			a[i]=scr.nextInt();
			
		}
	}
}