import java.util.*;
class Demoif{
	
	public static void main(String[]args)
	{
		
		int num = (int)(Math.random()*20);
		/*int first_no =10;
		int sec_no=20;
		int third_no=30;*/
		System.out.println(num);
		
		if(num>5&& num<10) 
		{
			System.out.println("first_no is greater");
		}
		else if(num>15 && num<20) 
		{
			System.out.println("Sec_no is lesser");
		}
		else
		{
			System.out.println("Third_no is lesser");
		}
	}
}