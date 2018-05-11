import java.util.Scanner;
class Battery
{
	int availableStatus =0;
	
	void batteryCharging(int charged)
	{
		if(availableStatus>=0)
		{
			availableStatus = availableStatus + charged;
			
		}
		else{
			System.out.println("Battery is fully charged");
		}
		
	}
	void batterDischarged(int discharged)
	{
		availableStatus = availableStatus - discharged;
	}
	void displayCurrentbatteryStatus()
	{
		System.out.println("Current Battery Status is "+availableStatus);
	}
	
}
class MainClass9
{
	public static void main(String[] args)
	{
		Battery bt1=new Battery();
		
		System.out.println("1:Battery Charged");
		System.out.println("2:Battery Discharged");
		System.out.println("3:Current Battery Status");
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Choice");
		int choice = sc1.nextInt();
		if (choice == 1)
		{
		System.out.println("How much % you want to charge battery");
		int chrg = sc1.nextInt();
		bt1.batteryCharging(chrg);
		}
		else if(choice == 2)
		{
		System.out.println("How much % Battery you Used");
		int dschrg = sc1.nextInt();
		bt1.batterDischarged(dschrg);	
		}
		else if(choice==3)
		{
			bt1.displayCurrentbatteryStatus();
		}
		
		
		
		
		
	}
}