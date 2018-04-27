class Calculator
{
public static void main(String[] args)
{
System.out.println("Welcome to the Arthmatic program");

Calculator1 cal = new Calculator1();
int i = cal.getAdd(10,20);
System.out.println("The Addition is :" + i);
System.out.println("The Subtraction is :" + cal.getSub(10,20));
System.out.println("The Multplication is :" + cal.getMult(10,20));
System.out.println("The Division is :" + cal.getDiv(10,20));
}

}