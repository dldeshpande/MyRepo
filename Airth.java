import java.util.Scanner;
class Airth
{
static void Add(int a,int b)
{
int c = a+b;
System.out.println("Addition is "+c);

}
static void Sub(int a,int b)
{
int c = a-b;
System.out.println("Addition is "+c);

}
static void Mul(int a,int b)
{
int c = a*b;
System.out.println("Addition is "+c);

}
static void Div(int a,int b)
{
int c = a/b;
System.out.println("Addition is "+c);

}
}
class Mainclass
{
	public static void main(String[] args)
	{
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("1: Addition");
		System.out.println("1: Subtraction");
		System.out.println("1: Multiplication");
		System.out.println("1: Division");
		System.out.println("Enter choice");
		int choice = sc1.nextInt();
		System.out.println("Enter First No");
		int first = sc1.nextInt();
		System.out.println("Enter Second No");
		int second = sc1.nextInt();
		
		if (choice==1)
		{
			
			Airth.Add(first,second);
			
		}
	}
}