class Variable_Demo3
{
	static int k;   // class Variable or static variable,compiler will take Default value for class variable
	
	static void Test()
	{
		int k = 3; //local variable, can't access out side the block, must to initialize variable
		System.out.println("Value of k"+k);
		
	}
}
	class Local_Var
	{
		public static void main(String[] args)
		{
			
			System.out.println("Value of k is :"+Variable_Demo3.k);
			Variable_Demo3.Test();
		}
	}