class Callmethod
{
	
	
	public static void main(String[]args)
	{
		Callmethod c = new Callmethod();
		c.Go1();
		System.out.println("after calling Go1 method");
		}
		public void Go()
	{
		System.out.println("Inside the Go method");
		
		Go2();
		System.out.println("after calling Go method");
	}
	public void Go1()
	{
		System.out.println("Inside the Go1 method");
			Go();
			System.out.println("after calling Go method");
	}
	public void Go2(){
		System.out.println("Inside the Go2 method");
}
	}

