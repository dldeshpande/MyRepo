class StringDemo{
	
	public static void main(String[] args)
	{
		String str= "Java Tester";
		System.out.println("The length of given string"+str.length());
		System.out.println("The Index of given character"+str.charAt(5));
		System.out.println("The character of given Index of 1st occurance"+str.indexOf('a'));
		System.out.println("The character of given Index of last occurance"+str.lastIndexOf('a'));
		System.out.println("The given string contains sequence"+str.contains("Tes"));
		System.out.println("The string start with"+str.startsWith("Jav"));
		System.out.println("The string start with"+str.endsWith("ter"));
		System.out.println("The give substring is "+str.substring(3));
		System.out.println("The give substring is"+str.substring(0,4));
		System.out.println("The given string in uppercase is"+str.toUpperCase());
        System.out.println("The given string in uppercase is"+str.toLowerCase());
	}
}