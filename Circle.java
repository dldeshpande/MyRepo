class Circle
{
	static double AOC(double rad)
	{
		double rad1= 3.14*rad*rad;
		return rad1;
	}
	public static void main(String[]args)
	{
		double rad2=AOC(2.15);
		System.out.println("Area of circle is "+rad2);
		
	}
}