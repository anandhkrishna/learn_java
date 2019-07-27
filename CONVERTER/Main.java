import java.util.Scanner;
import converters.CurrencyConv;
import converters.DistanceConv;
import converters.TimeConv;
class Main
{

	public static void main(String[] args)
	{
        Scanner input = new Scanner(System.in);
        int choice = 0;
		while(choice != 4)
		{
			System.out.println("\nConverters");
			System.out.println("**********");
			System.out.println("1. Currentcy\n2. Distance\n3. Time\n4. Exit\n\nEnter Your Choice");
			choice = input.nextInt();
			switch(choice)
			{
				case 1:CurrencyConv.userChoice();break;
				case 2:DistanceConv.userChoice();break;
				case 3:TimeConv.userChoice();break;
				case 4:break;
				default:System.out.println("Please choose valid option");
						break;
			}
		}
	}
	
}