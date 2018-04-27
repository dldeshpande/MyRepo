import java.util.Scanner;
import java.util.Random;
class Rectangle

{
static double getReactangle(double length,double width)

{
double num3 = 2*length*width;

return num3;

}
public static void main(String[]args)
{
	double length1,width1;
	System.out.println("Enter length");
	Scanner sca = new Scanner(System.in);
	
	length1 = sca.nextDouble();
	System.out.println("Enter Width");
	width1 = sca.nextDouble();

	double num3 =getReactangle(30,20);

	System.out.println("Areof Rectangle is "+num3);
}
}