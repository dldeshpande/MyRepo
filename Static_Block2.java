class Static_Block2
{
static int  k=12;

static
{
	k=15;
}
static
{
	 int k=18;
}
public static void main(String[] args)
{
	int j =33;
	System.out.println("Value of J :" +j);
	System.out.println("Value of K is "+Static_Block2.k);
	System.out.println("Main Method");
	
	
}
}