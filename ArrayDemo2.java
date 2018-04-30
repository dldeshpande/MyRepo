class ArrayDemo2
{
	public static void main(String[]args)
	{
		int arr1[];
		arr1=new int[3];
		arr1[0]=10;
		arr1[1]=20;
		arr1[2]=30;
		
		PrintArray(arr1);
		
		
	}
	static void PrintArray(int[]arg2)

	{
		for(int i=0;i<arg2.length;i++)
		{
			
			System.out.println(arg2[i]);
		}
	}	
}