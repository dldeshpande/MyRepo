class VariableDemo1
 {
   public static void main(String[] args)
   {
   int a=10;
   int b=20;
   int c=30;
   System.out.println("A value is "+a);
   System.out.println("A value is "+b);
   System.out.println("A value is "+c);
   a=30;
   //System.out.println("A value is " +a);
   
   a=c;
   b=c;
   c=a;
   a=b;

   System.out.println("A value is "+a);
   System.out.println("B value is "+b);
   System.out.println("C value is "+c);
   
 }}