class Variable_Demo2
{
	static int k;   // class Variable or static variable,compiler will take Default value for class variable
	
	static void Test()
	{
		System.out.println("TEST METHOD");
		
	}
}
	class Class_Var
	{
		public static void main(String[] args)
		{
			
			System.out.println("Value of k is :"+Variable_Demo2.k);
			Variable_Demo2.Test();
		}
	}