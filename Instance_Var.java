class Variable_Demo1
{
	int k;   // Instance Variable,compiler will take Default value for instance variable
	
	void Test()
	{
		System.out.println("TEST METHOD");
		
	}
}
	class Instance_Var
	{
		public static void main(String[] args)
		{
			Variable_Demo1 v1 = new Variable_Demo1();
			System.out.println("Value of k is :"+v1.k);
			v1.Test();
		}
	}
