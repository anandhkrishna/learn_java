package converters;

import java.util.Scanner;

public class TimeConv{
	
	public static double HrsToMins(double hrs){
		return hrs * 60;
	}
	
	public static double HrsToSecs(double hrs){
		return hrs * 60 * 60;
	}
	
	public static double MinsToHrs(double mins){
		return mins / 60;
	}
	
	public static double SecsToHrs(double mins){
		return mins / 60 / 60;
	}
	
	public static void userChoice(){
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		double time = 0;
		
		System.out.println("Time Converter");
		System.out.println("******************");
		System.out.println("1.Hours To Minutes");
		System.out.println("2.Hours To Seconds");
		System.out.println("3.Minutes To Hours");
		System.out.println("4.Seconds To Hours");
		System.out.println("5.Exit");
		
		choice=scanner.nextInt();
		
		switch(choice){
			case 1:System.out.println("\nEnter in Hours...");
					time = scanner.nextDouble();
					System.out.println(time+ " Hrs = "+TimeConv.HrsToMins(time)+" Mins" );break;
			case 2:System.out.println("\nEnter in Hours");
					time = scanner.nextDouble();
					System.out.println(time+ " Hrs = "+TimeConv.HrsToSecs(time)+" Secs");break;
			case 3:System.out.println("\nEnter in Minutes");
					time = scanner.nextDouble();
					System.out.println(time+ " Mins = "+TimeConv.MinsToHrs(time)+" Hrs");break;
			case 4:System.out.println("\nEnter in Seconds");
					time = scanner.nextDouble();
					System.out.println(time+ " KM = "+TimeConv.SecsToHrs(time)+" Hrs");break;
			case 5:break;
			default:
					System.out.println("\nInvalid Choice..");break;
		}
	}
}
