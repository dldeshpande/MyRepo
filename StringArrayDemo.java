class StringArrayDemo
{
	public static void main(String[] args)
	{
		int i;
		int j;
	String str = "Java_sql_j2ee_selenium-manultesting";
	String[]aar1= str.split("_");
	String[]aar2= str.split("-");
	for( i=0;i<aar1.length;i++)
	{
	
	System.out.println(aar1[i]);
	}
	for ( j=0;j<aar2.length;j++)
	{
		System.out.println(aar2[j]);
		
	}
	System.out.println(aar1[i]+aar2[j]);
}}