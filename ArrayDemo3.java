class ArrayDemo3
{
	
	static int[]PrintArray()
	
	{
		//int[]arg;
		int[]arg = new int[3];
		arg[0]=20;
		arg[1]=30;
		arg[2]=40;
		
		
		return arg;
		
	}
	public static void main(String[]args)
	
	{
		int[]d=PrintArray();
		
		for(int i=0;i<=d.length-1;i++)
		{
			System.out.println(d[i]);
			
		}
		
		//System.out.println(d);
	}
	
	} 