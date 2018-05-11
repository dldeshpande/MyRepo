class JVM_Memory_1
{
 static int k =22;
 double d = 50.23;
 
 static void Test()
 {
	 System.out.println("Test Method");
 }
  void disp()
  {
	  System.out.println("non-static method");
  }
  
  }
  class Main_JVM
  {  
 
 public static void main(String[] args)
 {
	 
	 System.out.println("Main Method");
	 System.out.println("value of K"+JVM_Memory_1.k);
	 JVM_Memory_1.Test();
	 JVM_Memory_1 jvm = new JVM_Memory_1();
	 System.out.println("value of D "+jvm.d);
	 jvm.disp();
	 
 }
}